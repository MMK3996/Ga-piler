// Generated from grammars/AUJava.g4 by ANTLR 4.9.2

package compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AUJavaParser}.
 */
public interface AUJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AUJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AUJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AUJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AUJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#classBodyMember}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyMember(AUJavaParser.ClassBodyMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#classBodyMember}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyMember(AUJavaParser.ClassBodyMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#mainMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDecl(AUJavaParser.MainMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#mainMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDecl(AUJavaParser.MainMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(AUJavaParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(AUJavaParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(AUJavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(AUJavaParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(AUJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(AUJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(AUJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(AUJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AUJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AUJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(AUJavaParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(AUJavaParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AUJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AUJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(AUJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(AUJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#varDeclStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStatement(AUJavaParser.VarDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#varDeclStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStatement(AUJavaParser.VarDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AUJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AUJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AUJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AUJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AUJavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AUJavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(AUJavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(AUJavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AUJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AUJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AUJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AUJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(AUJavaParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(AUJavaParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteralExpr(AUJavaParser.BoolLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteralExpr(AUJavaParser.BoolLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewObjectExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectExpr(AUJavaParser.NewObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewObjectExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectExpr(AUJavaParser.NewObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(AUJavaParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(AUJavaParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AUJavaParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AUJavaParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(AUJavaParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(AUJavaParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(AUJavaParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(AUJavaParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(AUJavaParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(AUJavaParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(AUJavaParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(AUJavaParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteralExpr(AUJavaParser.IntLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteralExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteralExpr(AUJavaParser.IntLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(AUJavaParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(AUJavaParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(AUJavaParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(AUJavaParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LocalMethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocalMethodCallExpr(AUJavaParser.LocalMethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LocalMethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocalMethodCallExpr(AUJavaParser.LocalMethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(AUJavaParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(AUJavaParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExpr(AUJavaParser.FieldAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccessExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExpr(AUJavaParser.FieldAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(AUJavaParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(AUJavaParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(AUJavaParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(AUJavaParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(AUJavaParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpr}
	 * labeled alternative in {@link AUJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(AUJavaParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AUJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AUJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AUJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AUJavaParser.ArgumentsContext ctx);
}