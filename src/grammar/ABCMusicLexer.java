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
		L_BRACKET=23, R_BRACKET=24, DIGIT=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "TUPLET_START", "'/'", "'['", "']'", "DIGIT"
	};
	public static final String[] ruleNames = {
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "TUPLET_START", "SLASH", "L_BRACKET", "R_BRACKET", 
		"DIGIT"
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

		case 14: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u0159\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\6\3I\n\3\r\3\16\3J"+
		"\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3\4\6\4W\n\4\r\4\16\4X\3\5\3"+
		"\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13\5\3\5\6\5e\n\5\r\5\16\5f\3\6\3\6\3\6"+
		"\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\6\6s\n\6\r\6\16\6t\3\6\3\6\6\6y\n\6\r"+
		"\6\16\6z\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13\7\3\7\3\7\3\7"+
		"\3\7\6\7\u008a\n\7\r\7\16\7\u008b\3\7\3\7\6\7\u0090\n\7\r\7\16\7\u0091"+
		"\5\7\u0094\n\7\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\6"+
		"\b\u00a0\n\b\r\b\16\b\u00a1\3\b\3\b\6\b\u00a6\n\b\r\b\16\b\u00a7\3\b\3"+
		"\b\5\b\u00ac\n\b\3\b\6\b\u00af\n\b\r\b\16\b\u00b0\3\t\3\t\3\t\3\t\7\t"+
		"\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\6\t\u00bd\n\t\r\t\16\t\u00be\3\n\6"+
		"\n\u00c2\n\n\r\n\16\n\u00c3\3\n\3\n\6\n\u00c8\n\n\r\n\16\n\u00c9\3\13"+
		"\6\13\u00cd\n\13\r\13\16\13\u00ce\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\6\f\u00d7"+
		"\n\f\r\f\16\f\u00d8\3\f\3\f\3\f\5\f\u00de\n\f\3\f\6\f\u00e1\n\f\r\f\16"+
		"\f\u00e2\3\f\6\f\u00e6\n\f\r\f\16\f\u00e7\3\f\3\f\6\f\u00ec\n\f\r\f\16"+
		"\f\u00ed\5\f\u00f0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f9\n\r\3\r\3"+
		"\r\6\r\u00fd\n\r\r\r\16\r\u00fe\3\r\6\r\u0102\n\r\r\r\16\r\u0103\5\r\u0106"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\6\20\u010d\n\20\r\20\16\20\u010e\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0120\n\22\3\23\3\23\3\23\3\23\7\23\u0126\n\23\f\23\16\23\u0129\13"+
		"\23\3\23\3\23\5\23\u012d\n\23\3\23\5\23\u0130\n\23\3\24\3\24\3\24\3\24"+
		"\6\24\u0136\n\24\r\24\16\24\u0137\3\24\3\24\3\24\3\24\7\24\u013e\n\24"+
		"\f\24\16\24\u0141\13\24\3\24\7\24\u0144\n\24\f\24\16\24\u0147\13\24\3"+
		"\25\3\25\3\25\3\25\5\25\u014d\n\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\2\33\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1"+
		"\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\3!\22\1#\23"+
		"\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\3\2\f\3\f\f\3"+
		"\f\f\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\4CIci\6,,//aa\u0080\u0080\3"+
		"\f\f\u0194\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5>\3\2\2\2\7L\3\2\2"+
		"\2\tZ\3\2\2\2\13h\3\2\2\2\r|\3\2\2\2\17\u0095\3\2\2\2\21\u00b2\3\2\2\2"+
		"\23\u00c1\3\2\2\2\25\u00cc\3\2\2\2\27\u00d2\3\2\2\2\31\u00f8\3\2\2\2\33"+
		"\u0107\3\2\2\2\35\u0109\3\2\2\2\37\u010c\3\2\2\2!\u0112\3\2\2\2#\u011f"+
		"\3\2\2\2%\u0121\3\2\2\2\'\u0131\3\2\2\2)\u014c\3\2\2\2+\u014e\3\2\2\2"+
		"-\u0151\3\2\2\2/\u0153\3\2\2\2\61\u0155\3\2\2\2\63\u0157\3\2\2\2\659\7"+
		"\'\2\2\668\n\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2"+
		"\2\2;9\3\2\2\2<=\b\2\2\2=\4\3\2\2\2>?\7Z\2\2?@\7<\2\2@D\3\2\2\2AC\5\37"+
		"\20\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5"+
		"\63\32\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\6\3\2\2\2LM\7V\2\2M"+
		"N\7<\2\2NR\3\2\2\2OQ\5\37\20\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2UW\n\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y\b\3\2\2\2Z[\7E\2\2[\\\7<\2\2\\`\3\2\2\2]_\5\37\20\2^]\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2ce\n\4\2\2dc\3\2\2\2ef\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2g\n\3\2\2\2hi\7N\2\2ij\7<\2\2jn\3\2\2\2km\5\37"+
		"\20\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\5"+
		"\63\32\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\7\61\2\2"+
		"wy\5\63\32\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\f\3\2\2\2|}\7O\2"+
		"\2}~\7<\2\2~\u0082\3\2\2\2\177\u0081\5\37\20\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0093\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0094\7E\2\2\u0086\u0087\7E\2\2\u0087\u0094"+
		"\7~\2\2\u0088\u008a\5\63\32\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\7\61\2\2\u008e\u0090\5\63\32\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0085"+
		"\3\2\2\2\u0093\u0086\3\2\2\2\u0093\u0089\3\2\2\2\u0094\16\3\2\2\2\u0095"+
		"\u0096\7S\2\2\u0096\u0097\7<\2\2\u0097\u009b\3\2\2\2\u0098\u009a\5\37"+
		"\20\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00ab\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\63"+
		"\32\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\7\61\2\2\u00a4\u00a6\5"+
		"\63\32\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ac\3\2"+
		"\2\2\u00ab\u009f\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00af\5\63\32\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7X\2\2\u00b3\u00b4"+
		"\7<\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\5\37\20\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\n\5\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\22\3\2\2"+
		"\2\u00c0\u00c2\5\63\32\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\61"+
		"\2\2\u00c6\u00c8\5\63\32\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\24\3\2\2\2\u00cb\u00cd\t\6\2"+
		"\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\26\3\2\2\2\u00d0\u00d3\5\31\r\2\u00d1\u00d3\5!\21\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00ef\3\2\2\2\u00d4\u00f0\5-"+
		"\27\2\u00d5\u00d7\5\63\32\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5-"+
		"\27\2\u00db\u00f0\3\2\2\2\u00dc\u00de\5-\27\2\u00dd\u00dc\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\5\63\32\2\u00e0\u00df\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00f0\3\2\2\2\u00e4\u00e6\5\63\32\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\7\61\2\2\u00ea\u00ec\5\63\32\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00d4\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00dd\3\2\2\2\u00ef\u00e5\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\30\3\2\2\2\u00f1\u00f9\7`\2\2\u00f2\u00f3"+
		"\7`\2\2\u00f3\u00f9\7`\2\2\u00f4\u00f9\7a\2\2\u00f5\u00f6\7a\2\2\u00f6"+
		"\u00f9\7a\2\2\u00f7\u00f9\7?\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2"+
		"\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0105\t\7\2\2\u00fb\u00fd\7)\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0106\3\2\2\2\u0100\u0102\7.\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u00fc\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\32\3\2\2\2\u0107\u0108\t\b\2\2\u0108\34\3\2\2\2\u0109\u010a\7o\2\2\u010a"+
		"\36\3\2\2\2\u010b\u010d\7\"\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\b\20\3\2\u0111 \3\2\2\2\u0112\u0113\7|\2\2\u0113\"\3\2\2\2\u0114\u0120"+
		"\7~\2\2\u0115\u0116\7~\2\2\u0116\u0120\7~\2\2\u0117\u0118\7]\2\2\u0118"+
		"\u0120\7~\2\2\u0119\u011a\7~\2\2\u011a\u0120\7_\2\2\u011b\u011c\7<\2\2"+
		"\u011c\u0120\7~\2\2\u011d\u011e\7~\2\2\u011e\u0120\7<\2\2\u011f\u0114"+
		"\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u0119\3\2\2\2\u011f"+
		"\u011b\3\2\2\2\u011f\u011d\3\2\2\2\u0120$\3\2\2\2\u0121\u0122\7M\2\2\u0122"+
		"\u0123\7<\2\2\u0123\u0127\3\2\2\2\u0124\u0126\5\37\20\2\u0125\u0124\3"+
		"\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\t\t\2\2\u012b\u012d\5\33"+
		"\16\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u0130\5\35\17\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130&\3\2\2"+
		"\2\u0131\u0132\7y\2\2\u0132\u0133\7<\2\2\u0133\u013f\3\2\2\2\u0134\u0136"+
		"\7\"\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013e\3\2\2\2\u0139\u013e\t\n\2\2\u013a\u013b\7^"+
		"\2\2\u013b\u013e\7/\2\2\u013c\u013e\7~\2\2\u013d\u0135\3\2\2\2\u013d\u0139"+
		"\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0144\n\13\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146(\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u0149\7]\2\2\u0149\u014d\7\63\2\2\u014a\u014b\7]\2\2\u014b\u014d"+
		"\7\64\2\2\u014c\u0148\3\2\2\2\u014c\u014a\3\2\2\2\u014d*\3\2\2\2\u014e"+
		"\u014f\7*\2\2\u014f\u0150\5\63\32\2\u0150,\3\2\2\2\u0151\u0152\7\61\2"+
		"\2\u0152.\3\2\2\2\u0153\u0154\7]\2\2\u0154\60\3\2\2\2\u0155\u0156\7_\2"+
		"\2\u0156\62\3\2\2\2\u0157\u0158\4\62;\2\u0158\64\3\2\2\2\60\29DJRX`fn"+
		"tz\u0082\u008b\u0091\u0093\u009b\u00a1\u00a7\u00ab\u00b0\u00b8\u00be\u00c3"+
		"\u00c9\u00ce\u00d2\u00d8\u00dd\u00e2\u00e7\u00ed\u00ef\u00f8\u00fe\u0103"+
		"\u0105\u010e\u011f\u0127\u012c\u012f\u0137\u013d\u013f\u0145\u014c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}