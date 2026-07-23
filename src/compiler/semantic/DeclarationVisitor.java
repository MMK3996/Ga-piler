package compiler.semantic;

import compiler.AUJavaBaseVisitor;
import compiler.AUJavaParser;
import compiler.error.AUJavaErrorListener;
import compiler.symbol.*;

import java.util.HashSet;
import java.util.Set;

public class DeclarationVisitor extends AUJavaBaseVisitor<Void> {
    private final SymbolTable symbolTable;
    private int mainCount = 0;

    public DeclarationVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visitProgram(AUJavaParser.ProgramContext ctx) {
        // Pass 1: Visit all classes
        visitChildren(ctx);

        // Resolve inheritance references
        for (ClassSymbol cs : symbolTable.getClasses().values()) {
            if (cs.getParentName() != null) {
                ClassSymbol parent = symbolTable.getClass(cs.getParentName());
                if (parent == null) {
                    AUJavaErrorListener.INSTANCE.addSemanticError(0, 0,
                            "Class '" + cs.getName() + "' extends undefined class '" + cs.getParentName() + "'");
                } else {
                    cs.setParent(parent);
                }
            }
        }

        // Check for cyclic inheritance
        for (ClassSymbol cs : symbolTable.getClasses().values()) {
            if (hasCyclicInheritance(cs)) {
                AUJavaErrorListener.INSTANCE.addSemanticError(0, 0,
                        "Cyclic inheritance detected involving class '" + cs.getName() + "'");
                break;
            }
        }

        // Check main entry point requirement
        if (mainCount != 1) {
            AUJavaErrorListener.INSTANCE.addSemanticError(0, 0,
                    "Program must contain exactly one main method entry point (found " + mainCount + ")");
        }

        return null;
    }

    private boolean hasCyclicInheritance(ClassSymbol start) {
        Set<String> visited = new HashSet<>();
        ClassSymbol current = start;
        while (current != null) {
            if (visited.contains(current.getName())) {
                return true;
            }
            visited.add(current.getName());
            current = current.getParent();
        }
        return false;
    }

    @Override
    public Void visitClassDecl(AUJavaParser.ClassDeclContext ctx) {
        String className = ctx.Identifier(0).getText();
        if (symbolTable.getClass(className) != null) {
            AUJavaErrorListener.INSTANCE.addSemanticError(
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    "Class '" + className + "' is already defined"
            );
            return null;
        }

        ClassSymbol classSymbol = new ClassSymbol(className);
        if (ctx.EXTENDS() != null && ctx.Identifier().size() > 1) {
            classSymbol.setParentName(ctx.Identifier(1).getText());
        }

        symbolTable.addClass(classSymbol);
        symbolTable.setCurrentClass(classSymbol);

        for (AUJavaParser.ClassBodyMemberContext member : ctx.classBodyMember()) {
            visitClassBodyMember(member);
        }

        symbolTable.setCurrentClass(null);
        return null;
    }

    @Override
    public Void visitMainMethodDecl(AUJavaParser.MainMethodDeclContext ctx) {
        mainCount++;
        if (symbolTable.getCurrentClass() != null) {
            symbolTable.getCurrentClass().setMainClass(true);
            MethodSymbol mainMethod = new MethodSymbol("main", Type.VOID_TYPE, true);
            mainMethod.addParameter(new Symbol(ctx.Identifier().getText(), new Type(Type.Kind.CLASS, "String[]")));
            symbolTable.getCurrentClass().addMethod(mainMethod);
        }
        return null;
    }

    @Override
    public Void visitFieldDecl(AUJavaParser.FieldDeclContext ctx) {
        if (symbolTable.getCurrentClass() == null) return null;
        String fieldName = ctx.Identifier().getText();
        boolean isStatic = ctx.STATIC() != null;
        Type type = resolveType(ctx.type());

        Symbol field = new Symbol(fieldName, type, isStatic, true);
        if (!symbolTable.getCurrentClass().addField(field)) {
            AUJavaErrorListener.INSTANCE.addSemanticError(
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    "Duplicate field '" + fieldName + "' in class '" + symbolTable.getCurrentClass().getName() + "'"
            );
        }
        return null;
    }

    @Override
    public Void visitMethodDecl(AUJavaParser.MethodDeclContext ctx) {
        if (symbolTable.getCurrentClass() == null) return null;
        String methodName = ctx.Identifier().getText();
        boolean isStatic = ctx.STATIC() != null;
        Type returnType = resolveReturnType(ctx.returnType());

        MethodSymbol method = new MethodSymbol(methodName, returnType, isStatic);

        if (ctx.formalParameters() != null) {
            for (AUJavaParser.FormalParameterContext paramCtx : ctx.formalParameters().formalParameter()) {
                String paramName = paramCtx.Identifier().getText();
                Type paramType = resolveType(paramCtx.type());
                method.addParameter(new Symbol(paramName, paramType));
            }
        }

        if (!symbolTable.getCurrentClass().addMethod(method)) {
            AUJavaErrorListener.INSTANCE.addSemanticError(
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    "Duplicate method '" + methodName + "' in class '" + symbolTable.getCurrentClass().getName() + "'"
            );
        }
        return null;
    }

    private Type resolveType(AUJavaParser.TypeContext ctx) {
        if (ctx.INT() != null) return Type.INT_TYPE;
        if (ctx.BOOLEAN() != null) return Type.BOOL_TYPE;
        if (ctx.Identifier() != null) return new Type(Type.Kind.CLASS, ctx.Identifier().getText());
        return Type.ERROR_TYPE;
    }

    private Type resolveReturnType(AUJavaParser.ReturnTypeContext ctx) {
        if (ctx.VOID() != null) return Type.VOID_TYPE;
        if (ctx.type() != null) return resolveType(ctx.type());
        return Type.ERROR_TYPE;
    }
}
