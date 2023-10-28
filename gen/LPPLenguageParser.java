// Generated from C:/Users/Sebastian Sarmiento/Documents/LENGUAJES/translator/grammar/LPPLenguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LPPLenguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PROC=15, VAR=16, TYPE=17, 
		IF=18, ELSE=19, WHILE=20, REPEAT=21, FOR=22, FUNCTION=23, RETURN=24, CASE=25, 
		ASSGN=26, REAL=27, INT=28, COMMA=29, STR=30, ID=31, ESP=32;
	public static final int
		RULE_init = 0, RULE_procedure = 1, RULE_proc_params = 2, RULE_arr_cad = 3, 
		RULE_function = 4, RULE_commands = 5, RULE_if = 6, RULE_case = 7, RULE_while = 8, 
		RULE_repeat = 9, RULE_for = 10, RULE_exp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "procedure", "proc_params", "arr_cad", "function", "commands", 
			"if", "case", "while", "repeat", "for", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fin'", "'('", "')'", "'['", "']'", "'no'", "'entonces'", 
			"'fin si'", "'haga'", "'fin mientras'", "'hasta'", "'fin para'", "'a'", 
			"'procedimiento'", "'var'", null, "'si'", "'sino'", "'mientras'", "'repita'", 
			"'para'", "'funcion'", "'retorne'", "'caso'", "'<-'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PROC", "VAR", "TYPE", "IF", "ELSE", "WHILE", "REPEAT", 
			"FOR", "FUNCTION", "RETURN", "CASE", "ASSGN", "REAL", "INT", "COMMA", 
			"STR", "ID", "ESP"
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
	public String getGrammarFileName() { return "LPPLenguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LPPLenguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROC) {
				{
				{
				setState(24);
				procedure();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				commands();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(36);
			match(T__1);
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
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(LPPLenguageParser.PROC, 0); }
		public List<TerminalNode> ID() { return getTokens(LPPLenguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LPPLenguageParser.ID, i);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(LPPLenguageParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(LPPLenguageParser.VAR, 0); }
		public Arr_cadContext arr_cad() {
			return getRuleContext(Arr_cadContext.class,0);
		}
		public List<Proc_paramsContext> proc_params() {
			return getRuleContexts(Proc_paramsContext.class);
		}
		public Proc_paramsContext proc_params(int i) {
			return getRuleContext(Proc_paramsContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PROC);
			setState(39);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(40);
				match(T__2);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(41);
					match(VAR);
					}
				}

				setState(44);
				match(TYPE);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(45);
					arr_cad();
					}
				}

				setState(48);
				match(ID);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(49);
					proc_params();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__3);
				}
			}

			setState(58);
			init();
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
	public static class Proc_paramsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LPPLenguageParser.COMMA, 0); }
		public TerminalNode TYPE() { return getToken(LPPLenguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(LPPLenguageParser.ID, 0); }
		public TerminalNode VAR() { return getToken(LPPLenguageParser.VAR, 0); }
		public Arr_cadContext arr_cad() {
			return getRuleContext(Arr_cadContext.class,0);
		}
		public Proc_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterProc_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitProc_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitProc_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_paramsContext proc_params() throws RecognitionException {
		Proc_paramsContext _localctx = new Proc_paramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proc_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(COMMA);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(61);
				match(VAR);
				}
			}

			setState(64);
			match(TYPE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(65);
				arr_cad();
				}
			}

			setState(68);
			match(ID);
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
	public static class Arr_cadContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LPPLenguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LPPLenguageParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(LPPLenguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LPPLenguageParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LPPLenguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPPLenguageParser.COMMA, i);
		}
		public Arr_cadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_cad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterArr_cad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitArr_cad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitArr_cad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_cadContext arr_cad() throws RecognitionException {
		Arr_cadContext _localctx = new Arr_cadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arr_cad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LPPLenguageParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(LPPLenguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LPPLenguageParser.ID, i);
		}
		public TerminalNode RETURN() { return getToken(LPPLenguageParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(LPPLenguageParser.TYPE, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public Arr_cadContext arr_cad() {
			return getRuleContext(Arr_cadContext.class,0);
		}
		public List<Proc_paramsContext> proc_params() {
			return getRuleContexts(Proc_paramsContext.class);
		}
		public Proc_paramsContext proc_params(int i) {
			return getRuleContext(Proc_paramsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(FUNCTION);
			setState(82);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(83);
				match(T__2);
				setState(84);
				match(TYPE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(85);
					arr_cad();
					}
				}

				setState(88);
				match(ID);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					proc_params();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__3);
				}
			}

			setState(98);
			match(T__0);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				commands();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(104);
			match(RETURN);
			setState(105);
			exp();
			setState(106);
			match(T__1);
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
	public static class CommandsContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public TerminalNode STR() { return getToken(LPPLenguageParser.STR, 0); }
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commands);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				if_();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				while_();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				repeat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				for_();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__6);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(STR);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LPPLenguageParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LPPLenguageParser.ELSE, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			exp();
			setState(118);
			match(T__7);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				commands();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(124);
				match(ELSE);
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					commands();
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
				}
			}

			setState(132);
			match(T__8);
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
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LPPLenguageParser.CASE, 0); }
		public TerminalNode ID() { return getToken(LPPLenguageParser.ID, 0); }
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CASE);
			setState(135);
			match(ID);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LPPLenguageParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			exp();
			setState(139);
			match(T__9);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				commands();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(145);
			match(T__10);
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
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(LPPLenguageParser.REPEAT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(REPEAT);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				commands();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(153);
			match(T__11);
			setState(154);
			exp();
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LPPLenguageParser.FOR, 0); }
		public TerminalNode ID() { return getToken(LPPLenguageParser.ID, 0); }
		public TerminalNode ASSGN() { return getToken(LPPLenguageParser.ASSGN, 0); }
		public List<TerminalNode> INT() { return getTokens(LPPLenguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LPPLenguageParser.INT, i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(FOR);
			setState(157);
			match(ID);
			setState(158);
			match(ASSGN);
			setState(159);
			match(INT);
			setState(160);
			match(T__11);
			setState(161);
			match(INT);
			setState(162);
			match(T__9);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				commands();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1081344128L) != 0) );
			setState(168);
			match(T__12);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPPLenguageListener ) ((LPPLenguageListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPPLenguageVisitor ) return ((LPPLenguageVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__13);
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
		"\u0004\u0001 \u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"K\b\u0003\n\u0003\f\u0003N\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004W\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004"+
		"\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"e\b\u0004\u000b\u0004\f\u0004f\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005s\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006y\b\u0006\u000b\u0006\f\u0006z\u0001\u0006\u0001\u0006"+
		"\u0004\u0006\u007f\b\u0006\u000b\u0006\f\u0006\u0080\u0003\u0006\u0083"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u008e\b\b\u000b\b\f\b\u008f\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0004\t\u0096\b\t\u000b\t\f\t\u0097\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00a5\b\n\u000b\n\f\n\u00a6\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0001\u0002\u0000\u001c\u001c\u001f\u001f\u00b8"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u0004"+
		"<\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bQ\u0001\u0000"+
		"\u0000\u0000\nr\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000\u000e"+
		"\u0086\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012"+
		"\u0093\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016"+
		"\u00aa\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e"+
		" \u0005\u0001\u0000\u0000\u001f!\u0003\n\u0005\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#"+
		"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0002\u0000"+
		"\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u000f\u0000\u0000\'8\u0005"+
		"\u001f\u0000\u0000(*\u0005\u0003\u0000\u0000)+\u0005\u0010\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0005\u0011\u0000\u0000-/\u0003\u0006\u0003\u0000.-\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000004\u0005"+
		"\u001f\u0000\u000013\u0003\u0004\u0002\u000021\u0001\u0000\u0000\u0000"+
		"36\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000079\u0005\u0004"+
		"\u0000\u00008(\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0000\u0000\u0000;\u0003\u0001\u0000\u0000"+
		"\u0000<>\u0005\u001d\u0000\u0000=?\u0005\u0010\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0005"+
		"\u0011\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u001f\u0000"+
		"\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000GL\u0007"+
		"\u0000\u0000\u0000HI\u0005\u001d\u0000\u0000IK\u0007\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0006\u0000\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0017\u0000\u0000R`\u0005\u001f\u0000\u0000ST\u0005\u0003\u0000"+
		"\u0000TV\u0005\u0011\u0000\u0000UW\u0003\u0006\u0003\u0000VU\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\\\u0005"+
		"\u001f\u0000\u0000Y[\u0003\u0004\u0002\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0005\u0004"+
		"\u0000\u0000`S\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bd\u0005\u0001\u0000\u0000ce\u0003\n\u0005\u0000dc\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0018\u0000"+
		"\u0000ij\u0003\u0016\u000b\u0000jk\u0005\u0002\u0000\u0000k\t\u0001\u0000"+
		"\u0000\u0000ls\u0003\f\u0006\u0000ms\u0003\u0010\b\u0000ns\u0003\u0012"+
		"\t\u0000os\u0003\u0014\n\u0000ps\u0005\u0007\u0000\u0000qs\u0005\u001e"+
		"\u0000\u0000rl\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000rn\u0001"+
		"\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\u0012"+
		"\u0000\u0000uv\u0003\u0016\u000b\u0000vx\u0005\b\u0000\u0000wy\u0003\n"+
		"\u0005\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0082\u0001\u0000\u0000"+
		"\u0000|~\u0005\u0013\u0000\u0000}\u007f\u0003\n\u0005\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000"+
		"\u0000\u0082|\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085"+
		"\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0088"+
		"\u0005\u001f\u0000\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0014\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b\u008d"+
		"\u0005\n\u0000\u0000\u008c\u008e\u0003\n\u0005\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092\u0011\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0005\u0015\u0000\u0000\u0094\u0096\u0003"+
		"\n\u0005\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\f\u0000"+
		"\u0000\u009a\u009b\u0003\u0016\u000b\u0000\u009b\u0013\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u009e\u0005\u001f\u0000"+
		"\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f\u00a0\u0005\u001c\u0000"+
		"\u0000\u00a0\u00a1\u0005\f\u0000\u0000\u00a1\u00a2\u0005\u001c\u0000\u0000"+
		"\u00a2\u00a4\u0005\n\u0000\u0000\u00a3\u00a5\u0003\n\u0005\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u0015"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u0017"+
		"\u0001\u0000\u0000\u0000\u0014\u001b\"*.48>BLV\\`frz\u0080\u0082\u008f"+
		"\u0097\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}