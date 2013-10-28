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
		BASENOTE=11, KEYACCIDENTAL=12, MODEMINOR=13, SPACE=14, REST=15, OCTAVE=16, 
		ACCIDENTAL=17, BARLINE=18, FIELD_KEY=19, LYRIC=20, LYRICAL_ELEMENT=21, 
		NTH_REPEAT=22, TUPLET_START=23, SLASH=24, L_BRACKET=25, R_BRACKET=26, 
		DIGITS=27, DIGIT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "BASENOTE", 
		"KEYACCIDENTAL", "'m'", "SPACE", "'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", 
		"FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_START", 
		"'/'", "'['", "']'", "DIGITS", "DIGIT"
	};
	public static final String[] ruleNames = {
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "BASENOTE", 
		"KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "OCTAVE", "ACCIDENTAL", 
		"BARLINE", "FIELD_KEY", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_START", 
		"SLASH", "L_BRACKET", "R_BRACKET", "DIGITS", "DIGIT"
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

		case 9: LINEFEED_action((RuleContext)_localctx, actionIndex); break;

		case 13: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LINEFEED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\36\u0141\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\6\2>\n\2\r\2\16\2?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16"+
		"\3M\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\6\4[\n\4"+
		"\r\4\16\4\\\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\6\5i\n\5\r\5\16"+
		"\5j\3\6\3\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\6\6w\n\6\r\6\16\6x\3\6"+
		"\3\6\6\6}\n\6\r\6\16\6~\3\7\3\7\3\7\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13"+
		"\7\3\7\3\7\3\7\3\7\6\7\u008e\n\7\r\7\16\7\u008f\3\7\3\7\6\7\u0094\n\7"+
		"\r\7\16\7\u0095\5\7\u0098\n\7\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1"+
		"\13\b\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\b\3\b\6\b\u00aa\n\b\r\b\16\b"+
		"\u00ab\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b8\n\t\f\t"+
		"\16\t\u00bb\13\t\3\t\6\t\u00be\n\t\r\t\16\t\u00bf\3\n\6\n\u00c3\n\n\r"+
		"\n\16\n\u00c4\3\n\3\n\6\n\u00c9\n\n\r\n\16\n\u00ca\3\13\6\13\u00ce\n\13"+
		"\r\13\16\13\u00cf\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\6\21\u00e1\n\21\r\21\16\21\u00e2\3\21\6\21\u00e6\n"+
		"\21\r\21\16\21\u00e7\5\21\u00ea\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00f3\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0100\n\23\3\24\3\24\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109"+
		"\13\24\3\24\3\24\5\24\u010d\n\24\3\24\5\24\u0110\n\24\3\25\3\25\3\25\3"+
		"\25\7\25\u0116\n\25\f\25\16\25\u0119\13\25\3\25\7\25\u011c\n\25\f\25\16"+
		"\25\u011f\13\25\3\26\6\26\u0122\n\26\r\26\16\26\u0123\3\26\3\26\3\26\3"+
		"\26\5\26\u012a\n\26\3\27\3\27\3\27\3\27\5\27\u0130\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u013c\n\34\r\34\16\34\u013d\3"+
		"\35\3\35\2\36\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\3\27\r\1\31\16\1\33\17\1\35\20\4\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1\3\2\f"+
		"\3\f\f\3\f\f\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\3\"\"\3\f\f\6,,//aa"+
		"\u0080\u0080\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5E\3\2\2\2\7P\3\2\2\2\t^\3\2\2\2\13l\3\2\2\2\r"+
		"\u0080\3\2\2\2\17\u0099\3\2\2\2\21\u00b3\3\2\2\2\23\u00c2\3\2\2\2\25\u00cd"+
		"\3\2\2\2\27\u00d3\3\2\2\2\31\u00d5\3\2\2\2\33\u00d7\3\2\2\2\35\u00d9\3"+
		"\2\2\2\37\u00dd\3\2\2\2!\u00e9\3\2\2\2#\u00f2\3\2\2\2%\u00ff\3\2\2\2\'"+
		"\u0101\3\2\2\2)\u0111\3\2\2\2+\u0129\3\2\2\2-\u012f\3\2\2\2/\u0131\3\2"+
		"\2\2\61\u0134\3\2\2\2\63\u0136\3\2\2\2\65\u0138\3\2\2\2\67\u013b\3\2\2"+
		"\29\u013f\3\2\2\2;=\7\'\2\2<>\n\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@"+
		"\3\2\2\2@A\3\2\2\2AB\5\25\13\2BC\3\2\2\2CD\b\2\2\2D\4\3\2\2\2EF\7Z\2\2"+
		"FG\7<\2\2GK\3\2\2\2HJ\5\35\17\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2LN\3\2\2\2MK\3\2\2\2NO\5\67\34\2O\6\3\2\2\2PQ\7V\2\2QR\7<\2\2RV\3\2"+
		"\2\2SU\5\35\17\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2Y[\n\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\b\3\2\2\2"+
		"^_\7E\2\2_`\7<\2\2`d\3\2\2\2ac\5\35\17\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eh\3\2\2\2fd\3\2\2\2gi\n\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2k\n\3\2\2\2lm\7N\2\2mn\7<\2\2nr\3\2\2\2oq\5\35\17\2po\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\59\35\2vu\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\61\2\2{}\59\35\2|{\3\2"+
		"\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\f\3\2\2\2\u0080\u0081\7O\2\2"+
		"\u0081\u0082\7<\2\2\u0082\u0086\3\2\2\2\u0083\u0085\5\35\17\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0097\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0098\7E\2\2\u008a\u008b\7E\2"+
		"\2\u008b\u0098\7~\2\2\u008c\u008e\59\35\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\7\61\2\2\u0092\u0094\59\35\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0089\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008d\3\2\2\2\u0098\16\3\2\2"+
		"\2\u0099\u009a\7S\2\2\u009a\u009b\7<\2\2\u009b\u009f\3\2\2\2\u009c\u009e"+
		"\5\35\17\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00af\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4"+
		"\59\35\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\61\2\2\u00a8\u00aa\5"+
		"9\35\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00a3\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\5\67\34\2\u00b2\20\3\2\2\2\u00b3\u00b4\7X\2\2\u00b4\u00b5\7<\2"+
		"\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\5\35\17\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\n\5\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\22\3\2\2"+
		"\2\u00c1\u00c3\59\35\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\61\2\2"+
		"\u00c7\u00c9\59\35\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\24\3\2\2\2\u00cc\u00ce\t\6\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\13\3\2\u00d2\26\3\2\2\2\u00d3\u00d4"+
		"\t\7\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\t\b\2\2\u00d6\32\3\2\2\2\u00d7\u00d8"+
		"\7o\2\2\u00d8\34\3\2\2\2\u00d9\u00da\t\t\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b\17\4\2\u00dc\36\3\2\2\2\u00dd\u00de\7|\2\2\u00de \3\2\2\2\u00df"+
		"\u00e1\7)\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ea\3\2\2\2\u00e4\u00e6\7.\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea"+
		"\"\3\2\2\2\u00eb\u00f3\7`\2\2\u00ec\u00ed\7`\2\2\u00ed\u00f3\7`\2\2\u00ee"+
		"\u00f3\7a\2\2\u00ef\u00f0\7a\2\2\u00f0\u00f3\7a\2\2\u00f1\u00f3\7?\2\2"+
		"\u00f2\u00eb\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef"+
		"\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3$\3\2\2\2\u00f4\u0100\7~\2\2\u00f5\u00f6"+
		"\7~\2\2\u00f6\u0100\7~\2\2\u00f7\u00f8\7]\2\2\u00f8\u0100\7~\2\2\u00f9"+
		"\u00fa\7~\2\2\u00fa\u0100\7_\2\2\u00fb\u00fc\7<\2\2\u00fc\u0100\7~\2\2"+
		"\u00fd\u00fe\7~\2\2\u00fe\u0100\7<\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f5"+
		"\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100&\3\2\2\2\u0101\u0102\7M\2\2\u0102\u0103\7<\2\2\u0103"+
		"\u0107\3\2\2\2\u0104\u0106\5\35\17\2\u0105\u0104\3\2\2\2\u0106\u0109\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010c\5\27\f\2\u010b\u010d\5\31\r\2\u010c\u010b\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5\33\16\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110(\3\2\2\2\u0111\u0112\7y\2\2\u0112"+
		"\u0113\7<\2\2\u0113\u0117\3\2\2\2\u0114\u0116\5+\26\2\u0115\u0114\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011d\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\n\n\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"*\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\"\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012a"+
		"\3\2\2\2\u0125\u012a\t\13\2\2\u0126\u0127\7^\2\2\u0127\u012a\7/\2\2\u0128"+
		"\u012a\7~\2\2\u0129\u0121\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a,\3\2\2\2\u012b\u012c\7]\2\2\u012c\u0130"+
		"\7\63\2\2\u012d\u012e\7]\2\2\u012e\u0130\7\64\2\2\u012f\u012b\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u0130.\3\2\2\2\u0131\u0132\7*\2\2\u0132\u0133\59"+
		"\35\2\u0133\60\3\2\2\2\u0134\u0135\7\61\2\2\u0135\62\3\2\2\2\u0136\u0137"+
		"\7]\2\2\u0137\64\3\2\2\2\u0138\u0139\7_\2\2\u0139\66\3\2\2\2\u013a\u013c"+
		"\59\35\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e8\3\2\2\2\u013f\u0140\4\62;\2\u0140:\3\2\2\2\'\2?"+
		"KV\\djrx~\u0086\u008f\u0095\u0097\u009f\u00a5\u00ab\u00af\u00b9\u00bf"+
		"\u00c4\u00ca\u00cf\u00e2\u00e7\u00e9\u00f2\u00ff\u0107\u010c\u010f\u0117"+
		"\u011d\u0123\u0129\u012f\u013d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}