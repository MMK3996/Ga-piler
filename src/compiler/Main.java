package compiler;

import compiler.codegen.CodeGeneratorVisitor;
import compiler.error.AUJavaErrorListener;
import compiler.semantic.DeclarationVisitor;
import compiler.semantic.TypeCheckVisitor;
import compiler.symbol.SymbolTable;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java compiler.Main <input_file.java> [output_file.c]");
            System.exit(1);
        }

        String inputFilePath = args[0];
        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.err.println("Error: Input file '" + inputFilePath + "' does not exist.");
            System.exit(1);
        }

        String outputFilePath;
        if (args.length >= 2) {
            outputFilePath = args[1];
        } else {
            if (inputFilePath.endsWith(".java")) {
                outputFilePath = inputFilePath.substring(0, inputFilePath.length() - 5) + ".c";
            } else {
                outputFilePath = inputFilePath + ".c";
            }
        }

        try {
            CharStream input = CharStreams.fromFileName(inputFilePath);
            AUJavaLexer lexer = new AUJavaLexer(input);

            // Configure Lexer Error Handling
            lexer.removeErrorListeners();
            lexer.addErrorListener(AUJavaErrorListener.INSTANCE);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AUJavaParser parser = new AUJavaParser(tokens);

            // Configure Parser Error Handling
            parser.removeErrorListeners();
            parser.addErrorListener(AUJavaErrorListener.INSTANCE);

            ParseTree tree = parser.program();

            if (AUJavaErrorListener.INSTANCE.hasErrors()) {
                System.err.println("Syntax/Lexical Compilation failed with errors:");
                AUJavaErrorListener.INSTANCE.printErrors();
                System.exit(1);
            }

            // ==========================================
            // SEMANTIC ANALYSIS (PHASE 3)
            // ==========================================
            SymbolTable symbolTable = new SymbolTable();

            // Pass 1: Class, Field, and Method Declarations + Inheritance Resolution
            DeclarationVisitor declVisitor = new DeclarationVisitor(symbolTable);
            declVisitor.visit(tree);

            // Pass 2: Type Checking & Scope Validation
            TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor(symbolTable);
            typeCheckVisitor.visit(tree);

            if (AUJavaErrorListener.INSTANCE.hasErrors()) {
                System.err.println("Semantic Analysis failed with errors:");
                AUJavaErrorListener.INSTANCE.printErrors();
                System.exit(1);
            }

            // ==========================================
            // CODE GENERATION (PHASE 4 & BONUS)
            // ==========================================
            CodeGeneratorVisitor codeGenVisitor = new CodeGeneratorVisitor(symbolTable);
            String cCode = codeGenVisitor.visit(tree);

            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(cCode);
            }

            System.out.println("Transpilation Successful!");
            System.out.println("Input AUJava File: " + inputFilePath);
            System.out.println("Output C File:     " + outputFilePath);

        } catch (IOException e) {
            System.err.println("IO Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
