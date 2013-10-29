// Generated from ABCMusic.g4 by ANTLR 4.0

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
		COMMENT=1, FIELD_NUMBER=2, FIELD_TITLE=3, FIELD_COMPOSER=4, FIELD_DEFAULT_LENGTH=5, 
		FIELD_METER=6, FIELD_TEMPO=7, FIELD_VOICE=8, FRACTION=9, LINEFEED=10, 
		NOTE=11, PITCH=12, KEYACCIDENTAL=13, MODEMINOR=14, SPACE=15, REST=16, 
		BARLINE=17, FIELD_KEY=18, LYRIC=19, NTH_REPEAT=20, TUPLET_START=21, SLASH=22, 
		L_BRACKET=23, R_BRACKET=24, DIGITS=25, DIGIT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "TUPLET_START", "'/'", "'['", "']'", "DIGITS", 
		"DIGIT"
	};
	public static final String[] ruleNames = {
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "TUPLET_START", "SLASH", "L_BRACKET", "R_BRACKET", 
		"DIGITS", "DIGIT"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\34\u014c\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\6\2:\n\2\r\2\16"+
		"\2;\3\2\3\2\3\3\3\3\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3\4\6\4U\n\4\r\4\16\4V\3\5\3\5\3\5\3\5"+
		"\7\5]\n\5\f\5\16\5`\13\5\3\5\6\5c\n\5\r\5\16\5d\3\6\3\6\3\6\3\6\7\6k\n"+
		"\6\f\6\16\6n\13\6\3\6\6\6q\n\6\r\6\16\6r\3\6\3\6\6\6w\n\6\r\6\16\6x\3"+
		"\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\7\3\7\3\7\3\7\6\7\u0088"+
		"\n\7\r\7\16\7\u0089\3\7\3\7\6\7\u008e\n\7\r\7\16\7\u008f\5\7\u0092\n\7"+
		"\3\b\3\b\3\b\3\b\7\b\u0098\n\b\f\b\16\b\u009b\13\b\3\b\6\b\u009e\n\b\r"+
		"\b\16\b\u009f\3\b\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\b\3\b\5\b\u00aa\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\6\t\u00b8"+
		"\n\t\r\t\16\t\u00b9\3\n\6\n\u00bd\n\n\r\n\16\n\u00be\3\n\3\n\6\n\u00c3"+
		"\n\n\r\n\16\n\u00c4\3\13\6\13\u00c8\n\13\r\13\16\13\u00c9\3\f\3\f\5\f"+
		"\u00ce\n\f\3\f\3\f\5\f\u00d2\n\f\3\f\3\f\6\f\u00d6\n\f\r\f\16\f\u00d7"+
		"\3\f\3\f\6\f\u00dc\n\f\r\f\16\f\u00dd\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00e9\n\r\3\r\3\r\6\r\u00ed\n\r\r\r\16\r\u00ee\3\r\6\r"+
		"\u00f2\n\r\r\r\16\r\u00f3\5\r\u00f6\n\r\3\16\3\16\3\17\3\17\3\20\6\20"+
		"\u00fd\n\20\r\20\16\20\u00fe\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\23\3\23\3\23\3\23\7\23\u0114"+
		"\n\23\f\23\16\23\u0117\13\23\3\23\3\23\5\23\u011b\n\23\3\23\5\23\u011e"+
		"\n\23\3\24\3\24\3\24\3\24\6\24\u0124\n\24\r\24\16\24\u0125\3\24\3\24\3"+
		"\24\3\24\7\24\u012c\n\24\f\24\16\24\u012f\13\24\3\24\7\24\u0132\n\24\f"+
		"\24\16\24\u0135\13\24\3\25\3\25\3\25\3\25\5\25\u013b\n\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u0147\n\32\r\32\16\32\u0148"+
		"\3\33\3\33\2\34\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\3\2\f\3\f\f\3"+
		"\f\f\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\4CIci\6,,//aa\u0080\u0080\3"+
		"\f\f\u0183\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5?\3\2"+
		"\2\2\7J\3\2\2\2\tX\3\2\2\2\13f\3\2\2\2\rz\3\2\2\2\17\u0093\3\2\2\2\21"+
		"\u00ad\3\2\2\2\23\u00bc\3\2\2\2\25\u00c7\3\2\2\2\27\u00cd\3\2\2\2\31\u00e8"+
		"\3\2\2\2\33\u00f7\3\2\2\2\35\u00f9\3\2\2\2\37\u00fc\3\2\2\2!\u0100\3\2"+
		"\2\2#\u010d\3\2\2\2%\u010f\3\2\2\2\'\u011f\3\2\2\2)\u013a\3\2\2\2+\u013c"+
		"\3\2\2\2-\u013f\3\2\2\2/\u0141\3\2\2\2\61\u0143\3\2\2\2\63\u0146\3\2\2"+
		"\2\65\u014a\3\2\2\2\679\7\'\2\28:\n\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<=\3\2\2\2=>\b\2\2\2>\4\3\2\2\2?@\7Z\2\2@A\7<\2\2AE\3\2\2"+
		"\2BD\5\37\20\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2"+
		"\2\2HI\5\63\32\2I\6\3\2\2\2JK\7V\2\2KL\7<\2\2LP\3\2\2\2MO\5\37\20\2NM"+
		"\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\n\3\2\2T"+
		"S\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\b\3\2\2\2XY\7E\2\2YZ\7<\2\2Z"+
		"^\3\2\2\2[]\5\37\20\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2ac\n\4\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\n\3"+
		"\2\2\2fg\7N\2\2gh\7<\2\2hl\3\2\2\2ik\5\37\20\2ji\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\65\33\2po\3\2\2\2qr\3\2\2\2r"+
		"p\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7\61\2\2uw\5\65\33\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\f\3\2\2\2z{\7O\2\2{|\7<\2\2|\u0080\3\2\2\2}\177"+
		"\5\37\20\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0091\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0092\7E\2\2\u0084"+
		"\u0085\7E\2\2\u0085\u0092\7~\2\2\u0086\u0088\5\65\33\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008d\7\61\2\2\u008c\u008e\5\65\33\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0083\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u0087\3\2"+
		"\2\2\u0092\16\3\2\2\2\u0093\u0094\7S\2\2\u0094\u0095\7<\2\2\u0095\u0099"+
		"\3\2\2\2\u0096\u0098\5\37\20\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a9\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009e\5\65\33\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\7\61\2\2\u00a2\u00a4\5\65\33\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\5\63\32\2\u00ac\20\3\2\2\2\u00ad\u00ae\7X\2"+
		"\2\u00ae\u00af\7<\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\5\37\20\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\n\5\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\22\3\2\2\2\u00bb\u00bd\5\65\33\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\7\61\2\2\u00c1\u00c3\5\65\33\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\24\3\2\2"+
		"\2\u00c6\u00c8\t\6\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\26\3\2\2\2\u00cb\u00ce\5\31\r\2\u00cc"+
		"\u00ce\5!\21\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00df\3\2"+
		"\2\2\u00cf\u00e0\5-\27\2\u00d0\u00d2\5-\27\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e0\5\63\32\2\u00d4\u00d6\5"+
		"\65\33\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\61\2\2\u00da\u00dc\5"+
		"\65\33\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d1\3\2"+
		"\2\2\u00df\u00d5\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\30\3\2\2\2\u00e1\u00e9"+
		"\7`\2\2\u00e2\u00e3\7`\2\2\u00e3\u00e9\7`\2\2\u00e4\u00e9\7a\2\2\u00e5"+
		"\u00e6\7a\2\2\u00e6\u00e9\7a\2\2\u00e7\u00e9\7?\2\2\u00e8\u00e1\3\2\2"+
		"\2\u00e8\u00e2\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f5\t\7\2\2\u00eb"+
		"\u00ed\7)\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f6\3\2\2\2\u00f0\u00f2\7.\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\32\3\2\2\2\u00f7\u00f8\t\b\2\2\u00f8\34\3\2\2\2\u00f9"+
		"\u00fa\7o\2\2\u00fa\36\3\2\2\2\u00fb\u00fd\7\"\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff \3"+
		"\2\2\2\u0100\u0101\7|\2\2\u0101\"\3\2\2\2\u0102\u010e\7~\2\2\u0103\u0104"+
		"\7~\2\2\u0104\u010e\7~\2\2\u0105\u0106\7]\2\2\u0106\u010e\7~\2\2\u0107"+
		"\u0108\7~\2\2\u0108\u010e\7_\2\2\u0109\u010a\7<\2\2\u010a\u010e\7~\2\2"+
		"\u010b\u010c\7~\2\2\u010c\u010e\7<\2\2\u010d\u0102\3\2\2\2\u010d\u0103"+
		"\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e$\3\2\2\2\u010f\u0110\7M\2\2\u0110\u0111\7<\2\2\u0111"+
		"\u0115\3\2\2\2\u0112\u0114\5\37\20\2\u0113\u0112\3\2\2\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011a\t\t\2\2\u0119\u011b\5\33\16\2\u011a\u0119\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5\35\17\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e&\3\2\2\2\u011f\u0120\7y\2\2\u0120"+
		"\u0121\7<\2\2\u0121\u012d\3\2\2\2\u0122\u0124\7\"\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u012c\3\2\2\2\u0127\u012c\t\n\2\2\u0128\u0129\7^\2\2\u0129\u012c\7/\2"+
		"\2\u012a\u012c\7~\2\2\u012b\u0123\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0133\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\n\13"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134(\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7]\2\2\u0137"+
		"\u013b\7\63\2\2\u0138\u0139\7]\2\2\u0139\u013b\7\64\2\2\u013a\u0136\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013b*\3\2\2\2\u013c\u013d\7*\2\2\u013d\u013e"+
		"\5\65\33\2\u013e,\3\2\2\2\u013f\u0140\7\61\2\2\u0140.\3\2\2\2\u0141\u0142"+
		"\7]\2\2\u0142\60\3\2\2\2\u0143\u0144\7_\2\2\u0144\62\3\2\2\2\u0145\u0147"+
		"\5\65\33\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\64\3\2\2\2\u014a\u014b\4\62;\2\u014b\66\3\2"+
		"\2\2-\2;EPV^dlrx\u0080\u0089\u008f\u0091\u0099\u009f\u00a5\u00a9\u00b3"+
		"\u00b9\u00be\u00c4\u00c9\u00cd\u00d1\u00d7\u00dd\u00df\u00e8\u00ee\u00f3"+
		"\u00f5\u00fe\u010d\u0115\u011a\u011d\u0125\u012b\u012d\u0133\u013a\u0148";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}