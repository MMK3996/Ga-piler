package compiler.semantic;

import compiler.AUJavaBaseVisitor;
import compiler.AUJavaParser;
import compiler.error.AUJavaErrorListener;
import compiler.symbol.*;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckVisitor extends AUJavaBaseVisitor<Type> {
    private final SymbolTable symbolTable;

    public TypeCheckVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    // Helper for error reporting
    private void error(org.antlr.v4.runtime.ParserRuleContext ctx, String message) {
        AUJavaErrorListener.INSTANCE.addSemanticError(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                message
        );
    }

    @Override
    public Type visitProgram(AUJavaParser.ProgramContext ctx) {
        for (AUJavaParser.ClassDeclContext classCtx : ctx.classDecl()) {
            visitClassDecl(classCtx);
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitClassDecl(AUJavaParser.ClassDeclContext ctx) {
        String className = ctx.Identifier(0).getText();
        ClassSymbol classSymbol = symbolTable.getClass(className);
        if (classSymbol == null) return Type.ERROR_TYPE;

        symbolTable.setCurrentClass(classSymbol);

        for (AUJavaParser.ClassBodyMemberContext member : ctx.classBodyMember()) {
            if (member.mainMethodDecl() != null) {
                visitMainMethodDecl(member.mainMethodDecl());
            } else if (member.methodDecl() != null) {
                visitMethodDecl(member.methodDecl());
            } else if (member.fieldDecl() != null) {
                visitFieldDecl(member.fieldDecl());
            }
        }

        symbolTable.setCurrentClass(null);
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitFieldDecl(AUJavaParser.FieldDeclContext ctx) {
        if (ctx.ASSIGN() != null && ctx.expr() != null) {
            Type fieldType = resolveType(ctx.type());
            Type initType = visit(ctx.expr());
            if (!isAssignable(fieldType, initType)) {
                error(ctx, "Type mismatch: cannot assign " + initType + " to field of type " + fieldType);
            }
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitMainMethodDecl(AUJavaParser.MainMethodDeclContext ctx) {
        ClassSymbol cs = symbolTable.getCurrentClass();
        if (cs == null) return Type.ERROR_TYPE;

        MethodSymbol mainMethod = cs.getMethod("main");
        symbolTable.setCurrentMethod(mainMethod);
        symbolTable.enterScope();

        // Parameter args
        symbolTable.declareVariable(new Symbol(ctx.Identifier().getText(), new Type(Type.Kind.CLASS, "String[]")));

        for (AUJavaParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }

        symbolTable.exitScope();
        symbolTable.setCurrentMethod(null);
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitMethodDecl(AUJavaParser.MethodDeclContext ctx) {
        String methodName = ctx.Identifier().getText();
        ClassSymbol cs = symbolTable.getCurrentClass();
        if (cs == null) return Type.ERROR_TYPE;

        MethodSymbol method = cs.getDirectMethods().get(methodName);
        if (method == null) return Type.ERROR_TYPE;

        symbolTable.setCurrentMethod(method);
        symbolTable.enterScope();

        // Declare parameters in method scope
        for (Symbol param : method.getParameters()) {
            symbolTable.declareVariable(param);
        }

        for (AUJavaParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }

        symbolTable.exitScope();
        symbolTable.setCurrentMethod(null);
        return Type.VOID_TYPE;
    }

    // ==========================================
    // STATEMENTS
    // ==========================================

    @Override
    public Type visitBlockStatement(AUJavaParser.BlockStatementContext ctx) {
        symbolTable.enterScope();
        for (AUJavaParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        symbolTable.exitScope();
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitVarDeclStatement(AUJavaParser.VarDeclStatementContext ctx) {
        String varName = ctx.Identifier().getText();
        Type declaredType = resolveType(ctx.type());

        Symbol sym = new Symbol(varName, declaredType);
        if (!symbolTable.declareVariable(sym)) {
            error(ctx, "Variable '" + varName + "' is already declared in this scope");
        }

        if (ctx.ASSIGN() != null && ctx.expr() != null) {
            Type initType = visit(ctx.expr());
            if (!isAssignable(declaredType, initType)) {
                error(ctx, "Type mismatch: cannot assign " + initType + " to variable '" + varName + "' of type " + declaredType);
            }
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitIfStatement(AUJavaParser.IfStatementContext ctx) {
        Type condType = visit(ctx.expr());
        if (!condType.equals(Type.BOOL_TYPE)) {
            error(ctx, "If condition must be boolean, got " + condType);
        }
        visit(ctx.statement(0));
        if (ctx.statement().size() > 1) {
            visit(ctx.statement(1));
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitWhileStatement(AUJavaParser.WhileStatementContext ctx) {
        Type condType = visit(ctx.expr());
        if (!condType.equals(Type.BOOL_TYPE)) {
            error(ctx, "While condition must be boolean, got " + condType);
        }

        symbolTable.enterLoop();
        visit(ctx.statement());
        symbolTable.exitLoop();
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitBreakStatement(AUJavaParser.BreakStatementContext ctx) {
        if (!symbolTable.isInLoop()) {
            error(ctx, "'break' statement outside loop scope");
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitContinueStatement(AUJavaParser.ContinueStatementContext ctx) {
        if (!symbolTable.isInLoop()) {
            error(ctx, "'continue' statement outside loop scope");
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitReturnStatement(AUJavaParser.ReturnStatementContext ctx) {
        MethodSymbol currentMethod = symbolTable.getCurrentMethod();
        if (currentMethod == null) return Type.ERROR_TYPE;

        Type expectedType = currentMethod.getReturnType();
        if (ctx.expr() == null) {
            if (!expectedType.equals(Type.VOID_TYPE)) {
                error(ctx, "Return statement missing value for method returning " + expectedType);
            }
        } else {
            Type actualType = visit(ctx.expr());
            if (!isAssignable(expectedType, actualType)) {
                error(ctx, "Type mismatch: method expected return type " + expectedType + " but got " + actualType);
            }
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitPrintStatement(AUJavaParser.PrintStatementContext ctx) {
        Type exprType = visit(ctx.expr());
        if (!exprType.equals(Type.INT_TYPE) && !exprType.equals(Type.BOOL_TYPE)) {
            error(ctx, "System.out.println expected int or boolean argument but got " + exprType);
        }
        return Type.VOID_TYPE;
    }

    @Override
    public Type visitExprStatement(AUJavaParser.ExprStatementContext ctx) {
        return visit(ctx.expr());
    }

    // ==========================================
    // EXPRESSIONS
    // ==========================================

    @Override
    public Type visitAssignExpr(AUJavaParser.AssignExprContext ctx) {
        Type targetType = visit(ctx.target);
        Type valType = visit(ctx.value);

        if (!isAssignable(targetType, valType)) {
            error(ctx, "Cannot assign " + valType + " to target of type " + targetType);
            return Type.ERROR_TYPE;
        }
        return targetType;
    }

    @Override
    public Type visitLogicalOrExpr(AUJavaParser.LogicalOrExprContext ctx) {
        return checkBinaryLogical(ctx, ctx.left, ctx.right, "||");
    }

    @Override
    public Type visitLogicalAndExpr(AUJavaParser.LogicalAndExprContext ctx) {
        return checkBinaryLogical(ctx, ctx.left, ctx.right, "&&");
    }

    private Type checkBinaryLogical(org.antlr.v4.runtime.ParserRuleContext ctx,
                                     AUJavaParser.ExprContext leftCtx,
                                     AUJavaParser.ExprContext rightCtx,
                                     String op) {
        Type l = visit(leftCtx);
        Type r = visit(rightCtx);
        if (!l.equals(Type.BOOL_TYPE) || !r.equals(Type.BOOL_TYPE)) {
            error(ctx, "Operator '" + op + "' requires boolean operands, got " + l + " and " + r);
            return Type.ERROR_TYPE;
        }
        return Type.BOOL_TYPE;
    }

    @Override
    public Type visitEqualityExpr(AUJavaParser.EqualityExprContext ctx) {
        Type l = visit(ctx.left);
        Type r = visit(ctx.right);
        if (!isAssignable(l, r) && !isAssignable(r, l)) {
            error(ctx, "Incompatible types for equality comparison: " + l + " and " + r);
            return Type.ERROR_TYPE;
        }
        return Type.BOOL_TYPE;
    }

    @Override
    public Type visitRelationalExpr(AUJavaParser.RelationalExprContext ctx) {
        Type l = visit(ctx.left);
        Type r = visit(ctx.right);
        if (!l.equals(Type.INT_TYPE) || !r.equals(Type.INT_TYPE)) {
            error(ctx, "Relational comparison requires int operands, got " + l + " and " + r);
            return Type.ERROR_TYPE;
        }
        return Type.BOOL_TYPE;
    }

    @Override
    public Type visitAdditiveExpr(AUJavaParser.AdditiveExprContext ctx) {
        return checkBinaryArithmetic(ctx, ctx.left, ctx.right, ctx.op.getText());
    }

    @Override
    public Type visitMultiplicativeExpr(AUJavaParser.MultiplicativeExprContext ctx) {
        return checkBinaryArithmetic(ctx, ctx.left, ctx.right, ctx.op.getText());
    }

    private Type checkBinaryArithmetic(org.antlr.v4.runtime.ParserRuleContext ctx,
                                        AUJavaParser.ExprContext leftCtx,
                                        AUJavaParser.ExprContext rightCtx,
                                        String op) {
        Type l = visit(leftCtx);
        Type r = visit(rightCtx);
        if (!l.equals(Type.INT_TYPE) || !r.equals(Type.INT_TYPE)) {
            error(ctx, "Arithmetic operator '" + op + "' requires int operands, got " + l + " and " + r);
            return Type.ERROR_TYPE;
        }
        return Type.INT_TYPE;
    }

    @Override
    public Type visitUnaryExpr(AUJavaParser.UnaryExprContext ctx) {
        Type operand = visit(ctx.expr());
        String op = ctx.op.getText();
        if (op.equals("!")) {
            if (!operand.equals(Type.BOOL_TYPE)) {
                error(ctx, "Operator '!' requires boolean operand, got " + operand);
                return Type.ERROR_TYPE;
            }
            return Type.BOOL_TYPE;
        } else { // + or -
            if (!operand.equals(Type.INT_TYPE)) {
                error(ctx, "Operator '" + op + "' requires int operand, got " + operand);
                return Type.ERROR_TYPE;
            }
            return Type.INT_TYPE;
        }
    }

    @Override
    public Type visitMethodCallExpr(AUJavaParser.MethodCallExprContext ctx) {
        Type targetType = visit(ctx.expr());
        String methodName = ctx.Identifier().getText();

        if (targetType.isPrimitive()) {
            error(ctx, "Cannot invoke method '" + methodName + "' on primitive type " + targetType);
            return Type.ERROR_TYPE;
        }

        ClassSymbol targetClass = symbolTable.getClass(targetType.getName());
        if (targetClass == null) {
            error(ctx, "Unknown class type '" + targetType.getName() + "'");
            return Type.ERROR_TYPE;
        }

        MethodSymbol method = targetClass.getMethod(methodName);
        if (method == null) {
            error(ctx, "Method '" + methodName + "' not found in class '" + targetClass.getName() + "'");
            return Type.ERROR_TYPE;
        }

        // Check: ClassName.method() must target a static method
        String targetText = ctx.expr().getText();
        ClassSymbol staticAccessClass = symbolTable.getClass(targetText);
        if (staticAccessClass != null && !method.isStatic()) {
            error(ctx, "Cannot call instance method '" + methodName + "' via class name '" + targetText + "'");
            return Type.ERROR_TYPE;
        }

        return validateMethodArgs(ctx, method, ctx.arguments());
    }

    @Override
    public Type visitFieldAccessExpr(AUJavaParser.FieldAccessExprContext ctx) {
        Type targetType = visit(ctx.expr());
        String fieldName = ctx.Identifier().getText();

        if (targetType.isPrimitive()) {
            error(ctx, "Cannot access field '" + fieldName + "' on primitive type " + targetType);
            return Type.ERROR_TYPE;
        }

        ClassSymbol targetClass = symbolTable.getClass(targetType.getName());
        if (targetClass == null) {
            error(ctx, "Unknown class type '" + targetType.getName() + "'");
            return Type.ERROR_TYPE;
        }

        Symbol field = targetClass.getField(fieldName);
        if (field == null) {
            error(ctx, "Field '" + fieldName + "' not found in class '" + targetClass.getName() + "'");
            return Type.ERROR_TYPE;
        }

        // Check: ClassName.field must target a static field
        String targetText = ctx.expr().getText();
        ClassSymbol staticAccessClass = symbolTable.getClass(targetText);
        if (staticAccessClass != null && !field.isStatic()) {
            error(ctx, "Cannot access instance field '" + fieldName + "' via class name '" + targetText + "'");
            return Type.ERROR_TYPE;
        }

        return field.getType();
    }

    @Override
    public Type visitLocalMethodCallExpr(AUJavaParser.LocalMethodCallExprContext ctx) {
        String methodName = ctx.Identifier().getText();
        ClassSymbol currentClass = symbolTable.getCurrentClass();
        if (currentClass == null) return Type.ERROR_TYPE;

        MethodSymbol method = currentClass.getMethod(methodName);
        if (method == null) {
            error(ctx, "Method '" + methodName + "' is not defined in scope");
            return Type.ERROR_TYPE;
        }

        // Check: cannot call instance method from static context
        if (!method.isStatic()) {
            MethodSymbol currentMethod = symbolTable.getCurrentMethod();
            if (currentMethod != null && currentMethod.isStatic()) {
                error(ctx, "Cannot call instance method '" + methodName + "' from static context");
                return Type.ERROR_TYPE;
            }
        }

        return validateMethodArgs(ctx, method, ctx.arguments());
    }

    private Type validateMethodArgs(org.antlr.v4.runtime.ParserRuleContext ctx,
                                     MethodSymbol method,
                                     AUJavaParser.ArgumentsContext argsCtx) {
        List<Type> argTypes = new ArrayList<>();
        if (argsCtx != null) {
            for (AUJavaParser.ExprContext argExpr : argsCtx.expr()) {
                argTypes.add(visit(argExpr));
            }
        }

        List<Symbol> params = method.getParameters();
        if (argTypes.size() != params.size()) {
            error(ctx, "Method '" + method.getName() + "' expected " + params.size() + " arguments but got " + argTypes.size());
            return method.getReturnType();
        }

        for (int i = 0; i < params.size(); i++) {
            Type paramType = params.get(i).getType();
            Type argType = argTypes.get(i);
            if (!isAssignable(paramType, argType)) {
                error(ctx, "Method '" + method.getName() + "' argument " + (i + 1) + " expected " + paramType + " but got " + argType);
            }
        }

        return method.getReturnType();
    }

    @Override
    public Type visitNewObjectExpr(AUJavaParser.NewObjectExprContext ctx) {
        String className = ctx.Identifier().getText();
        ClassSymbol cs = symbolTable.getClass(className);
        if (cs == null) {
            error(ctx, "Cannot instantiate undefined class '" + className + "'");
            return Type.ERROR_TYPE;
        }
        return new Type(Type.Kind.CLASS, className);
    }

    @Override
    public Type visitThisExpr(AUJavaParser.ThisExprContext ctx) {
        MethodSymbol currentMethod = symbolTable.getCurrentMethod();
        if (currentMethod != null && currentMethod.isStatic()) {
            error(ctx, "Cannot use 'this' in a static method");
            return Type.ERROR_TYPE;
        }
        ClassSymbol currentClass = symbolTable.getCurrentClass();
        if (currentClass == null) {
            error(ctx, "'this' used outside of class context");
            return Type.ERROR_TYPE;
        }
        return new Type(Type.Kind.CLASS, currentClass.getName());
    }

    @Override
    public Type visitVarExpr(AUJavaParser.VarExprContext ctx) {
        String varName = ctx.Identifier().getText();
        Symbol sym = symbolTable.resolveVariable(varName);

        if (sym == null) {
            // Check if it's a known class name (for static access)
            ClassSymbol cs = symbolTable.getClass(varName);
            if (cs != null) {
                return new Type(Type.Kind.CLASS, varName);
            }

            error(ctx, "Variable '" + varName + "' is not defined");
            return Type.ERROR_TYPE;
        }

        // Check: cannot access instance field from static context
        if (sym.isField() && !sym.isStatic()) {
            MethodSymbol currentMethod = symbolTable.getCurrentMethod();
            if (currentMethod != null && currentMethod.isStatic()) {
                error(ctx, "Cannot access instance field '" + varName + "' from static context");
                return Type.ERROR_TYPE;
            }
        }

        return sym.getType();
    }

    @Override
    public Type visitIntLiteralExpr(AUJavaParser.IntLiteralExprContext ctx) {
        return Type.INT_TYPE;
    }

    @Override
    public Type visitBoolLiteralExpr(AUJavaParser.BoolLiteralExprContext ctx) {
        return Type.BOOL_TYPE;
    }

    @Override
    public Type visitParenExpr(AUJavaParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    private Type resolveType(AUJavaParser.TypeContext ctx) {
        if (ctx.INT() != null) return Type.INT_TYPE;
        if (ctx.BOOLEAN() != null) return Type.BOOL_TYPE;
        if (ctx.Identifier() != null) return new Type(Type.Kind.CLASS, ctx.Identifier().getText());
        return Type.ERROR_TYPE;
    }

    private boolean isAssignable(Type target, Type source) {
        if (target == null || source == null) return false;
        if (target.isError() || source.isError()) return true; // suppress redundant errors
        if (target.equals(source)) return true;

        // Object inheritance subtyping
        if (target.isClass() && source.isClass()) {
            ClassSymbol targetCs = symbolTable.getClass(target.getName());
            ClassSymbol sourceCs = symbolTable.getClass(source.getName());
            if (sourceCs != null && targetCs != null) {
                return sourceCs.isSubclassOf(targetCs);
            }
        }
        return false;
    }
}
