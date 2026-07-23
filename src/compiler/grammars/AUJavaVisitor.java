// Generated from grammars/AUJava.g4 by ANTLR 4.9.2

package compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AUJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AUJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AUJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AUJavaParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#classBodyMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyMember(AUJavaParser.ClassBodyMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#mainMethodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDecl(AUJavaParser.MainMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(AUJavaParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(AUJavaParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(AUJavaParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(AUJavaParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AUJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(AUJavaParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AUJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(AUJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#varDeclStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStatement(AUJavaParser.VarDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AUJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AUJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AUJavaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AUJavaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AUJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AUJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#exprStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(AUJavaParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteralExpr(AUJavaParser.BoolLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewObjectExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectExpr(AUJavaParser.NewObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(AUJavaParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AUJavaParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(AUJavaParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(AUJavaParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(AUJavaParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(AUJavaParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralExpr(AUJavaParser.IntLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AUJavaParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(AUJavaParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LocalMethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalMethodCallExpr(AUJavaParser.LocalMethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(AUJavaParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessExpr(AUJavaParser.FieldAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(AUJavaParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(AUJavaParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(AUJavaParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AUJavaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AUJavaParser.ArgumentsContext ctx);
}