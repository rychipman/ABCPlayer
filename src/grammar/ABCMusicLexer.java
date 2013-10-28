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
		NTH_REPEAT=27, TUPLET_SPEC=28, SLASH=29, L_BRACKET=30, R_BRACKET=31, NOTE_LENGTH=32;
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
		"']'", "NOTE_LENGTH"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "MODEMINOR", 
		"SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "KEY", "METER_FRACTION", 
		"TEMPO", "METER", "NOTE_LENGTH_STRICT", "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", 
		"FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", 
		"FIELD_VOICE", "FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", 
		"TUPLET_SPEC", "SLASH", "L_BRACKET", "R_BRACKET", "NOTE_LENGTH"
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
		"\2\4\"\u013b\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\3\2\6\2G\n\2\r\2\16\2H\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\6\nc\n\n\r\n\16\nd\3\n\6\nh\n\n\r\n\16\ni\5\nl\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r\5\r\u0086\n\r\3\r\5\r\u0089\n\r"+
		"\3\16\6\16\u008c\n\16\r\16\16\16\u008d\3\16\3\16\6\16\u0092\n\16\r\16"+
		"\16\16\u0093\3\17\3\17\3\17\6\17\u0099\n\17\r\17\16\17\u009a\3\20\3\20"+
		"\3\20\3\20\5\20\u00a1\n\20\3\21\6\21\u00a4\n\21\r\21\16\21\u00a5\3\21"+
		"\3\21\6\21\u00aa\n\21\r\21\16\21\u00ab\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\7\23\u00b6\n\23\f\23\16\23\u00b9\13\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf\13\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\7\26\u00d7\n\26\f\26\16\26\u00da\13\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\7\27\u00e2\n\27\f\27\16\27\u00e5\13\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\7\30\u00ed\n\30\f\30\16\30\u00f0\13\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\7\31\u00f8\n\31\f\31\16\31\u00fb\13\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\7\32\u0103\n\32\f\32\16\32\u0106\13\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\7\33\u010e\n\33\f\33\16\33\u0111\13\33\3\34\6\34\u0114\n\34\r"+
		"\34\16\34\u0115\3\34\3\34\3\34\3\34\3\34\5\34\u011d\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u0123\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\7\"\u012f"+
		"\n\"\f\"\16\"\u0132\13\"\3\"\5\"\u0135\n\"\3\"\6\"\u0138\n\"\r\"\16\""+
		"\u0139\2#\3\3\1\5\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17\b\1\21\t\1\23\n\1\25"+
		"\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1#\22\1%\23\1\'\24\1)"+
		"\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67\34\19\35\1;\36\1=\37"+
		"\1? \1A!\1C\"\1\3\2\7\4\13\f\17\17\4CIci\4%%dd\3\"\"\6,,//aa\u0080\u0080"+
		"\u0161\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3F\3\2\2\2\5J\3\2\2\2\7U"+
		"\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23"+
		"k\3\2\2\2\25t\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u008b\3\2\2"+
		"\2\35\u0095\3\2\2\2\37\u00a0\3\2\2\2!\u00a3\3\2\2\2#\u00ad\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00bc\3\2\2\2)\u00c7\3\2\2\2+\u00d2\3\2\2\2-\u00dd\3\2\2\2"+
		"/\u00e8\3\2\2\2\61\u00f3\3\2\2\2\63\u00fe\3\2\2\2\65\u0109\3\2\2\2\67"+
		"\u011c\3\2\2\29\u0122\3\2\2\2;\u0124\3\2\2\2=\u0127\3\2\2\2?\u0129\3\2"+
		"\2\2A\u012b\3\2\2\2C\u0134\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2I\4\3\2\2\2JK\7R\2\2KL\7k\2\2LM\7g\2\2MN\7e\2\2NO\7g\2\2"+
		"OP\7\"\2\2PQ\7P\2\2QR\7q\2\2RS\7\60\2\2ST\7\63\2\2T\6\3\2\2\2UV\4\62;"+
		"\2V\b\3\2\2\2WX\t\3\2\2X\n\3\2\2\2YZ\t\4\2\2Z\f\3\2\2\2[\\\7o\2\2\\\16"+
		"\3\2\2\2]^\t\5\2\2^\20\3\2\2\2_`\7|\2\2`\22\3\2\2\2ac\7)\2\2ba\3\2\2\2"+
		"cd\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fh\7.\2\2gf\3\2\2\2hi\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2kb\3\2\2\2kg\3\2\2\2l\24\3\2\2\2mu\7`\2"+
		"\2no\7`\2\2ou\7`\2\2pu\7a\2\2qr\7a\2\2ru\7a\2\2su\7?\2\2tm\3\2\2\2tn\3"+
		"\2\2\2tp\3\2\2\2tq\3\2\2\2ts\3\2\2\2u\26\3\2\2\2v\u0082\7~\2\2wx\7~\2"+
		"\2x\u0082\7~\2\2yz\7]\2\2z\u0082\7~\2\2{|\7~\2\2|\u0082\7_\2\2}~\7<\2"+
		"\2~\u0082\7~\2\2\177\u0080\7~\2\2\u0080\u0082\7<\2\2\u0081v\3\2\2\2\u0081"+
		"w\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\30\3\2\2\2\u0083\u0085\5\t\5\2\u0084\u0086\5\13\6\2\u0085\u0084"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\r\7\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\32\3\2\2\2\u008a\u008c\5\7\4"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\61\2\2\u0090\u0092\5\7\4\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\34\3\2\2\2\u0095\u0096\5\33\16\2\u0096\u0098\7?\2\2\u0097"+
		"\u0099\5\7\4\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\36\3\2\2\2\u009c\u00a1\7E\2\2\u009d\u009e"+
		"\7E\2\2\u009e\u00a1\7~\2\2\u009f\u00a1\5\33\16\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1 \3\2\2\2\u00a2\u00a4\5\7\4\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\61\2\2\u00a8\u00aa\5\7\4\2"+
		"\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00af\5\5\3\2\u00af"+
		"\u00b0\5\3\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7Z\2\2\u00b2\u00b3\7<\2\2\u00b3"+
		"\u00b7\3\2\2\2\u00b4\u00b6\5\17\b\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\5\7\4\2\u00bb&\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd"+
		"\u00be\7<\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1\5\17\b\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5\5\3\2\u00c6(\3\2\2\2"+
		"\u00c7\u00c8\7E\2\2\u00c8\u00c9\7<\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc"+
		"\5\17\b\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1"+
		"\5\5\3\2\u00d1*\3\2\2\2\u00d2\u00d3\7N\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d8"+
		"\3\2\2\2\u00d5\u00d7\5\17\b\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00db\u00dc\5!\21\2\u00dc,\3\2\2\2\u00dd\u00de\7O\2\2\u00de\u00df"+
		"\7<\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\5\17\b\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\37\20\2\u00e7.\3\2\2\2\u00e8\u00e9"+
		"\7S\2\2\u00e9\u00ea\7<\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00ed\5\17\b\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5\35\17\2\u00f2"+
		"\60\3\2\2\2\u00f3\u00f4\7X\2\2\u00f4\u00f5\7<\2\2\u00f5\u00f9\3\2\2\2"+
		"\u00f6\u00f8\5\17\b\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\5\5\3\2\u00fd\62\3\2\2\2\u00fe\u00ff\7M\2\2\u00ff\u0100\7<\2\2"+
		"\u0100\u0104\3\2\2\2\u0101\u0103\5\17\b\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\5\31\r\2\u0108\64\3\2\2\2\u0109\u010a\7y\2"+
		"\2\u010a\u010b\7<\2\2\u010b\u010f\3\2\2\2\u010c\u010e\5\67\34\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\66\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7\"\2\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u011d\3\2\2\2\u0117\u011d\t\6\2\2\u0118\u0119\7^\2\2\u0119\u011d\7/\2"+
		"\2\u011a\u011d\7~\2\2\u011b\u011d\5\5\3\2\u011c\u0113\3\2\2\2\u011c\u0117"+
		"\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\7]\2\2\u011f\u0123\7\63\2\2\u0120\u0121\7]\2\2\u0121"+
		"\u0123\7\64\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123:\3\2\2\2"+
		"\u0124\u0125\7*\2\2\u0125\u0126\5\7\4\2\u0126<\3\2\2\2\u0127\u0128\7\61"+
		"\2\2\u0128>\3\2\2\2\u0129\u012a\7]\2\2\u012a@\3\2\2\2\u012b\u012c\7_\2"+
		"\2\u012cB\3\2\2\2\u012d\u012f\5\7\4\2\u012e\u012d\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0135\5=\37\2\u0134\u0130\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0138\5\7\4\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013aD\3\2\2\2"+
		" \2Hdikt\u0081\u0085\u0088\u008d\u0093\u009a\u00a0\u00a5\u00ab\u00b7\u00c2"+
		"\u00cd\u00d8\u00e3\u00ee\u00f9\u0104\u010f\u0115\u011c\u0122\u0130\u0134"+
		"\u0139";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}