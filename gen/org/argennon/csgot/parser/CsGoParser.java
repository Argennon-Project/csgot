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
		BREAK=1, DEFAULT=2, FUNC=3, REL=4, INTERFACE=5, SELECT=6, CASE=7, DEFER=8, 
		GO=9, MAP=10, STRUCT=11, CHAN=12, ELSE=13, GOTO=14, PACKAGE=15, SWITCH=16, 
		CONST=17, FALLTHROUGH=18, IF=19, RANGE=20, TYPE=21, CONTINUE=22, FOR=23, 
		IMPORT=24, RETURN=25, VAR=26, NIL_LIT=27, IDENTIFIER=28, L_PAREN=29, R_PAREN=30, 
		L_CURLY=31, R_CURLY=32, L_BRACKET=33, R_BRACKET=34, ASSIGN=35, ALIAS_ASSIGN=36, 
		COMMA=37, SEMI=38, COLON=39, DOT=40, PLUS_PLUS=41, MINUS_MINUS=42, DECLARE_ASSIGN=43, 
		DECLARE_ALIAS=44, ELLIPSIS=45, LOGICAL_OR=46, LOGICAL_AND=47, EQUATION=48, 
		EQUALS=49, NOT_EQUALS=50, LESS=51, LESS_OR_EQUALS=52, GREATER=53, GREATER_OR_EQUALS=54, 
		OR=55, DIV=56, MOD=57, LSHIFT=58, RSHIFT=59, BIT_CLEAR=60, EXCLAMATION=61, 
		PLUS=62, MINUS=63, CARET=64, STAR=65, AMPERSAND=66, RECEIVE=67, SEND=68, 
		DECIMAL_LIT=69, BINARY_LIT=70, OCTAL_LIT=71, HEX_LIT=72, FLOAT_LIT=73, 
		DECIMAL_FLOAT_LIT=74, HEX_FLOAT_LIT=75, IMAGINARY_LIT=76, RUNE_LIT=77, 
		BYTE_VALUE=78, OCTAL_BYTE_VALUE=79, HEX_BYTE_VALUE=80, LITTLE_U_VALUE=81, 
		BIG_U_VALUE=82, RAW_STRING_LIT=83, INTERPRETED_STRING_LIT=84, WS=85, COMMENT=86, 
		TERMINATOR=87, LINE_COMMENT=88, WS_NLSEMI=89, COMMENT_NLSEMI=90, LINE_COMMENT_NLSEMI=91, 
		EOS=92, OTHER=93;
	public static final int
		RULE_sourceFile = 0, RULE_packageClause = 1, RULE_importDecl = 2, RULE_importSpec = 3, 
		RULE_importPath = 4, RULE_declaration = 5, RULE_constDecl = 6, RULE_constSpec = 7, 
		RULE_identifierList = 8, RULE_expressionList = 9, RULE_typeDecl = 10, 
		RULE_typeSpec = 11, RULE_functionDecl = 12, RULE_methodDecl = 13, RULE_relationDecl = 14, 
		RULE_receiver = 15, RULE_varDecl = 16, RULE_varSpec = 17, RULE_block = 18, 
		RULE_statementList = 19, RULE_statement = 20, RULE_simpleStmt = 21, RULE_hintCall = 22, 
		RULE_constraintDecl = 23, RULE_expressionStmt = 24, RULE_sendStmt = 25, 
		RULE_incDecStmt = 26, RULE_aliasing = 27, RULE_assignment = 28, RULE_assign_op = 29, 
		RULE_shortVarDecl = 30, RULE_shortAliasDecl = 31, RULE_emptyStmt = 32, 
		RULE_labeledStmt = 33, RULE_returnStmt = 34, RULE_breakStmt = 35, RULE_continueStmt = 36, 
		RULE_gotoStmt = 37, RULE_fallthroughStmt = 38, RULE_deferStmt = 39, RULE_ifStmt = 40, 
		RULE_switchStmt = 41, RULE_exprSwitchStmt = 42, RULE_exprCaseClause = 43, 
		RULE_exprSwitchCase = 44, RULE_typeSwitchStmt = 45, RULE_typeSwitchGuard = 46, 
		RULE_typeCaseClause = 47, RULE_typeSwitchCase = 48, RULE_typeList = 49, 
		RULE_selectStmt = 50, RULE_commClause = 51, RULE_commCase = 52, RULE_recvStmt = 53, 
		RULE_forStmt = 54, RULE_forClause = 55, RULE_rangeClause = 56, RULE_goStmt = 57, 
		RULE_type_ = 58, RULE_typeName = 59, RULE_typeLit = 60, RULE_arrayType = 61, 
		RULE_arrayLength = 62, RULE_elementType = 63, RULE_pointerType = 64, RULE_aliasType = 65, 
		RULE_interfaceType = 66, RULE_sliceType = 67, RULE_mapType = 68, RULE_channelType = 69, 
		RULE_methodSpec = 70, RULE_functionType = 71, RULE_signature = 72, RULE_result = 73, 
		RULE_templateParams = 74, RULE_parameters = 75, RULE_paramList = 76, RULE_parameterDecl = 77, 
		RULE_expression = 78, RULE_primaryExpr = 79, RULE_conversion = 80, RULE_nonNamedType = 81, 
		RULE_operand = 82, RULE_literal = 83, RULE_basicLit = 84, RULE_integer = 85, 
		RULE_operandName = 86, RULE_qualifiedIdent = 87, RULE_compositeLit = 88, 
		RULE_literalType = 89, RULE_literalValue = 90, RULE_elementList = 91, 
		RULE_keyedElement = 92, RULE_key = 93, RULE_element = 94, RULE_structType = 95, 
		RULE_fieldDecl = 96, RULE_string_ = 97, RULE_embeddedField = 98, RULE_functionLit = 99, 
		RULE_index = 100, RULE_slice_ = 101, RULE_typeAssertion = 102, RULE_templateAndArgs = 103, 
		RULE_templates = 104, RULE_arguments = 105, RULE_argList = 106, RULE_methodExpr = 107, 
		RULE_receiverType = 108, RULE_eos = 109;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageClause", "importDecl", "importSpec", "importPath", 
			"declaration", "constDecl", "constSpec", "identifierList", "expressionList", 
			"typeDecl", "typeSpec", "functionDecl", "methodDecl", "relationDecl", 
			"receiver", "varDecl", "varSpec", "block", "statementList", "statement", 
			"simpleStmt", "hintCall", "constraintDecl", "expressionStmt", "sendStmt", 
			"incDecStmt", "aliasing", "assignment", "assign_op", "shortVarDecl", 
			"shortAliasDecl", "emptyStmt", "labeledStmt", "returnStmt", "breakStmt", 
			"continueStmt", "gotoStmt", "fallthroughStmt", "deferStmt", "ifStmt", 
			"switchStmt", "exprSwitchStmt", "exprCaseClause", "exprSwitchCase", "typeSwitchStmt", 
			"typeSwitchGuard", "typeCaseClause", "typeSwitchCase", "typeList", "selectStmt", 
			"commClause", "commCase", "recvStmt", "forStmt", "forClause", "rangeClause", 
			"goStmt", "type_", "typeName", "typeLit", "arrayType", "arrayLength", 
			"elementType", "pointerType", "aliasType", "interfaceType", "sliceType", 
			"mapType", "channelType", "methodSpec", "functionType", "signature", 
			"result", "templateParams", "parameters", "paramList", "parameterDecl", 
			"expression", "primaryExpr", "conversion", "nonNamedType", "operand", 
			"literal", "basicLit", "integer", "operandName", "qualifiedIdent", "compositeLit", 
			"literalType", "literalValue", "elementList", "keyedElement", "key", 
			"element", "structType", "fieldDecl", "string_", "embeddedField", "functionLit", 
			"index", "slice_", "typeAssertion", "templateAndArgs", "templates", "arguments", 
			"argList", "methodExpr", "receiverType", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'default'", "'func'", "'rel'", "'interface'", "'select'", 
			"'case'", "'defer'", "'go'", "'map'", "'struct'", "'chan'", "'else'", 
			"'goto'", "'package'", "'switch'", "'const'", "'fallthrough'", "'if'", 
			"'range'", "'type'", "'continue'", "'for'", "'import'", "'return'", "'var'", 
			"'nil'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'<=='", 
			"','", "';'", "':'", "'.'", "'++'", "'--'", "':='", "':=='", "'...'", 
			"'||'", "'&&'", "'==='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'|'", "'/'", "'%'", "'<<'", "'>>'", "'&^'", "'!'", "'+'", "'-'", "'^'", 
			"'*'", "'&'", "'<-'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "DEFAULT", "FUNC", "REL", "INTERFACE", "SELECT", "CASE", 
			"DEFER", "GO", "MAP", "STRUCT", "CHAN", "ELSE", "GOTO", "PACKAGE", "SWITCH", 
			"CONST", "FALLTHROUGH", "IF", "RANGE", "TYPE", "CONTINUE", "FOR", "IMPORT", 
			"RETURN", "VAR", "NIL_LIT", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACKET", "R_BRACKET", "ASSIGN", "ALIAS_ASSIGN", "COMMA", 
			"SEMI", "COLON", "DOT", "PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", 
			"DECLARE_ALIAS", "ELLIPSIS", "LOGICAL_OR", "LOGICAL_AND", "EQUATION", 
			"EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", 
			"OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", "EXCLAMATION", "PLUS", 
			"MINUS", "CARET", "STAR", "AMPERSAND", "RECEIVE", "SEND", "DECIMAL_LIT", 
			"BINARY_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "DECIMAL_FLOAT_LIT", 
			"HEX_FLOAT_LIT", "IMAGINARY_LIT", "RUNE_LIT", "BYTE_VALUE", "OCTAL_BYTE_VALUE", 
			"HEX_BYTE_VALUE", "LITTLE_U_VALUE", "BIG_U_VALUE", "RAW_STRING_LIT", 
			"INTERPRETED_STRING_LIT", "WS", "COMMENT", "TERMINATOR", "LINE_COMMENT", 
			"WS_NLSEMI", "COMMENT_NLSEMI", "LINE_COMMENT_NLSEMI", "EOS", "OTHER"
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
		public List<RelationDeclContext> relationDecl() {
			return getRuleContexts(RelationDeclContext.class);
		}
		public RelationDeclContext relationDecl(int i) {
			return getRuleContext(RelationDeclContext.class,i);
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
			setState(220);
			packageClause();
			setState(221);
			eos();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(222);
				importDecl();
				setState(223);
				eos();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 69337112L) != 0) {
				{
				{
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(230);
					relationDecl();
					}
					break;
				case 2:
					{
					setState(231);
					functionDecl();
					}
					break;
				case 3:
					{
					setState(232);
					methodDecl();
					}
					break;
				case 4:
					{
					setState(233);
					declaration();
					}
					break;
				}
				setState(236);
				eos();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(245);
			match(PACKAGE);
			setState(246);
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
			setState(248);
			match(IMPORT);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case DOT:
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				{
				setState(249);
				importSpec();
				}
				break;
			case L_PAREN:
				{
				setState(250);
				match(L_PAREN);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 108086391056896001L) != 0) {
					{
					{
					setState(251);
					importSpec();
					setState(252);
					eos();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
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
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==DOT) {
				{
				setState(262);
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

			setState(265);
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
			setState(267);
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
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
			setState(274);
			match(CONST);
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(275);
				constSpec();
				}
				break;
			case L_PAREN:
				{
				setState(276);
				match(L_PAREN);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(277);
					constSpec();
					setState(278);
					eos();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
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
			setState(288);
			identifierList();
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 9395248168L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7L) != 0) {
					{
					setState(289);
					type_();
					}
				}

				setState(292);
				match(ASSIGN);
				setState(293);
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
			setState(296);
			match(IDENTIFIER);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					match(IDENTIFIER);
					}
					} 
				}
				setState(303);
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
			setState(304);
			expression(0);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					expression(0);
					}
					} 
				}
				setState(311);
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
			setState(312);
			match(TYPE);
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(313);
				typeSpec();
				}
				break;
			case L_PAREN:
				{
				setState(314);
				match(L_PAREN);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(315);
					typeSpec();
					setState(316);
					eos();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
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
			setState(326);
			match(IDENTIFIER);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(327);
				match(ASSIGN);
				}
			}

			setState(330);
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
			setState(332);
			match(FUNC);
			setState(333);
			match(IDENTIFIER);
			{
			setState(334);
			signature();
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(335);
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
			setState(338);
			match(FUNC);
			setState(339);
			receiver();
			setState(340);
			match(IDENTIFIER);
			{
			setState(341);
			signature();
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(342);
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
	public static class RelationDeclContext extends ParserRuleContext {
		public TerminalNode REL() { return getToken(CsGoParser.REL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TemplateParamsContext templateParams() {
			return getRuleContext(TemplateParamsContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RelationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterRelationDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitRelationDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitRelationDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationDeclContext relationDecl() throws RecognitionException {
		RelationDeclContext _localctx = new RelationDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relationDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(REL);
			setState(346);
			match(IDENTIFIER);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(347);
				templateParams();
				}
			}

			setState(350);
			parameters();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(351);
				result();
				}
				break;
			}
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(354);
				block();
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
		enterRule(_localctx, 30, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 32, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(VAR);
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(360);
				varSpec();
				}
				break;
			case L_PAREN:
				{
				setState(361);
				match(L_PAREN);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(362);
					varSpec();
					setState(363);
					eos();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
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
		enterRule(_localctx, 34, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			identifierList();
			setState(381);
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
			case AMPERSAND:
			case RECEIVE:
				{
				setState(374);
				type_();
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(375);
					match(ASSIGN);
					setState(376);
					expressionList();
					}
					break;
				}
				}
				break;
			case ASSIGN:
				{
				setState(379);
				match(ASSIGN);
				setState(380);
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
		enterRule(_localctx, 36, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(L_CURLY);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(384);
				statementList();
				}
				break;
			}
			setState(387);
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
		enterRule(_localctx, 38, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SEMI) {
							{
							setState(389);
							match(SEMI);
							}
						}

						}
						break;
					case 2:
						{
						setState(393);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EOS) {
							{
							setState(392);
							match(EOS);
							}
						}

						}
						break;
					case 3:
						{
						setState(395);
						if (!(this.closingBracket())) throw new FailedPredicateException(this, "this.closingBracket()");
						}
						break;
					}
					setState(398);
					statement();
					setState(399);
					eos();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(403); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				goStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				continueStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(412);
				gotoStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				fallthroughStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(414);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(415);
				ifStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(416);
				switchStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(417);
				selectStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(418);
				forStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(419);
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
		public HintCallContext hintCall() {
			return getRuleContext(HintCallContext.class,0);
		}
		public AliasingContext aliasing() {
			return getRuleContext(AliasingContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public ShortVarDeclContext shortVarDecl() {
			return getRuleContext(ShortVarDeclContext.class,0);
		}
		public ShortAliasDeclContext shortAliasDecl() {
			return getRuleContext(ShortAliasDeclContext.class,0);
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
		enterRule(_localctx, 42, RULE_simpleStmt);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				constraintDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				sendStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				incDecStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				hintCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				aliasing();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				expressionStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				shortVarDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(430);
				shortAliasDecl();
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
	public static class HintCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CsGoParser.IDENTIFIER, 0); }
		public TemplateAndArgsContext templateAndArgs() {
			return getRuleContext(TemplateAndArgsContext.class,0);
		}
		public TerminalNode SEND() { return getToken(CsGoParser.SEND, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public HintCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterHintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitHintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitHintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintCallContext hintCall() throws RecognitionException {
		HintCallContext _localctx = new HintCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hintCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(IDENTIFIER);
			setState(434);
			templateAndArgs();
			setState(435);
			match(SEND);
			setState(436);
			identifierList();
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
		enterRule(_localctx, 46, RULE_constraintDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			expression(0);
			setState(439);
			match(EQUATION);
			setState(440);
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
		enterRule(_localctx, 48, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		enterRule(_localctx, 50, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((SendStmtContext)_localctx).channel = expression(0);
			setState(445);
			match(RECEIVE);
			setState(446);
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
		enterRule(_localctx, 52, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			expression(0);
			setState(449);
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
	public static class AliasingContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ALIAS_ASSIGN() { return getToken(CsGoParser.ALIAS_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AliasingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterAliasing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitAliasing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitAliasing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasingContext aliasing() throws RecognitionException {
		AliasingContext _localctx = new AliasingContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			expressionList();
			setState(452);
			match(ALIAS_ASSIGN);
			setState(453);
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
		enterRule(_localctx, 56, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			expressionList();
			setState(456);
			assign_op();
			setState(457);
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
		enterRule(_localctx, 58, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 4031L) != 0) {
				{
				setState(459);
				_la = _input.LA(1);
				if ( !((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 4031L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(462);
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
		enterRule(_localctx, 60, RULE_shortVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			identifierList();
			setState(465);
			match(DECLARE_ASSIGN);
			setState(466);
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
	public static class ShortAliasDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode DECLARE_ALIAS() { return getToken(CsGoParser.DECLARE_ALIAS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ShortAliasDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAliasDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterShortAliasDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitShortAliasDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitShortAliasDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAliasDeclContext shortAliasDecl() throws RecognitionException {
		ShortAliasDeclContext _localctx = new ShortAliasDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shortAliasDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			identifierList();
			setState(469);
			match(DECLARE_ALIAS);
			setState(470);
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
		enterRule(_localctx, 64, RULE_emptyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		enterRule(_localctx, 66, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(IDENTIFIER);
			setState(475);
			match(COLON);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(476);
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
		enterRule(_localctx, 68, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(RETURN);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(480);
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
		enterRule(_localctx, 70, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(BREAK);
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(484);
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
		enterRule(_localctx, 72, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(CONTINUE);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(488);
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
		enterRule(_localctx, 74, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(GOTO);
			setState(492);
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
		enterRule(_localctx, 76, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 78, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(DEFER);
			setState(497);
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
		enterRule(_localctx, 80, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(IF);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(500);
				expression(0);
				}
				break;
			case 2:
				{
				setState(501);
				eos();
				setState(502);
				expression(0);
				}
				break;
			case 3:
				{
				setState(504);
				simpleStmt();
				setState(505);
				eos();
				setState(506);
				expression(0);
				}
				break;
			}
			setState(510);
			block();
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(511);
				match(ELSE);
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(512);
					ifStmt();
					}
					break;
				case L_CURLY:
					{
					setState(513);
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
		enterRule(_localctx, 82, RULE_switchStmt);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
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
		enterRule(_localctx, 84, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(SWITCH);
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(523);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(526);
					simpleStmt();
					}
					break;
				}
				setState(529);
				eos();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(530);
					expression(0);
					}
				}

				}
				break;
			}
			setState(535);
			match(L_CURLY);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(536);
				exprCaseClause();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
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
		enterRule(_localctx, 86, RULE_exprCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			exprSwitchCase();
			setState(545);
			match(COLON);
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(546);
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
		enterRule(_localctx, 88, RULE_exprSwitchCase);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(CASE);
				setState(550);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
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
		enterRule(_localctx, 90, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(SWITCH);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(555);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(556);
				eos();
				setState(557);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(559);
				simpleStmt();
				setState(560);
				eos();
				setState(561);
				typeSwitchGuard();
				}
				break;
			}
			setState(565);
			match(L_CURLY);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(566);
				typeCaseClause();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
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
		enterRule(_localctx, 92, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(574);
				match(IDENTIFIER);
				setState(575);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(578);
			primaryExpr(0);
			setState(579);
			match(DOT);
			setState(580);
			match(L_PAREN);
			setState(581);
			match(TYPE);
			setState(582);
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
		enterRule(_localctx, 94, RULE_typeCaseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			typeSwitchCase();
			setState(585);
			match(COLON);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(586);
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
		enterRule(_localctx, 96, RULE_typeSwitchCase);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(CASE);
				setState(590);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
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
		enterRule(_localctx, 98, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
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
			case AMPERSAND:
			case RECEIVE:
				{
				setState(594);
				type_();
				}
				break;
			case NIL_LIT:
				{
				setState(595);
				match(NIL_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(598);
				match(COMMA);
				setState(601);
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
				case AMPERSAND:
				case RECEIVE:
					{
					setState(599);
					type_();
					}
					break;
				case NIL_LIT:
					{
					setState(600);
					match(NIL_LIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(607);
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
		enterRule(_localctx, 100, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(SELECT);
			setState(609);
			match(L_CURLY);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==CASE) {
				{
				{
				setState(610);
				commClause();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
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
		enterRule(_localctx, 102, RULE_commClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			commCase();
			setState(619);
			match(COLON);
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(620);
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
		enterRule(_localctx, 104, RULE_commCase);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(CASE);
				setState(626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(624);
					sendStmt();
					}
					break;
				case 2:
					{
					setState(625);
					recvStmt();
					}
					break;
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
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
		enterRule(_localctx, 106, RULE_recvStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(631);
				expressionList();
				setState(632);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(634);
				identifierList();
				setState(635);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(639);
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
		enterRule(_localctx, 108, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(FOR);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(642);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(645);
				forClause();
				}
				break;
			case 3:
				{
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999683179480L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(646);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(651);
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
		enterRule(_localctx, 110, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(653);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
				break;
			}
			setState(656);
			eos();
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(657);
				expression(0);
				}
				break;
			}
			setState(660);
			eos();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
				{
				setState(661);
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
		enterRule(_localctx, 112, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(664);
				expressionList();
				setState(665);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(667);
				identifierList();
				setState(668);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(672);
			match(RANGE);
			setState(673);
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
		enterRule(_localctx, 114, RULE_goStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(GO);
			setState(676);
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
		enterRule(_localctx, 116, RULE_type_);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
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
			case AMPERSAND:
			case RECEIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				match(L_PAREN);
				setState(681);
				type_();
				setState(682);
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
		enterRule(_localctx, 118, RULE_typeName);
		try {
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
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
		public AliasTypeContext aliasType() {
			return getRuleContext(AliasTypeContext.class,0);
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
		enterRule(_localctx, 120, RULE_typeLit);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				pointerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				aliasType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(694);
				functionType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				interfaceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(696);
				sliceType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(697);
				mapType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
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
		enterRule(_localctx, 122, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(L_BRACKET);
			setState(702);
			arrayLength();
			setState(703);
			match(R_BRACKET);
			setState(704);
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
		enterRule(_localctx, 124, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		enterRule(_localctx, 126, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
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
		enterRule(_localctx, 128, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(STAR);
			setState(711);
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
	public static class AliasTypeContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(CsGoParser.AMPERSAND, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AliasTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterAliasType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitAliasType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitAliasType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasTypeContext aliasType() throws RecognitionException {
		AliasTypeContext _localctx = new AliasTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_aliasType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(AMPERSAND);
			setState(714);
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
		enterRule(_localctx, 132, RULE_interfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(INTERFACE);
			setState(717);
			match(L_CURLY);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(718);
					methodSpec();
					}
					break;
				case 2:
					{
					setState(719);
					typeName();
					}
					break;
				}
				setState(722);
				eos();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
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
		enterRule(_localctx, 134, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(L_BRACKET);
			setState(732);
			match(R_BRACKET);
			setState(733);
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
		enterRule(_localctx, 136, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(MAP);
			setState(736);
			match(L_BRACKET);
			setState(737);
			type_();
			setState(738);
			match(R_BRACKET);
			setState(739);
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
		enterRule(_localctx, 138, RULE_channelType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(741);
				match(CHAN);
				}
				break;
			case 2:
				{
				setState(742);
				match(CHAN);
				setState(743);
				match(RECEIVE);
				}
				break;
			case 3:
				{
				setState(744);
				match(RECEIVE);
				setState(745);
				match(CHAN);
				}
				break;
			}
			setState(748);
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
		enterRule(_localctx, 140, RULE_methodSpec);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(IDENTIFIER);
				setState(751);
				parameters();
				setState(752);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				match(IDENTIFIER);
				setState(755);
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
		enterRule(_localctx, 142, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(FUNC);
			setState(759);
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
		enterRule(_localctx, 144, RULE_signature);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				parameters();
				setState(762);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
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
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
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
	public static class TemplateParamsContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CsGoParser.LESS, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(CsGoParser.GREATER, 0); }
		public TemplateParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTemplateParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTemplateParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTemplateParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParamsContext templateParams() throws RecognitionException {
		TemplateParamsContext _localctx = new TemplateParamsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_templateParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(LESS);
			setState(772);
			paramList();
			setState(773);
			match(GREATER);
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
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CsGoParser.R_PAREN, 0); }
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
		enterRule(_localctx, 150, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(L_PAREN);
			setState(776);
			paramList();
			setState(777);
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
	public static class ParamListContext extends ParserRuleContext {
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
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_paramList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 35193767337000L) != 0 || (((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 7L) != 0) {
				{
				setState(779);
				parameterDecl();
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(780);
						match(COMMA);
						setState(781);
						parameterDecl();
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(787);
					match(COMMA);
					}
				}

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
		enterRule(_localctx, 154, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(792);
				identifierList();
				}
				break;
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(795);
				match(ELLIPSIS);
				}
			}

			setState(798);
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(801);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				_localctx = new DcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(802);
				((DcContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 127L) != 0) ) {
					((DcContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(803);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(806);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(807);
						((MulContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 1567L) != 0) ) {
							((MulContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(808);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(809);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(810);
						((AddContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 897L) != 0) ) {
							((AddContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(811);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(812);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(813);
						((DcContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847065542656L) != 0) ) {
							((DcContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(814);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(815);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(816);
						match(LOGICAL_AND);
						setState(817);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new DcContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(818);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(819);
						match(LOGICAL_OR);
						setState(820);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(825);
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
		public TemplateAndArgsContext templateAndArgs() {
			return getRuleContext(TemplateAndArgsContext.class,0);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(827);
				operand();
				}
				break;
			case 2:
				{
				setState(828);
				conversion();
				}
				break;
			case 3:
				{
				setState(829);
				methodExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(832);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(839);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						{
						setState(833);
						match(DOT);
						setState(834);
						match(IDENTIFIER);
						}
						}
						break;
					case 2:
						{
						setState(835);
						index();
						}
						break;
					case 3:
						{
						setState(836);
						slice_();
						}
						break;
					case 4:
						{
						setState(837);
						typeAssertion();
						}
						break;
					case 5:
						{
						setState(838);
						templateAndArgs();
						}
						break;
					}
					}
					} 
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 160, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			nonNamedType();
			setState(847);
			match(L_PAREN);
			setState(848);
			expression(0);
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(849);
				match(COMMA);
				}
			}

			setState(852);
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
		enterRule(_localctx, 162, RULE_nonNamedType);
		try {
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case INTERFACE:
			case MAP:
			case STRUCT:
			case CHAN:
			case L_BRACKET:
			case STAR:
			case AMPERSAND:
			case RECEIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				typeLit();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(L_PAREN);
				setState(856);
				nonNamedType();
				setState(857);
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
		enterRule(_localctx, 164, RULE_operand);
		try {
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				match(L_PAREN);
				setState(864);
				expression(0);
				setState(865);
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
		enterRule(_localctx, 166, RULE_literal);
		try {
			setState(872);
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
				setState(869);
				basicLit();
				}
				break;
			case MAP:
			case STRUCT:
			case IDENTIFIER:
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				compositeLit();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(871);
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
		enterRule(_localctx, 168, RULE_basicLit);
		try {
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
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
				setState(875);
				integer();
				}
				break;
			case RAW_STRING_LIT:
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
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
		enterRule(_localctx, 170, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 399L) != 0) ) {
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
		enterRule(_localctx, 172, RULE_operandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
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
		enterRule(_localctx, 174, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(IDENTIFIER);
			setState(885);
			match(DOT);
			setState(886);
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
		enterRule(_localctx, 176, RULE_compositeLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			literalType();
			setState(889);
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
		enterRule(_localctx, 178, RULE_literalType);
		try {
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				structType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				match(L_BRACKET);
				setState(894);
				match(ELLIPSIS);
				setState(895);
				match(R_BRACKET);
				setState(896);
				elementType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				sliceType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				mapType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(899);
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
		enterRule(_localctx, 180, RULE_literalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(L_CURLY);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842997536744408L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
				{
				setState(903);
				elementList();
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(904);
					match(COMMA);
					}
				}

				}
			}

			setState(909);
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
		enterRule(_localctx, 182, RULE_elementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			keyedElement();
			setState(916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(912);
					match(COMMA);
					setState(913);
					keyedElement();
					}
					} 
				}
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		enterRule(_localctx, 184, RULE_keyedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(919);
				key();
				setState(920);
				match(COLON);
				}
				break;
			}
			setState(924);
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
		enterRule(_localctx, 186, RULE_key);
		try {
			setState(928);
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
				setState(926);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
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
		enterRule(_localctx, 188, RULE_element);
		try {
			setState(932);
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
				setState(930);
				expression(0);
				}
				break;
			case L_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
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
		enterRule(_localctx, 190, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(STRUCT);
			setState(935);
			match(L_CURLY);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==STAR) {
				{
				{
				setState(936);
				fieldDecl();
				setState(937);
				eos();
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
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
		enterRule(_localctx, 192, RULE_fieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(946);
				identifierList();
				setState(947);
				type_();
				}
				break;
			case 2:
				{
				setState(949);
				embeddedField();
				}
				break;
			}
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(952);
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
		enterRule(_localctx, 194, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
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
		enterRule(_localctx, 196, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(957);
				match(STAR);
				}
			}

			setState(960);
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
		enterRule(_localctx, 198, RULE_functionLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(FUNC);
			setState(963);
			signature();
			setState(964);
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
		enterRule(_localctx, 200, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(L_BRACKET);
			setState(967);
			expression(0);
			setState(968);
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
		enterRule(_localctx, 202, RULE_slice_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(L_BRACKET);
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(971);
					expression(0);
					}
				}

				setState(974);
				match(COLON);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(975);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
					{
					setState(978);
					expression(0);
					}
				}

				setState(981);
				match(COLON);
				setState(982);
				expression(0);
				setState(983);
				match(COLON);
				setState(984);
				expression(0);
				}
				break;
			}
			setState(988);
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
		enterRule(_localctx, 204, RULE_typeAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(DOT);
			setState(991);
			match(L_PAREN);
			setState(992);
			type_();
			setState(993);
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
	public static class TemplateAndArgsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TemplateAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTemplateAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTemplateAndArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTemplateAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateAndArgsContext templateAndArgs() throws RecognitionException {
		TemplateAndArgsContext _localctx = new TemplateAndArgsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_templateAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(995);
				templates();
				}
			}

			setState(998);
			arguments();
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
	public static class TemplatesContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(CsGoParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CsGoParser.GREATER, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterTemplates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitTemplates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(LESS);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
				{
				setState(1001);
				argList();
				}
			}

			setState(1004);
			match(GREATER);
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
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
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
		enterRule(_localctx, 210, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(L_PAREN);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842999684228056L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1586159L) != 0) {
				{
				setState(1007);
				argList();
				}
			}

			setState(1010);
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
	public static class ArgListContext extends ParserRuleContext {
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
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsGoParserListener ) ((CsGoParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsGoParserVisitor ) return ((CsGoParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1012);
				expressionList();
				}
				break;
			case 2:
				{
				setState(1013);
				nonNamedType();
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1014);
					match(COMMA);
					setState(1015);
					expressionList();
					}
					break;
				}
				}
				break;
			}
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELLIPSIS) {
				{
				setState(1020);
				match(ELLIPSIS);
				}
			}

			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1023);
				match(COMMA);
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
		enterRule(_localctx, 214, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			nonNamedType();
			setState(1027);
			match(DOT);
			setState(1028);
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
		enterRule(_localctx, 216, RULE_receiverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		enterRule(_localctx, 218, RULE_eos);
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1034);
				match(EOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1035);
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
		case 19:
			return statementList_sempred((StatementListContext)_localctx, predIndex);
		case 78:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 79:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		case 109:
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
		"\u0004\u0001]\u040f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00e2"+
		"\b\u0000\n\u0000\f\u0000\u00e5\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u00eb\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00ef\b\u0000\n\u0000\f\u0000\u00f2\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ff\b\u0002\n\u0002\f\u0002"+
		"\u0102\t\u0002\u0001\u0002\u0003\u0002\u0105\b\u0002\u0001\u0003\u0003"+
		"\u0003\u0108\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0111\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0119"+
		"\b\u0006\n\u0006\f\u0006\u011c\t\u0006\u0001\u0006\u0003\u0006\u011f\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0123\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0127\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u012c"+
		"\b\b\n\b\f\b\u012f\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u0134\b\t\n\t\f"+
		"\t\u0137\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u013f"+
		"\b\n\n\n\f\n\u0142\t\n\u0001\n\u0003\n\u0145\b\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0149\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0151\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0158\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015d\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0161\b\u000e\u0001\u000e\u0003\u000e"+
		"\u0164\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u016e\b\u0010\n\u0010"+
		"\f\u0010\u0171\t\u0010\u0001\u0010\u0003\u0010\u0174\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u017a\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u017e\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0182\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u0187\b"+
		"\u0013\u0001\u0013\u0003\u0013\u018a\b\u0013\u0001\u0013\u0003\u0013\u018d"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0192\b\u0013"+
		"\u000b\u0013\f\u0013\u0193\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01a5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b0\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u01cd\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0003!\u01de\b!\u0001\"\u0001\"\u0003\"\u01e2\b\"\u0001#\u0001#\u0003"+
		"#\u01e6\b#\u0001$\u0001$\u0003$\u01ea\b$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01fd\b(\u0001(\u0001(\u0001(\u0001(\u0003(\u0203"+
		"\b(\u0003(\u0205\b(\u0001)\u0001)\u0003)\u0209\b)\u0001*\u0001*\u0003"+
		"*\u020d\b*\u0001*\u0003*\u0210\b*\u0001*\u0001*\u0003*\u0214\b*\u0003"+
		"*\u0216\b*\u0001*\u0001*\u0005*\u021a\b*\n*\f*\u021d\t*\u0001*\u0001*"+
		"\u0001+\u0001+\u0001+\u0003+\u0224\b+\u0001,\u0001,\u0001,\u0003,\u0229"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0234\b-\u0001-\u0001-\u0005-\u0238\b-\n-\f-\u023b\t-\u0001-\u0001-"+
		"\u0001.\u0001.\u0003.\u0241\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0003/\u024c\b/\u00010\u00010\u00010\u00030\u0251"+
		"\b0\u00011\u00011\u00031\u0255\b1\u00011\u00011\u00011\u00031\u025a\b"+
		"1\u00051\u025c\b1\n1\f1\u025f\t1\u00012\u00012\u00012\u00052\u0264\b2"+
		"\n2\f2\u0267\t2\u00012\u00012\u00013\u00013\u00013\u00033\u026e\b3\u0001"+
		"4\u00014\u00014\u00034\u0273\b4\u00014\u00034\u0276\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u027e\b5\u00015\u00015\u00016\u00016\u0003"+
		"6\u0284\b6\u00016\u00016\u00036\u0288\b6\u00036\u028a\b6\u00016\u0001"+
		"6\u00017\u00037\u028f\b7\u00017\u00017\u00037\u0293\b7\u00017\u00017\u0003"+
		"7\u0297\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u029f\b8\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0003:\u02ad\b:\u0001;\u0001;\u0003;\u02b1\b;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u02bc\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0003B\u02d1\bB\u0001"+
		"B\u0001B\u0005B\u02d5\bB\nB\fB\u02d8\tB\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u02eb\bE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02f5\bF\u0001G\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u02fe\bH\u0001I\u0001I\u0003I\u0302\bI\u0001J\u0001J\u0001"+
		"J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005L\u030f"+
		"\bL\nL\fL\u0312\tL\u0001L\u0003L\u0315\bL\u0003L\u0317\bL\u0001M\u0003"+
		"M\u031a\bM\u0001M\u0003M\u031d\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001"+
		"N\u0003N\u0325\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0005N\u0336\bN\nN"+
		"\fN\u0339\tN\u0001O\u0001O\u0001O\u0001O\u0003O\u033f\bO\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0348\bO\u0005O\u034a\bO\n"+
		"O\fO\u034d\tO\u0001P\u0001P\u0001P\u0001P\u0003P\u0353\bP\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u035c\bQ\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0003R\u0364\bR\u0001S\u0001S\u0001S\u0003S\u0369"+
		"\bS\u0001T\u0001T\u0001T\u0001T\u0003T\u036f\bT\u0001U\u0001U\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u0385\bY\u0001Z\u0001"+
		"Z\u0001Z\u0003Z\u038a\bZ\u0003Z\u038c\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001"+
		"[\u0005[\u0393\b[\n[\f[\u0396\t[\u0001\\\u0001\\\u0001\\\u0003\\\u039b"+
		"\b\\\u0001\\\u0001\\\u0001]\u0001]\u0003]\u03a1\b]\u0001^\u0001^\u0003"+
		"^\u03a5\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0005_\u03ac\b_\n_\f_\u03af"+
		"\t_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0003`\u03b7\b`\u0001`\u0003"+
		"`\u03ba\b`\u0001a\u0001a\u0001b\u0003b\u03bf\bb\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0003e\u03cd"+
		"\be\u0001e\u0001e\u0003e\u03d1\be\u0001e\u0003e\u03d4\be\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0003e\u03db\be\u0001e\u0001e\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001g\u0003g\u03e5\bg\u0001g\u0001g\u0001h\u0001h\u0003"+
		"h\u03eb\bh\u0001h\u0001h\u0001i\u0001i\u0003i\u03f1\bi\u0001i\u0001i\u0001"+
		"j\u0001j\u0001j\u0001j\u0003j\u03f9\bj\u0003j\u03fb\bj\u0001j\u0003j\u03fe"+
		"\bj\u0001j\u0003j\u0401\bj\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001"+
		"m\u0001m\u0001m\u0001m\u0003m\u040d\bm\u0001m\u0000\u0002\u009c\u009e"+
		"n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u0000\n\u0002\u0000\u001c"+
		"\u001c((\u0001\u0000)*\u0002\u00007<>B\u0002\u0000&&\\\\\u0001\u0000="+
		"C\u0002\u00008<AB\u0002\u000077>@\u0001\u000016\u0002\u0000EHLM\u0001"+
		"\u0000ST\u044b\u0000\u00dc\u0001\u0000\u0000\u0000\u0002\u00f5\u0001\u0000"+
		"\u0000\u0000\u0004\u00f8\u0001\u0000\u0000\u0000\u0006\u0107\u0001\u0000"+
		"\u0000\u0000\b\u010b\u0001\u0000\u0000\u0000\n\u0110\u0001\u0000\u0000"+
		"\u0000\f\u0112\u0001\u0000\u0000\u0000\u000e\u0120\u0001\u0000\u0000\u0000"+
		"\u0010\u0128\u0001\u0000\u0000\u0000\u0012\u0130\u0001\u0000\u0000\u0000"+
		"\u0014\u0138\u0001\u0000\u0000\u0000\u0016\u0146\u0001\u0000\u0000\u0000"+
		"\u0018\u014c\u0001\u0000\u0000\u0000\u001a\u0152\u0001\u0000\u0000\u0000"+
		"\u001c\u0159\u0001\u0000\u0000\u0000\u001e\u0165\u0001\u0000\u0000\u0000"+
		" \u0167\u0001\u0000\u0000\u0000\"\u0175\u0001\u0000\u0000\u0000$\u017f"+
		"\u0001\u0000\u0000\u0000&\u0191\u0001\u0000\u0000\u0000(\u01a4\u0001\u0000"+
		"\u0000\u0000*\u01af\u0001\u0000\u0000\u0000,\u01b1\u0001\u0000\u0000\u0000"+
		".\u01b6\u0001\u0000\u0000\u00000\u01ba\u0001\u0000\u0000\u00002\u01bc"+
		"\u0001\u0000\u0000\u00004\u01c0\u0001\u0000\u0000\u00006\u01c3\u0001\u0000"+
		"\u0000\u00008\u01c7\u0001\u0000\u0000\u0000:\u01cc\u0001\u0000\u0000\u0000"+
		"<\u01d0\u0001\u0000\u0000\u0000>\u01d4\u0001\u0000\u0000\u0000@\u01d8"+
		"\u0001\u0000\u0000\u0000B\u01da\u0001\u0000\u0000\u0000D\u01df\u0001\u0000"+
		"\u0000\u0000F\u01e3\u0001\u0000\u0000\u0000H\u01e7\u0001\u0000\u0000\u0000"+
		"J\u01eb\u0001\u0000\u0000\u0000L\u01ee\u0001\u0000\u0000\u0000N\u01f0"+
		"\u0001\u0000\u0000\u0000P\u01f3\u0001\u0000\u0000\u0000R\u0208\u0001\u0000"+
		"\u0000\u0000T\u020a\u0001\u0000\u0000\u0000V\u0220\u0001\u0000\u0000\u0000"+
		"X\u0228\u0001\u0000\u0000\u0000Z\u022a\u0001\u0000\u0000\u0000\\\u0240"+
		"\u0001\u0000\u0000\u0000^\u0248\u0001\u0000\u0000\u0000`\u0250\u0001\u0000"+
		"\u0000\u0000b\u0254\u0001\u0000\u0000\u0000d\u0260\u0001\u0000\u0000\u0000"+
		"f\u026a\u0001\u0000\u0000\u0000h\u0275\u0001\u0000\u0000\u0000j\u027d"+
		"\u0001\u0000\u0000\u0000l\u0281\u0001\u0000\u0000\u0000n\u028e\u0001\u0000"+
		"\u0000\u0000p\u029e\u0001\u0000\u0000\u0000r\u02a3\u0001\u0000\u0000\u0000"+
		"t\u02ac\u0001\u0000\u0000\u0000v\u02b0\u0001\u0000\u0000\u0000x\u02bb"+
		"\u0001\u0000\u0000\u0000z\u02bd\u0001\u0000\u0000\u0000|\u02c2\u0001\u0000"+
		"\u0000\u0000~\u02c4\u0001\u0000\u0000\u0000\u0080\u02c6\u0001\u0000\u0000"+
		"\u0000\u0082\u02c9\u0001\u0000\u0000\u0000\u0084\u02cc\u0001\u0000\u0000"+
		"\u0000\u0086\u02db\u0001\u0000\u0000\u0000\u0088\u02df\u0001\u0000\u0000"+
		"\u0000\u008a\u02ea\u0001\u0000\u0000\u0000\u008c\u02f4\u0001\u0000\u0000"+
		"\u0000\u008e\u02f6\u0001\u0000\u0000\u0000\u0090\u02fd\u0001\u0000\u0000"+
		"\u0000\u0092\u0301\u0001\u0000\u0000\u0000\u0094\u0303\u0001\u0000\u0000"+
		"\u0000\u0096\u0307\u0001\u0000\u0000\u0000\u0098\u0316\u0001\u0000\u0000"+
		"\u0000\u009a\u0319\u0001\u0000\u0000\u0000\u009c\u0324\u0001\u0000\u0000"+
		"\u0000\u009e\u033e\u0001\u0000\u0000\u0000\u00a0\u034e\u0001\u0000\u0000"+
		"\u0000\u00a2\u035b\u0001\u0000\u0000\u0000\u00a4\u0363\u0001\u0000\u0000"+
		"\u0000\u00a6\u0368\u0001\u0000\u0000\u0000\u00a8\u036e\u0001\u0000\u0000"+
		"\u0000\u00aa\u0370\u0001\u0000\u0000\u0000\u00ac\u0372\u0001\u0000\u0000"+
		"\u0000\u00ae\u0374\u0001\u0000\u0000\u0000\u00b0\u0378\u0001\u0000\u0000"+
		"\u0000\u00b2\u0384\u0001\u0000\u0000\u0000\u00b4\u0386\u0001\u0000\u0000"+
		"\u0000\u00b6\u038f\u0001\u0000\u0000\u0000\u00b8\u039a\u0001\u0000\u0000"+
		"\u0000\u00ba\u03a0\u0001\u0000\u0000\u0000\u00bc\u03a4\u0001\u0000\u0000"+
		"\u0000\u00be\u03a6\u0001\u0000\u0000\u0000\u00c0\u03b6\u0001\u0000\u0000"+
		"\u0000\u00c2\u03bb\u0001\u0000\u0000\u0000\u00c4\u03be\u0001\u0000\u0000"+
		"\u0000\u00c6\u03c2\u0001\u0000\u0000\u0000\u00c8\u03c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u03ca\u0001\u0000\u0000\u0000\u00cc\u03de\u0001\u0000\u0000"+
		"\u0000\u00ce\u03e4\u0001\u0000\u0000\u0000\u00d0\u03e8\u0001\u0000\u0000"+
		"\u0000\u00d2\u03ee\u0001\u0000\u0000\u0000\u00d4\u03fa\u0001\u0000\u0000"+
		"\u0000\u00d6\u0402\u0001\u0000\u0000\u0000\u00d8\u0406\u0001\u0000\u0000"+
		"\u0000\u00da\u040c\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\u0002\u0001"+
		"\u0000\u00dd\u00e3\u0003\u00dam\u0000\u00de\u00df\u0003\u0004\u0002\u0000"+
		"\u00df\u00e0\u0003\u00dam\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1"+
		"\u00de\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00f0\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00eb\u0003\u001c\u000e\u0000\u00e7\u00eb\u0003\u0018\f\u0000\u00e8\u00eb"+
		"\u0003\u001a\r\u0000\u00e9\u00eb\u0003\n\u0005\u0000\u00ea\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0003\u00dam\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0000\u0000\u0001\u00f4\u0001\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005\u000f\u0000\u0000\u00f6\u00f7\u0005\u001c"+
		"\u0000\u0000\u00f7\u0003\u0001\u0000\u0000\u0000\u00f8\u0104\u0005\u0018"+
		"\u0000\u0000\u00f9\u0105\u0003\u0006\u0003\u0000\u00fa\u0100\u0005\u001d"+
		"\u0000\u0000\u00fb\u00fc\u0003\u0006\u0003\u0000\u00fc\u00fd\u0003\u00da"+
		"m\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0105\u0005\u001e\u0000"+
		"\u0000\u0104\u00f9\u0001\u0000\u0000\u0000\u0104\u00fa\u0001\u0000\u0000"+
		"\u0000\u0105\u0005\u0001\u0000\u0000\u0000\u0106\u0108\u0007\u0000\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0003\b\u0004\u0000"+
		"\u010a\u0007\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u00c2a\u0000\u010c"+
		"\t\u0001\u0000\u0000\u0000\u010d\u0111\u0003\f\u0006\u0000\u010e\u0111"+
		"\u0003\u0014\n\u0000\u010f\u0111\u0003 \u0010\u0000\u0110\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u000b\u0001\u0000\u0000\u0000\u0112\u011e\u0005"+
		"\u0011\u0000\u0000\u0113\u011f\u0003\u000e\u0007\u0000\u0114\u011a\u0005"+
		"\u001d\u0000\u0000\u0115\u0116\u0003\u000e\u0007\u0000\u0116\u0117\u0003"+
		"\u00dam\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011f\u0005\u001e"+
		"\u0000\u0000\u011e\u0113\u0001\u0000\u0000\u0000\u011e\u0114\u0001\u0000"+
		"\u0000\u0000\u011f\r\u0001\u0000\u0000\u0000\u0120\u0126\u0003\u0010\b"+
		"\u0000\u0121\u0123\u0003t:\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005#\u0000\u0000\u0125\u0127\u0003\u0012\t\u0000\u0126\u0122"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u000f"+
		"\u0001\u0000\u0000\u0000\u0128\u012d\u0005\u001c\u0000\u0000\u0129\u012a"+
		"\u0005%\u0000\u0000\u012a\u012c\u0005\u001c\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0011\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0135\u0003"+
		"\u009cN\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u0134\u0003\u009cN"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0013\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u0144\u0005\u0015\u0000\u0000\u0139\u0145\u0003\u0016\u000b"+
		"\u0000\u013a\u0140\u0005\u001d\u0000\u0000\u013b\u013c\u0003\u0016\u000b"+
		"\u0000\u013c\u013d\u0003\u00dam\u0000\u013d\u013f\u0001\u0000\u0000\u0000"+
		"\u013e\u013b\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0145\u0005\u001e\u0000\u0000\u0144\u0139\u0001\u0000\u0000\u0000"+
		"\u0144\u013a\u0001\u0000\u0000\u0000\u0145\u0015\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0005\u001c\u0000\u0000\u0147\u0149\u0005#\u0000\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0003t:\u0000\u014b\u0017\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0005\u0003\u0000\u0000\u014d\u014e\u0005"+
		"\u001c\u0000\u0000\u014e\u0150\u0003\u0090H\u0000\u014f\u0151\u0003$\u0012"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0019\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0003\u0000"+
		"\u0000\u0153\u0154\u0003\u001e\u000f\u0000\u0154\u0155\u0005\u001c\u0000"+
		"\u0000\u0155\u0157\u0003\u0090H\u0000\u0156\u0158\u0003$\u0012\u0000\u0157"+
		"\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"\u001b\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0004\u0000\u0000\u015a"+
		"\u015c\u0005\u001c\u0000\u0000\u015b\u015d\u0003\u0094J\u0000\u015c\u015b"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0001\u0000\u0000\u0000\u015e\u0160\u0003\u0096K\u0000\u015f\u0161\u0003"+
		"\u0092I\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0164\u0003$\u0012"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u001d\u0001\u0000\u0000\u0000\u0165\u0166\u0003\u0096K\u0000"+
		"\u0166\u001f\u0001\u0000\u0000\u0000\u0167\u0173\u0005\u001a\u0000\u0000"+
		"\u0168\u0174\u0003\"\u0011\u0000\u0169\u016f\u0005\u001d\u0000\u0000\u016a"+
		"\u016b\u0003\"\u0011\u0000\u016b\u016c\u0003\u00dam\u0000\u016c\u016e"+
		"\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e\u0171"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0172\u0174\u0005\u001e\u0000\u0000\u0173\u0168"+
		"\u0001\u0000\u0000\u0000\u0173\u0169\u0001\u0000\u0000\u0000\u0174!\u0001"+
		"\u0000\u0000\u0000\u0175\u017d\u0003\u0010\b\u0000\u0176\u0179\u0003t"+
		":\u0000\u0177\u0178\u0005#\u0000\u0000\u0178\u017a\u0003\u0012\t\u0000"+
		"\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017e\u0001\u0000\u0000\u0000\u017b\u017c\u0005#\u0000\u0000\u017c"+
		"\u017e\u0003\u0012\t\u0000\u017d\u0176\u0001\u0000\u0000\u0000\u017d\u017b"+
		"\u0001\u0000\u0000\u0000\u017e#\u0001\u0000\u0000\u0000\u017f\u0181\u0005"+
		"\u001f\u0000\u0000\u0180\u0182\u0003&\u0013\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0005 \u0000\u0000\u0184%\u0001\u0000\u0000\u0000"+
		"\u0185\u0187\u0005&\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u018d\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0005\\\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u0004\u0013\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000\u018c\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0003(\u0014\u0000\u018f\u0190\u0003"+
		"\u00dam\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\'\u0001\u0000\u0000"+
		"\u0000\u0195\u01a5\u0003\n\u0005\u0000\u0196\u01a5\u0003B!\u0000\u0197"+
		"\u01a5\u0003*\u0015\u0000\u0198\u01a5\u0003r9\u0000\u0199\u01a5\u0003"+
		"D\"\u0000\u019a\u01a5\u0003F#\u0000\u019b\u01a5\u0003H$\u0000\u019c\u01a5"+
		"\u0003J%\u0000\u019d\u01a5\u0003L&\u0000\u019e\u01a5\u0003$\u0012\u0000"+
		"\u019f\u01a5\u0003P(\u0000\u01a0\u01a5\u0003R)\u0000\u01a1\u01a5\u0003"+
		"d2\u0000\u01a2\u01a5\u0003l6\u0000\u01a3\u01a5\u0003N\'\u0000\u01a4\u0195"+
		"\u0001\u0000\u0000\u0000\u01a4\u0196\u0001\u0000\u0000\u0000\u01a4\u0197"+
		"\u0001\u0000\u0000\u0000\u01a4\u0198\u0001\u0000\u0000\u0000\u01a4\u0199"+
		"\u0001\u0000\u0000\u0000\u01a4\u019a\u0001\u0000\u0000\u0000\u01a4\u019b"+
		"\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u019d"+
		"\u0001\u0000\u0000\u0000\u01a4\u019e\u0001\u0000\u0000\u0000\u01a4\u019f"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5)\u0001\u0000\u0000\u0000\u01a6\u01b0\u0003"+
		".\u0017\u0000\u01a7\u01b0\u00032\u0019\u0000\u01a8\u01b0\u00034\u001a"+
		"\u0000\u01a9\u01b0\u00038\u001c\u0000\u01aa\u01b0\u0003,\u0016\u0000\u01ab"+
		"\u01b0\u00036\u001b\u0000\u01ac\u01b0\u00030\u0018\u0000\u01ad\u01b0\u0003"+
		"<\u001e\u0000\u01ae\u01b0\u0003>\u001f\u0000\u01af\u01a6\u0001\u0000\u0000"+
		"\u0000\u01af\u01a7\u0001\u0000\u0000\u0000\u01af\u01a8\u0001\u0000\u0000"+
		"\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af\u01aa\u0001\u0000\u0000"+
		"\u0000\u01af\u01ab\u0001\u0000\u0000\u0000\u01af\u01ac\u0001\u0000\u0000"+
		"\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b0+\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u001c\u0000\u0000"+
		"\u01b2\u01b3\u0003\u00ceg\u0000\u01b3\u01b4\u0005D\u0000\u0000\u01b4\u01b5"+
		"\u0003\u0010\b\u0000\u01b5-\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003"+
		"\u009cN\u0000\u01b7\u01b8\u00050\u0000\u0000\u01b8\u01b9\u0003\u009cN"+
		"\u0000\u01b9/\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\u009cN\u0000\u01bb"+
		"1\u0001\u0000\u0000\u0000\u01bc\u01bd\u0003\u009cN\u0000\u01bd\u01be\u0005"+
		"C\u0000\u0000\u01be\u01bf\u0003\u009cN\u0000\u01bf3\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0003\u009cN\u0000\u01c1\u01c2\u0007\u0001\u0000\u0000"+
		"\u01c25\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003\u0012\t\u0000\u01c4"+
		"\u01c5\u0005$\u0000\u0000\u01c5\u01c6\u0003\u009cN\u0000\u01c67\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0003\u0012\t\u0000\u01c8\u01c9\u0003:"+
		"\u001d\u0000\u01c9\u01ca\u0003\u0012\t\u0000\u01ca9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cd\u0007\u0002\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0005#\u0000\u0000\u01cf;\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0003\u0010\b\u0000\u01d1\u01d2\u0005+\u0000\u0000\u01d2\u01d3"+
		"\u0003\u0012\t\u0000\u01d3=\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003"+
		"\u0010\b\u0000\u01d5\u01d6\u0005,\u0000\u0000\u01d6\u01d7\u0003\u0012"+
		"\t\u0000\u01d7?\u0001\u0000\u0000\u0000\u01d8\u01d9\u0007\u0003\u0000"+
		"\u0000\u01d9A\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u001c\u0000\u0000"+
		"\u01db\u01dd\u0005\'\u0000\u0000\u01dc\u01de\u0003(\u0014\u0000\u01dd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"C\u0001\u0000\u0000\u0000\u01df\u01e1\u0005\u0019\u0000\u0000\u01e0\u01e2"+
		"\u0003\u0012\t\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2E\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005\u0001"+
		"\u0000\u0000\u01e4\u01e6\u0005\u001c\u0000\u0000\u01e5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6G\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e9\u0005\u0016\u0000\u0000\u01e8\u01ea\u0005\u001c\u0000"+
		"\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01eaI\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u000e\u0000\u0000"+
		"\u01ec\u01ed\u0005\u001c\u0000\u0000\u01edK\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0005\u0012\u0000\u0000\u01efM\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0005\b\u0000\u0000\u01f1\u01f2\u0003\u009cN\u0000\u01f2O\u0001\u0000"+
		"\u0000\u0000\u01f3\u01fc\u0005\u0013\u0000\u0000\u01f4\u01fd\u0003\u009c"+
		"N\u0000\u01f5\u01f6\u0003\u00dam\u0000\u01f6\u01f7\u0003\u009cN\u0000"+
		"\u01f7\u01fd\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003*\u0015\u0000\u01f9"+
		"\u01fa\u0003\u00dam\u0000\u01fa\u01fb\u0003\u009cN\u0000\u01fb\u01fd\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f4\u0001\u0000\u0000\u0000\u01fc\u01f5\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u0204\u0003$\u0012\u0000\u01ff\u0202\u0005\r"+
		"\u0000\u0000\u0200\u0203\u0003P(\u0000\u0201\u0203\u0003$\u0012\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01ff\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0001\u0000\u0000\u0000\u0205Q\u0001\u0000\u0000\u0000\u0206"+
		"\u0209\u0003T*\u0000\u0207\u0209\u0003Z-\u0000\u0208\u0206\u0001\u0000"+
		"\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209S\u0001\u0000\u0000"+
		"\u0000\u020a\u0215\u0005\u0010\u0000\u0000\u020b\u020d\u0003\u009cN\u0000"+
		"\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000"+
		"\u020d\u0216\u0001\u0000\u0000\u0000\u020e\u0210\u0003*\u0015\u0000\u020f"+
		"\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0003\u00dam\u0000\u0212\u0214"+
		"\u0003\u009cN\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u020c\u0001"+
		"\u0000\u0000\u0000\u0215\u020f\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u021b\u0005\u001f\u0000\u0000\u0218\u021a\u0003"+
		"V+\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000"+
		"\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0005 \u0000\u0000\u021fU\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0003X,\u0000\u0221\u0223\u0005\'\u0000\u0000\u0222\u0224\u0003"+
		"&\u0013\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224W\u0001\u0000\u0000\u0000\u0225\u0226\u0005\u0007\u0000"+
		"\u0000\u0226\u0229\u0003\u0012\t\u0000\u0227\u0229\u0005\u0002\u0000\u0000"+
		"\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000"+
		"\u0229Y\u0001\u0000\u0000\u0000\u022a\u0233\u0005\u0010\u0000\u0000\u022b"+
		"\u0234\u0003\\.\u0000\u022c\u022d\u0003\u00dam\u0000\u022d\u022e\u0003"+
		"\\.\u0000\u022e\u0234\u0001\u0000\u0000\u0000\u022f\u0230\u0003*\u0015"+
		"\u0000\u0230\u0231\u0003\u00dam\u0000\u0231\u0232\u0003\\.\u0000\u0232"+
		"\u0234\u0001\u0000\u0000\u0000\u0233\u022b\u0001\u0000\u0000\u0000\u0233"+
		"\u022c\u0001\u0000\u0000\u0000\u0233\u022f\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0001\u0000\u0000\u0000\u0235\u0239\u0005\u001f\u0000\u0000\u0236"+
		"\u0238\u0003^/\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238\u023b\u0001"+
		"\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001"+
		"\u0000\u0000\u0000\u023a\u023c\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0005 \u0000\u0000\u023d[\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005\u001c\u0000\u0000\u023f\u0241\u0005+\u0000\u0000"+
		"\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0003\u009eO\u0000\u0243"+
		"\u0244\u0005(\u0000\u0000\u0244\u0245\u0005\u001d\u0000\u0000\u0245\u0246"+
		"\u0005\u0015\u0000\u0000\u0246\u0247\u0005\u001e\u0000\u0000\u0247]\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0003`0\u0000\u0249\u024b\u0005\'\u0000"+
		"\u0000\u024a\u024c\u0003&\u0013\u0000\u024b\u024a\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0001\u0000\u0000\u0000\u024c_\u0001\u0000\u0000\u0000\u024d"+
		"\u024e\u0005\u0007\u0000\u0000\u024e\u0251\u0003b1\u0000\u024f\u0251\u0005"+
		"\u0002\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0250\u024f\u0001"+
		"\u0000\u0000\u0000\u0251a\u0001\u0000\u0000\u0000\u0252\u0255\u0003t:"+
		"\u0000\u0253\u0255\u0005\u001b\u0000\u0000\u0254\u0252\u0001\u0000\u0000"+
		"\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255\u025d\u0001\u0000\u0000"+
		"\u0000\u0256\u0259\u0005%\u0000\u0000\u0257\u025a\u0003t:\u0000\u0258"+
		"\u025a\u0005\u001b\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259"+
		"\u0258\u0001\u0000\u0000\u0000\u025a\u025c\u0001\u0000\u0000\u0000\u025b"+
		"\u0256\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"c\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0005\u0006\u0000\u0000\u0261\u0265\u0005\u001f\u0000\u0000\u0262\u0264"+
		"\u0003f3\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001\u0000"+
		"\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0005 \u0000\u0000\u0269e\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0003h4\u0000\u026b\u026d\u0005\'\u0000\u0000\u026c\u026e"+
		"\u0003&\u0013\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026eg\u0001\u0000\u0000\u0000\u026f\u0272\u0005\u0007"+
		"\u0000\u0000\u0270\u0273\u00032\u0019\u0000\u0271\u0273\u0003j5\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000"+
		"\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0276\u0005\u0002\u0000\u0000"+
		"\u0275\u026f\u0001\u0000\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000"+
		"\u0276i\u0001\u0000\u0000\u0000\u0277\u0278\u0003\u0012\t\u0000\u0278"+
		"\u0279\u0005#\u0000\u0000\u0279\u027e\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0003\u0010\b\u0000\u027b\u027c\u0005+\u0000\u0000\u027c\u027e\u0001"+
		"\u0000\u0000\u0000\u027d\u0277\u0001\u0000\u0000\u0000\u027d\u027a\u0001"+
		"\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0003\u009cN\u0000\u0280k\u0001\u0000\u0000"+
		"\u0000\u0281\u0289\u0005\u0017\u0000\u0000\u0282\u0284\u0003\u009cN\u0000"+
		"\u0283\u0282\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000"+
		"\u0284\u028a\u0001\u0000\u0000\u0000\u0285\u028a\u0003n7\u0000\u0286\u0288"+
		"\u0003p8\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000"+
		"\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u0283\u0001\u0000"+
		"\u0000\u0000\u0289\u0285\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028c\u0003$\u0012"+
		"\u0000\u028cm\u0001\u0000\u0000\u0000\u028d\u028f\u0003*\u0015\u0000\u028e"+
		"\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f"+
		"\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0003\u00dam\u0000\u0291\u0293"+
		"\u0003\u009cN\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0296\u0003"+
		"\u00dam\u0000\u0295\u0297\u0003*\u0015\u0000\u0296\u0295\u0001\u0000\u0000"+
		"\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297o\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0003\u0012\t\u0000\u0299\u029a\u0005#\u0000\u0000\u029a"+
		"\u029f\u0001\u0000\u0000\u0000\u029b\u029c\u0003\u0010\b\u0000\u029c\u029d"+
		"\u0005+\u0000\u0000\u029d\u029f\u0001\u0000\u0000\u0000\u029e\u0298\u0001"+
		"\u0000\u0000\u0000\u029e\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u0001"+
		"\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005"+
		"\u0014\u0000\u0000\u02a1\u02a2\u0003\u009cN\u0000\u02a2q\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0005\t\u0000\u0000\u02a4\u02a5\u0003\u009cN\u0000"+
		"\u02a5s\u0001\u0000\u0000\u0000\u02a6\u02ad\u0003v;\u0000\u02a7\u02ad"+
		"\u0003x<\u0000\u02a8\u02a9\u0005\u001d\u0000\u0000\u02a9\u02aa\u0003t"+
		":\u0000\u02aa\u02ab\u0005\u001e\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7\u0001\u0000\u0000"+
		"\u0000\u02ac\u02a8\u0001\u0000\u0000\u0000\u02adu\u0001\u0000\u0000\u0000"+
		"\u02ae\u02b1\u0003\u00aeW\u0000\u02af\u02b1\u0005\u001c\u0000\u0000\u02b0"+
		"\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1"+
		"w\u0001\u0000\u0000\u0000\u02b2\u02bc\u0003z=\u0000\u02b3\u02bc\u0003"+
		"\u00be_\u0000\u02b4\u02bc\u0003\u0080@\u0000\u02b5\u02bc\u0003\u0082A"+
		"\u0000\u02b6\u02bc\u0003\u008eG\u0000\u02b7\u02bc\u0003\u0084B\u0000\u02b8"+
		"\u02bc\u0003\u0086C\u0000\u02b9\u02bc\u0003\u0088D\u0000\u02ba\u02bc\u0003"+
		"\u008aE\u0000\u02bb\u02b2\u0001\u0000\u0000\u0000\u02bb\u02b3\u0001\u0000"+
		"\u0000\u0000\u02bb\u02b4\u0001\u0000\u0000\u0000\u02bb\u02b5\u0001\u0000"+
		"\u0000\u0000\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000"+
		"\u0000\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bcy\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0005!\u0000\u0000\u02be\u02bf\u0003|>\u0000\u02bf"+
		"\u02c0\u0005\"\u0000\u0000\u02c0\u02c1\u0003~?\u0000\u02c1{\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0003\u009cN\u0000\u02c3}\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0003t:\u0000\u02c5\u007f\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0005A\u0000\u0000\u02c7\u02c8\u0003t:\u0000\u02c8\u0081\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0005B\u0000\u0000\u02ca\u02cb\u0003t:\u0000"+
		"\u02cb\u0083\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\u0005\u0000\u0000"+
		"\u02cd\u02d6\u0005\u001f\u0000\u0000\u02ce\u02d1\u0003\u008cF\u0000\u02cf"+
		"\u02d1\u0003v;\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0003"+
		"\u00dam\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d8\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d9\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9\u02da\u0005 \u0000"+
		"\u0000\u02da\u0085\u0001\u0000\u0000\u0000\u02db\u02dc\u0005!\u0000\u0000"+
		"\u02dc\u02dd\u0005\"\u0000\u0000\u02dd\u02de\u0003~?\u0000\u02de\u0087"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0005\n\u0000\u0000\u02e0\u02e1\u0005"+
		"!\u0000\u0000\u02e1\u02e2\u0003t:\u0000\u02e2\u02e3\u0005\"\u0000\u0000"+
		"\u02e3\u02e4\u0003~?\u0000\u02e4\u0089\u0001\u0000\u0000\u0000\u02e5\u02eb"+
		"\u0005\f\u0000\u0000\u02e6\u02e7\u0005\f\u0000\u0000\u02e7\u02eb\u0005"+
		"C\u0000\u0000\u02e8\u02e9\u0005C\u0000\u0000\u02e9\u02eb\u0005\f\u0000"+
		"\u0000\u02ea\u02e5\u0001\u0000\u0000\u0000\u02ea\u02e6\u0001\u0000\u0000"+
		"\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u0003~?\u0000\u02ed\u008b\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0005\u001c\u0000\u0000\u02ef\u02f0\u0003\u0096K\u0000\u02f0\u02f1"+
		"\u0003\u0092I\u0000\u02f1\u02f5\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005"+
		"\u001c\u0000\u0000\u02f3\u02f5\u0003\u0096K\u0000\u02f4\u02ee\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u008d\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0005\u0003\u0000\u0000\u02f7\u02f8\u0003\u0090"+
		"H\u0000\u02f8\u008f\u0001\u0000\u0000\u0000\u02f9\u02fa\u0003\u0096K\u0000"+
		"\u02fa\u02fb\u0003\u0092I\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fe\u0003\u0096K\u0000\u02fd\u02f9\u0001\u0000\u0000\u0000\u02fd\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fe\u0091\u0001\u0000\u0000\u0000\u02ff\u0302"+
		"\u0003\u0096K\u0000\u0300\u0302\u0003t:\u0000\u0301\u02ff\u0001\u0000"+
		"\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0302\u0093\u0001\u0000"+
		"\u0000\u0000\u0303\u0304\u00053\u0000\u0000\u0304\u0305\u0003\u0098L\u0000"+
		"\u0305\u0306\u00055\u0000\u0000\u0306\u0095\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0005\u001d\u0000\u0000\u0308\u0309\u0003\u0098L\u0000\u0309\u030a"+
		"\u0005\u001e\u0000\u0000\u030a\u0097\u0001\u0000\u0000\u0000\u030b\u0310"+
		"\u0003\u009aM\u0000\u030c\u030d\u0005%\u0000\u0000\u030d\u030f\u0003\u009a"+
		"M\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000"+
		"\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0313\u0315\u0005%\u0000\u0000\u0314\u0313\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000\u0000"+
		"\u0316\u030b\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u0099\u0001\u0000\u0000\u0000\u0318\u031a\u0003\u0010\b\u0000\u0319"+
		"\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u031c\u0001\u0000\u0000\u0000\u031b\u031d\u0005-\u0000\u0000\u031c\u031b"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u031f\u0003t:\u0000\u031f\u009b\u0001\u0000"+
		"\u0000\u0000\u0320\u0321\u0006N\uffff\uffff\u0000\u0321\u0325\u0003\u009e"+
		"O\u0000\u0322\u0323\u0007\u0004\u0000\u0000\u0323\u0325\u0003\u009cN\u0006"+
		"\u0324\u0320\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000"+
		"\u0325\u0337\u0001\u0000\u0000\u0000\u0326\u0327\n\u0005\u0000\u0000\u0327"+
		"\u0328\u0007\u0005\u0000\u0000\u0328\u0336\u0003\u009cN\u0006\u0329\u032a"+
		"\n\u0004\u0000\u0000\u032a\u032b\u0007\u0006\u0000\u0000\u032b\u0336\u0003"+
		"\u009cN\u0005\u032c\u032d\n\u0003\u0000\u0000\u032d\u032e\u0007\u0007"+
		"\u0000\u0000\u032e\u0336\u0003\u009cN\u0004\u032f\u0330\n\u0002\u0000"+
		"\u0000\u0330\u0331\u0005/\u0000\u0000\u0331\u0336\u0003\u009cN\u0003\u0332"+
		"\u0333\n\u0001\u0000\u0000\u0333\u0334\u0005.\u0000\u0000\u0334\u0336"+
		"\u0003\u009cN\u0002\u0335\u0326\u0001\u0000\u0000\u0000\u0335\u0329\u0001"+
		"\u0000\u0000\u0000\u0335\u032c\u0001\u0000\u0000\u0000\u0335\u032f\u0001"+
		"\u0000\u0000\u0000\u0335\u0332\u0001\u0000\u0000\u0000\u0336\u0339\u0001"+
		"\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337\u0338\u0001"+
		"\u0000\u0000\u0000\u0338\u009d\u0001\u0000\u0000\u0000\u0339\u0337\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0006O\uffff\uffff\u0000\u033b\u033f\u0003"+
		"\u00a4R\u0000\u033c\u033f\u0003\u00a0P\u0000\u033d\u033f\u0003\u00d6k"+
		"\u0000\u033e\u033a\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000"+
		"\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033f\u034b\u0001\u0000\u0000"+
		"\u0000\u0340\u0347\n\u0001\u0000\u0000\u0341\u0342\u0005(\u0000\u0000"+
		"\u0342\u0348\u0005\u001c\u0000\u0000\u0343\u0348\u0003\u00c8d\u0000\u0344"+
		"\u0348\u0003\u00cae\u0000\u0345\u0348\u0003\u00ccf\u0000\u0346\u0348\u0003"+
		"\u00ceg\u0000\u0347\u0341\u0001\u0000\u0000\u0000\u0347\u0343\u0001\u0000"+
		"\u0000\u0000\u0347\u0344\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000"+
		"\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348\u034a\u0001\u0000"+
		"\u0000\u0000\u0349\u0340\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000"+
		"\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000"+
		"\u0000\u0000\u034c\u009f\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000"+
		"\u0000\u0000\u034e\u034f\u0003\u00a2Q\u0000\u034f\u0350\u0005\u001d\u0000"+
		"\u0000\u0350\u0352\u0003\u009cN\u0000\u0351\u0353\u0005%\u0000\u0000\u0352"+
		"\u0351\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353"+
		"\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0005\u001e\u0000\u0000\u0355"+
		"\u00a1\u0001\u0000\u0000\u0000\u0356\u035c\u0003x<\u0000\u0357\u0358\u0005"+
		"\u001d\u0000\u0000\u0358\u0359\u0003\u00a2Q\u0000\u0359\u035a\u0005\u001e"+
		"\u0000\u0000\u035a\u035c\u0001\u0000\u0000\u0000\u035b\u0356\u0001\u0000"+
		"\u0000\u0000\u035b\u0357\u0001\u0000\u0000\u0000\u035c\u00a3\u0001\u0000"+
		"\u0000\u0000\u035d\u0364\u0003\u00a6S\u0000\u035e\u0364\u0003\u00acV\u0000"+
		"\u035f\u0360\u0005\u001d\u0000\u0000\u0360\u0361\u0003\u009cN\u0000\u0361"+
		"\u0362\u0005\u001e\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363"+
		"\u035d\u0001\u0000\u0000\u0000\u0363\u035e\u0001\u0000\u0000\u0000\u0363"+
		"\u035f\u0001\u0000\u0000\u0000\u0364\u00a5\u0001\u0000\u0000\u0000\u0365"+
		"\u0369\u0003\u00a8T\u0000\u0366\u0369\u0003\u00b0X\u0000\u0367\u0369\u0003"+
		"\u00c6c\u0000\u0368\u0365\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000"+
		"\u0000\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0369\u00a7\u0001\u0000"+
		"\u0000\u0000\u036a\u036f\u0005\u001b\u0000\u0000\u036b\u036f\u0003\u00aa"+
		"U\u0000\u036c\u036f\u0003\u00c2a\u0000\u036d\u036f\u0005I\u0000\u0000"+
		"\u036e\u036a\u0001\u0000\u0000\u0000\u036e\u036b\u0001\u0000\u0000\u0000"+
		"\u036e\u036c\u0001\u0000\u0000\u0000\u036e\u036d\u0001\u0000\u0000\u0000"+
		"\u036f\u00a9\u0001\u0000\u0000\u0000\u0370\u0371\u0007\b\u0000\u0000\u0371"+
		"\u00ab\u0001\u0000\u0000\u0000\u0372\u0373\u0005\u001c\u0000\u0000\u0373"+
		"\u00ad\u0001\u0000\u0000\u0000\u0374\u0375\u0005\u001c\u0000\u0000\u0375"+
		"\u0376\u0005(\u0000\u0000\u0376\u0377\u0005\u001c\u0000\u0000\u0377\u00af"+
		"\u0001\u0000\u0000\u0000\u0378\u0379\u0003\u00b2Y\u0000\u0379\u037a\u0003"+
		"\u00b4Z\u0000\u037a\u00b1\u0001\u0000\u0000\u0000\u037b\u0385\u0003\u00be"+
		"_\u0000\u037c\u0385\u0003z=\u0000\u037d\u037e\u0005!\u0000\u0000\u037e"+
		"\u037f\u0005-\u0000\u0000\u037f\u0380\u0005\"\u0000\u0000\u0380\u0385"+
		"\u0003~?\u0000\u0381\u0385\u0003\u0086C\u0000\u0382\u0385\u0003\u0088"+
		"D\u0000\u0383\u0385\u0003v;\u0000\u0384\u037b\u0001\u0000\u0000\u0000"+
		"\u0384\u037c\u0001\u0000\u0000\u0000\u0384\u037d\u0001\u0000\u0000\u0000"+
		"\u0384\u0381\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000"+
		"\u0384\u0383\u0001\u0000\u0000\u0000\u0385\u00b3\u0001\u0000\u0000\u0000"+
		"\u0386\u038b\u0005\u001f\u0000\u0000\u0387\u0389\u0003\u00b6[\u0000\u0388"+
		"\u038a\u0005%\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a"+
		"\u0001\u0000\u0000\u0000\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u0387"+
		"\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d"+
		"\u0001\u0000\u0000\u0000\u038d\u038e\u0005 \u0000\u0000\u038e\u00b5\u0001"+
		"\u0000\u0000\u0000\u038f\u0394\u0003\u00b8\\\u0000\u0390\u0391\u0005%"+
		"\u0000\u0000\u0391\u0393\u0003\u00b8\\\u0000\u0392\u0390\u0001\u0000\u0000"+
		"\u0000\u0393\u0396\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000"+
		"\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u00b7\u0001\u0000\u0000"+
		"\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0397\u0398\u0003\u00ba]\u0000"+
		"\u0398\u0399\u0005\'\u0000\u0000\u0399\u039b\u0001\u0000\u0000\u0000\u039a"+
		"\u0397\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0003\u00bc^\u0000\u039d\u00b9"+
		"\u0001\u0000\u0000\u0000\u039e\u03a1\u0003\u009cN\u0000\u039f\u03a1\u0003"+
		"\u00b4Z\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u039f\u0001\u0000"+
		"\u0000\u0000\u03a1\u00bb\u0001\u0000\u0000\u0000\u03a2\u03a5\u0003\u009c"+
		"N\u0000\u03a3\u03a5\u0003\u00b4Z\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u00bd\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a7\u0005\u000b\u0000\u0000\u03a7\u03ad\u0005\u001f\u0000\u0000"+
		"\u03a8\u03a9\u0003\u00c0`\u0000\u03a9\u03aa\u0003\u00dam\u0000\u03aa\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ab\u03a8\u0001\u0000\u0000\u0000\u03ac\u03af"+
		"\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae"+
		"\u0001\u0000\u0000\u0000\u03ae\u03b0\u0001\u0000\u0000\u0000\u03af\u03ad"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005 \u0000\u0000\u03b1\u00bf\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b3\u0003\u0010\b\u0000\u03b3\u03b4\u0003t"+
		":\u0000\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b7\u0003\u00c4b\u0000"+
		"\u03b6\u03b2\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03ba\u0003\u00c2a\u0000\u03b9"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba"+
		"\u00c1\u0001\u0000\u0000\u0000\u03bb\u03bc\u0007\t\u0000\u0000\u03bc\u00c3"+
		"\u0001\u0000\u0000\u0000\u03bd\u03bf\u0005A\u0000\u0000\u03be\u03bd\u0001"+
		"\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c0\u03c1\u0003v;\u0000\u03c1\u00c5\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c3\u0005\u0003\u0000\u0000\u03c3\u03c4\u0003\u0090H\u0000"+
		"\u03c4\u03c5\u0003$\u0012\u0000\u03c5\u00c7\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0005!\u0000\u0000\u03c7\u03c8\u0003\u009cN\u0000\u03c8\u03c9\u0005"+
		"\"\u0000\u0000\u03c9\u00c9\u0001\u0000\u0000\u0000\u03ca\u03da\u0005!"+
		"\u0000\u0000\u03cb\u03cd\u0003\u009cN\u0000\u03cc\u03cb\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000"+
		"\u0000\u03ce\u03d0\u0005\'\u0000\u0000\u03cf\u03d1\u0003\u009cN\u0000"+
		"\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1\u03db\u0001\u0000\u0000\u0000\u03d2\u03d4\u0003\u009cN\u0000\u03d3"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005\'\u0000\u0000\u03d6\u03d7"+
		"\u0003\u009cN\u0000\u03d7\u03d8\u0005\'\u0000\u0000\u03d8\u03d9\u0003"+
		"\u009cN\u0000\u03d9\u03db\u0001\u0000\u0000\u0000\u03da\u03cc\u0001\u0000"+
		"\u0000\u0000\u03da\u03d3\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000"+
		"\u0000\u0000\u03dc\u03dd\u0005\"\u0000\u0000\u03dd\u00cb\u0001\u0000\u0000"+
		"\u0000\u03de\u03df\u0005(\u0000\u0000\u03df\u03e0\u0005\u001d\u0000\u0000"+
		"\u03e0\u03e1\u0003t:\u0000\u03e1\u03e2\u0005\u001e\u0000\u0000\u03e2\u00cd"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e5\u0003\u00d0h\u0000\u03e4\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0003\u00d2i\u0000\u03e7\u00cf\u0001\u0000"+
		"\u0000\u0000\u03e8\u03ea\u00053\u0000\u0000\u03e9\u03eb\u0003\u00d4j\u0000"+
		"\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed\u00055\u0000\u0000\u03ed"+
		"\u00d1\u0001\u0000\u0000\u0000\u03ee\u03f0\u0005\u001d\u0000\u0000\u03ef"+
		"\u03f1\u0003\u00d4j\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f3"+
		"\u0005\u001e\u0000\u0000\u03f3\u00d3\u0001\u0000\u0000\u0000\u03f4\u03fb"+
		"\u0003\u0012\t\u0000\u03f5\u03f8\u0003\u00a2Q\u0000\u03f6\u03f7\u0005"+
		"%\u0000\u0000\u03f7\u03f9\u0003\u0012\t\u0000\u03f8\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000"+
		"\u0000\u0000\u03fa\u03f4\u0001\u0000\u0000\u0000\u03fa\u03f5\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fd\u0001\u0000\u0000\u0000\u03fc\u03fe\u0005-\u0000"+
		"\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u0400\u0001\u0000\u0000\u0000\u03ff\u0401\u0005%\u0000\u0000"+
		"\u0400\u03ff\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000\u0000"+
		"\u0401\u00d5\u0001\u0000\u0000\u0000\u0402\u0403\u0003\u00a2Q\u0000\u0403"+
		"\u0404\u0005(\u0000\u0000\u0404\u0405\u0005\u001c\u0000\u0000\u0405\u00d7"+
		"\u0001\u0000\u0000\u0000\u0406\u0407\u0003t:\u0000\u0407\u00d9\u0001\u0000"+
		"\u0000\u0000\u0408\u040d\u0005&\u0000\u0000\u0409\u040d\u0005\u0000\u0000"+
		"\u0001\u040a\u040d\u0005\\\u0000\u0000\u040b\u040d\u0004m\u0007\u0000"+
		"\u040c\u0408\u0001\u0000\u0000\u0000\u040c\u0409\u0001\u0000\u0000\u0000"+
		"\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040b\u0001\u0000\u0000\u0000"+
		"\u040d\u00db\u0001\u0000\u0000\u0000t\u00e3\u00ea\u00f0\u0100\u0104\u0107"+
		"\u0110\u011a\u011e\u0122\u0126\u012d\u0135\u0140\u0144\u0148\u0150\u0157"+
		"\u015c\u0160\u0163\u016f\u0173\u0179\u017d\u0181\u0186\u0189\u018c\u0193"+
		"\u01a4\u01af\u01cc\u01dd\u01e1\u01e5\u01e9\u01fc\u0202\u0204\u0208\u020c"+
		"\u020f\u0213\u0215\u021b\u0223\u0228\u0233\u0239\u0240\u024b\u0250\u0254"+
		"\u0259\u025d\u0265\u026d\u0272\u0275\u027d\u0283\u0287\u0289\u028e\u0292"+
		"\u0296\u029e\u02ac\u02b0\u02bb\u02d0\u02d6\u02ea\u02f4\u02fd\u0301\u0310"+
		"\u0314\u0316\u0319\u031c\u0324\u0335\u0337\u033e\u0347\u034b\u0352\u035b"+
		"\u0363\u0368\u036e\u0384\u0389\u038b\u0394\u039a\u03a0\u03a4\u03ad\u03b6"+
		"\u03b9\u03be\u03cc\u03d0\u03d3\u03da\u03e4\u03ea\u03f0\u03f8\u03fa\u03fd"+
		"\u0400\u040c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}