// Generated from c:\antlr\GraphGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CORES=9, 
		LETRA=10, NUMBER=11, NOME=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_graph = 1, RULE_graph_name = 2, RULE_config = 3, RULE_path = 4;
	public static final String[] ruleNames = {
		"prog", "graph", "graph_name", "config", "path"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grafo '", "':'", "'tamanho='", "'forma='", "';'", "'<'", "'-'", 
		"'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "CORES", "LETRA", 
		"NUMBER", "NOME", "WS"
	};
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
	public String getGrammarFileName() { return "GraphGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GraphGrammarParser.EOF, 0); }
		public List<GraphContext> graph() {
			return getRuleContexts(GraphContext.class);
		}
		public GraphContext graph(int i) {
			return getRuleContext(GraphContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(10);
				graph();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class GraphContext extends ParserRuleContext {
		public Graph_nameContext graph_name() {
			return getRuleContext(Graph_nameContext.class,0);
		}
		public List<ConfigContext> config() {
			return getRuleContexts(ConfigContext.class);
		}
		public ConfigContext config(int i) {
			return getRuleContext(ConfigContext.class,i);
		}
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			graph_name();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(19);
				config();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				path();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graph_nameContext extends ParserRuleContext {
		public List<TerminalNode> NOME() { return getTokens(GraphGrammarParser.NOME); }
		public TerminalNode NOME(int i) {
			return getToken(GraphGrammarParser.NOME, i);
		}
		public Graph_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_name; }
	}

	public final Graph_nameContext graph_name() throws RecognitionException {
		Graph_nameContext _localctx = new Graph_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_graph_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				match(NOME);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOME );
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

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode CORES() { return getToken(GraphGrammarParser.CORES, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GraphGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GraphGrammarParser.NUMBER, i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(38);
				match(T__2);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					match(NUMBER);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case T__3:
				{
				setState(44);
				match(T__3);
				setState(45);
				match(CORES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(GraphGrammarParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GraphGrammarParser.LETRA, i);
		}
		public TerminalNode NUMBER() { return getToken(GraphGrammarParser.NUMBER, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(LETRA);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(55);
				match(T__5);
				}
			}

			setState(58);
			match(T__6);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(59);
				match(NUMBER);
				}
			}

			setState(62);
			match(T__6);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(63);
				match(T__7);
				}
			}

			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					match(LETRA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\6\3\35\n\3\r\3\16\3\36\3\4\3\4\6"+
		"\4#\n\4\r\4\16\4$\3\4\3\4\3\5\3\5\6\5+\n\5\r\5\16\5,\3\5\3\5\5\5\61\n"+
		"\5\3\5\3\5\3\6\6\6\66\n\6\r\6\16\6\67\3\6\5\6;\n\6\3\6\3\6\5\6?\n\6\3"+
		"\6\3\6\5\6C\n\6\3\6\6\6F\n\6\r\6\16\6G\3\6\2\2\7\2\4\6\b\n\2\2\2O\2\17"+
		"\3\2\2\2\4\24\3\2\2\2\6 \3\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f\16\5\4\3"+
		"\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2"+
		"\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\30\5\6\4\2\25\27\5\b\5\2"+
		"\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\34\3\2\2\2"+
		"\32\30\3\2\2\2\33\35\5\n\6\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2"+
		"\36\37\3\2\2\2\37\5\3\2\2\2 \"\7\3\2\2!#\7\16\2\2\"!\3\2\2\2#$\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\4\2\2\'\7\3\2\2\2(*\7\5\2\2)+\7\r"+
		"\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2./\7\6\2\2/\61"+
		"\7\13\2\2\60(\3\2\2\2\60.\3\2\2\2\61\62\3\2\2\2\62\63\7\7\2\2\63\t\3\2"+
		"\2\2\64\66\7\f\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\28:\3\2\2\29;\7\b\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\t\2\2=?\7\r\2"+
		"\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\7\t\2\2AC\7\n\2\2BA\3\2\2\2BC\3\2\2"+
		"\2CE\3\2\2\2DF\7\f\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2"+
		"\2\2\r\17\30\36$,\60\67:>BG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}