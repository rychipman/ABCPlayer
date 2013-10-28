// Generated from src/grammar/ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINEFEED=1, DIGIT=2, BASENOTE=3, KEYACCIDENTAL=4, MODEMINOR=5, SPACE=6, 
		REST=7, OCTAVE=8, ACCIDENTAL=9, BARLINE=10, KEY=11, METER_FRACTION=12, 
		TEMPO=13, METER=14, NOTE_LENGTH_STRICT=15, COMMENT=16, FIELD_NUMBER=17, 
		FIELD_TITLE=18, FIELD_COMPOSER=19, FIELD_DEFAULT_LENGTH=20, FIELD_METER=21, 
		FIELD_TEMPO=22, FIELD_VOICE=23, FIELD_KEY=24, LYRIC=25, LYRICAL_ELEMENT=26, 
		NTH_REPEAT=27, TUPLET_SPEC=28, SLASH=29, L_BRACKET=30, R_BRACKET=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINEFEED", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", 
		"OCTAVE", "ACCIDENTAL", "BARLINE", "KEY", "METER_FRACTION", "TEMPO", "METER", 
		"NOTE_LENGTH_STRICT", "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", 
		"FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", 
		"LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_SPEC", "'/'", "'['", 
		"']'"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "MODEMINOR", 
		"SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "KEY", "METER_FRACTION", 
		"TEMPO", "METER", "NOTE_LENGTH_STRICT", "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", 
		"FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", 
		"FIELD_VOICE", "FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", 
		"TUPLET_SPEC", "SLASH", "L_BRACKET", "R_BRACKET"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4!\u012b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\3\2\6\2E\n\2\r\2\16\2F\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\6\na\n\n\r\n\16\nb\3\n\6\nf\n\n\r\n\16\ng\5\nj\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0080\n\f\3\r\3\r\5\r\u0084\n\r\3\r\5\r\u0087\n\r\3\16\6"+
		"\16\u008a\n\16\r\16\16\16\u008b\3\16\3\16\6\16\u0090\n\16\r\16\16\16\u0091"+
		"\3\17\3\17\3\17\6\17\u0097\n\17\r\17\16\17\u0098\3\20\3\20\3\20\3\20\5"+
		"\20\u009f\n\20\3\21\6\21\u00a2\n\21\r\21\16\21\u00a3\3\21\3\21\6\21\u00a8"+
		"\n\21\r\21\16\21\u00a9\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00b4"+
		"\n\23\f\23\16\23\u00b7\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00bf"+
		"\n\24\f\24\16\24\u00c2\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ca"+
		"\n\25\f\25\16\25\u00cd\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d5"+
		"\n\26\f\26\16\26\u00d8\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e0"+
		"\n\27\f\27\16\27\u00e3\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00eb"+
		"\n\30\f\30\16\30\u00ee\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f6"+
		"\n\31\f\31\16\31\u00f9\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0101"+
		"\n\32\f\32\16\32\u0104\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u010c"+
		"\n\33\f\33\16\33\u010f\13\33\3\34\6\34\u0112\n\34\r\34\16\34\u0113\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u011b\n\34\3\35\3\35\3\35\3\35\5\35\u0121\n"+
		"\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\2\"\3\3\1\5\2\1\7\4\1\t\5\1\13"+
		"\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1"+
		"\37\20\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32"+
		"\1\65\33\1\67\34\19\35\1;\36\1=\37\1? \1A!\1\3\2\7\4\13\f\17\17\4CIci"+
		"\4%%dd\3\"\"\6,,//aa\u0080\u0080\u014e\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3D\3\2"+
		"\2\2\5H\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2"+
		"\2\21]\3\2\2\2\23i\3\2\2\2\25r\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2"+
		"\33\u0089\3\2\2\2\35\u0093\3\2\2\2\37\u009e\3\2\2\2!\u00a1\3\2\2\2#\u00ab"+
		"\3\2\2\2%\u00af\3\2\2\2\'\u00ba\3\2\2\2)\u00c5\3\2\2\2+\u00d0\3\2\2\2"+
		"-\u00db\3\2\2\2/\u00e6\3\2\2\2\61\u00f1\3\2\2\2\63\u00fc\3\2\2\2\65\u0107"+
		"\3\2\2\2\67\u011a\3\2\2\29\u0120\3\2\2\2;\u0122\3\2\2\2=\u0125\3\2\2\2"+
		"?\u0127\3\2\2\2A\u0129\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2G\4\3\2\2\2HI\7R\2\2IJ\7k\2\2JK\7g\2\2KL\7e\2\2LM\7g\2\2MN\7"+
		"\"\2\2NO\7P\2\2OP\7q\2\2PQ\7\60\2\2QR\7\63\2\2R\6\3\2\2\2ST\4\62;\2T\b"+
		"\3\2\2\2UV\t\3\2\2V\n\3\2\2\2WX\t\4\2\2X\f\3\2\2\2YZ\7o\2\2Z\16\3\2\2"+
		"\2[\\\t\5\2\2\\\20\3\2\2\2]^\7|\2\2^\22\3\2\2\2_a\7)\2\2`_\3\2\2\2ab\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2cj\3\2\2\2df\7.\2\2ed\3\2\2\2fg\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2hj\3\2\2\2i`\3\2\2\2ie\3\2\2\2j\24\3\2\2\2ks\7`\2\2lm"+
		"\7`\2\2ms\7`\2\2ns\7a\2\2op\7a\2\2ps\7a\2\2qs\7?\2\2rk\3\2\2\2rl\3\2\2"+
		"\2rn\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\26\3\2\2\2t\u0080\7~\2\2uv\7~\2\2v\u0080"+
		"\7~\2\2wx\7]\2\2x\u0080\7~\2\2yz\7~\2\2z\u0080\7_\2\2{|\7<\2\2|\u0080"+
		"\7~\2\2}~\7~\2\2~\u0080\7<\2\2\177t\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2"+
		"\177y\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\30\3\2\2\2\u0081\u0083\5"+
		"\t\5\2\u0082\u0084\5\13\6\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0087\5\r\7\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\32\3\2\2\2\u0088\u008a\5\7\4\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\7\61\2\2\u008e\u0090\5\7\4\2\u008f\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\5\33\16\2\u0094\u0096\7?\2\2\u0095\u0097\5\7\4\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\36\3\2\2\2\u009a\u009f\7E\2\2\u009b\u009c\7E\2\2\u009c\u009f\7~\2\2\u009d"+
		"\u009f\5\33\16\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f \3\2\2\2\u00a0\u00a2\5\7\4\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\7\61\2\2\u00a6\u00a8\5\7\4\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\"\3\2\2\2\u00ab\u00ac"+
		"\7\'\2\2\u00ac\u00ad\5\5\3\2\u00ad\u00ae\5\3\2\2\u00ae$\3\2\2\2\u00af"+
		"\u00b0\7Z\2\2\u00b0\u00b1\7<\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\5\17"+
		"\b\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\7"+
		"\4\2\u00b9&\3\2\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7<\2\2\u00bc\u00c0"+
		"\3\2\2\2\u00bd\u00bf\5\17\b\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\5\5\3\2\u00c4(\3\2\2\2\u00c5\u00c6\7E\2\2\u00c6\u00c7"+
		"\7<\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\5\17\b\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\5\3\2\u00cf*\3\2\2\2\u00d0\u00d1"+
		"\7N\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5\5\17\b\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5!\21\2\u00da"+
		",\3\2\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7<\2\2\u00dd\u00e1\3\2\2\2\u00de"+
		"\u00e0\5\17\b\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\5\37\20\2\u00e5.\3\2\2\2\u00e6\u00e7\7S\2\2\u00e7\u00e8\7<\2\2"+
		"\u00e8\u00ec\3\2\2\2\u00e9\u00eb\5\17\b\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\5\35\17\2\u00f0\60\3\2\2\2\u00f1\u00f2\7X\2"+
		"\2\u00f2\u00f3\7<\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\5\17\b\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5\5\3\2\u00fb\62\3\2\2"+
		"\2\u00fc\u00fd\7M\2\2\u00fd\u00fe\7<\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101"+
		"\5\17\b\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106"+
		"\5\31\r\2\u0106\64\3\2\2\2\u0107\u0108\7y\2\2\u0108\u0109\7<\2\2\u0109"+
		"\u010d\3\2\2\2\u010a\u010c\5\67\34\2\u010b\u010a\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\66\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\7\"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011b\3\2\2\2\u0115"+
		"\u011b\t\6\2\2\u0116\u0117\7^\2\2\u0117\u011b\7/\2\2\u0118\u011b\7~\2"+
		"\2\u0119\u011b\5\5\3\2\u011a\u0111\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b8\3\2\2\2\u011c"+
		"\u011d\7]\2\2\u011d\u0121\7\63\2\2\u011e\u011f\7]\2\2\u011f\u0121\7\64"+
		"\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121:\3\2\2\2\u0122\u0123"+
		"\7*\2\2\u0123\u0124\5\7\4\2\u0124<\3\2\2\2\u0125\u0126\7\61\2\2\u0126"+
		">\3\2\2\2\u0127\u0128\7]\2\2\u0128@\3\2\2\2\u0129\u012a\7_\2\2\u012aB"+
		"\3\2\2\2\35\2Fbgir\177\u0083\u0086\u008b\u0091\u0098\u009e\u00a3\u00a9"+
		"\u00b5\u00c0\u00cb\u00d6\u00e1\u00ec\u00f7\u0102\u010d\u0113\u011a\u0120";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}