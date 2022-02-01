// Generated from c:\Users\HCC\Desktop\MorseCalculator\MorseCalculator\MorseCalculatorLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MorseCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, ONE=2, TWO=3, THREE=4, FOUR=5, FIVE=6, SIX=7, SEVEN=8, EIGHT=9, 
		NINE=10, PLUS=11, MULTIPLY=12, MINUS=13, DIVIDE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "PLUS", "MULTIPLY", "MINUS", "DIVIDE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-----'", "'.----'", "'..---'", "'...--'", "'....-'", "'.....'", 
		"'-....'", "'--...'", "'---..'", "'----.'", "'.-.-.'", "'-..-'", "'-....-'", 
		"'-..-.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", 
		"NINE", "PLUS", "MULTIPLY", "MINUS", "DIVIDE", "WS"
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


	public MorseCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MorseCalculatorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21\3\2\3\5\2\13\f\17\17\"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5\'\3\2\2\2\7-\3\2\2\2\t\63\3"+
		"\2\2\2\139\3\2\2\2\r?\3\2\2\2\17E\3\2\2\2\21K\3\2\2\2\23Q\3\2\2\2\25W"+
		"\3\2\2\2\27]\3\2\2\2\31c\3\2\2\2\33h\3\2\2\2\35o\3\2\2\2\37u\3\2\2\2!"+
		"\"\7/\2\2\"#\7/\2\2#$\7/\2\2$%\7/\2\2%&\7/\2\2&\4\3\2\2\2\'(\7\60\2\2"+
		"()\7/\2\2)*\7/\2\2*+\7/\2\2+,\7/\2\2,\6\3\2\2\2-.\7\60\2\2./\7\60\2\2"+
		"/\60\7/\2\2\60\61\7/\2\2\61\62\7/\2\2\62\b\3\2\2\2\63\64\7\60\2\2\64\65"+
		"\7\60\2\2\65\66\7\60\2\2\66\67\7/\2\2\678\7/\2\28\n\3\2\2\29:\7\60\2\2"+
		":;\7\60\2\2;<\7\60\2\2<=\7\60\2\2=>\7/\2\2>\f\3\2\2\2?@\7\60\2\2@A\7\60"+
		"\2\2AB\7\60\2\2BC\7\60\2\2CD\7\60\2\2D\16\3\2\2\2EF\7/\2\2FG\7\60\2\2"+
		"GH\7\60\2\2HI\7\60\2\2IJ\7\60\2\2J\20\3\2\2\2KL\7/\2\2LM\7/\2\2MN\7\60"+
		"\2\2NO\7\60\2\2OP\7\60\2\2P\22\3\2\2\2QR\7/\2\2RS\7/\2\2ST\7/\2\2TU\7"+
		"\60\2\2UV\7\60\2\2V\24\3\2\2\2WX\7/\2\2XY\7/\2\2YZ\7/\2\2Z[\7/\2\2[\\"+
		"\7\60\2\2\\\26\3\2\2\2]^\7\60\2\2^_\7/\2\2_`\7\60\2\2`a\7/\2\2ab\7\60"+
		"\2\2b\30\3\2\2\2cd\7/\2\2de\7\60\2\2ef\7\60\2\2fg\7/\2\2g\32\3\2\2\2h"+
		"i\7/\2\2ij\7\60\2\2jk\7\60\2\2kl\7\60\2\2lm\7\60\2\2mn\7/\2\2n\34\3\2"+
		"\2\2op\7/\2\2pq\7\60\2\2qr\7\60\2\2rs\7/\2\2st\7\60\2\2t\36\3\2\2\2uv"+
		"\t\2\2\2vw\3\2\2\2wx\b\20\2\2x \3\2\2\2\3\2\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}