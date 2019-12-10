// Generated from c:\antlr\GraphGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CORES=9, 
		LETRA=10, NUMBER=11, NOME=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CORES", 
		"LETRA", "NUMBER", "NOME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grafo '", "':'", "'tamanho='", "'cor='", "';'", "'<'", "'-'", 
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


	public GraphGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\f\3\f\3\r\6\rU\n\r\r\r\16\rV\3\16\6"+
		"\16Z\n\16\r\16\16\16[\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\6\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5$\3\2\2\2\7&\3"+
		"\2\2\2\t/\3\2\2\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23"+
		"M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33Y\3\2\2\2\35\36\7i\2\2"+
		"\36\37\7t\2\2\37 \7c\2\2 !\7h\2\2!\"\7q\2\2\"#\7\"\2\2#\4\3\2\2\2$%\7"+
		"<\2\2%\6\3\2\2\2&\'\7v\2\2\'(\7c\2\2()\7o\2\2)*\7c\2\2*+\7p\2\2+,\7j\2"+
		"\2,-\7q\2\2-.\7?\2\2.\b\3\2\2\2/\60\7e\2\2\60\61\7q\2\2\61\62\7t\2\2\62"+
		"\63\7?\2\2\63\n\3\2\2\2\64\65\7=\2\2\65\f\3\2\2\2\66\67\7>\2\2\67\16\3"+
		"\2\2\289\7/\2\29\20\3\2\2\2:;\7@\2\2;\22\3\2\2\2<=\7c\2\2=>\7|\2\2>?\7"+
		"w\2\2?N\7n\2\2@A\7x\2\2AB\7g\2\2BC\7t\2\2CD\7o\2\2DE\7g\2\2EF\7n\2\2F"+
		"G\7j\2\2GN\7q\2\2HI\7x\2\2IJ\7g\2\2JK\7t\2\2KL\7f\2\2LN\7g\2\2M<\3\2\2"+
		"\2M@\3\2\2\2MH\3\2\2\2N\24\3\2\2\2OP\t\2\2\2P\26\3\2\2\2QR\t\3\2\2R\30"+
		"\3\2\2\2SU\t\4\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\32\3\2\2\2"+
		"XZ\t\5\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\16"+
		"\2\2^\34\3\2\2\2\6\2MV[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}