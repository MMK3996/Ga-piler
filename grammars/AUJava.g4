grammar AUJava;

@header {
package compiler;
}

// ==========================================
// PARSER RULES
// ==========================================

program
    : classDecl+ EOF
    ;

classDecl
    : PUBLIC? CLASS Identifier (EXTENDS Identifier)? LBRACE classBodyMember* RBRACE
    ;

classBodyMember
    : mainMethodDecl
    | fieldDecl
    | methodDecl
    ;

mainMethodDecl
    : PUBLIC STATIC VOID MAIN LPAREN STRING LBRACK RBRACK Identifier RPAREN LBRACE statement* RBRACE
    ;

fieldDecl
    : STATIC? type Identifier (ASSIGN expr)? SEMI
    ;

methodDecl
    : PUBLIC? STATIC? returnType Identifier LPAREN formalParameters? RPAREN LBRACE statement* RBRACE
    ;

formalParameters
    : formalParameter (COMMA formalParameter)*
    ;

formalParameter
    : type Identifier
    ;

type
    : INT
    | BOOLEAN
    | Identifier
    ;

returnType
    : VOID
    | type
    ;

statement
    : blockStatement
    | varDeclStatement
    | ifStatement
    | whileStatement
    | breakStatement
    | continueStatement
    | returnStatement
    | printStatement
    | exprStatement
    ;

blockStatement
    : LBRACE statement* RBRACE
    ;

varDeclStatement
    : type Identifier (ASSIGN expr)? SEMI
    ;

ifStatement
    : IF LPAREN expr RPAREN statement (ELSE statement)?
    ;

whileStatement
    : WHILE LPAREN expr RPAREN statement
    ;

breakStatement
    : BREAK SEMI
    ;

continueStatement
    : CONTINUE SEMI
    ;

returnStatement
    : RETURN expr? SEMI
    ;

printStatement
    : SYSTEM_OUT_PRINTLN LPAREN expr RPAREN SEMI
    ;

exprStatement
    : expr SEMI
    ;

// Expression hierarchy for ANTLR4: Top rules = highest precedence, Bottom = lowest
expr
    : expr DOT Identifier LPAREN arguments? RPAREN                       # MethodCallExpr
    | expr DOT Identifier                                                # FieldAccessExpr
    | Identifier LPAREN arguments? RPAREN                                # LocalMethodCallExpr
    | NEW Identifier LPAREN RPAREN                                      # NewObjectExpr
    | THIS                                                               # ThisExpr
    | Identifier                                                         # VarExpr
    | INT_LITERAL                                                        # IntLiteralExpr
    | BOOL_LITERAL                                                       # BoolLiteralExpr
    | LPAREN expr RPAREN                                                 # ParenExpr
    | (op=NOT | op=MINUS | op=PLUS) expr                                 # UnaryExpr
    | left = expr (op=MULT | op=DIV | op=MOD) right = expr               # MultiplicativeExpr
    | left = expr (op=PLUS | op=MINUS) right = expr                      # AdditiveExpr
    | left = expr (op=LT | op=LTE | op=GT | op=GTE) right = expr         # RelationalExpr
    | left = expr (op=EQ | op=NEQ) right = expr                          # EqualityExpr
    | left = expr op = LOGAND right = expr                              # LogicalAndExpr
    | left = expr op = LOGOR right = expr                               # LogicalOrExpr
    | <assoc=right> target = expr ASSIGN value = expr                   # AssignExpr
    ;

arguments
    : expr (COMMA expr)*
    ;

// ==========================================
// LEXER RULES
// ==========================================

CLASS                : 'class' ;
PUBLIC               : 'public' ;
STATIC               : 'static' ;
VOID                 : 'void' ;
MAIN                 : 'main' ;
EXTENDS              : 'extends' ;
INT                  : 'int' ;
BOOLEAN              : 'boolean' ;
IF                   : 'if' ;
ELSE                 : 'else' ;
WHILE                : 'while' ;
BREAK                : 'break' ;
CONTINUE             : 'continue' ;
RETURN               : 'return' ;
NEW                  : 'new' ;
THIS                 : 'this' ;
STRING               : 'String' ;
SYSTEM_OUT_PRINTLN   : 'System.out.println' ;

BOOL_LITERAL         : 'true' | 'false' ;
INT_LITERAL          : [0-9]+ ;

LOGOR                : '||' ;
LOGAND               : '&&' ;
EQ                   : '==' ;
NEQ                  : '!=' ;
LTE                  : '<=' ;
GTE                  : '>=' ;
LT                   : '<' ;
GT                   : '>' ;
PLUS                 : '+' ;
MINUS                : '-' ;
MULT                 : '*' ;
DIV                  : '/' ;
MOD                  : '%' ;
NOT                  : '!' ;
ASSIGN               : '=' ;

LPAREN               : '(' ;
RPAREN               : ')' ;
LBRACE               : '{' ;
RBRACE               : '}' ;
LBRACK               : '[' ;
RBRACK               : ']' ;
SEMI                 : ';' ;
COMMA                : ',' ;
DOT                  : '.' ;

Identifier           : [a-zA-Z_][a-zA-Z0-9_]* ;

// Comments
SINGLE_LINE_COMMENT  : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT   : '/*' .*? '*/' -> skip ;

// Whitespace
WS                   : [ \t\r\n]+ -> skip ;
