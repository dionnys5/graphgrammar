// Generated from GraphGrammar.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAPH_NAME=1, CONFIGS=2, PATH=3, ARESTA=4, VERTICE=5, CONFIG=6, LETRA=7, 
		NUMBER=8, NOME=9, WS=10;
	public static final int
		RULE_prog = 0, RULE_graph = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "graph"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAPH_NAME", "CONFIGS", "PATH", "ARESTA", "VERTICE", "CONFIG", 
			"LETRA", "NUMBER", "NOME", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphGrammarListener ) ((GraphGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphGrammarListener ) ((GraphGrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GRAPH_NAME) {
				{
				{
				setState(4);
				graph();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
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
		public TerminalNode GRAPH_NAME() { return getToken(GraphGrammarParser.GRAPH_NAME, 0); }
		public TerminalNode CONFIGS() { return getToken(GraphGrammarParser.CONFIGS, 0); }
		public List<TerminalNode> PATH() { return getTokens(GraphGrammarParser.PATH); }
		public TerminalNode PATH(int i) {
			return getToken(GraphGrammarParser.PATH, i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphGrammarListener ) ((GraphGrammarListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphGrammarListener ) ((GraphGrammarListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_graph);
		int _la;
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(GRAPH_NAME);
				setState(13);
				match(CONFIGS);
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(14);
					match(PATH);
					}
					}
					setState(17); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PATH );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(GRAPH_NAME);
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(20);
					match(PATH);
					}
					}
					setState(23); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PATH );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\36\4\2\t\2\4\3"+
		"\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2\3\2\3\3\3\3\3\3\6\3\22\n\3\r\3"+
		"\16\3\23\3\3\3\3\6\3\30\n\3\r\3\16\3\31\5\3\34\n\3\3\3\2\2\4\2\4\2\2\2"+
		"\37\2\t\3\2\2\2\4\33\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7"+
		"\3\2\2\2\t\n\3\2\2\2\n\f\3\2\2\2\13\t\3\2\2\2\f\r\7\2\2\3\r\3\3\2\2\2"+
		"\16\17\7\3\2\2\17\21\7\4\2\2\20\22\7\5\2\2\21\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\34\3\2\2\2\25\27\7\3\2\2\26\30\7\5\2\2"+
		"\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2"+
		"\33\16\3\2\2\2\33\25\3\2\2\2\34\5\3\2\2\2\6\t\23\31\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}