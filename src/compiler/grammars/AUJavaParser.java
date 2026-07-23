// Generated from grammars/AUJava.g4 by ANTLR 4.9.2

package compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AUJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PUBLIC=2, STATIC=3, VOID=4, MAIN=5, EXTENDS=6, INT=7, BOOLEAN=8, 
		IF=9, ELSE=10, WHILE=11, BREAK=12, CONTINUE=13, RETURN=14, NEW=15, THIS=16, 
		STRING=17, SYSTEM_OUT_PRINTLN=18, BOOL_LITERAL=19, INT_LITERAL=20, LOGOR=21, 
		LOGAND=22, EQ=23, NEQ=24, LTE=25, GTE=26, LT=27, GT=28, PLUS=29, MINUS=30, 
		MULT=31, DIV=32, MOD=33, NOT=34, ASSIGN=35, LPAREN=36, RPAREN=37, LBRACE=38, 
		RBRACE=39, LBRACK=40, RBRACK=41, SEMI=42, COMMA=43, DOT=44, Identifier=45, 
		SINGLE_LINE_COMMENT=46, MULTI_LINE_COMMENT=47, WS=48;
	public static final int
		RULE_program = 0, RULE_classDecl = 1, RULE_classBodyMember = 2, RULE_mainMethodDecl = 3, 
		RULE_fieldDecl = 4, RULE_methodDecl = 5, RULE_formalParameters = 6, RULE_formalParameter = 7, 
		RULE_type = 8, RULE_returnType = 9, RULE_statement = 10, RULE_blockStatement = 11, 
		RULE_varDeclStatement = 12, RULE_ifStatement = 13, RULE_whileStatement = 14, 
		RULE_breakStatement = 15, RULE_continueStatement = 16, RULE_returnStatement = 17, 
		RULE_printStatement = 18, RULE_exprStatement = 19, RULE_expr = 20, RULE_arguments = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDecl", "classBodyMember", "mainMethodDecl", "fieldDecl", 
			"methodDecl", "formalParameters", "formalParameter", "type", "returnType", 
			"statement", "blockStatement", "varDeclStatement", "ifStatement", "whileStatement", 
			"breakStatement", "continueStatement", "returnStatement", "printStatement", 
			"exprStatement", "expr", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'public'", "'static'", "'void'", "'main'", "'extends'", 
			"'int'", "'boolean'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
			"'return'", "'new'", "'this'", "'String'", "'System.out.println'", null, 
			null, "'||'", "'&&'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'='", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "EXTENDS", "INT", 
			"BOOLEAN", "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", "RETURN", "NEW", 
			"THIS", "STRING", "SYSTEM_OUT_PRINTLN", "BOOL_LITERAL", "INT_LITERAL", 
			"LOGOR", "LOGAND", "EQ", "NEQ", "LTE", "GTE", "LT", "GT", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "NOT", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "Identifier", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AUJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AUJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AUJavaParser.EOF, 0); }
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				classDecl();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS || _la==PUBLIC );
			setState(49);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AUJavaParser.CLASS, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AUJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AUJavaParser.Identifier, i);
		}
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public TerminalNode PUBLIC() { return getToken(AUJavaParser.PUBLIC, 0); }
		public TerminalNode EXTENDS() { return getToken(AUJavaParser.EXTENDS, 0); }
		public List<ClassBodyMemberContext> classBodyMember() {
			return getRuleContexts(ClassBodyMemberContext.class);
		}
		public ClassBodyMemberContext classBodyMember(int i) {
			return getRuleContext(ClassBodyMemberContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(51);
				match(PUBLIC);
				}
			}

			setState(54);
			match(CLASS);
			setState(55);
			match(Identifier);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(56);
				match(EXTENDS);
				setState(57);
				match(Identifier);
				}
			}

			setState(60);
			match(LBRACE);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << STATIC) | (1L << VOID) | (1L << INT) | (1L << BOOLEAN) | (1L << Identifier))) != 0)) {
				{
				{
				setState(61);
				classBodyMember();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyMemberContext extends ParserRuleContext {
		public MainMethodDeclContext mainMethodDecl() {
			return getRuleContext(MainMethodDeclContext.class,0);
		}
		public FieldDeclContext fieldDecl() {
			return getRuleContext(FieldDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public ClassBodyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterClassBodyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitClassBodyMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitClassBodyMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyMemberContext classBodyMember() throws RecognitionException {
		ClassBodyMemberContext _localctx = new ClassBodyMemberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBodyMember);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				mainMethodDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				fieldDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				methodDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainMethodDeclContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AUJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(AUJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(AUJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(AUJavaParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AUJavaParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(AUJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AUJavaParser.RBRACK, 0); }
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterMainMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitMainMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMainMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclContext mainMethodDecl() throws RecognitionException {
		MainMethodDeclContext _localctx = new MainMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainMethodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PUBLIC);
			setState(75);
			match(STATIC);
			setState(76);
			match(VOID);
			setState(77);
			match(MAIN);
			setState(78);
			match(LPAREN);
			setState(79);
			match(STRING);
			setState(80);
			match(LBRACK);
			setState(81);
			match(RBRACK);
			setState(82);
			match(Identifier);
			setState(83);
			match(RPAREN);
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << SYSTEM_OUT_PRINTLN) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(AUJavaParser.STATIC, 0); }
		public TerminalNode ASSIGN() { return getToken(AUJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(93);
				match(STATIC);
				}
			}

			setState(96);
			type();
			setState(97);
			match(Identifier);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(98);
				match(ASSIGN);
				setState(99);
				expr(0);
				}
			}

			setState(102);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public TerminalNode PUBLIC() { return getToken(AUJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(AUJavaParser.STATIC, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUBLIC) {
				{
				setState(104);
				match(PUBLIC);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(107);
				match(STATIC);
				}
			}

			setState(110);
			returnType();
			setState(111);
			match(Identifier);
			setState(112);
			match(LPAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << Identifier))) != 0)) {
				{
				setState(113);
				formalParameters();
				}
			}

			setState(116);
			match(RPAREN);
			setState(117);
			match(LBRACE);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << SYSTEM_OUT_PRINTLN) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AUJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AUJavaParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			formalParameter();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				formalParameter();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AUJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(AUJavaParser.BOOLEAN, 0); }
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(AUJavaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(VOID);
				}
				break;
			case INT:
			case BOOLEAN:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VarDeclStatementContext varDeclStatement() {
			return getRuleContext(VarDeclStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				varDeclStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				breakStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				continueStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				exprStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LBRACE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << SYSTEM_OUT_PRINTLN) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE) | (1L << Identifier))) != 0)) {
				{
				{
				setState(155);
				statement();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(AUJavaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterVarDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitVarDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitVarDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclStatementContext varDeclStatement() throws RecognitionException {
		VarDeclStatementContext _localctx = new VarDeclStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDeclStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			type();
			setState(164);
			match(Identifier);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(165);
				match(ASSIGN);
				setState(166);
				expr(0);
				}
			}

			setState(169);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AUJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AUJavaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			match(LPAREN);
			setState(173);
			expr(0);
			setState(174);
			match(RPAREN);
			setState(175);
			statement();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(176);
				match(ELSE);
				setState(177);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AUJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(LPAREN);
			setState(182);
			expr(0);
			setState(183);
			match(RPAREN);
			setState(184);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AUJavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(BREAK);
			setState(187);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(AUJavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CONTINUE);
			setState(190);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AUJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(RETURN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
				{
				setState(193);
				expr(0);
				}
			}

			setState(196);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode SYSTEM_OUT_PRINTLN() { return getToken(AUJavaParser.SYSTEM_OUT_PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(SYSTEM_OUT_PRINTLN);
			setState(199);
			match(LPAREN);
			setState(200);
			expr(0);
			setState(201);
			match(RPAREN);
			setState(202);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr(0);
			setState(205);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolLiteralExprContext extends ExprContext {
		public TerminalNode BOOL_LITERAL() { return getToken(AUJavaParser.BOOL_LITERAL, 0); }
		public BoolLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterBoolLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitBoolLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitBoolLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjectExprContext extends ExprContext {
		public TerminalNode NEW() { return getToken(AUJavaParser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public NewObjectExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterNewObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitNewObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitNewObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(AUJavaParser.LT, 0); }
		public TerminalNode LTE() { return getToken(AUJavaParser.LTE, 0); }
		public TerminalNode GT() { return getToken(AUJavaParser.GT, 0); }
		public TerminalNode GTE() { return getToken(AUJavaParser.GTE, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(AUJavaParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(AUJavaParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(AUJavaParser.PLUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOGAND() { return getToken(AUJavaParser.LOGAND, 0); }
		public LogicalAndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public ExprContext target;
		public ExprContext value;
		public TerminalNode ASSIGN() { return getToken(AUJavaParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(AUJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(AUJavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AUJavaParser.MOD, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOGOR() { return getToken(AUJavaParser.LOGOR, 0); }
		public LogicalOrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralExprContext extends ExprContext {
		public TerminalNode INT_LITERAL() { return getToken(AUJavaParser.INT_LITERAL, 0); }
		public IntLiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterIntLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitIntLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitIntLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AUJavaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AUJavaParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AUJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AUJavaParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalMethodCallExprContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LocalMethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterLocalMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitLocalMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitLocalMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AUJavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public FieldAccessExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterFieldAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitFieldAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFieldAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprContext extends ExprContext {
		public TerminalNode THIS() { return getToken(AUJavaParser.THIS, 0); }
		public ThisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterThisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitThisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AUJavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AUJavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterMethodCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitMethodCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new LocalMethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				match(Identifier);
				setState(209);
				match(LPAREN);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
					{
					setState(210);
					arguments();
					}
				}

				setState(213);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NewObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(NEW);
				setState(215);
				match(Identifier);
				setState(216);
				match(LPAREN);
				setState(217);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(THIS);
				}
				break;
			case 4:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(Identifier);
				}
				break;
			case 5:
				{
				_localctx = new IntLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(INT_LITERAL);
				}
				break;
			case 6:
				{
				_localctx = new BoolLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(BOOL_LITERAL);
				}
				break;
			case 7:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(LPAREN);
				setState(223);
				expr(0);
				setState(224);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(226);
					((UnaryExprContext)_localctx).op = match(NOT);
					}
					break;
				case MINUS:
					{
					setState(227);
					((UnaryExprContext)_localctx).op = match(MINUS);
					}
					break;
				case PLUS:
					{
					setState(228);
					((UnaryExprContext)_localctx).op = match(PLUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				expr(8);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						((MultiplicativeExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(238);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(235);
							((MultiplicativeExprContext)_localctx).op = match(MULT);
							}
							break;
						case DIV:
							{
							setState(236);
							((MultiplicativeExprContext)_localctx).op = match(DIV);
							}
							break;
						case MOD:
							{
							setState(237);
							((MultiplicativeExprContext)_localctx).op = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(240);
						((MultiplicativeExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						((AdditiveExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(242);
							((AdditiveExprContext)_localctx).op = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(243);
							((AdditiveExprContext)_localctx).op = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(246);
						((AdditiveExprContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(252);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(248);
							((RelationalExprContext)_localctx).op = match(LT);
							}
							break;
						case LTE:
							{
							setState(249);
							((RelationalExprContext)_localctx).op = match(LTE);
							}
							break;
						case GT:
							{
							setState(250);
							((RelationalExprContext)_localctx).op = match(GT);
							}
							break;
						case GTE:
							{
							setState(251);
							((RelationalExprContext)_localctx).op = match(GTE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(254);
						((RelationalExprContext)_localctx).right = expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(258);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(256);
							((EqualityExprContext)_localctx).op = match(EQ);
							}
							break;
						case NEQ:
							{
							setState(257);
							((EqualityExprContext)_localctx).op = match(NEQ);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(260);
						((EqualityExprContext)_localctx).right = expr(5);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExprContext(new ExprContext(_parentctx, _parentState));
						((LogicalAndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						((LogicalAndExprContext)_localctx).op = match(LOGAND);
						setState(263);
						((LogicalAndExprContext)_localctx).right = expr(4);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExprContext(new ExprContext(_parentctx, _parentState));
						((LogicalOrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						((LogicalOrExprContext)_localctx).op = match(LOGOR);
						setState(266);
						((LogicalOrExprContext)_localctx).right = expr(3);
						}
						break;
					case 7:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						((AssignExprContext)_localctx).target = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(268);
						match(ASSIGN);
						setState(269);
						((AssignExprContext)_localctx).value = expr(1);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(271);
						match(DOT);
						setState(272);
						match(Identifier);
						setState(273);
						match(LPAREN);
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << BOOL_LITERAL) | (1L << INT_LITERAL) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << LPAREN) | (1L << Identifier))) != 0)) {
							{
							setState(274);
							arguments();
							}
						}

						setState(277);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new FieldAccessExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(279);
						match(DOT);
						setState(280);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AUJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AUJavaParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AUJavaListener ) ((AUJavaListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expr(0);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				expr(0);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0129\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\3\2\3\3\5\3\67\n\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\6\5\6a\n"+
		"\6\3\6\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\7\5\7l\n\7\3\7\5\7o\n\7\3\7\3\7"+
		"\3\7\3\7\5\7u\n\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5"+
		"\13\u0090\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3"+
		"\r\7\r\u009f\n\r\f\r\16\r\u00a2\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00aa\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b5\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\5\23\u00c5\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\5\26\u00d6\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e8\n\26\3\26"+
		"\5\26\u00eb\n\26\3\26\3\26\3\26\3\26\5\26\u00f1\n\26\3\26\3\26\3\26\3"+
		"\26\5\26\u00f7\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ff\n\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0105\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0116\n\26\3\26\3\26\3\26\3\26"+
		"\7\26\u011c\n\26\f\26\16\26\u011f\13\26\3\27\3\27\3\27\7\27\u0124\n\27"+
		"\f\27\16\27\u0127\13\27\3\27\2\3*\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\3\4\2\t\n//\2\u0149\2/\3\2\2\2\4\66\3\2\2\2\6J\3\2\2"+
		"\2\bL\3\2\2\2\n`\3\2\2\2\fk\3\2\2\2\16\u0080\3\2\2\2\20\u0088\3\2\2\2"+
		"\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32"+
		"\u00a5\3\2\2\2\34\u00ad\3\2\2\2\36\u00b6\3\2\2\2 \u00bc\3\2\2\2\"\u00bf"+
		"\3\2\2\2$\u00c2\3\2\2\2&\u00c8\3\2\2\2(\u00ce\3\2\2\2*\u00ea\3\2\2\2,"+
		"\u0120\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2\2\65\67\7\4\2\2\66\65\3"+
		"\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\3\2\29<\7/\2\2:;\7\b\2\2;=\7/\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>B\7(\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7)\2\2F\5\3\2\2\2GK\5\b\5\2"+
		"HK\5\n\6\2IK\5\f\7\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7\4\2"+
		"\2MN\7\5\2\2NO\7\6\2\2OP\7\7\2\2PQ\7&\2\2QR\7\23\2\2RS\7*\2\2ST\7+\2\2"+
		"TU\7/\2\2UV\7\'\2\2VZ\7(\2\2WY\5\26\f\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7)\2\2^\t\3\2\2\2_a\7\5\2\2`_\3\2\2"+
		"\2`a\3\2\2\2ab\3\2\2\2bc\5\22\n\2cf\7/\2\2de\7%\2\2eg\5*\26\2fd\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7,\2\2i\13\3\2\2\2jl\7\4\2\2kj\3\2\2\2kl\3\2"+
		"\2\2ln\3\2\2\2mo\7\5\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\24\13\2qr\7"+
		"/\2\2rt\7&\2\2su\5\16\b\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\'\2\2w{\7"+
		"(\2\2xz\5\26\f\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3"+
		"\2\2\2~\177\7)\2\2\177\r\3\2\2\2\u0080\u0085\5\20\t\2\u0081\u0082\7-\2"+
		"\2\u0082\u0084\5\20\t\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\5\22\n\2\u0089\u008a\7/\2\2\u008a\21\3\2\2\2\u008b\u008c"+
		"\t\2\2\2\u008c\23\3\2\2\2\u008d\u0090\7\6\2\2\u008e\u0090\5\22\n\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\25\3\2\2\2\u0091\u009b\5\30\r"+
		"\2\u0092\u009b\5\32\16\2\u0093\u009b\5\34\17\2\u0094\u009b\5\36\20\2\u0095"+
		"\u009b\5 \21\2\u0096\u009b\5\"\22\2\u0097\u009b\5$\23\2\u0098\u009b\5"+
		"&\24\2\u0099\u009b\5(\25\2\u009a\u0091\3\2\2\2\u009a\u0092\3\2\2\2\u009a"+
		"\u0093\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2"+
		"\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\27\3\2\2\2\u009c\u00a0\7(\2\2\u009d\u009f\5\26\f\2\u009e\u009d\3\2\2"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4\31\3\2\2\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a9\7/\2\2\u00a7\u00a8\7%\2\2\u00a8\u00aa\5*\26"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7,\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\7&\2\2\u00af"+
		"\u00b0\5*\26\2\u00b0\u00b1\7\'\2\2\u00b1\u00b4\5\26\f\2\u00b2\u00b3\7"+
		"\f\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\35\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\7&\2\2\u00b8\u00b9\5*\26\2"+
		"\u00b9\u00ba\7\'\2\2\u00ba\u00bb\5\26\f\2\u00bb\37\3\2\2\2\u00bc\u00bd"+
		"\7\16\2\2\u00bd\u00be\7,\2\2\u00be!\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0"+
		"\u00c1\7,\2\2\u00c1#\3\2\2\2\u00c2\u00c4\7\20\2\2\u00c3\u00c5\5*\26\2"+
		"\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\7,\2\2\u00c7%\3\2\2\2\u00c8\u00c9\7\24\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cb"+
		"\5*\26\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\7,\2\2\u00cd\'\3\2\2\2\u00ce"+
		"\u00cf\5*\26\2\u00cf\u00d0\7,\2\2\u00d0)\3\2\2\2\u00d1\u00d2\b\26\1\2"+
		"\u00d2\u00d3\7/\2\2\u00d3\u00d5\7&\2\2\u00d4\u00d6\5,\27\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00eb\7\'\2\2\u00d8"+
		"\u00d9\7\21\2\2\u00d9\u00da\7/\2\2\u00da\u00db\7&\2\2\u00db\u00eb\7\'"+
		"\2\2\u00dc\u00eb\7\22\2\2\u00dd\u00eb\7/\2\2\u00de\u00eb\7\26\2\2\u00df"+
		"\u00eb\7\25\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7\'"+
		"\2\2\u00e3\u00eb\3\2\2\2\u00e4\u00e8\7$\2\2\u00e5\u00e8\7 \2\2\u00e6\u00e8"+
		"\7\37\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00eb\5*\26\n\u00ea\u00d1\3\2\2\2\u00ea\u00d8"+
		"\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea"+
		"\u00df\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u011d\3\2"+
		"\2\2\u00ec\u00f0\f\t\2\2\u00ed\u00f1\7!\2\2\u00ee\u00f1\7\"\2\2\u00ef"+
		"\u00f1\7#\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u011c\5*\26\n\u00f3\u00f6\f\b\2\2\u00f4"+
		"\u00f7\7\37\2\2\u00f5\u00f7\7 \2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u011c\5*\26\t\u00f9\u00fe\f\7\2\2\u00fa"+
		"\u00ff\7\35\2\2\u00fb\u00ff\7\33\2\2\u00fc\u00ff\7\36\2\2\u00fd\u00ff"+
		"\7\34\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u011c\5*\26\b\u0101\u0104"+
		"\f\6\2\2\u0102\u0105\7\31\2\2\u0103\u0105\7\32\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u011c\5*\26\7\u0107\u0108"+
		"\f\5\2\2\u0108\u0109\7\30\2\2\u0109\u011c\5*\26\6\u010a\u010b\f\4\2\2"+
		"\u010b\u010c\7\27\2\2\u010c\u011c\5*\26\5\u010d\u010e\f\3\2\2\u010e\u010f"+
		"\7%\2\2\u010f\u011c\5*\26\3\u0110\u0111\f\23\2\2\u0111\u0112\7.\2\2\u0112"+
		"\u0113\7/\2\2\u0113\u0115\7&\2\2\u0114\u0116\5,\27\2\u0115\u0114\3\2\2"+
		"\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\7\'\2\2\u0118\u0119"+
		"\f\22\2\2\u0119\u011a\7.\2\2\u011a\u011c\7/\2\2\u011b\u00ec\3\2\2\2\u011b"+
		"\u00f3\3\2\2\2\u011b\u00f9\3\2\2\2\u011b\u0101\3\2\2\2\u011b\u0107\3\2"+
		"\2\2\u011b\u010a\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u0110\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e+\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125\5*\26\2\u0121\u0122"+
		"\7-\2\2\u0122\u0124\5*\26\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126-\3\2\2\2\u0127\u0125\3\2\2\2"+
		" \61\66<BJZ`fknt{\u0085\u008f\u009a\u00a0\u00a9\u00b4\u00c4\u00d5\u00e7"+
		"\u00ea\u00f0\u00f6\u00fe\u0104\u0115\u011b\u011d\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}