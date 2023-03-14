// Generated from java-escape by ANTLR 4.11.1
package org.argennon.csgot.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CsGoParser extends CsGoParserBase {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, DEFAULT=2, FUNC=3, INTERFACE=4, SELECT=5, CASE=6, DEFER=7, GO=8, 
		MAP=9, STRUCT=10, CHAN=11, ELSE=12, GOTO=13, PACKAGE=14, SWITCH=15, CONST=16, 
		FALLTHROUGH=17, IF=18, RANGE=19, TYPE=20, CONTINUE=21, FOR=22, IMPORT=23, 
		RETURN=24, VAR=25, NIL_LIT=26, IDENTIFIER=27, L_PAREN=28, R_PAREN=29, 
		L_CURLY=30, R_CURLY=31, L_BRACKET=32, R_BRACKET=33, ASSIGN=34, COMMA=35, 
		SEMI=36, COLON=37, DOT=38, PLUS_PLUS=39, MINUS_MINUS=40, DECLARE_ASSIGN=41, 
		ELLIPSIS=42, LOGICAL_OR=43, LOGICAL_AND=44, EQUATION=45, EQUALS=46, NOT_EQUALS=47, 
		LESS=48, LESS_OR_EQUALS=49, GREATER=50, GREATER_OR_EQUALS=51, OR=52, DIV=53, 
		MOD=54, LSHIFT=55, RSHIFT=56, BIT_CLEAR=57, EXCLAMATION=58, PLUS=59, MINUS=60, 
		CARET=61, STAR=62, AMPERSAND=63, RECEIVE=64, DECIMAL_LIT=65, BINARY_LIT=66, 
		OCTAL_LIT=67, HEX_LIT=68, FLOAT_LIT=69, DECIMAL_FLOAT_LIT=70, HEX_FLOAT_LIT=71, 
		IMAGINARY_LIT=72, RUNE_LIT=73, BYTE_VALUE=74, OCTAL_BYTE_VALUE=75, HEX_BYTE_VALUE=76, 
		LITTLE_U_VALUE=77, BIG_U_VALUE=78, RAW_STRING_LIT=79, INTERPRETED_STRING_LIT=80, 
		WS=81, COMMENT=82, TERMINATOR=83, LINE_COMMENT=84, WS_NLSEMI=85, COMMENT_NLSEMI=86, 
		LINE_COMMENT_NLSEMI=87, EOS=88, OTHER=89;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_declaration = 5, RULE_constDecl = 6, RULE_constSpec = 7, 
		RULE_identifierList = 8, RULE_expressionList = 9, RULE_typeDecl = 10, 
		RULE_typeSpec = 11, RULE_functionDecl = 12, RULE_methodDecl = 13, RULE_receiver = 14, 
		RULE_varDecl = 15, RULE_varSpec = 16, RULE_block = 17, RULE_statementList = 18, 
		RULE_statement = 19, RULE_simpleStmt = 20, RULE_constraintDecl = 21, RULE_expressionStmt = 22, 
		RULE_sendStmt = 23, RULE_incDecStmt = 24, RULE_assignment = 25, RULE_assign_op = 26, 
		RULE_shortVarDecl = 27, RULE_emptyStmt = 28, RULE_labeledStmt = 29, RULE_returnStmt = 30, 
		RULE_breakStmt = 31, RULE_continueStmt = 32, RULE_gotoStmt = 33, RULE_fallthroughStmt = 34, 
		RULE_deferStmt = 35, RULE_ifStmt = 36, RULE_switchStmt = 37, RULE_exprSwitchStmt = 38, 
		RULE_exprCaseClause = 39, RULE_exprSwitchCase = 40, RULE_typeSwitchStmt = 41, 
		RULE_typeSwitchGuard = 42, RULE_typeCaseClause = 43, RULE_typeSwitchCase = 44, 
		RULE_typeList = 45, RULE_selectStmt = 46, RULE_commClause = 47, RULE_commCase = 48, 
		RULE_recvStmt = 49, RULE_forStmt = 50, RULE_forClause = 51, RULE_rangeClause = 52, 
		RULE_goStmt = 53, RULE_type_ = 54, RULE_typeName = 55, RULE_typeLit = 56, 
		RULE_arrayType = 57, RULE_arrayLength = 58, RULE_elementType = 59, RULE_pointerType = 60, 
		RULE_interfaceType = 61, RULE_sliceType = 62, RULE_mapType = 63, RULE_channelType = 64, 
		RULE_methodSpec = 65, RULE_functionType = 66, RULE_signature = 67, RULE_result = 68, 
		RULE_parameters = 69, RULE_parameterDecl = 70, RULE_expression = 71, RULE_primaryExpr = 72, 
		RULE_conversion = 73, RULE_nonNamedType = 74, RULE_operand = 75, RULE_literal = 76, 
		RULE_basicLit = 77, RULE_integer = 78, RULE_operandName = 79, RULE_qualifiedIdent = 80, 
		RULE_compositeLit = 81, RULE_literalType = 82, RULE_literalValue = 83, 
		RULE_elementList = 84, RULE_keyedElement = 85, RULE_key = 86, RULE_element = 87, 
		RULE_structType = 88, RULE_fieldDecl = 89, RULE_string_ = 90, RULE_embeddedField = 91, 
		RULE_functionLit = 92, RULE_index = 93, RULE_slice_ = 94, RULE_typeAssertion = 95, 
		RULE_arguments = 96, RULE_methodExpr = 97, RULE_receiverType = 98, RULE_eos = 99;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
			"declaration", "constDecl", "constSpec", "identifierList", "expressionList", 
			"typeDecl", "typeSpec", "functionDecl", "methodDecl", "receiver", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "constraintDecl", 
			"expressionStmt", "sendStmt", "incDecStmt", "assignment", "assign_op", 
			"shortVarDecl", "emptyStmt", "labeledStmt", "returnStmt", "breakStmt", 
			"continueStmt", "gotoStmt", "fallthroughStmt", "deferStmt", "ifStmt", 
			"switchStmt", "exprSwitchStmt", "exprCaseClause", "exprSwitchCase", "typeSwitchStmt", 
			"typeSwitchGuard", "typeCaseClause", "typeSwitchCase", "typeList", "selectStmt", 
			"commClause", "commCase", "recvStmt", "forStmt", "forClause", "rangeClause", 
			"goStmt", "type_", "typeName", "typeLit", "arrayType", "arrayLength", 
			"elementType", "pointerType", "interfaceType", "sliceType", "mapType", 
			"channelType", "methodSpec", "functionType", "signature", "result", "parameters", 
			"parameterDecl", "expression", "primaryExpr", "conversion", "nonNamedType", 
			"operand", "literal", "basicLit", "integer", "operandName", "qualifiedIdent", 
			"compositeLit", "literalType", "literalValue", "elementList", "keyedElement", 
			"key", "element", "structType", "fieldDecl", "string_", "embeddedField", 
			"functionLit", "index", "slice_", "typeAssertion", "arguments", "methodExpr", 
			"receiverType", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'interface'", "'select'", "'case'", 
			"'defer'", "'go'", "'map'", "'struct'", "'chan'", "'else'", "'goto'", 
			"'package'", "'switch'", "'const'", "'fallthrough'", "'if'", "'range'", 
			"'type'", "'continue'", "'for'", "'import'", "'return'", "'var'", "'nil'", 
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", 
			"':'", "'.'", "'++'", "'--'", "':='", "'...'", "'||'", "'&&'", "'==='", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'|'", "'/'", "'%'", "'<<'", 
			"'>>'", "'&^'", "'!'", "'+'", "'-'", "'^'", "'*'", "'&'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "INTERFACE", "SELECT", "CASE", "DEFER", 
			"GO", "MAP", "STRUCT", "CHAN", "ELSE", "GOTO", "PACKAGE", "SWITCH", "CONST", 
			"FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", "RETURN", 
			"VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", "DOT", 
			"PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUATION", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", 
			"BIT_CLEAR", "EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", 
			"RECEIVE", "DECIMAL_LIT", "BINARY_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", 
			"DECIMAL_FLOAT_LIT", "HEX_FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "BYTE_VALUE", 
			"OCTAL_BYTE_VALUE", "HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", 
			"RAW_STRING_LIT", "INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", 
			"LINE_COMMENT", "WS_NLSEMI", "COMMENT_NLSEMI", "LINE_COMMENT_NLSEMI", 
			"EOS", "OTHER"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsGoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceFileContext extends ParserRuleContext {
		public PackageClauseContext packageClause() {
			return getRuleContext(PackageClauseContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CsGoParser.EOF, 0); }
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			packageClause();
			setState(201);
			eos();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(202);
				importDecl();
				setState(203);
				eos();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 34668552L) != 0) {
				{
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(210);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(211);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(212);
					declaration();
					}
					break;
				}
				setState(215);
				eos();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageClauseContext extends ParserRuleContext {
		public Token packageName;
		public TerminalNode PACKAGE() { return getToken(CsGoParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public PackageClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterPackageClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitPackageClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitPackageClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageClauseContext packageClause() throws RecognitionException {
		PackageClauseContext _localctx = new PackageClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(PACKAGE);
			setState(225);
			((PackageClauseContext)_localctx).packageName = match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(CsGoParser.IMPORT, 0); }
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IMPORT);
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DOT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				{
				setState(228);
				importSpec();
				}
				break;
			case L_PAREN:
				{
				setState(229);
				match(L_PAREN);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 13510798882113537L) != 0) {
					{
					{
					setState(230);
					importSpec();
					setState(231);
					eos();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecContext extends ParserRuleContext {
		public Token alias;
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==DOT) {
				{
				setState(241);
				((ImportSpecContext)_localctx).alias = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==DOT) ) {
					((ImportSpecContext)_localctx).alias = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(244);
			importPath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportPathContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			string_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				varDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CsGoParser.CONST, 0); }
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(CONST);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(254);
				constSpec();
				}
				break;
			case L_PAREN:
				{
				setState(255);
				match(L_PAREN);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(256);
					constSpec();
					setState(257);
					eos();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitConstSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitConstSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			identifierList();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2882303762104320451L) != 0) {
					{
					setState(268);
					type_();
					}
				}

				setState(271);
				match(ASSIGN);
				setState(272);
				expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CsGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CsGoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENTIFIER);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(COMMA);
					setState(277);
					match(IDENTIFIER);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expression(0);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					expression(0);
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CsGoParser.TYPE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TYPE);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(292);
				typeSpec();
				}
				break;
			case L_PAREN:
				{
				setState(293);
				match(L_PAREN);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(294);
					typeSpec();
					setState(295);
					eos();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(306);
				match(ASSIGN);
				}
			}

			setState(309);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CsGoParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(FUNC);
			setState(312);
			match(IDENTIFIER);
			{
			setState(313);
			signature();
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(314);
				block();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CsGoParser.FUNC, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FUNC);
			setState(318);
			receiver();
			setState(319);
			match(IDENTIFIER);
			{
			setState(320);
			signature();
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(321);
				block();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitReceiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitReceiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			parameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CsGoParser.VAR, 0); }
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(VAR);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(327);
				varSpec();
				}
				break;
			case L_PAREN:
				{
				setState(328);
				match(L_PAREN);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(329);
					varSpec();
					setState(330);
					eos();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			identifierList();
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(341);
				type_();
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(342);
					match(ASSIGN);
					setState(343);
					expressionList();
					}
					break;
				}
				}
				break;
			case ASSIGN:
				{
				setState(346);
				match(ASSIGN);
				setState(347);
				expressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(L_CURLY);
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(351);
				statementList();
				}
				break;
			}
			setState(354);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CsGoParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CsGoParser.SEMI, i);
		}
		public List<TerminalNode> EOS() { return getTokens(CsGoParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(CsGoParser.EOS, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMI) {
							{
							setState(356);
							match(SEMI);
							}
						}

						}
						break;
					case 2:
						{
						setState(360);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOS) {
							{
							setState(359);
							match(EOS);
							}
						}

						}
						break;
					case 3:
						{
						setState(362);
						if (!(this.closingBracket())) throw new FailedPredicateException(this, "this.closingBracket()");
						}
						break;
					}
					setState(365);
					statement();
					setState(366);
					eos();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public GoStmtContext goStmt() {
			return getRuleContext(GoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public DeferStmtContext deferStmt() {
			return getRuleContext(DeferStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(378);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(381);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(382);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(383);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(384);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(385);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(386);
				deferStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public ConstraintDeclContext constraintDecl() {
			return getRuleContext(ConstraintDeclContext.class,0);
		}
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_simpleStmt);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				constraintDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				sendStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				expressionStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				shortVarDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintDeclContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUATION() { return getToken(CsGoParser.EQUATION, 0); }
		public ConstraintDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterConstraintDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitConstraintDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitConstraintDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintDeclContext constraintDecl() throws RecognitionException {
		ConstraintDeclContext _localctx = new ConstraintDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constraintDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			expression(0);
			setState(398);
			match(EQUATION);
			setState(399);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitExpressionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SendStmtContext extends ParserRuleContext {
		public ExpressionContext channel;
		public TerminalNode RECEIVE() { return getToken(CsGoParser.RECEIVE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSendStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSendStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSendStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((SendStmtContext)_localctx).channel = expression(0);
			setState(404);
			match(RECEIVE);
			setState(405);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(CsGoParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(CsGoParser.MINUS_MINUS, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitIncDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			expression(0);
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			expressionList();
			setState(411);
			assign_op();
			setState(412);
			expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(CsGoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CsGoParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(CsGoParser.OR, 0); }
		public TerminalNode CARET() { return getToken(CsGoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(CsGoParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CsGoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CsGoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(CsGoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(CsGoParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(CsGoParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(CsGoParser.BIT_CLEAR, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -292733975779082240L) != 0) {
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -292733975779082240L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(417);
			match(ASSIGN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortVarDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(CsGoParser.DECLARE_ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterShortVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitShortVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitShortVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortVarDeclContext shortVarDecl() throws RecognitionException {
		ShortVarDeclContext _localctx = new ShortVarDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			identifierList();
			setState(420);
			match(DECLARE_ASSIGN);
			setState(421);
			expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(CsGoParser.EOS, 0); }
		public TerminalNode SEMI() { return getToken(CsGoParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_emptyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==EOS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CsGoParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitLabeledStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitLabeledStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(IDENTIFIER);
			setState(426);
			match(COLON);
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(427);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CsGoParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(RETURN);
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(431);
				expressionList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CsGoParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(BREAK);
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(435);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CsGoParser.CONTINUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(CONTINUE);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(439);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(CsGoParser.GOTO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitGotoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(GOTO);
			setState(443);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(CsGoParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterFallthroughStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitFallthroughStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitFallthroughStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(FALLTHROUGH);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeferStmtContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(CsGoParser.DEFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterDeferStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitDeferStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitDeferStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(DEFER);
			setState(448);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CsGoParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CsGoParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(IF);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(451);
				expression(0);
				}
				break;
			case 2:
				{
				setState(452);
				eos();
				setState(453);
				expression(0);
				}
				break;
			case 3:
				{
				setState(455);
				simpleStmt();
				setState(456);
				eos();
				setState(457);
				expression(0);
				}
				break;
			}
			setState(461);
			block();
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(462);
				match(ELSE);
				setState(465);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(463);
					ifStmt();
					}
					break;
				case L_CURLY:
					{
					setState(464);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switchStmt);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				typeSwitchStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CsGoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterExprSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitExprSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitExprSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(SWITCH);
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(474);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(477);
					simpleStmt();
					}
					break;
				}
				setState(480);
				eos();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(481);
					expression(0);
					}
				}

				}
				break;
			}
			setState(486);
			match(L_CURLY);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(487);
				exprCaseClause();
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CsGoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitExprCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitExprCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			exprSwitchCase();
			setState(496);
			match(COLON);
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(497);
				statementList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CsGoParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CsGoParser.DEFAULT, 0); }
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterExprSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitExprSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitExprSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exprSwitchCase);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(CASE);
				setState(501);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(DEFAULT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(CsGoParser.SWITCH, 0); }
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(SWITCH);
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(506);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(507);
				eos();
				setState(508);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(510);
				simpleStmt();
				setState(511);
				eos();
				setState(512);
				typeSwitchGuard();
				}
				break;
			}
			setState(516);
			match(L_CURLY);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(517);
				typeCaseClause();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode TYPE() { return getToken(CsGoParser.TYPE, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public TerminalNode DECLARE_ASSIGN() { return getToken(CsGoParser.DECLARE_ASSIGN, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeSwitchGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeSwitchGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(525);
				match(IDENTIFIER);
				setState(526);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(529);
			primaryExpr(0);
			setState(530);
			match(DOT);
			setState(531);
			match(L_PAREN);
			setState(532);
			match(TYPE);
			setState(533);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CsGoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			typeSwitchCase();
			setState(536);
			match(COLON);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(537);
				statementList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CsGoParser.CASE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CsGoParser.DEFAULT, 0); }
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeSwitchCase);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(CASE);
				setState(541);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(DEFAULT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> NIL_LIT() { return getTokens(CsGoParser.NIL_LIT); }
		public TerminalNode NIL_LIT(int i) {
			return getToken(CsGoParser.NIL_LIT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				{
				setState(545);
				type_();
				}
				break;
			case NIL_LIT:
				{
				setState(546);
				match(NIL_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(552);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
				case INTERFACE:
				case MAP:
				case STRUCT:
				case CHAN:
				case IDENTIFIER:
				case L_PAREN:
				case L_BRACKET:
				case STAR:
				case RECEIVE:
					{
					setState(550);
					type_();
					}
					break;
				case NIL_LIT:
					{
					setState(551);
					match(NIL_LIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(558);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CsGoParser.SELECT, 0); }
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public List<CommClauseContext> commClause() {
			return getRuleContexts(CommClauseContext.class);
		}
		public CommClauseContext commClause(int i) {
			return getRuleContext(CommClauseContext.class,i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(SELECT);
			setState(560);
			match(L_CURLY);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(561);
				commClause();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommClauseContext extends ParserRuleContext {
		public CommCaseContext commCase() {
			return getRuleContext(CommCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CsGoParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterCommClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitCommClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitCommClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommClauseContext commClause() throws RecognitionException {
		CommClauseContext _localctx = new CommClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			commCase();
			setState(570);
			match(COLON);
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(571);
				statementList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CsGoParser.CASE, 0); }
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public RecvStmtContext recvStmt() {
			return getRuleContext(RecvStmtContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CsGoParser.DEFAULT, 0); }
		public CommCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterCommCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitCommCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitCommCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommCaseContext commCase() throws RecognitionException {
		CommCaseContext _localctx = new CommCaseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commCase);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(CASE);
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(575);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(576);
					recvStmt();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(DEFAULT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RecvStmtContext extends ParserRuleContext {
		public ExpressionContext recvExpr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(CsGoParser.DECLARE_ASSIGN, 0); }
		public RecvStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recvStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterRecvStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitRecvStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitRecvStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecvStmtContext recvStmt() throws RecognitionException {
		RecvStmtContext _localctx = new RecvStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(582);
				expressionList();
				setState(583);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(585);
				identifierList();
				setState(586);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(590);
			((RecvStmtContext)_localctx).recvExpr = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CsGoParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(FOR);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(593);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(596);
				forClause();
				}
				break;
			case 3:
				{
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386454504L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(597);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(602);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public SimpleStmtContext initStmt;
		public SimpleStmtContext postStmt;
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(604);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
				break;
			}
			setState(607);
			eos();
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(608);
				expression(0);
				}
				break;
			}
			setState(611);
			eos();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
				{
				setState(612);
				((ForClauseContext)_localctx).postStmt = simpleStmt();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(CsGoParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsGoParser.ASSIGN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(CsGoParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitRangeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(615);
				expressionList();
				setState(616);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(618);
				identifierList();
				setState(619);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(623);
			match(RANGE);
			setState(624);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoStmtContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(CsGoParser.GO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterGoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitGoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitGoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoStmtContext goStmt() throws RecognitionException {
		GoStmtContext _localctx = new GoStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(GO);
			setState(627);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_type_);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				typeName();
				}
				break;
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(L_PAREN);
				setState(632);
				type_();
				setState(633);
				match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeName);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public ChannelTypeContext channelType() {
			return getRuleContext(ChannelTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeLit);
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				functionType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(645);
				interfaceType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(646);
				sliceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(647);
				mapType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(648);
				channelType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(L_BRACKET);
			setState(652);
			arrayLength();
			setState(653);
			match(R_BRACKET);
			setState(654);
			elementType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitArrayLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitElementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CsGoParser.STAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(STAR);
			setState(661);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceTypeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CsGoParser.INTERFACE, 0); }
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<MethodSpecContext> methodSpec() {
			return getRuleContexts(MethodSpecContext.class);
		}
		public MethodSpecContext methodSpec(int i) {
			return getRuleContext(MethodSpecContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_interfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(INTERFACE);
			setState(664);
			match(L_CURLY);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(665);
					methodSpec();
					}
					break;
				case 2:
					{
					setState(666);
					typeName();
					}
					break;
				}
				setState(669);
				eos();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(L_BRACKET);
			setState(679);
			match(R_BRACKET);
			setState(680);
			elementType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(CsGoParser.MAP, 0); }
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(MAP);
			setState(683);
			match(L_BRACKET);
			setState(684);
			type_();
			setState(685);
			match(R_BRACKET);
			setState(686);
			elementType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChannelTypeContext extends ParserRuleContext {
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public TerminalNode CHAN() { return getToken(CsGoParser.CHAN, 0); }
		public TerminalNode RECEIVE() { return getToken(CsGoParser.RECEIVE, 0); }
		public ChannelTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterChannelType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitChannelType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitChannelType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelTypeContext channelType() throws RecognitionException {
		ChannelTypeContext _localctx = new ChannelTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(688);
				match(CHAN);
				}
				break;
			case 2:
				{
				setState(689);
				match(CHAN);
				setState(690);
				match(RECEIVE);
				}
				break;
			case 3:
				{
				setState(691);
				match(RECEIVE);
				setState(692);
				match(CHAN);
				}
				break;
			}
			setState(695);
			elementType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitMethodSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitMethodSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_methodSpec);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(IDENTIFIER);
				setState(698);
				parameters();
				setState(699);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(IDENTIFIER);
				setState(702);
				parameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CsGoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(FUNC);
			setState(706);
			signature();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_signature);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				parameters();
				setState(709);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				parameters();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_result);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(L_PAREN);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2882304311860134339L) != 0) {
				{
				setState(719);
				parameterDecl();
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(720);
						match(COMMA);
						setState(721);
						parameterDecl();
						}
						} 
					}
					setState(726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(727);
					match(COMMA);
					}
				}

				}
			}

			setState(732);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CsGoParser.ELLIPSIS, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(734);
				identifierList();
				}
				break;
			}
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(737);
				match(ELLIPSIS);
				}
			}

			setState(740);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExpressionContext {
		public Token add_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CsGoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CsGoParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(CsGoParser.OR, 0); }
		public TerminalNode CARET() { return getToken(CsGoParser.CARET, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExpressionContext {
		public Token mul_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(CsGoParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CsGoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CsGoParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(CsGoParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(CsGoParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(CsGoParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(CsGoParser.BIT_CLEAR, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ExpressionContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PrimaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DcContext extends ExpressionContext {
		public Token unary_op;
		public Token rel_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CsGoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CsGoParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(CsGoParser.EXCLAMATION, 0); }
		public TerminalNode CARET() { return getToken(CsGoParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(CsGoParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(CsGoParser.AMPERSAND, 0); }
		public TerminalNode RECEIVE() { return getToken(CsGoParser.RECEIVE, 0); }
		public TerminalNode EQUALS() { return getToken(CsGoParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(CsGoParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(CsGoParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(CsGoParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(CsGoParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(CsGoParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(CsGoParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(CsGoParser.LOGICAL_OR, 0); }
		public DcContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterDc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitDc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitDc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(743);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				_localctx = new DcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(744);
				((DcContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 127L) != 0) ) {
					((DcContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(745);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(763);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(749);
						((MulContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & -4332462841530417152L) != 0) ) {
							((MulContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(750);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(752);
						((AddContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4039728865751334912L) != 0) ) {
							((AddContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(753);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(755);
						((DcContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0) ) {
							((DcContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(756);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(757);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(758);
						match(LOGICAL_AND);
						setState(759);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(760);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(761);
						match(LOGICAL_OR);
						setState(762);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Slice_Context slice_() {
			return getRuleContext(Slice_Context.class,0);
		}
		public TypeAssertionContext typeAssertion() {
			return getRuleContext(TypeAssertionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(769);
				operand();
				}
				break;
			case 2:
				{
				setState(770);
				conversion();
				}
				break;
			case 3:
				{
				setState(771);
				methodExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(774);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						{
						setState(775);
						match(DOT);
						setState(776);
						match(IDENTIFIER);
						}
						}
						break;
					case 2:
						{
						setState(777);
						index();
						}
						break;
					case 3:
						{
						setState(778);
						slice_();
						}
						break;
					case 4:
						{
						setState(779);
						typeAssertion();
						}
						break;
					case 5:
						{
						setState(780);
						arguments();
						}
						break;
					}
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(CsGoParser.COMMA, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			nonNamedType();
			setState(789);
			match(L_PAREN);
			setState(790);
			expression(0);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(791);
				match(COMMA);
				}
			}

			setState(794);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonNamedTypeContext extends ParserRuleContext {
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public NonNamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonNamedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterNonNamedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitNonNamedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitNonNamedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonNamedTypeContext nonNamedType() throws RecognitionException {
		NonNamedTypeContext _localctx = new NonNamedTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_nonNamedType);
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case RECEIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(L_PAREN);
				setState(798);
				nonNamedType();
				setState(799);
				match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_operand);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				match(L_PAREN);
				setState(806);
				expression(0);
				setState(807);
				match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public CompositeLitContext compositeLit() {
			return getRuleContext(CompositeLitContext.class,0);
		}
		public FunctionLitContext functionLit() {
			return getRuleContext(FunctionLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_literal);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				basicLit();
				}
				break;
			case MAP:
			case STRUCT:
			case IDENTIFIER:
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				functionLit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicLitContext extends ParserRuleContext {
		public TerminalNode NIL_LIT() { return getToken(CsGoParser.NIL_LIT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(CsGoParser.FLOAT_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitBasicLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_basicLit);
		try {
			setState(820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(NIL_LIT);
				}
				break;
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				integer();
				}
				break;
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				match(FLOAT_LIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LIT() { return getToken(CsGoParser.DECIMAL_LIT, 0); }
		public TerminalNode BINARY_LIT() { return getToken(CsGoParser.BINARY_LIT, 0); }
		public TerminalNode OCTAL_LIT() { return getToken(CsGoParser.OCTAL_LIT, 0); }
		public TerminalNode HEX_LIT() { return getToken(CsGoParser.HEX_LIT, 0); }
		public TerminalNode IMAGINARY_LIT() { return getToken(CsGoParser.IMAGINARY_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(CsGoParser.RUNE_LIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 399L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitOperandName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitOperandName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_operandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CsGoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CsGoParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitQualifiedIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitQualifiedIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(IDENTIFIER);
			setState(827);
			match(DOT);
			setState(828);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompositeLitContext extends ParserRuleContext {
		public LiteralTypeContext literalType() {
			return getRuleContext(LiteralTypeContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public CompositeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterCompositeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitCompositeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitCompositeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeLitContext compositeLit() throws RecognitionException {
		CompositeLitContext _localctx = new CompositeLitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			literalType();
			setState(831);
			literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public TerminalNode ELLIPSIS() { return getToken(CsGoParser.ELLIPSIS, 0); }
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitLiteralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitLiteralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_literalType);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				match(L_BRACKET);
				setState(836);
				match(ELLIPSIS);
				setState(837);
				match(R_BRACKET);
				setState(838);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(840);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(841);
				typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CsGoParser.COMMA, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(L_CURLY);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230370313236968L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
				{
				setState(845);
				elementList();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(846);
					match(COMMA);
					}
				}

				}
			}

			setState(851);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementListContext extends ParserRuleContext {
		public List<KeyedElementContext> keyedElement() {
			return getRuleContexts(KeyedElementContext.class);
		}
		public KeyedElementContext keyedElement(int i) {
			return getRuleContext(KeyedElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			keyedElement();
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(854);
					match(COMMA);
					setState(855);
					keyedElement();
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyedElementContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CsGoParser.COLON, 0); }
		public KeyedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterKeyedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitKeyedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitKeyedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedElementContext keyedElement() throws RecognitionException {
		KeyedElementContext _localctx = new KeyedElementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(861);
				key();
				setState(862);
				match(COLON);
				}
				break;
			}
			setState(866);
			element();
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_key);
		try {
			setState(870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_element);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case NIL_LIT:
			case IDENTIFIER:
			case L_PAREN:
			case L_BRACKET:
			case EXCLAMATION:
			case PLUS:
			case MINUS:
			case CARET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
			case DECIMAL_LIT:
			case BINARY_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
			case FLOAT_LIT:
			case IMAGINARY_LIT:
			case RUNE_LIT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CsGoParser.STRUCT, 0); }
		public TerminalNode L_CURLY() { return getToken(CsGoParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(CsGoParser.R_CURLY, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(STRUCT);
			setState(877);
			match(L_CURLY);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==STAR) {
				{
				{
				setState(878);
				fieldDecl();
				setState(879);
				eos();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
			match(R_CURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclContext extends ParserRuleContext {
		public String_Context tag;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public EmbeddedFieldContext embeddedField() {
			return getRuleContext(EmbeddedFieldContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(888);
				identifierList();
				setState(889);
				type_();
				}
				break;
			case 2:
				{
				setState(891);
				embeddedField();
				}
				break;
			}
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(894);
				((FieldDeclContext)_localctx).tag = string_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_Context extends ParserRuleContext {
		public TerminalNode RAW_STRING_LIT() { return getToken(CsGoParser.RAW_STRING_LIT, 0); }
		public TerminalNode INTERPRETED_STRING_LIT() { return getToken(CsGoParser.INTERPRETED_STRING_LIT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitString_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitString_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_la = _input.LA(1);
			if ( !(_la==RAW_STRING_LIT || _la==INTERPRETED_STRING_LIT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmbeddedFieldContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(CsGoParser.STAR, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterEmbeddedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitEmbeddedField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitEmbeddedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(899);
				match(STAR);
				}
			}

			setState(902);
			typeName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionLitContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CsGoParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterFunctionLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitFunctionLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitFunctionLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLitContext functionLit() throws RecognitionException {
		FunctionLitContext _localctx = new FunctionLitContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(FUNC);
			setState(905);
			signature();
			setState(906);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(L_BRACKET);
			setState(909);
			expression(0);
			setState(910);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Slice_Context extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(CsGoParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(CsGoParser.R_BRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(CsGoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CsGoParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Slice_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterSlice_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitSlice_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitSlice_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_Context slice_() throws RecognitionException {
		Slice_Context _localctx = new Slice_Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_slice_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(L_BRACKET);
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(913);
					expression(0);
					}
				}

				setState(916);
				match(COLON);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(917);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
					{
					setState(920);
					expression(0);
					}
				}

				setState(923);
				match(COLON);
				setState(924);
				expression(0);
				setState(925);
				match(COLON);
				setState(926);
				expression(0);
				}
				break;
			}
			setState(930);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public TypeAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTypeAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTypeAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTypeAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAssertionContext typeAssertion() throws RecognitionException {
		TypeAssertionContext _localctx = new TypeAssertionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(DOT);
			setState(933);
			match(L_PAREN);
			setState(934);
			type_();
			setState(935);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(CsGoParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CsGoParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CsGoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsGoParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(L_PAREN);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -288230371386978792L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 99135L) != 0) {
				{
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(938);
					expressionList();
					}
					break;
				case 2:
					{
					setState(939);
					nonNamedType();
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
					case 1:
						{
						setState(940);
						match(COMMA);
						setState(941);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(946);
					match(ELLIPSIS);
					}
				}

				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(949);
					match(COMMA);
					}
				}

				}
			}

			setState(954);
			match(R_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodExprContext extends ParserRuleContext {
		public NonNamedTypeContext nonNamedType() {
			return getRuleContext(NonNamedTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CsGoParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			nonNamedType();
			setState(957);
			match(DOT);
			setState(958);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitReceiverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitReceiverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_receiverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			type_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(CsGoParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(CsGoParser.EOF, 0); }
		public TerminalNode EOS() { return getToken(CsGoParser.EOS, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_eos);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				match(EOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				if (!(this.closingBracket())) throw new FailedPredicateException(this, "this.closingBracket()");
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 71:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 72:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 99:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementList_sempred(StatementListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.closingBracket();
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return this.closingBracket();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001Y\u03c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ce"+
		"\b\u0000\n\u0000\f\u0000\u00d1\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u00d6\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00da\b"+
		"\u0000\n\u0000\f\u0000\u00dd\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u00ea\b\u0002\n\u0002\f\u0002\u00ed"+
		"\t\u0002\u0001\u0002\u0003\u0002\u00f0\b\u0002\u0001\u0003\u0003\u0003"+
		"\u00f3\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00fc\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0104\b\u0006"+
		"\n\u0006\f\u0006\u0107\t\u0006\u0001\u0006\u0003\u0006\u010a\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0112\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0117\b\b\n\b\f\b"+
		"\u011a\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u011f\b\t\n\t\f\t\u0122\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u012a\b\n\n\n"+
		"\f\n\u012d\t\n\u0001\n\u0003\n\u0130\b\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0134\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u013c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0143"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u014d\b\u000f\n\u000f\f\u000f"+
		"\u0150\t\u000f\u0001\u000f\u0003\u000f\u0153\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0159\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u015d\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0161"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u0166\b\u0012"+
		"\u0001\u0012\u0003\u0012\u0169\b\u0012\u0001\u0012\u0003\u0012\u016c\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0171\b\u0012\u000b"+
		"\u0012\f\u0012\u0172\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0184"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u018c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u01a0\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01ad\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01b1\b\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01b5\b\u001f\u0001 \u0001 \u0003 \u01b9\b \u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u01cc\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01d2\b$\u0003$\u01d4\b$\u0001%\u0001%\u0003%\u01d8\b%\u0001"+
		"&\u0001&\u0003&\u01dc\b&\u0001&\u0003&\u01df\b&\u0001&\u0001&\u0003&\u01e3"+
		"\b&\u0003&\u01e5\b&\u0001&\u0001&\u0005&\u01e9\b&\n&\f&\u01ec\t&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u01f3\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u01f8\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0203\b)\u0001)\u0001)\u0005)\u0207\b)\n)\f)\u020a\t)"+
		"\u0001)\u0001)\u0001*\u0001*\u0003*\u0210\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0003+\u021b\b+\u0001,\u0001,\u0001"+
		",\u0003,\u0220\b,\u0001-\u0001-\u0003-\u0224\b-\u0001-\u0001-\u0001-\u0003"+
		"-\u0229\b-\u0005-\u022b\b-\n-\f-\u022e\t-\u0001.\u0001.\u0001.\u0005."+
		"\u0233\b.\n.\f.\u0236\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u023d"+
		"\b/\u00010\u00010\u00010\u00030\u0242\b0\u00010\u00030\u0245\b0\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u024d\b1\u00011\u00011\u0001"+
		"2\u00012\u00032\u0253\b2\u00012\u00012\u00032\u0257\b2\u00032\u0259\b"+
		"2\u00012\u00012\u00013\u00033\u025e\b3\u00013\u00013\u00033\u0262\b3\u0001"+
		"3\u00013\u00033\u0266\b3\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u026e\b4\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u027c\b6\u00017\u00017\u00037\u0280\b7\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u028a\b8\u0001"+
		"9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u029c\b=\u0001=\u0001=\u0005"+
		"=\u02a0\b=\n=\f=\u02a3\t=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0003@\u02b6\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u02c0\bA\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u02c9\bC\u0001D\u0001D\u0003D\u02cd\bD\u0001E\u0001E\u0001E\u0001E\u0005"+
		"E\u02d3\bE\nE\fE\u02d6\tE\u0001E\u0003E\u02d9\bE\u0003E\u02db\bE\u0001"+
		"E\u0001E\u0001F\u0003F\u02e0\bF\u0001F\u0003F\u02e3\bF\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0001G\u0003G\u02eb\bG\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0005G\u02fc\bG\nG\fG\u02ff\tG\u0001H\u0001H\u0001H\u0001H\u0003H\u0305"+
		"\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u030e\bH\u0005"+
		"H\u0310\bH\nH\fH\u0313\tH\u0001I\u0001I\u0001I\u0001I\u0003I\u0319\bI"+
		"\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u0322\bJ\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u032a\bK\u0001L\u0001L\u0001"+
		"L\u0003L\u032f\bL\u0001M\u0001M\u0001M\u0001M\u0003M\u0335\bM\u0001N\u0001"+
		"N\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u034b"+
		"\bR\u0001S\u0001S\u0001S\u0003S\u0350\bS\u0003S\u0352\bS\u0001S\u0001"+
		"S\u0001T\u0001T\u0001T\u0005T\u0359\bT\nT\fT\u035c\tT\u0001U\u0001U\u0001"+
		"U\u0003U\u0361\bU\u0001U\u0001U\u0001V\u0001V\u0003V\u0367\bV\u0001W\u0001"+
		"W\u0003W\u036b\bW\u0001X\u0001X\u0001X\u0001X\u0001X\u0005X\u0372\bX\n"+
		"X\fX\u0375\tX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u037d\b"+
		"Y\u0001Y\u0003Y\u0380\bY\u0001Z\u0001Z\u0001[\u0003[\u0385\b[\u0001[\u0001"+
		"[\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001"+
		"^\u0003^\u0393\b^\u0001^\u0001^\u0003^\u0397\b^\u0001^\u0003^\u039a\b"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u03a1\b^\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0003"+
		"`\u03af\b`\u0003`\u03b1\b`\u0001`\u0003`\u03b4\b`\u0001`\u0003`\u03b7"+
		"\b`\u0003`\u03b9\b`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001b\u0001"+
		"b\u0001c\u0001c\u0001c\u0001c\u0003c\u03c7\bc\u0001c\u0000\u0002\u008e"+
		"\u0090d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u0000"+
		"\n\u0002\u0000\u001b\u001b&&\u0001\u0000\'(\u0002\u000049;?\u0002\u0000"+
		"$$XX\u0001\u0000:@\u0002\u000059>?\u0002\u000044;=\u0001\u0000.3\u0002"+
		"\u0000ADHI\u0001\u0000OP\u0405\u0000\u00c8\u0001\u0000\u0000\u0000\u0002"+
		"\u00e0\u0001\u0000\u0000\u0000\u0004\u00e3\u0001\u0000\u0000\u0000\u0006"+
		"\u00f2\u0001\u0000\u0000\u0000\b\u00f6\u0001\u0000\u0000\u0000\n\u00fb"+
		"\u0001\u0000\u0000\u0000\f\u00fd\u0001\u0000\u0000\u0000\u000e\u010b\u0001"+
		"\u0000\u0000\u0000\u0010\u0113\u0001\u0000\u0000\u0000\u0012\u011b\u0001"+
		"\u0000\u0000\u0000\u0014\u0123\u0001\u0000\u0000\u0000\u0016\u0131\u0001"+
		"\u0000\u0000\u0000\u0018\u0137\u0001\u0000\u0000\u0000\u001a\u013d\u0001"+
		"\u0000\u0000\u0000\u001c\u0144\u0001\u0000\u0000\u0000\u001e\u0146\u0001"+
		"\u0000\u0000\u0000 \u0154\u0001\u0000\u0000\u0000\"\u015e\u0001\u0000"+
		"\u0000\u0000$\u0170\u0001\u0000\u0000\u0000&\u0183\u0001\u0000\u0000\u0000"+
		"(\u018b\u0001\u0000\u0000\u0000*\u018d\u0001\u0000\u0000\u0000,\u0191"+
		"\u0001\u0000\u0000\u0000.\u0193\u0001\u0000\u0000\u00000\u0197\u0001\u0000"+
		"\u0000\u00002\u019a\u0001\u0000\u0000\u00004\u019f\u0001\u0000\u0000\u0000"+
		"6\u01a3\u0001\u0000\u0000\u00008\u01a7\u0001\u0000\u0000\u0000:\u01a9"+
		"\u0001\u0000\u0000\u0000<\u01ae\u0001\u0000\u0000\u0000>\u01b2\u0001\u0000"+
		"\u0000\u0000@\u01b6\u0001\u0000\u0000\u0000B\u01ba\u0001\u0000\u0000\u0000"+
		"D\u01bd\u0001\u0000\u0000\u0000F\u01bf\u0001\u0000\u0000\u0000H\u01c2"+
		"\u0001\u0000\u0000\u0000J\u01d7\u0001\u0000\u0000\u0000L\u01d9\u0001\u0000"+
		"\u0000\u0000N\u01ef\u0001\u0000\u0000\u0000P\u01f7\u0001\u0000\u0000\u0000"+
		"R\u01f9\u0001\u0000\u0000\u0000T\u020f\u0001\u0000\u0000\u0000V\u0217"+
		"\u0001\u0000\u0000\u0000X\u021f\u0001\u0000\u0000\u0000Z\u0223\u0001\u0000"+
		"\u0000\u0000\\\u022f\u0001\u0000\u0000\u0000^\u0239\u0001\u0000\u0000"+
		"\u0000`\u0244\u0001\u0000\u0000\u0000b\u024c\u0001\u0000\u0000\u0000d"+
		"\u0250\u0001\u0000\u0000\u0000f\u025d\u0001\u0000\u0000\u0000h\u026d\u0001"+
		"\u0000\u0000\u0000j\u0272\u0001\u0000\u0000\u0000l\u027b\u0001\u0000\u0000"+
		"\u0000n\u027f\u0001\u0000\u0000\u0000p\u0289\u0001\u0000\u0000\u0000r"+
		"\u028b\u0001\u0000\u0000\u0000t\u0290\u0001\u0000\u0000\u0000v\u0292\u0001"+
		"\u0000\u0000\u0000x\u0294\u0001\u0000\u0000\u0000z\u0297\u0001\u0000\u0000"+
		"\u0000|\u02a6\u0001\u0000\u0000\u0000~\u02aa\u0001\u0000\u0000\u0000\u0080"+
		"\u02b5\u0001\u0000\u0000\u0000\u0082\u02bf\u0001\u0000\u0000\u0000\u0084"+
		"\u02c1\u0001\u0000\u0000\u0000\u0086\u02c8\u0001\u0000\u0000\u0000\u0088"+
		"\u02cc\u0001\u0000\u0000\u0000\u008a\u02ce\u0001\u0000\u0000\u0000\u008c"+
		"\u02df\u0001\u0000\u0000\u0000\u008e\u02ea\u0001\u0000\u0000\u0000\u0090"+
		"\u0304\u0001\u0000\u0000\u0000\u0092\u0314\u0001\u0000\u0000\u0000\u0094"+
		"\u0321\u0001\u0000\u0000\u0000\u0096\u0329\u0001\u0000\u0000\u0000\u0098"+
		"\u032e\u0001\u0000\u0000\u0000\u009a\u0334\u0001\u0000\u0000\u0000\u009c"+
		"\u0336\u0001\u0000\u0000\u0000\u009e\u0338\u0001\u0000\u0000\u0000\u00a0"+
		"\u033a\u0001\u0000\u0000\u0000\u00a2\u033e\u0001\u0000\u0000\u0000\u00a4"+
		"\u034a\u0001\u0000\u0000\u0000\u00a6\u034c\u0001\u0000\u0000\u0000\u00a8"+
		"\u0355\u0001\u0000\u0000\u0000\u00aa\u0360\u0001\u0000\u0000\u0000\u00ac"+
		"\u0366\u0001\u0000\u0000\u0000\u00ae\u036a\u0001\u0000\u0000\u0000\u00b0"+
		"\u036c\u0001\u0000\u0000\u0000\u00b2\u037c\u0001\u0000\u0000\u0000\u00b4"+
		"\u0381\u0001\u0000\u0000\u0000\u00b6\u0384\u0001\u0000\u0000\u0000\u00b8"+
		"\u0388\u0001\u0000\u0000\u0000\u00ba\u038c\u0001\u0000\u0000\u0000\u00bc"+
		"\u0390\u0001\u0000\u0000\u0000\u00be\u03a4\u0001\u0000\u0000\u0000\u00c0"+
		"\u03a9\u0001\u0000\u0000\u0000\u00c2\u03bc\u0001\u0000\u0000\u0000\u00c4"+
		"\u03c0\u0001\u0000\u0000\u0000\u00c6\u03c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0003\u0002\u0001\u0000\u00c9\u00cf\u0003\u00c6c\u0000\u00ca\u00cb"+
		"\u0003\u0004\u0002\u0000\u00cb\u00cc\u0003\u00c6c\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00db\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d6\u0003\u0018\f\u0000\u00d3\u00d6\u0003\u001a"+
		"\r\u0000\u00d4\u00d6\u0003\n\u0005\u0000\u00d5\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u00c6c\u0000"+
		"\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0000\u0000\u0001"+
		"\u00df\u0001\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u000e\u0000\u0000"+
		"\u00e1\u00e2\u0005\u001b\u0000\u0000\u00e2\u0003\u0001\u0000\u0000\u0000"+
		"\u00e3\u00ef\u0005\u0017\u0000\u0000\u00e4\u00f0\u0003\u0006\u0003\u0000"+
		"\u00e5\u00eb\u0005\u001c\u0000\u0000\u00e6\u00e7\u0003\u0006\u0003\u0000"+
		"\u00e7\u00e8\u0003\u00c6c\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f0\u0005\u001d\u0000\u0000\u00ef\u00e4\u0001\u0000\u0000\u0000\u00ef"+
		"\u00e5\u0001\u0000\u0000\u0000\u00f0\u0005\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f3\u0007\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0003\b\u0004\u0000\u00f5\u0007\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0003\u00b4Z\u0000\u00f7\t\u0001\u0000\u0000\u0000\u00f8\u00fc\u0003"+
		"\f\u0006\u0000\u00f9\u00fc\u0003\u0014\n\u0000\u00fa\u00fc\u0003\u001e"+
		"\u000f\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u000b\u0001\u0000"+
		"\u0000\u0000\u00fd\u0109\u0005\u0010\u0000\u0000\u00fe\u010a\u0003\u000e"+
		"\u0007\u0000\u00ff\u0105\u0005\u001c\u0000\u0000\u0100\u0101\u0003\u000e"+
		"\u0007\u0000\u0101\u0102\u0003\u00c6c\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u010a\u0005\u001d\u0000\u0000\u0109\u00fe\u0001\u0000\u0000"+
		"\u0000\u0109\u00ff\u0001\u0000\u0000\u0000\u010a\r\u0001\u0000\u0000\u0000"+
		"\u010b\u0111\u0003\u0010\b\u0000\u010c\u010e\u0003l6\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005\"\u0000\u0000\u0110\u0112\u0003"+
		"\u0012\t\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u000f\u0001\u0000\u0000\u0000\u0113\u0118\u0005\u001b"+
		"\u0000\u0000\u0114\u0115\u0005#\u0000\u0000\u0115\u0117\u0005\u001b\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u0011\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0120\u0003\u008eG\u0000\u011c\u011d\u0005#\u0000\u0000\u011d"+
		"\u011f\u0003\u008eG\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0013\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0123\u012f\u0005\u0014\u0000\u0000\u0124\u0130"+
		"\u0003\u0016\u000b\u0000\u0125\u012b\u0005\u001c\u0000\u0000\u0126\u0127"+
		"\u0003\u0016\u000b\u0000\u0127\u0128\u0003\u00c6c\u0000\u0128\u012a\u0001"+
		"\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u012a\u012d\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012e\u0130\u0005\u001d\u0000\u0000\u012f\u0124\u0001"+
		"\u0000\u0000\u0000\u012f\u0125\u0001\u0000\u0000\u0000\u0130\u0015\u0001"+
		"\u0000\u0000\u0000\u0131\u0133\u0005\u001b\u0000\u0000\u0132\u0134\u0005"+
		"\"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0003l6\u0000"+
		"\u0136\u0017\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000"+
		"\u0138\u0139\u0005\u001b\u0000\u0000\u0139\u013b\u0003\u0086C\u0000\u013a"+
		"\u013c\u0003\"\u0011\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u0019\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u0003\u0000\u0000\u013e\u013f\u0003\u001c\u000e\u0000\u013f\u0140"+
		"\u0005\u001b\u0000\u0000\u0140\u0142\u0003\u0086C\u0000\u0141\u0143\u0003"+
		"\"\u0011\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u001b\u0001\u0000\u0000\u0000\u0144\u0145\u0003\u008a"+
		"E\u0000\u0145\u001d\u0001\u0000\u0000\u0000\u0146\u0152\u0005\u0019\u0000"+
		"\u0000\u0147\u0153\u0003 \u0010\u0000\u0148\u014e\u0005\u001c\u0000\u0000"+
		"\u0149\u014a\u0003 \u0010\u0000\u014a\u014b\u0003\u00c6c\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0153\u0005\u001d\u0000\u0000\u0152\u0147"+
		"\u0001\u0000\u0000\u0000\u0152\u0148\u0001\u0000\u0000\u0000\u0153\u001f"+
		"\u0001\u0000\u0000\u0000\u0154\u015c\u0003\u0010\b\u0000\u0155\u0158\u0003"+
		"l6\u0000\u0156\u0157\u0005\"\u0000\u0000\u0157\u0159\u0003\u0012\t\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015d\u0001\u0000\u0000\u0000\u015a\u015b\u0005\"\u0000\u0000\u015b"+
		"\u015d\u0003\u0012\t\u0000\u015c\u0155\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015d!\u0001\u0000\u0000\u0000\u015e\u0160\u0005"+
		"\u001e\u0000\u0000\u015f\u0161\u0003$\u0012\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\u001f\u0000\u0000\u0163#\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0005$\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u016c\u0001\u0000\u0000\u0000"+
		"\u0167\u0169\u0005X\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0004\u0012\u0000\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016b"+
		"\u0168\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0003&\u0013\u0000\u016e\u016f"+
		"\u0003\u00c6c\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016b\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173%\u0001\u0000"+
		"\u0000\u0000\u0174\u0184\u0003\n\u0005\u0000\u0175\u0184\u0003:\u001d"+
		"\u0000\u0176\u0184\u0003(\u0014\u0000\u0177\u0184\u0003j5\u0000\u0178"+
		"\u0184\u0003<\u001e\u0000\u0179\u0184\u0003>\u001f\u0000\u017a\u0184\u0003"+
		"@ \u0000\u017b\u0184\u0003B!\u0000\u017c\u0184\u0003D\"\u0000\u017d\u0184"+
		"\u0003\"\u0011\u0000\u017e\u0184\u0003H$\u0000\u017f\u0184\u0003J%\u0000"+
		"\u0180\u0184\u0003\\.\u0000\u0181\u0184\u0003d2\u0000\u0182\u0184\u0003"+
		"F#\u0000\u0183\u0174\u0001\u0000\u0000\u0000\u0183\u0175\u0001\u0000\u0000"+
		"\u0000\u0183\u0176\u0001\u0000\u0000\u0000\u0183\u0177\u0001\u0000\u0000"+
		"\u0000\u0183\u0178\u0001\u0000\u0000\u0000\u0183\u0179\u0001\u0000\u0000"+
		"\u0000\u0183\u017a\u0001\u0000\u0000\u0000\u0183\u017b\u0001\u0000\u0000"+
		"\u0000\u0183\u017c\u0001\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000"+
		"\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u017f\u0001\u0000\u0000"+
		"\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\'\u0001\u0000\u0000\u0000"+
		"\u0185\u018c\u0003*\u0015\u0000\u0186\u018c\u0003.\u0017\u0000\u0187\u018c"+
		"\u00030\u0018\u0000\u0188\u018c\u00032\u0019\u0000\u0189\u018c\u0003,"+
		"\u0016\u0000\u018a\u018c\u00036\u001b\u0000\u018b\u0185\u0001\u0000\u0000"+
		"\u0000\u018b\u0186\u0001\u0000\u0000\u0000\u018b\u0187\u0001\u0000\u0000"+
		"\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c)\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0003\u008eG\u0000\u018e\u018f\u0005-\u0000\u0000\u018f\u0190"+
		"\u0003\u008eG\u0000\u0190+\u0001\u0000\u0000\u0000\u0191\u0192\u0003\u008e"+
		"G\u0000\u0192-\u0001\u0000\u0000\u0000\u0193\u0194\u0003\u008eG\u0000"+
		"\u0194\u0195\u0005@\u0000\u0000\u0195\u0196\u0003\u008eG\u0000\u0196/"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0003\u008eG\u0000\u0198\u0199\u0007"+
		"\u0001\u0000\u0000\u01991\u0001\u0000\u0000\u0000\u019a\u019b\u0003\u0012"+
		"\t\u0000\u019b\u019c\u00034\u001a\u0000\u019c\u019d\u0003\u0012\t\u0000"+
		"\u019d3\u0001\u0000\u0000\u0000\u019e\u01a0\u0007\u0002\u0000\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\"\u0000\u0000\u01a25"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003\u0010\b\u0000\u01a4\u01a5\u0005"+
		")\u0000\u0000\u01a5\u01a6\u0003\u0012\t\u0000\u01a67\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0007\u0003\u0000\u0000\u01a89\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0005\u001b\u0000\u0000\u01aa\u01ac\u0005%\u0000\u0000\u01ab"+
		"\u01ad\u0003&\u0013\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad;\u0001\u0000\u0000\u0000\u01ae\u01b0\u0005"+
		"\u0018\u0000\u0000\u01af\u01b1\u0003\u0012\t\u0000\u01b0\u01af\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1=\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b4\u0005\u0001\u0000\u0000\u01b3\u01b5\u0005\u001b\u0000"+
		"\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5?\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005\u0015\u0000\u0000"+
		"\u01b7\u01b9\u0005\u001b\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9A\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005\r\u0000\u0000\u01bb\u01bc\u0005\u001b\u0000\u0000\u01bcC"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0011\u0000\u0000\u01beE\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0005\u0007\u0000\u0000\u01c0\u01c1\u0003"+
		"\u008eG\u0000\u01c1G\u0001\u0000\u0000\u0000\u01c2\u01cb\u0005\u0012\u0000"+
		"\u0000\u01c3\u01cc\u0003\u008eG\u0000\u01c4\u01c5\u0003\u00c6c\u0000\u01c5"+
		"\u01c6\u0003\u008eG\u0000\u01c6\u01cc\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0003(\u0014\u0000\u01c8\u01c9\u0003\u00c6c\u0000\u01c9\u01ca\u0003\u008e"+
		"G\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c4\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01d3\u0003\"\u0011\u0000"+
		"\u01ce\u01d1\u0005\f\u0000\u0000\u01cf\u01d2\u0003H$\u0000\u01d0\u01d2"+
		"\u0003\"\u0011\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4I\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0003L&\u0000\u01d6\u01d8\u0003R)\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8"+
		"K\u0001\u0000\u0000\u0000\u01d9\u01e4\u0005\u000f\u0000\u0000\u01da\u01dc"+
		"\u0003\u008eG\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01db\u01dc\u0001"+
		"\u0000\u0000\u0000\u01dc\u01e5\u0001\u0000\u0000\u0000\u01dd\u01df\u0003"+
		"(\u0014\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000"+
		"\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003\u00c6"+
		"c\u0000\u01e1\u01e3\u0003\u008eG\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e4\u01db\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01ea\u0005\u001e\u0000\u0000"+
		"\u01e7\u01e9\u0003N\'\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\u001f\u0000\u0000\u01ee"+
		"M\u0001\u0000\u0000\u0000\u01ef\u01f0\u0003P(\u0000\u01f0\u01f2\u0005"+
		"%\u0000\u0000\u01f1\u01f3\u0003$\u0012\u0000\u01f2\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3O\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005\u0006\u0000\u0000\u01f5\u01f8\u0003\u0012\t\u0000\u01f6"+
		"\u01f8\u0005\u0002\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8Q\u0001\u0000\u0000\u0000\u01f9\u0202"+
		"\u0005\u000f\u0000\u0000\u01fa\u0203\u0003T*\u0000\u01fb\u01fc\u0003\u00c6"+
		"c\u0000\u01fc\u01fd\u0003T*\u0000\u01fd\u0203\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u0003(\u0014\u0000\u01ff\u0200\u0003\u00c6c\u0000\u0200\u0201"+
		"\u0003T*\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01fa\u0001\u0000"+
		"\u0000\u0000\u0202\u01fb\u0001\u0000\u0000\u0000\u0202\u01fe\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0208\u0005\u001e"+
		"\u0000\u0000\u0205\u0207\u0003V+\u0000\u0206\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000"+
		"\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u001f\u0000\u0000"+
		"\u020cS\u0001\u0000\u0000\u0000\u020d\u020e\u0005\u001b\u0000\u0000\u020e"+
		"\u0210\u0005)\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0003\u0090H\u0000\u0212\u0213\u0005&\u0000\u0000\u0213\u0214\u0005\u001c"+
		"\u0000\u0000\u0214\u0215\u0005\u0014\u0000\u0000\u0215\u0216\u0005\u001d"+
		"\u0000\u0000\u0216U\u0001\u0000\u0000\u0000\u0217\u0218\u0003X,\u0000"+
		"\u0218\u021a\u0005%\u0000\u0000\u0219\u021b\u0003$\u0012\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021bW\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0005\u0006\u0000\u0000\u021d\u0220\u0003"+
		"Z-\u0000\u021e\u0220\u0005\u0002\u0000\u0000\u021f\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220Y\u0001\u0000\u0000\u0000"+
		"\u0221\u0224\u0003l6\u0000\u0222\u0224\u0005\u001a\u0000\u0000\u0223\u0221"+
		"\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u022c"+
		"\u0001\u0000\u0000\u0000\u0225\u0228\u0005#\u0000\u0000\u0226\u0229\u0003"+
		"l6\u0000\u0227\u0229\u0005\u001a\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000"+
		"\u0000\u022a\u0225\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000\u0000"+
		"\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d[\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0005\u0005\u0000\u0000\u0230\u0234\u0005\u001e\u0000\u0000"+
		"\u0231\u0233\u0003^/\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u001f\u0000\u0000\u0238]\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0003`0\u0000\u023a\u023c\u0005%\u0000"+
		"\u0000\u023b\u023d\u0003$\u0012\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d_\u0001\u0000\u0000\u0000\u023e"+
		"\u0241\u0005\u0006\u0000\u0000\u023f\u0242\u0003.\u0017\u0000\u0240\u0242"+
		"\u0003b1\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000"+
		"\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0245\u0005\u0002"+
		"\u0000\u0000\u0244\u023e\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000"+
		"\u0000\u0000\u0245a\u0001\u0000\u0000\u0000\u0246\u0247\u0003\u0012\t"+
		"\u0000\u0247\u0248\u0005\"\u0000\u0000\u0248\u024d\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0003\u0010\b\u0000\u024a\u024b\u0005)\u0000\u0000\u024b"+
		"\u024d\u0001\u0000\u0000\u0000\u024c\u0246\u0001\u0000\u0000\u0000\u024c"+
		"\u0249\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0003\u008eG\u0000\u024fc\u0001"+
		"\u0000\u0000\u0000\u0250\u0258\u0005\u0016\u0000\u0000\u0251\u0253\u0003"+
		"\u008eG\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000"+
		"\u0000\u0000\u0253\u0259\u0001\u0000\u0000\u0000\u0254\u0259\u0003f3\u0000"+
		"\u0255\u0257\u0003h4\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u0252"+
		"\u0001\u0000\u0000\u0000\u0258\u0254\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0003\"\u0011\u0000\u025be\u0001\u0000\u0000\u0000\u025c\u025e\u0003"+
		"(\u0014\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0003\u00c6"+
		"c\u0000\u0260\u0262\u0003\u008eG\u0000\u0261\u0260\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000"+
		"\u0263\u0265\u0003\u00c6c\u0000\u0264\u0266\u0003(\u0014\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266g\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0003\u0012\t\u0000\u0268\u0269\u0005\""+
		"\u0000\u0000\u0269\u026e\u0001\u0000\u0000\u0000\u026a\u026b\u0003\u0010"+
		"\b\u0000\u026b\u026c\u0005)\u0000\u0000\u026c\u026e\u0001\u0000\u0000"+
		"\u0000\u026d\u0267\u0001\u0000\u0000\u0000\u026d\u026a\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0005\u0013\u0000\u0000\u0270\u0271\u0003\u008eG\u0000"+
		"\u0271i\u0001\u0000\u0000\u0000\u0272\u0273\u0005\b\u0000\u0000\u0273"+
		"\u0274\u0003\u008eG\u0000\u0274k\u0001\u0000\u0000\u0000\u0275\u027c\u0003"+
		"n7\u0000\u0276\u027c\u0003p8\u0000\u0277\u0278\u0005\u001c\u0000\u0000"+
		"\u0278\u0279\u0003l6\u0000\u0279\u027a\u0005\u001d\u0000\u0000\u027a\u027c"+
		"\u0001\u0000\u0000\u0000\u027b\u0275\u0001\u0000\u0000\u0000\u027b\u0276"+
		"\u0001\u0000\u0000\u0000\u027b\u0277\u0001\u0000\u0000\u0000\u027cm\u0001"+
		"\u0000\u0000\u0000\u027d\u0280\u0003\u00a0P\u0000\u027e\u0280\u0005\u001b"+
		"\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e\u0001\u0000"+
		"\u0000\u0000\u0280o\u0001\u0000\u0000\u0000\u0281\u028a\u0003r9\u0000"+
		"\u0282\u028a\u0003\u00b0X\u0000\u0283\u028a\u0003x<\u0000\u0284\u028a"+
		"\u0003\u0084B\u0000\u0285\u028a\u0003z=\u0000\u0286\u028a\u0003|>\u0000"+
		"\u0287\u028a\u0003~?\u0000\u0288\u028a\u0003\u0080@\u0000\u0289\u0281"+
		"\u0001\u0000\u0000\u0000\u0289\u0282\u0001\u0000\u0000\u0000\u0289\u0283"+
		"\u0001\u0000\u0000\u0000\u0289\u0284\u0001\u0000\u0000\u0000\u0289\u0285"+
		"\u0001\u0000\u0000\u0000\u0289\u0286\u0001\u0000\u0000\u0000\u0289\u0287"+
		"\u0001\u0000\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028aq\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0005 \u0000\u0000\u028c\u028d\u0003t:"+
		"\u0000\u028d\u028e\u0005!\u0000\u0000\u028e\u028f\u0003v;\u0000\u028f"+
		"s\u0001\u0000\u0000\u0000\u0290\u0291\u0003\u008eG\u0000\u0291u\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0003l6\u0000\u0293w\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0005>\u0000\u0000\u0295\u0296\u0003l6\u0000\u0296"+
		"y\u0001\u0000\u0000\u0000\u0297\u0298\u0005\u0004\u0000\u0000\u0298\u02a1"+
		"\u0005\u001e\u0000\u0000\u0299\u029c\u0003\u0082A\u0000\u029a\u029c\u0003"+
		"n7\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000\u0000"+
		"\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0003\u00c6c\u0000"+
		"\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u029b\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005\u001f\u0000\u0000"+
		"\u02a5{\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005 \u0000\u0000\u02a7\u02a8"+
		"\u0005!\u0000\u0000\u02a8\u02a9\u0003v;\u0000\u02a9}\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\u0005\t\u0000\u0000\u02ab\u02ac\u0005 \u0000\u0000"+
		"\u02ac\u02ad\u0003l6\u0000\u02ad\u02ae\u0005!\u0000\u0000\u02ae\u02af"+
		"\u0003v;\u0000\u02af\u007f\u0001\u0000\u0000\u0000\u02b0\u02b6\u0005\u000b"+
		"\u0000\u0000\u02b1\u02b2\u0005\u000b\u0000\u0000\u02b2\u02b6\u0005@\u0000"+
		"\u0000\u02b3\u02b4\u0005@\u0000\u0000\u02b4\u02b6\u0005\u000b\u0000\u0000"+
		"\u02b5\u02b0\u0001\u0000\u0000\u0000\u02b5\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b8\u0003v;\u0000\u02b8\u0081\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0005\u001b\u0000\u0000\u02ba\u02bb\u0003\u008aE\u0000\u02bb\u02bc\u0003"+
		"\u0088D\u0000\u02bc\u02c0\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u001b"+
		"\u0000\u0000\u02be\u02c0\u0003\u008aE\u0000\u02bf\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0\u0083\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0005\u0003\u0000\u0000\u02c2\u02c3\u0003\u0086C\u0000"+
		"\u02c3\u0085\u0001\u0000\u0000\u0000\u02c4\u02c5\u0003\u008aE\u0000\u02c5"+
		"\u02c6\u0003\u0088D\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c9"+
		"\u0003\u008aE\u0000\u02c8\u02c4\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c9\u0087\u0001\u0000\u0000\u0000\u02ca\u02cd\u0003"+
		"\u008aE\u0000\u02cb\u02cd\u0003l6\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cd\u0089\u0001\u0000\u0000"+
		"\u0000\u02ce\u02da\u0005\u001c\u0000\u0000\u02cf\u02d4\u0003\u008cF\u0000"+
		"\u02d0\u02d1\u0005#\u0000\u0000\u02d1\u02d3\u0003\u008cF\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d9"+
		"\u0005#\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d9\u02db\u0001\u0000\u0000\u0000\u02da\u02cf\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02dd\u0005\u001d\u0000\u0000\u02dd\u008b\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0003\u0010\b\u0000\u02df\u02de\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e3\u0005*\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0003l6\u0000\u02e5\u008d\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0006G\uffff\uffff\u0000\u02e7\u02eb\u0003\u0090H\u0000\u02e8\u02e9"+
		"\u0007\u0004\u0000\u0000\u02e9\u02eb\u0003\u008eG\u0006\u02ea\u02e6\u0001"+
		"\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02fd\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\n\u0005\u0000\u0000\u02ed\u02ee\u0007\u0005"+
		"\u0000\u0000\u02ee\u02fc\u0003\u008eG\u0006\u02ef\u02f0\n\u0004\u0000"+
		"\u0000\u02f0\u02f1\u0007\u0006\u0000\u0000\u02f1\u02fc\u0003\u008eG\u0005"+
		"\u02f2\u02f3\n\u0003\u0000\u0000\u02f3\u02f4\u0007\u0007\u0000\u0000\u02f4"+
		"\u02fc\u0003\u008eG\u0004\u02f5\u02f6\n\u0002\u0000\u0000\u02f6\u02f7"+
		"\u0005,\u0000\u0000\u02f7\u02fc\u0003\u008eG\u0003\u02f8\u02f9\n\u0001"+
		"\u0000\u0000\u02f9\u02fa\u0005+\u0000\u0000\u02fa\u02fc\u0003\u008eG\u0002"+
		"\u02fb\u02ec\u0001\u0000\u0000\u0000\u02fb\u02ef\u0001\u0000\u0000\u0000"+
		"\u02fb\u02f2\u0001\u0000\u0000\u0000\u02fb\u02f5\u0001\u0000\u0000\u0000"+
		"\u02fb\u02f8\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u008f\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u0300\u0301\u0006H\uffff\uffff\u0000\u0301\u0305\u0003\u0096K\u0000\u0302"+
		"\u0305\u0003\u0092I\u0000\u0303\u0305\u0003\u00c2a\u0000\u0304\u0300\u0001"+
		"\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0311\u0001\u0000\u0000\u0000\u0306\u030d\n\u0001"+
		"\u0000\u0000\u0307\u0308\u0005&\u0000\u0000\u0308\u030e\u0005\u001b\u0000"+
		"\u0000\u0309\u030e\u0003\u00ba]\u0000\u030a\u030e\u0003\u00bc^\u0000\u030b"+
		"\u030e\u0003\u00be_\u0000\u030c\u030e\u0003\u00c0`\u0000\u030d\u0307\u0001"+
		"\u0000\u0000\u0000\u030d\u0309\u0001\u0000\u0000\u0000\u030d\u030a\u0001"+
		"\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030c\u0001"+
		"\u0000\u0000\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f\u0306\u0001"+
		"\u0000\u0000\u0000\u0310\u0313\u0001\u0000\u0000\u0000\u0311\u030f\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0091\u0001"+
		"\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0315\u0003"+
		"\u0094J\u0000\u0315\u0316\u0005\u001c\u0000\u0000\u0316\u0318\u0003\u008e"+
		"G\u0000\u0317\u0319\u0005#\u0000\u0000\u0318\u0317\u0001\u0000\u0000\u0000"+
		"\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000"+
		"\u031a\u031b\u0005\u001d\u0000\u0000\u031b\u0093\u0001\u0000\u0000\u0000"+
		"\u031c\u0322\u0003p8\u0000\u031d\u031e\u0005\u001c\u0000\u0000\u031e\u031f"+
		"\u0003\u0094J\u0000\u031f\u0320\u0005\u001d\u0000\u0000\u0320\u0322\u0001"+
		"\u0000\u0000\u0000\u0321\u031c\u0001\u0000\u0000\u0000\u0321\u031d\u0001"+
		"\u0000\u0000\u0000\u0322\u0095\u0001\u0000\u0000\u0000\u0323\u032a\u0003"+
		"\u0098L\u0000\u0324\u032a\u0003\u009eO\u0000\u0325\u0326\u0005\u001c\u0000"+
		"\u0000\u0326\u0327\u0003\u008eG\u0000\u0327\u0328\u0005\u001d\u0000\u0000"+
		"\u0328\u032a\u0001\u0000\u0000\u0000\u0329\u0323\u0001\u0000\u0000\u0000"+
		"\u0329\u0324\u0001\u0000\u0000\u0000\u0329\u0325\u0001\u0000\u0000\u0000"+
		"\u032a\u0097\u0001\u0000\u0000\u0000\u032b\u032f\u0003\u009aM\u0000\u032c"+
		"\u032f\u0003\u00a2Q\u0000\u032d\u032f\u0003\u00b8\\\u0000\u032e\u032b"+
		"\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032d"+
		"\u0001\u0000\u0000\u0000\u032f\u0099\u0001\u0000\u0000\u0000\u0330\u0335"+
		"\u0005\u001a\u0000\u0000\u0331\u0335\u0003\u009cN\u0000\u0332\u0335\u0003"+
		"\u00b4Z\u0000\u0333\u0335\u0005E\u0000\u0000\u0334\u0330\u0001\u0000\u0000"+
		"\u0000\u0334\u0331\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000"+
		"\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0335\u009b\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0007\b\u0000\u0000\u0337\u009d\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0005\u001b\u0000\u0000\u0339\u009f\u0001\u0000\u0000\u0000"+
		"\u033a\u033b\u0005\u001b\u0000\u0000\u033b\u033c\u0005&\u0000\u0000\u033c"+
		"\u033d\u0005\u001b\u0000\u0000\u033d\u00a1\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u0003\u00a4R\u0000\u033f\u0340\u0003\u00a6S\u0000\u0340\u00a3\u0001"+
		"\u0000\u0000\u0000\u0341\u034b\u0003\u00b0X\u0000\u0342\u034b\u0003r9"+
		"\u0000\u0343\u0344\u0005 \u0000\u0000\u0344\u0345\u0005*\u0000\u0000\u0345"+
		"\u0346\u0005!\u0000\u0000\u0346\u034b\u0003v;\u0000\u0347\u034b\u0003"+
		"|>\u0000\u0348\u034b\u0003~?\u0000\u0349\u034b\u0003n7\u0000\u034a\u0341"+
		"\u0001\u0000\u0000\u0000\u034a\u0342\u0001\u0000\u0000\u0000\u034a\u0343"+
		"\u0001\u0000\u0000\u0000\u034a\u0347\u0001\u0000\u0000\u0000\u034a\u0348"+
		"\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b\u00a5"+
		"\u0001\u0000\u0000\u0000\u034c\u0351\u0005\u001e\u0000\u0000\u034d\u034f"+
		"\u0003\u00a8T\u0000\u034e\u0350\u0005#\u0000\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352\u0001\u0000"+
		"\u0000\u0000\u0351\u034d\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0354\u0005\u001f"+
		"\u0000\u0000\u0354\u00a7\u0001\u0000\u0000\u0000\u0355\u035a\u0003\u00aa"+
		"U\u0000\u0356\u0357\u0005#\u0000\u0000\u0357\u0359\u0003\u00aaU\u0000"+
		"\u0358\u0356\u0001\u0000\u0000\u0000\u0359\u035c\u0001\u0000\u0000\u0000"+
		"\u035a\u0358\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000"+
		"\u035b\u00a9\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0003\u00acV\u0000\u035e\u035f\u0005%\u0000\u0000\u035f\u0361"+
		"\u0001\u0000\u0000\u0000\u0360\u035d\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0003\u00aeW\u0000\u0363\u00ab\u0001\u0000\u0000\u0000\u0364\u0367\u0003"+
		"\u008eG\u0000\u0365\u0367\u0003\u00a6S\u0000\u0366\u0364\u0001\u0000\u0000"+
		"\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0367\u00ad\u0001\u0000\u0000"+
		"\u0000\u0368\u036b\u0003\u008eG\u0000\u0369\u036b\u0003\u00a6S\u0000\u036a"+
		"\u0368\u0001\u0000\u0000\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b"+
		"\u00af\u0001\u0000\u0000\u0000\u036c\u036d\u0005\n\u0000\u0000\u036d\u0373"+
		"\u0005\u001e\u0000\u0000\u036e\u036f\u0003\u00b2Y\u0000\u036f\u0370\u0003"+
		"\u00c6c\u0000\u0370\u0372\u0001\u0000\u0000\u0000\u0371\u036e\u0001\u0000"+
		"\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000"+
		"\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376\u0001\u0000"+
		"\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0376\u0377\u0005\u001f"+
		"\u0000\u0000\u0377\u00b1\u0001\u0000\u0000\u0000\u0378\u0379\u0003\u0010"+
		"\b\u0000\u0379\u037a\u0003l6\u0000\u037a\u037d\u0001\u0000\u0000\u0000"+
		"\u037b\u037d\u0003\u00b6[\u0000\u037c\u0378\u0001\u0000\u0000\u0000\u037c"+
		"\u037b\u0001\u0000\u0000\u0000\u037d\u037f\u0001\u0000\u0000\u0000\u037e"+
		"\u0380\u0003\u00b4Z\u0000\u037f\u037e\u0001\u0000\u0000\u0000\u037f\u0380"+
		"\u0001\u0000\u0000\u0000\u0380\u00b3\u0001\u0000\u0000\u0000\u0381\u0382"+
		"\u0007\t\u0000\u0000\u0382\u00b5\u0001\u0000\u0000\u0000\u0383\u0385\u0005"+
		">\u0000\u0000\u0384\u0383\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0003n7\u0000"+
		"\u0387\u00b7\u0001\u0000\u0000\u0000\u0388\u0389\u0005\u0003\u0000\u0000"+
		"\u0389\u038a\u0003\u0086C\u0000\u038a\u038b\u0003\"\u0011\u0000\u038b"+
		"\u00b9\u0001\u0000\u0000\u0000\u038c\u038d\u0005 \u0000\u0000\u038d\u038e"+
		"\u0003\u008eG\u0000\u038e\u038f\u0005!\u0000\u0000\u038f\u00bb\u0001\u0000"+
		"\u0000\u0000\u0390\u03a0\u0005 \u0000\u0000\u0391\u0393\u0003\u008eG\u0000"+
		"\u0392\u0391\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000"+
		"\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0396\u0005%\u0000\u0000\u0395"+
		"\u0397\u0003\u008eG\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397"+
		"\u0001\u0000\u0000\u0000\u0397\u03a1\u0001\u0000\u0000\u0000\u0398\u039a"+
		"\u0003\u008eG\u0000\u0399\u0398\u0001\u0000\u0000\u0000\u0399\u039a\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0005"+
		"%\u0000\u0000\u039c\u039d\u0003\u008eG\u0000\u039d\u039e\u0005%\u0000"+
		"\u0000\u039e\u039f\u0003\u008eG\u0000\u039f\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a0\u0392\u0001\u0000\u0000\u0000\u03a0\u0399\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005!\u0000\u0000\u03a3"+
		"\u00bd\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005&\u0000\u0000\u03a5\u03a6"+
		"\u0005\u001c\u0000\u0000\u03a6\u03a7\u0003l6\u0000\u03a7\u03a8\u0005\u001d"+
		"\u0000\u0000\u03a8\u00bf\u0001\u0000\u0000\u0000\u03a9\u03b8\u0005\u001c"+
		"\u0000\u0000\u03aa\u03b1\u0003\u0012\t\u0000\u03ab\u03ae\u0003\u0094J"+
		"\u0000\u03ac\u03ad\u0005#\u0000\u0000\u03ad\u03af\u0003\u0012\t\u0000"+
		"\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000"+
		"\u03af\u03b1\u0001\u0000\u0000\u0000\u03b0\u03aa\u0001\u0000\u0000\u0000"+
		"\u03b0\u03ab\u0001\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b4\u0005*\u0000\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b4\u03b6\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b7\u0005#\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b6\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03ba"+
		"\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005\u001d\u0000\u0000\u03bb\u00c1"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bd\u0003\u0094J\u0000\u03bd\u03be\u0005"+
		"&\u0000\u0000\u03be\u03bf\u0005\u001b\u0000\u0000\u03bf\u00c3\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c1\u0003l6\u0000\u03c1\u00c5\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c7\u0005$\u0000\u0000\u03c3\u03c7\u0005\u0000\u0000\u0001\u03c4"+
		"\u03c7\u0005X\u0000\u0000\u03c5\u03c7\u0004c\u0007\u0000\u03c6\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c3\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c7\u00c7\u0001"+
		"\u0000\u0000\u0000o\u00cf\u00d5\u00db\u00eb\u00ef\u00f2\u00fb\u0105\u0109"+
		"\u010d\u0111\u0118\u0120\u012b\u012f\u0133\u013b\u0142\u014e\u0152\u0158"+
		"\u015c\u0160\u0165\u0168\u016b\u0172\u0183\u018b\u019f\u01ac\u01b0\u01b4"+
		"\u01b8\u01cb\u01d1\u01d3\u01d7\u01db\u01de\u01e2\u01e4\u01ea\u01f2\u01f7"+
		"\u0202\u0208\u020f\u021a\u021f\u0223\u0228\u022c\u0234\u023c\u0241\u0244"+
		"\u024c\u0252\u0256\u0258\u025d\u0261\u0265\u026d\u027b\u027f\u0289\u029b"+
		"\u02a1\u02b5\u02bf\u02c8\u02cc\u02d4\u02d8\u02da\u02df\u02e2\u02ea\u02fb"+
		"\u02fd\u0304\u030d\u0311\u0318\u0321\u0329\u032e\u0334\u034a\u034f\u0351"+
		"\u035a\u0360\u0366\u036a\u0373\u037c\u037f\u0384\u0392\u0396\u0399\u03a0"+
		"\u03ae\u03b0\u03b3\u03b6\u03b8\u03c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}