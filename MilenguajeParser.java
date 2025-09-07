// Generated from Milenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MilenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOLEANO=7, IDENTIFICADOR=8, 
		FLOTANTE=9, ENTERO=10, CADENA=11, SI=12, SINO=13, PARA=14, MIENTRAS=15, 
		MAS=16, MENOS=17, POTENCIADO=18, MULTIPLICADO=19, DIVIDIDO=20, MODULO=21, 
		IGUAL=22, DIFERENTE=23, MENORQUE=24, MENORIGUAL=25, MAYORQUE=26, MAYORIGUAL=27, 
		LOGAND=28, LOGOR=29, LOGNOT=30, ASIGN=31, BITAND=32, BITOR=33, BITNOT=34, 
		BITXOR=35, BITLSHIFT=36, BITRSHIFT=37, T_BOOLEANO=38, T_ENTERO=39, T_FLOTANTE=40, 
		T_CADENA=41, RETORNAR=42, WS=43;
	public static final int
		RULE_codigo = 0, RULE_instruccion = 1, RULE_declrVar = 2, RULE_asigVar = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_instrIf = 6, RULE_instrFor = 7, 
		RULE_instrWhile = 8, RULE_instrReturn = 9, RULE_declrFun = 10, RULE_llamarFun = 11, 
		RULE_expresion = 12, RULE_exprLogico = 13, RULE_exprAnd = 14, RULE_exprIgualdad = 15, 
		RULE_exprRel = 16, RULE_exprSuma = 17, RULE_exprMult = 18, RULE_exprPot = 19, 
		RULE_exprUn = 20, RULE_exprResto = 21, RULE_tipo = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"codigo", "instruccion", "declrVar", "asigVar", "parametros", "parametro", 
			"instrIf", "instrFor", "instrWhile", "instrReturn", "declrFun", "llamarFun", 
			"expresion", "exprLogico", "exprAnd", "exprIgualdad", "exprRel", "exprSuma", 
			"exprMult", "exprPot", "exprUn", "exprResto", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'{'", "'}'", null, null, null, null, 
			null, "'si'", "'sino'", "'para'", "'mientras'", "'+'", "'-'", "'**'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'&&'", 
			"'||'", "'!'", "'='", "'&'", "'|'", "'~'", "'^'", "'<<'", "'>>'", "'booleano'", 
			"'entero'", "'flotante'", "'cadena'", "'retornar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BOOLEANO", "IDENTIFICADOR", 
			"FLOTANTE", "ENTERO", "CADENA", "SI", "SINO", "PARA", "MIENTRAS", "MAS", 
			"MENOS", "POTENCIADO", "MULTIPLICADO", "DIVIDIDO", "MODULO", "IGUAL", 
			"DIFERENTE", "MENORQUE", "MENORIGUAL", "MAYORQUE", "MAYORIGUAL", "LOGAND", 
			"LOGOR", "LOGNOT", "ASIGN", "BITAND", "BITOR", "BITNOT", "BITXOR", "BITLSHIFT", 
			"BITRSHIFT", "T_BOOLEANO", "T_ENTERO", "T_FLOTANTE", "T_CADENA", "RETORNAR", 
			"WS"
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
	public String getGrammarFileName() { return "Milenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MilenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodigoContext extends ParserRuleContext {
		public List<DeclrFunContext> declrFun() {
			return getRuleContexts(DeclrFunContext.class);
		}
		public DeclrFunContext declrFun(int i) {
			return getRuleContext(DeclrFunContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					declrFun();
					}
					break;
				case 2:
					{
					setState(47);
					instruccion();
					}
					break;
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclrVarContext declrVar() {
			return getRuleContext(DeclrVarContext.class,0);
		}
		public AsigVarContext asigVar() {
			return getRuleContext(AsigVarContext.class,0);
		}
		public LlamarFunContext llamarFun() {
			return getRuleContext(LlamarFunContext.class,0);
		}
		public InstrIfContext instrIf() {
			return getRuleContext(InstrIfContext.class,0);
		}
		public InstrForContext instrFor() {
			return getRuleContext(InstrForContext.class,0);
		}
		public InstrWhileContext instrWhile() {
			return getRuleContext(InstrWhileContext.class,0);
		}
		public InstrReturnContext instrReturn() {
			return getRuleContext(InstrReturnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declrVar();
				setState(53);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				asigVar();
				setState(56);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				llamarFun();
				setState(59);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				instrIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				instrFor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				instrWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				instrReturn();
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
	public static class DeclrVarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGN() { return getToken(MilenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declrVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitDeclrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclrVarContext declrVar() throws RecognitionException {
		DeclrVarContext _localctx = new DeclrVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declrVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			tipo();
			setState(68);
			match(IDENTIFICADOR);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGN) {
				{
				setState(69);
				match(ASIGN);
				setState(70);
				expresion();
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
	public static class AsigVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGN() { return getToken(MilenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitAsigVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigVarContext asigVar() throws RecognitionException {
		AsigVarContext _localctx = new AsigVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asigVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFICADOR);
			setState(74);
			match(ASIGN);
			setState(75);
			expresion();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			parametro();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(78);
				match(T__1);
				setState(79);
				parametro();
				}
				}
				setState(84);
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			tipo();
			setState(86);
			match(IDENTIFICADOR);
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
	public static class InstrIfContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MilenguajeParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode SINO() { return getToken(MilenguajeParser.SINO, 0); }
		public InstrIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitInstrIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrIfContext instrIf() throws RecognitionException {
		InstrIfContext _localctx = new InstrIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SI);
			setState(89);
			match(T__2);
			setState(90);
			expresion();
			setState(91);
			match(T__3);
			setState(92);
			match(T__4);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				instruccion();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
			setState(98);
			match(T__5);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(99);
				match(SINO);
				setState(100);
				match(T__4);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					instruccion();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
				setState(106);
				match(T__5);
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
	public static class InstrForContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MilenguajeParser.PARA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclrVarContext declrVar() {
			return getRuleContext(DeclrVarContext.class,0);
		}
		public List<AsigVarContext> asigVar() {
			return getRuleContexts(AsigVarContext.class);
		}
		public AsigVarContext asigVar(int i) {
			return getRuleContext(AsigVarContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstrForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitInstrFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrForContext instrFor() throws RecognitionException {
		InstrForContext _localctx = new InstrForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instrFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PARA);
			setState(111);
			match(T__2);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BOOLEANO:
			case T_ENTERO:
			case T_FLOTANTE:
			case T_CADENA:
				{
				setState(112);
				declrVar();
				}
				break;
			case IDENTIFICADOR:
				{
				setState(113);
				asigVar();
				}
				break;
			case T__0:
				break;
			default:
				break;
			}
			setState(116);
			match(T__0);
			setState(117);
			expresion();
			setState(118);
			match(T__0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(119);
				asigVar();
				}
			}

			setState(122);
			match(T__3);
			setState(123);
			match(T__4);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				instruccion();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
			setState(129);
			match(T__5);
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
	public static class InstrWhileContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(MilenguajeParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstrWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrWhile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitInstrWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrWhileContext instrWhile() throws RecognitionException {
		InstrWhileContext _localctx = new InstrWhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(MIENTRAS);
			setState(132);
			match(T__2);
			setState(133);
			expresion();
			setState(134);
			match(T__3);
			setState(135);
			match(T__4);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				instruccion();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
			setState(141);
			match(T__5);
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
	public static class InstrReturnContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(MilenguajeParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstrReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitInstrReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrReturnContext instrReturn() throws RecognitionException {
		InstrReturnContext _localctx = new InstrReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(RETORNAR);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073876872L) != 0)) {
				{
				setState(144);
				expresion();
				}
			}

			setState(147);
			match(T__0);
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
	public static class DeclrFunContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public DeclrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declrFun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitDeclrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclrFunContext declrFun() throws RecognitionException {
		DeclrFunContext _localctx = new DeclrFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declrFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			tipo();
			setState(150);
			match(IDENTIFICADOR);
			setState(151);
			match(T__2);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) {
				{
				setState(152);
				parametros();
				}
			}

			setState(155);
			match(T__3);
			setState(156);
			match(T__4);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				instruccion();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8521215168768L) != 0) );
			setState(162);
			match(T__5);
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
	public static class LlamarFunContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public LlamarFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamarFun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitLlamarFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamarFunContext llamarFun() throws RecognitionException {
		LlamarFunContext _localctx = new LlamarFunContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_llamarFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFICADOR);
			setState(165);
			match(T__2);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073876872L) != 0)) {
				{
				setState(166);
				expresion();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(167);
					match(T__1);
					setState(168);
					expresion();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(176);
			match(T__3);
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExprLogicoContext exprLogico() {
			return getRuleContext(ExprLogicoContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			exprLogico();
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
	public static class ExprLogicoContext extends ParserRuleContext {
		public List<ExprAndContext> exprAnd() {
			return getRuleContexts(ExprAndContext.class);
		}
		public ExprAndContext exprAnd(int i) {
			return getRuleContext(ExprAndContext.class,i);
		}
		public List<TerminalNode> LOGOR() { return getTokens(MilenguajeParser.LOGOR); }
		public TerminalNode LOGOR(int i) {
			return getToken(MilenguajeParser.LOGOR, i);
		}
		public ExprLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicoContext exprLogico() throws RecognitionException {
		ExprLogicoContext _localctx = new ExprLogicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			exprAnd();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGOR) {
				{
				{
				setState(181);
				match(LOGOR);
				setState(182);
				exprAnd();
				}
				}
				setState(187);
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
	public static class ExprAndContext extends ParserRuleContext {
		public List<ExprIgualdadContext> exprIgualdad() {
			return getRuleContexts(ExprIgualdadContext.class);
		}
		public ExprIgualdadContext exprIgualdad(int i) {
			return getRuleContext(ExprIgualdadContext.class,i);
		}
		public List<TerminalNode> LOGAND() { return getTokens(MilenguajeParser.LOGAND); }
		public TerminalNode LOGAND(int i) {
			return getToken(MilenguajeParser.LOGAND, i);
		}
		public ExprAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAndContext exprAnd() throws RecognitionException {
		ExprAndContext _localctx = new ExprAndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			exprIgualdad();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGAND) {
				{
				{
				setState(189);
				match(LOGAND);
				setState(190);
				exprIgualdad();
				}
				}
				setState(195);
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
	public static class ExprIgualdadContext extends ParserRuleContext {
		public List<ExprRelContext> exprRel() {
			return getRuleContexts(ExprRelContext.class);
		}
		public ExprRelContext exprRel(int i) {
			return getRuleContext(ExprRelContext.class,i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(MilenguajeParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(MilenguajeParser.IGUAL, i);
		}
		public List<TerminalNode> DIFERENTE() { return getTokens(MilenguajeParser.DIFERENTE); }
		public TerminalNode DIFERENTE(int i) {
			return getToken(MilenguajeParser.DIFERENTE, i);
		}
		public ExprIgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIgualdad; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIgualdadContext exprIgualdad() throws RecognitionException {
		ExprIgualdadContext _localctx = new ExprIgualdadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprIgualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			exprRel();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGUAL || _la==DIFERENTE) {
				{
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==IGUAL || _la==DIFERENTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				exprRel();
				}
				}
				setState(203);
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
	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprSumaContext> exprSuma() {
			return getRuleContexts(ExprSumaContext.class);
		}
		public ExprSumaContext exprSuma(int i) {
			return getRuleContext(ExprSumaContext.class,i);
		}
		public List<TerminalNode> MAYORQUE() { return getTokens(MilenguajeParser.MAYORQUE); }
		public TerminalNode MAYORQUE(int i) {
			return getToken(MilenguajeParser.MAYORQUE, i);
		}
		public List<TerminalNode> MENORQUE() { return getTokens(MilenguajeParser.MENORQUE); }
		public TerminalNode MENORQUE(int i) {
			return getToken(MilenguajeParser.MENORQUE, i);
		}
		public List<TerminalNode> MENORIGUAL() { return getTokens(MilenguajeParser.MENORIGUAL); }
		public TerminalNode MENORIGUAL(int i) {
			return getToken(MilenguajeParser.MENORIGUAL, i);
		}
		public List<TerminalNode> MAYORIGUAL() { return getTokens(MilenguajeParser.MAYORIGUAL); }
		public TerminalNode MAYORIGUAL(int i) {
			return getToken(MilenguajeParser.MAYORIGUAL, i);
		}
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			exprSuma();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				exprSuma();
				}
				}
				setState(211);
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
	public static class ExprSumaContext extends ParserRuleContext {
		public List<ExprMultContext> exprMult() {
			return getRuleContexts(ExprMultContext.class);
		}
		public ExprMultContext exprMult(int i) {
			return getRuleContext(ExprMultContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(MilenguajeParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(MilenguajeParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(MilenguajeParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(MilenguajeParser.MENOS, i);
		}
		public ExprSumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSuma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSumaContext exprSuma() throws RecognitionException {
		ExprSumaContext _localctx = new ExprSumaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprSuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			exprMult();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS || _la==MENOS) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==MAS || _la==MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				exprMult();
				}
				}
				setState(219);
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
	public static class ExprMultContext extends ParserRuleContext {
		public List<ExprPotContext> exprPot() {
			return getRuleContexts(ExprPotContext.class);
		}
		public ExprPotContext exprPot(int i) {
			return getRuleContext(ExprPotContext.class,i);
		}
		public List<TerminalNode> MULTIPLICADO() { return getTokens(MilenguajeParser.MULTIPLICADO); }
		public TerminalNode MULTIPLICADO(int i) {
			return getToken(MilenguajeParser.MULTIPLICADO, i);
		}
		public List<TerminalNode> DIVIDIDO() { return getTokens(MilenguajeParser.DIVIDIDO); }
		public TerminalNode DIVIDIDO(int i) {
			return getToken(MilenguajeParser.DIVIDIDO, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(MilenguajeParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(MilenguajeParser.MODULO, i);
		}
		public ExprMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		ExprMultContext _localctx = new ExprMultContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			exprPot();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				exprPot();
				}
				}
				setState(227);
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
	public static class ExprPotContext extends ParserRuleContext {
		public List<ExprUnContext> exprUn() {
			return getRuleContexts(ExprUnContext.class);
		}
		public ExprUnContext exprUn(int i) {
			return getRuleContext(ExprUnContext.class,i);
		}
		public List<TerminalNode> POTENCIADO() { return getTokens(MilenguajeParser.POTENCIADO); }
		public TerminalNode POTENCIADO(int i) {
			return getToken(MilenguajeParser.POTENCIADO, i);
		}
		public ExprPotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprPot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPotContext exprPot() throws RecognitionException {
		ExprPotContext _localctx = new ExprPotContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprPot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			exprUn();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENCIADO) {
				{
				{
				setState(229);
				match(POTENCIADO);
				setState(230);
				exprUn();
				}
				}
				setState(235);
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
	public static class ExprUnContext extends ParserRuleContext {
		public ExprRestoContext exprResto() {
			return getRuleContext(ExprRestoContext.class,0);
		}
		public List<TerminalNode> LOGNOT() { return getTokens(MilenguajeParser.LOGNOT); }
		public TerminalNode LOGNOT(int i) {
			return getToken(MilenguajeParser.LOGNOT, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(MilenguajeParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(MilenguajeParser.MENOS, i);
		}
		public ExprUnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprUn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprUn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprUnContext exprUn() throws RecognitionException {
		ExprUnContext _localctx = new ExprUnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprUn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MENOS || _la==LOGNOT) {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==MENOS || _la==LOGNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			exprResto();
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
	public static class ExprRestoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LlamarFunContext llamarFun() {
			return getRuleContext(LlamarFunContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MilenguajeParser.IDENTIFICADOR, 0); }
		public TerminalNode ENTERO() { return getToken(MilenguajeParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(MilenguajeParser.FLOTANTE, 0); }
		public TerminalNode CADENA() { return getToken(MilenguajeParser.CADENA, 0); }
		public TerminalNode BOOLEANO() { return getToken(MilenguajeParser.BOOLEANO, 0); }
		public ExprRestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprResto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitExprResto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRestoContext exprResto() throws RecognitionException {
		ExprRestoContext _localctx = new ExprRestoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprResto);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__2);
				setState(245);
				expresion();
				setState(246);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				llamarFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(ENTERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(FLOTANTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(CADENA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(BOOLEANO);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode T_BOOLEANO() { return getToken(MilenguajeParser.T_BOOLEANO, 0); }
		public TerminalNode T_ENTERO() { return getToken(MilenguajeParser.T_ENTERO, 0); }
		public TerminalNode T_FLOTANTE() { return getToken(MilenguajeParser.T_FLOTANTE, 0); }
		public TerminalNode T_CADENA() { return getToken(MilenguajeParser.T_CADENA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilenguajeVisitor ) return ((MilenguajeVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001+\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0004\u00001\b\u0000"+
		"\u000b\u0000\f\u00002\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004Q\b\u0004\n\u0004\f\u0004T\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006_\b\u0006\u000b\u0006\f\u0006`\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006"+
		"h\u0001\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007y\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007~\b\u0007\u000b\u0007\f\u0007\u007f\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u008a"+
		"\b\b\u000b\b\f\b\u008b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0092\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u009f\b\n\u000b\n\f\n\u00a0\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00aa\b\u000b\n\u000b\f\u000b\u00ad\t\u000b\u0003\u000b\u00af\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00b8\b\r\n\r\f\r\u00bb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00c0\b\u000e\n\u000e\f\u000e\u00c3\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00c8\b\u000f\n\u000f\f\u000f\u00cb\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d0\b\u0010\n\u0010\f\u0010"+
		"\u00d3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d8\b"+
		"\u0011\n\u0011\f\u0011\u00db\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00e0\b\u0012\n\u0012\f\u0012\u00e3\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00e8\b\u0013\n\u0013\f\u0013\u00eb\t\u0013"+
		"\u0001\u0014\u0005\u0014\u00ee\b\u0014\n\u0014\f\u0014\u00f1\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00ff\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,\u0000\u0006\u0001\u0000\u0016\u0017\u0001\u0000\u0018"+
		"\u001b\u0001\u0000\u0010\u0011\u0001\u0000\u0013\u0015\u0002\u0000\u0011"+
		"\u0011\u001e\u001e\u0001\u0000&)\u0110\u00000\u0001\u0000\u0000\u0000"+
		"\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006I"+
		"\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u008f\u0001\u0000\u0000\u0000\u0014"+
		"\u0095\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018"+
		"\u00b2\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c"+
		"\u00bc\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00cc"+
		"\u0001\u0000\u0000\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00dc\u0001"+
		"\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00ef\u0001\u0000\u0000"+
		"\u0000*\u00fe\u0001\u0000\u0000\u0000,\u0100\u0001\u0000\u0000\u0000."+
		"1\u0003\u0014\n\u0000/1\u0003\u0002\u0001\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u000045\u0003"+
		"\u0004\u0002\u000056\u0005\u0001\u0000\u00006B\u0001\u0000\u0000\u0000"+
		"78\u0003\u0006\u0003\u000089\u0005\u0001\u0000\u00009B\u0001\u0000\u0000"+
		"\u0000:;\u0003\u0016\u000b\u0000;<\u0005\u0001\u0000\u0000<B\u0001\u0000"+
		"\u0000\u0000=B\u0003\f\u0006\u0000>B\u0003\u000e\u0007\u0000?B\u0003\u0010"+
		"\b\u0000@B\u0003\u0012\t\u0000A4\u0001\u0000\u0000\u0000A7\u0001\u0000"+
		"\u0000\u0000A:\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"B\u0003\u0001\u0000\u0000\u0000CD\u0003,\u0016\u0000DG\u0005\b\u0000\u0000"+
		"EF\u0005\u001f\u0000\u0000FH\u0003\u0018\f\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005\b\u0000"+
		"\u0000JK\u0005\u001f\u0000\u0000KL\u0003\u0018\f\u0000L\u0007\u0001\u0000"+
		"\u0000\u0000MR\u0003\n\u0005\u0000NO\u0005\u0002\u0000\u0000OQ\u0003\n"+
		"\u0005\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UV\u0003,\u0016\u0000VW\u0005\b\u0000\u0000"+
		"W\u000b\u0001\u0000\u0000\u0000XY\u0005\f\u0000\u0000YZ\u0005\u0003\u0000"+
		"\u0000Z[\u0003\u0018\f\u0000[\\\u0005\u0004\u0000\u0000\\^\u0005\u0005"+
		"\u0000\u0000]_\u0003\u0002\u0001\u0000^]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bl\u0005\u0006\u0000\u0000cd\u0005\r\u0000\u0000"+
		"df\u0005\u0005\u0000\u0000eg\u0003\u0002\u0001\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lc\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"m\r\u0001\u0000\u0000\u0000no\u0005\u000e\u0000\u0000or\u0005\u0003\u0000"+
		"\u0000ps\u0003\u0004\u0002\u0000qs\u0003\u0006\u0003\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0005\u0001\u0000\u0000uv\u0003\u0018\f\u0000vx\u0005"+
		"\u0001\u0000\u0000wy\u0003\u0006\u0003\u0000xw\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0004\u0000"+
		"\u0000{}\u0005\u0005\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u000f\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\u000f\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000"+
		"\u0085\u0086\u0003\u0018\f\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087"+
		"\u0089\u0005\u0005\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e"+
		"\u0011\u0001\u0000\u0000\u0000\u008f\u0091\u0005*\u0000\u0000\u0090\u0092"+
		"\u0003\u0018\f\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0001\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		",\u0016\u0000\u0096\u0097\u0005\b\u0000\u0000\u0097\u0099\u0005\u0003"+
		"\u0000\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u009e\u0005\u0005\u0000"+
		"\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3\u0015\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00ae\u0005\u0003\u0000\u0000"+
		"\u00a6\u00ab\u0003\u0018\f\u0000\u00a7\u00a8\u0005\u0002\u0000\u0000\u00a8"+
		"\u00aa\u0003\u0018\f\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0004\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0003\u001a\r\u0000\u00b3\u0019\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003"+
		"\u001c\u000e\u0000\u00b5\u00b6\u0005\u001d\u0000\u0000\u00b6\u00b8\u0003"+
		"\u001c\u000e\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00c1\u0003\u001e\u000f\u0000\u00bd\u00be\u0005"+
		"\u001c\u0000\u0000\u00be\u00c0\u0003\u001e\u000f\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u001d\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003"+
		" \u0010\u0000\u00c5\u00c6\u0007\u0000\u0000\u0000\u00c6\u00c8\u0003 \u0010"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u001f\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d1\u0003\"\u0011\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000"+
		"\u00ce\u00d0\u0003\"\u0011\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2!\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003$\u0012\u0000\u00d5\u00d6\u0007"+
		"\u0002\u0000\u0000\u00d6\u00d8\u0003$\u0012\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da#\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e1\u0003&\u0013\u0000"+
		"\u00dd\u00de\u0007\u0003\u0000\u0000\u00de\u00e0\u0003&\u0013\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"%\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e9"+
		"\u0003(\u0014\u0000\u00e5\u00e6\u0005\u0012\u0000\u0000\u00e6\u00e8\u0003"+
		"(\u0014\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\'\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0007\u0004\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003*\u0015\u0000"+
		"\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0003\u0000\u0000\u00f5"+
		"\u00f6\u0003\u0018\f\u0000\u00f6\u00f7\u0005\u0004\u0000\u0000\u00f7\u00ff"+
		"\u0001\u0000\u0000\u0000\u00f8\u00ff\u0003\u0016\u000b\u0000\u00f9\u00ff"+
		"\u0005\b\u0000\u0000\u00fa\u00ff\u0005\n\u0000\u0000\u00fb\u00ff\u0005"+
		"\t\u0000\u0000\u00fc\u00ff\u0005\u000b\u0000\u0000\u00fd\u00ff\u0005\u0007"+
		"\u0000\u0000\u00fe\u00f4\u0001\u0000\u0000\u0000\u00fe\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff+\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0007\u0005\u0000\u0000\u0101-\u0001\u0000\u0000\u0000"+
		"\u001a02AGR`hlrx\u007f\u008b\u0091\u0099\u00a0\u00ab\u00ae\u00b9\u00c1"+
		"\u00c9\u00d1\u00d9\u00e1\u00e9\u00ef\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}