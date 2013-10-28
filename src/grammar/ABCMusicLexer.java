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
		NTH_REPEAT=27, TUPLET_SPEC=28, NOTE_LENGTH=29, L_BRACKET=30, R_BRACKET=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINEFEED", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", 
		"OCTAVE", "ACCIDENTAL", "BARLINE", "KEY", "METER_FRACTION", "TEMPO", "METER", 
		"NOTE_LENGTH_STRICT", "COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", 
		"FIELD_DEFAULT_LENGTH", "FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", 
		"LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_SPEC", "NOTE_LENGTH", 
		"'['", "']'"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "ALPHABET", "DIGITS", "TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", 
		"MODEMINOR", "SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "KEY", 
		"METER_FRACTION", "TEMPO", "METER", "NOTE_LENGTH_STRICT", "COMMENT", "FIELD_NUMBER", 
		"FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", "FIELD_METER", 
		"FIELD_TEMPO", "FIELD_VOICE", "FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", 
		"NTH_REPEAT", "TUPLET_SPEC", "NOTE_LENGTH", "L_BRACKET", "R_BRACKET"
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
		"\2\4!\u013f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\6\2I\n\2\r\2\16\2J\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fi\n\f\r\f\16\fj\3\f\6\fn\n\f"+
		"\r\f\16\fo\5\fr\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0088\n\16\3\17\3\17\5\17"+
		"\u008c\n\17\3\17\5\17\u008f\n\17\3\20\6\20\u0092\n\20\r\20\16\20\u0093"+
		"\3\20\3\20\6\20\u0098\n\20\r\20\16\20\u0099\3\21\3\21\3\21\6\21\u009f"+
		"\n\21\r\21\16\21\u00a0\3\22\3\22\3\22\3\22\5\22\u00a7\n\22\3\23\6\23\u00aa"+
		"\n\23\r\23\16\23\u00ab\3\23\3\23\6\23\u00b0\n\23\r\23\16\23\u00b1\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00bc\n\25\f\25\16\25\u00bf\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00c7\n\26\f\26\16\26\u00ca\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00d2\n\27\f\27\16\27\u00d5\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00dd\n\30\f\30\16\30\u00e0\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00e8\n\31\f\31\16\31\u00eb\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00f3\n\32\f\32\16\32\u00f6\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00fe\n\33\f\33\16\33\u0101\13"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0109\n\34\f\34\16\34\u010c\13"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0114\n\35\f\35\16\35\u0117\13"+
		"\35\3\36\6\36\u011a\n\36\r\36\16\36\u011b\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0123\n\36\3\37\3\37\3\37\3\37\5\37\u0129\n\37\3 \3 \3 \3!\6!\u012f\n"+
		"!\r!\16!\u0130\3!\3!\5!\u0135\n!\3!\6!\u0138\n!\r!\16!\u0139\3\"\3\"\3"+
		"#\3#\2$\3\3\1\5\2\1\7\2\1\t\2\1\13\4\1\r\5\1\17\6\1\21\7\1\23\b\1\25\t"+
		"\1\27\n\1\31\13\1\33\f\1\35\r\1\37\16\1!\17\1#\20\1%\21\1\'\22\1)\23\1"+
		"+\24\1-\25\1/\26\1\61\27\1\63\30\1\65\31\1\67\32\19\33\1;\34\1=\35\1?"+
		"\36\1A\37\1C \1E!\1\3\2\b\4\13\f\17\17\4C\\c|\4CIci\4%%dd\3\"\"\6,,//"+
		"aa\u0080\u0080\u0163\2\3\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3H\3\2\2\2\5L\3\2\2\2\7N"+
		"\3\2\2\2\tP\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23"+
		"c\3\2\2\2\25e\3\2\2\2\27q\3\2\2\2\31z\3\2\2\2\33\u0087\3\2\2\2\35\u0089"+
		"\3\2\2\2\37\u0091\3\2\2\2!\u009b\3\2\2\2#\u00a6\3\2\2\2%\u00a9\3\2\2\2"+
		"\'\u00b3\3\2\2\2)\u00b7\3\2\2\2+\u00c2\3\2\2\2-\u00cd\3\2\2\2/\u00d8\3"+
		"\2\2\2\61\u00e3\3\2\2\2\63\u00ee\3\2\2\2\65\u00f9\3\2\2\2\67\u0104\3\2"+
		"\2\29\u010f\3\2\2\2;\u0122\3\2\2\2=\u0128\3\2\2\2?\u012a\3\2\2\2A\u0134"+
		"\3\2\2\2C\u013b\3\2\2\2E\u013d\3\2\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2\2J"+
		"H\3\2\2\2JK\3\2\2\2K\4\3\2\2\2LM\t\3\2\2M\6\3\2\2\2NO\4\62;\2O\b\3\2\2"+
		"\2PQ\7R\2\2QR\7k\2\2RS\7g\2\2ST\7e\2\2TU\7g\2\2UV\7\"\2\2VW\7P\2\2WX\7"+
		"q\2\2XY\7\60\2\2YZ\7\63\2\2Z\n\3\2\2\2[\\\4\62;\2\\\f\3\2\2\2]^\t\4\2"+
		"\2^\16\3\2\2\2_`\t\5\2\2`\20\3\2\2\2ab\7o\2\2b\22\3\2\2\2cd\t\6\2\2d\24"+
		"\3\2\2\2ef\7|\2\2f\26\3\2\2\2gi\7)\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2j"+
		"k\3\2\2\2kr\3\2\2\2ln\7.\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p"+
		"r\3\2\2\2qh\3\2\2\2qm\3\2\2\2r\30\3\2\2\2s{\7`\2\2tu\7`\2\2u{\7`\2\2v"+
		"{\7a\2\2wx\7a\2\2x{\7a\2\2y{\7?\2\2zs\3\2\2\2zt\3\2\2\2zv\3\2\2\2zw\3"+
		"\2\2\2zy\3\2\2\2{\32\3\2\2\2|\u0088\7~\2\2}~\7~\2\2~\u0088\7~\2\2\177"+
		"\u0080\7]\2\2\u0080\u0088\7~\2\2\u0081\u0082\7~\2\2\u0082\u0088\7_\2\2"+
		"\u0083\u0084\7<\2\2\u0084\u0088\7~\2\2\u0085\u0086\7~\2\2\u0086\u0088"+
		"\7<\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0087\u0081\3"+
		"\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008b\5\r\7\2\u008a\u008c\5\17\b\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5\21\t\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\36\3\2\2\2\u0090\u0092\5\13\6\2\u0091\u0090\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\7\61\2\2\u0096\u0098\5\13\6\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a \3"+
		"\2\2\2\u009b\u009c\5\37\20\2\u009c\u009e\7?\2\2\u009d\u009f\5\13\6\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\"\3\2\2\2\u00a2\u00a7\7E\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a7"+
		"\7~\2\2\u00a5\u00a7\5\37\20\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7$\3\2\2\2\u00a8\u00aa\5\13\6\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\7\61\2\2\u00ae\u00b0\5\13\6\2\u00af\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"&\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b5\5\t\5\2\u00b5\u00b6\5\3\2\2"+
		"\u00b6(\3\2\2\2\u00b7\u00b8\7Z\2\2\u00b8\u00b9\7<\2\2\u00b9\u00bd\3\2"+
		"\2\2\u00ba\u00bc\5\23\n\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c1\5\13\6\2\u00c1*\3\2\2\2\u00c2\u00c3\7V\2\2\u00c3\u00c4"+
		"\7<\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\5\23\n\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\t\5\2\u00cc,\3\2\2\2\u00cd\u00ce"+
		"\7E\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\5\23\n\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\5\t\5\2\u00d7"+
		".\3\2\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7<\2\2\u00da\u00de\3\2\2\2\u00db"+
		"\u00dd\5\23\n\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3"+
		"\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\5%\23\2\u00e2\60\3\2\2\2\u00e3\u00e4\7O\2\2\u00e4\u00e5\7<\2\2"+
		"\u00e5\u00e9\3\2\2\2\u00e6\u00e8\5\23\n\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\5#\22\2\u00ed\62\3\2\2\2\u00ee\u00ef\7S\2\2"+
		"\u00ef\u00f0\7<\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\5\23\n\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5!\21\2\u00f8\64\3\2\2"+
		"\2\u00f9\u00fa\7X\2\2\u00fa\u00fb\7<\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe"+
		"\5\23\n\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2"+
		"\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103"+
		"\5\t\5\2\u0103\66\3\2\2\2\u0104\u0105\7M\2\2\u0105\u0106\7<\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0109\5\23\n\2\u0108\u0107\3\2\2\2\u0109\u010c\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010e\5\35\17\2\u010e8\3\2\2\2\u010f\u0110\7y\2\2"+
		"\u0110\u0111\7<\2\2\u0111\u0115\3\2\2\2\u0112\u0114\5;\36\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		":\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\"\2\2\u0119\u0118\3\2\2\2"+
		"\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0123"+
		"\3\2\2\2\u011d\u0123\t\7\2\2\u011e\u011f\7^\2\2\u011f\u0123\7/\2\2\u0120"+
		"\u0123\7~\2\2\u0121\u0123\5\t\5\2\u0122\u0119\3\2\2\2\u0122\u011d\3\2"+
		"\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"<\3\2\2\2\u0124\u0125\7]\2\2\u0125\u0129\7\63\2\2\u0126\u0127\7]\2\2\u0127"+
		"\u0129\7\64\2\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129>\3\2\2\2"+
		"\u012a\u012b\7*\2\2\u012b\u012c\5\13\6\2\u012c@\3\2\2\2\u012d\u012f\5"+
		"\13\6\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\61\2\2\u0133\u0135\3"+
		"\2\2\2\u0134\u012e\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0138\5\13\6\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013aB\3\2\2\2\u013b\u013c\7]\2\2\u013cD\3"+
		"\2\2\2\u013d\u013e\7_\2\2\u013eF\3\2\2\2 \2Jjoqz\u0087\u008b\u008e\u0093"+
		"\u0099\u00a0\u00a6\u00ab\u00b1\u00bd\u00c8\u00d3\u00de\u00e9\u00f4\u00ff"+
		"\u010a\u0115\u011b\u0122\u0128\u0130\u0134\u0139";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}