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
		REST=7, OCTAVE=8, ACCIDENTAL=9, BARLINE=10, FRACTION=11, KEY=12, TEMPO=13, 
		METER=14, COMMENT=15, FIELD_NUMBER=16, FIELD_TITLE=17, FIELD_COMPOSER=18, 
		FIELD_DEFAULT_LENGTH=19, FIELD_METER=20, FIELD_TEMPO=21, FIELD_VOICE=22, 
		FIELD_KEY=23, LYRIC=24, LYRICAL_ELEMENT=25, NTH_REPEAT=26, TUPLET_SPEC=27, 
		SLASH=28, L_BRACKET=29, R_BRACKET=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINEFEED", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", 
		"OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "KEY", "TEMPO", "METER", 
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", 
		"NTH_REPEAT", "TUPLET_SPEC", "'/'", "'['", "']'"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "MODEMINOR", 
		"SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "KEY", 
		"TEMPO", "METER", "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", 
		"FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", 
		"LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_SPEC", "SLASH", "L_BRACKET", 
		"R_BRACKET"
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
		"\2\4 \u0121\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\6\2C\n\2\r\2\16\2D\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\6\n_\n\n\r\n\16\n`\3\n\6\nd\n\n\r\n\16\ne\5\nh\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f~\n\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3\r\6\r\u0087\n\r\r\r\16"+
		"\r\u0088\3\16\3\16\5\16\u008d\n\16\3\16\5\16\u0090\n\16\3\17\3\17\3\17"+
		"\5\17\u0095\n\17\3\17\6\17\u0098\n\17\r\17\16\17\u0099\3\20\3\20\3\20"+
		"\3\20\5\20\u00a0\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00aa"+
		"\n\22\f\22\16\22\u00ad\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00b5"+
		"\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00c0"+
		"\n\24\f\24\16\24\u00c3\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00cb"+
		"\n\25\f\25\16\25\u00ce\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00d6"+
		"\n\26\f\26\16\26\u00d9\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00e1"+
		"\n\27\f\27\16\27\u00e4\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00ec"+
		"\n\30\f\30\16\30\u00ef\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f7"+
		"\n\31\f\31\16\31\u00fa\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0102"+
		"\n\32\f\32\16\32\u0105\13\32\3\33\6\33\u0108\n\33\r\33\16\33\u0109\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0111\n\33\3\34\3\34\3\34\3\34\5\34\u0117\n"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \2!\3\3\1\5\2\1\7\4\1\t\5"+
		"\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35"+
		"\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1"+
		"\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37\1? \1\3\2\7\4\13\f\17\17\4CI"+
		"ci\4%%dd\3\"\"\6,,//aa\u0080\u0080\u0143\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3B\3\2\2\2\5F"+
		"\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21["+
		"\3\2\2\2\23g\3\2\2\2\25p\3\2\2\2\27}\3\2\2\2\31\u0080\3\2\2\2\33\u008a"+
		"\3\2\2\2\35\u0094\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a5\3\2\2"+
		"\2%\u00b0\3\2\2\2\'\u00bb\3\2\2\2)\u00c6\3\2\2\2+\u00d1\3\2\2\2-\u00dc"+
		"\3\2\2\2/\u00e7\3\2\2\2\61\u00f2\3\2\2\2\63\u00fd\3\2\2\2\65\u0110\3\2"+
		"\2\2\67\u0116\3\2\2\29\u0118\3\2\2\2;\u011b\3\2\2\2=\u011d\3\2\2\2?\u011f"+
		"\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\4\3\2\2\2"+
		"FG\7R\2\2GH\7k\2\2HI\7g\2\2IJ\7e\2\2JK\7g\2\2KL\7\"\2\2LM\7P\2\2MN\7q"+
		"\2\2NO\7\60\2\2OP\7\63\2\2P\6\3\2\2\2QR\4\62;\2R\b\3\2\2\2ST\t\3\2\2T"+
		"\n\3\2\2\2UV\t\4\2\2V\f\3\2\2\2WX\7o\2\2X\16\3\2\2\2YZ\t\5\2\2Z\20\3\2"+
		"\2\2[\\\7|\2\2\\\22\3\2\2\2]_\7)\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3"+
		"\2\2\2ah\3\2\2\2bd\7.\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3"+
		"\2\2\2g^\3\2\2\2gc\3\2\2\2h\24\3\2\2\2iq\7`\2\2jk\7`\2\2kq\7`\2\2lq\7"+
		"a\2\2mn\7a\2\2nq\7a\2\2oq\7?\2\2pi\3\2\2\2pj\3\2\2\2pl\3\2\2\2pm\3\2\2"+
		"\2po\3\2\2\2q\26\3\2\2\2r~\7~\2\2st\7~\2\2t~\7~\2\2uv\7]\2\2v~\7~\2\2"+
		"wx\7~\2\2x~\7_\2\2yz\7<\2\2z~\7~\2\2{|\7~\2\2|~\7<\2\2}r\3\2\2\2}s\3\2"+
		"\2\2}u\3\2\2\2}w\3\2\2\2}y\3\2\2\2}{\3\2\2\2~\30\3\2\2\2\177\u0081\5\7"+
		"\4\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\7\61\2\2\u0085\u0087\5\7\4\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\32\3\2\2\2\u008a\u008c\5\t\5\2\u008b\u008d\5\13\6\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\5\r"+
		"\7\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u0092"+
		"\5\31\r\2\u0092\u0093\7?\2\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\7\4\2\u0097\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\36\3\2\2\2\u009b\u00a0\7E\2\2\u009c\u009d\7E\2\2\u009d\u00a0\7~\2\2\u009e"+
		"\u00a0\5\31\r\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009e\3"+
		"\2\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2\u00a3\5\5\3\2\u00a3\u00a4"+
		"\5\3\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7Z\2\2\u00a6\u00a7\7<\2\2\u00a7\u00ab"+
		"\3\2\2\2\u00a8\u00aa\5\17\b\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00af\5\7\4\2\u00af$\3\2\2\2\u00b0\u00b1\7V\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\5\17\b\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5\5\3\2\u00ba&\3\2\2\2\u00bb\u00bc"+
		"\7E\2\2\u00bc\u00bd\7<\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\5\17\b\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\5\3\2\u00c5"+
		"(\3\2\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7<\2\2\u00c8\u00cc\3\2\2\2\u00c9"+
		"\u00cb\5\17\b\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\5\31\r\2\u00d0*\3\2\2\2\u00d1\u00d2\7O\2\2\u00d2\u00d3\7<\2\2\u00d3"+
		"\u00d7\3\2\2\2\u00d4\u00d6\5\17\b\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\5\37\20\2\u00db,\3\2\2\2\u00dc\u00dd\7S\2\2"+
		"\u00dd\u00de\7<\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\5\17\b\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\35\17\2\u00e6.\3\2\2"+
		"\2\u00e7\u00e8\7X\2\2\u00e8\u00e9\7<\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00ec"+
		"\5\17\b\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1"+
		"\5\5\3\2\u00f1\60\3\2\2\2\u00f2\u00f3\7M\2\2\u00f3\u00f4\7<\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\5\17\b\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\5\33\16\2\u00fc\62\3\2\2\2\u00fd\u00fe\7y\2"+
		"\2\u00fe\u00ff\7<\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\5\65\33\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\64\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\"\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0111\3\2\2\2\u010b\u0111\t\6\2\2\u010c\u010d\7^\2\2\u010d\u0111\7/\2"+
		"\2\u010e\u0111\7~\2\2\u010f\u0111\5\5\3\2\u0110\u0107\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\66\3\2\2\2\u0112\u0113\7]\2\2\u0113\u0117\7\63\2\2\u0114\u0115\7]\2\2"+
		"\u0115\u0117\7\64\2\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u01178\3"+
		"\2\2\2\u0118\u0119\7*\2\2\u0119\u011a\5\7\4\2\u011a:\3\2\2\2\u011b\u011c"+
		"\7\61\2\2\u011c<\3\2\2\2\u011d\u011e\7]\2\2\u011e>\3\2\2\2\u011f\u0120"+
		"\7_\2\2\u0120@\3\2\2\2\34\2D`egp}\u0082\u0088\u008c\u008f\u0094\u0099"+
		"\u009f\u00ab\u00b6\u00c1\u00cc\u00d7\u00e2\u00ed\u00f8\u0103\u0109\u0110"+
		"\u0116";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}