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
		BARLINE=17, FIELD_KEY=18, LYRIC=19, NTH_REPEAT=20, DUPLET=21, TRIPLET=22, 
		QUADRUPLET=23, SLASH=24, L_BRACKET=25, R_BRACKET=26, DIGIT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "'m'", "SPACE", "'z'", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "'(2'", "'(3'", "'(4'", "'/'", "'['", "']'", "DIGIT"
	};
	public static final String[] ruleNames = {
		"COMMENT", "FIELD_NUMBER", "FIELD_TITLE", "FIELD_COMPOSER", "FIELD_DEFAULT_LENGTH", 
		"FIELD_METER", "FIELD_TEMPO", "FIELD_VOICE", "FRACTION", "LINEFEED", "NOTE", 
		"PITCH", "KEYACCIDENTAL", "MODEMINOR", "SPACE", "REST", "BARLINE", "FIELD_KEY", 
		"LYRIC", "NTH_REPEAT", "DUPLET", "TRIPLET", "QUADRUPLET", "SLASH", "L_BRACKET", 
		"R_BRACKET", "DIGIT"
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
		"\2\4\35\u0163\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2<\n"+
		"\2\f\2\16\2?\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3"+
		"\6\3M\n\3\r\3\16\3N\3\4\3\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\6\4[\n"+
		"\4\r\4\16\4\\\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16\5f\13\5\3\5\6\5i\n\5\r\5"+
		"\16\5j\3\6\3\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\6\6w\n\6\r\6\16\6x"+
		"\3\6\3\6\6\6}\n\6\r\6\16\6~\3\7\3\7\3\7\3\7\7\7\u0085\n\7\f\7\16\7\u0088"+
		"\13\7\3\7\3\7\3\7\3\7\6\7\u008e\n\7\r\7\16\7\u008f\3\7\3\7\6\7\u0094\n"+
		"\7\r\7\16\7\u0095\5\7\u0098\n\7\3\b\3\b\3\b\3\b\7\b\u009e\n\b\f\b\16\b"+
		"\u00a1\13\b\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\b\3\b\6\b\u00aa\n\b\r\b"+
		"\16\b\u00ab\3\b\3\b\5\b\u00b0\n\b\3\b\6\b\u00b3\n\b\r\b\16\b\u00b4\3\t"+
		"\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\6\t\u00c1\n\t\r\t\16"+
		"\t\u00c2\3\n\6\n\u00c6\n\n\r\n\16\n\u00c7\3\n\3\n\6\n\u00cc\n\n\r\n\16"+
		"\n\u00cd\3\13\6\13\u00d1\n\13\r\13\16\13\u00d2\3\f\3\f\5\f\u00d7\n\f\3"+
		"\f\3\f\6\f\u00db\n\f\r\f\16\f\u00dc\3\f\3\f\3\f\5\f\u00e2\n\f\3\f\6\f"+
		"\u00e5\n\f\r\f\16\f\u00e6\3\f\6\f\u00ea\n\f\r\f\16\f\u00eb\3\f\3\f\6\f"+
		"\u00f0\n\f\r\f\16\f\u00f1\5\f\u00f4\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00fd\n\r\3\r\3\r\6\r\u0101\n\r\r\r\16\r\u0102\3\r\6\r\u0106\n\r\r"+
		"\r\16\r\u0107\5\r\u010a\n\r\3\16\3\16\3\17\3\17\3\20\6\20\u0111\n\20\r"+
		"\20\16\20\u0112\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0124\n\22\3\23\3\23\3\23\3\23\7\23\u012a\n"+
		"\23\f\23\16\23\u012d\13\23\3\23\3\23\5\23\u0131\n\23\3\23\5\23\u0134\n"+
		"\23\3\24\3\24\3\24\3\24\6\24\u013a\n\24\r\24\16\24\u013b\3\24\3\24\3\24"+
		"\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13\24\3\24\7\24\u0148\n\24\f\24"+
		"\16\24\u014b\13\24\3\25\3\25\3\25\3\25\5\25\u0151\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\2\35\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\3!\22\1#\23\1%\24\1\'\25\1)\26"+
		"\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1\3\2\f\3\f\f\3\f\f"+
		"\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\4CIci\6,,//aa\u0080\u0080\3\f\f"+
		"\u019e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2"+
		"\2\5B\3\2\2\2\7P\3\2\2\2\t^\3\2\2\2\13l\3\2\2\2\r\u0080\3\2\2\2\17\u0099"+
		"\3\2\2\2\21\u00b6\3\2\2\2\23\u00c5\3\2\2\2\25\u00d0\3\2\2\2\27\u00d6\3"+
		"\2\2\2\31\u00fc\3\2\2\2\33\u010b\3\2\2\2\35\u010d\3\2\2\2\37\u0110\3\2"+
		"\2\2!\u0116\3\2\2\2#\u0123\3\2\2\2%\u0125\3\2\2\2\'\u0135\3\2\2\2)\u0150"+
		"\3\2\2\2+\u0152\3\2\2\2-\u0155\3\2\2\2/\u0158\3\2\2\2\61\u015b\3\2\2\2"+
		"\63\u015d\3\2\2\2\65\u015f\3\2\2\2\67\u0161\3\2\2\29=\7\'\2\2:<\n\2\2"+
		"\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\b\2\2"+
		"\2A\4\3\2\2\2BC\7Z\2\2CD\7<\2\2DH\3\2\2\2EG\5\37\20\2FE\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5\67\34\2LK\3\2\2\2MN\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\6\3\2\2\2PQ\7V\2\2QR\7<\2\2RV\3\2\2\2SU\5"+
		"\37\20\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2Y"+
		"[\n\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\b\3\2\2\2^_\7E\2"+
		"\2_`\7<\2\2`d\3\2\2\2ac\5\37\20\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eh\3\2\2\2fd\3\2\2\2gi\n\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2k\n\3\2\2\2lm\7N\2\2mn\7<\2\2nr\3\2\2\2oq\5\37\20\2po\3\2\2\2qt\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\5\67\34\2vu\3\2\2\2w"+
		"x\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\61\2\2{}\5\67\34\2|{\3\2\2"+
		"\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\f\3\2\2\2\u0080\u0081\7O\2\2\u0081"+
		"\u0082\7<\2\2\u0082\u0086\3\2\2\2\u0083\u0085\5\37\20\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0097\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0098\7E\2\2\u008a\u008b\7E\2"+
		"\2\u008b\u0098\7~\2\2\u008c\u008e\5\67\34\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\7\61\2\2\u0092\u0094\5\67\34\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0089\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008d\3\2\2\2\u0098"+
		"\16\3\2\2\2\u0099\u009a\7S\2\2\u009a\u009b\7<\2\2\u009b\u009f\3\2\2\2"+
		"\u009c\u009e\5\37\20\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00af\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\5\67\34\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\7\61\2\2\u00a8"+
		"\u00aa\5\67\34\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00b3\5\67\34\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\7X\2\2"+
		"\u00b7\u00b8\7<\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\5\37\20\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\n\5\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\22\3\2\2\2\u00c4\u00c6\5\67\34\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\7\61\2\2\u00ca\u00cc\5\67\34\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\24\3\2\2\2\u00cf"+
		"\u00d1\t\6\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\26\3\2\2\2\u00d4\u00d7\5\31\r\2\u00d5\u00d7"+
		"\5!\21\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00f3\3\2\2\2\u00d8"+
		"\u00f4\5\61\31\2\u00d9\u00db\5\67\34\2\u00da\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\5\61\31\2\u00df\u00f4\3\2\2\2\u00e0\u00e2\5\61\31\2\u00e1\u00e0"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5\67\34\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00f4\3\2\2\2\u00e8\u00ea\5\67\34\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\7\61\2\2\u00ee\u00f0\5\67\34\2\u00ef\u00ee\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00d8\3\2\2\2\u00f3\u00da\3\2\2\2\u00f3\u00e1\3\2\2\2\u00f3"+
		"\u00e9\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\30\3\2\2\2\u00f5\u00fd\7`\2\2"+
		"\u00f6\u00f7\7`\2\2\u00f7\u00fd\7`\2\2\u00f8\u00fd\7a\2\2\u00f9\u00fa"+
		"\7a\2\2\u00fa\u00fd\7a\2\2\u00fb\u00fd\7?\2\2\u00fc\u00f5\3\2\2\2\u00fc"+
		"\u00f6\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0109\t\7\2\2\u00ff"+
		"\u0101\7)\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u010a\3\2\2\2\u0104\u0106\7.\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010a\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0105\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\32\3\2\2\2\u010b\u010c\t\b\2\2\u010c\34\3\2\2\2\u010d"+
		"\u010e\7o\2\2\u010e\36\3\2\2\2\u010f\u0111\7\"\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\b\20\3\2\u0115 \3\2\2\2\u0116\u0117\7|\2\2\u0117"+
		"\"\3\2\2\2\u0118\u0124\7~\2\2\u0119\u011a\7~\2\2\u011a\u0124\7~\2\2\u011b"+
		"\u011c\7]\2\2\u011c\u0124\7~\2\2\u011d\u011e\7~\2\2\u011e\u0124\7_\2\2"+
		"\u011f\u0120\7<\2\2\u0120\u0124\7~\2\2\u0121\u0122\7~\2\2\u0122\u0124"+
		"\7<\2\2\u0123\u0118\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011b\3\2\2\2\u0123"+
		"\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124$\3\2\2\2"+
		"\u0125\u0126\7M\2\2\u0126\u0127\7<\2\2\u0127\u012b\3\2\2\2\u0128\u012a"+
		"\5\37\20\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130"+
		"\t\t\2\2\u012f\u0131\5\33\16\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2"+
		"\u0131\u0133\3\2\2\2\u0132\u0134\5\35\17\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134&\3\2\2\2\u0135\u0136\7y\2\2\u0136\u0137\7<\2\2\u0137\u0143"+
		"\3\2\2\2\u0138\u013a\7\"\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0142\3\2\2\2\u013d\u0142\t\n"+
		"\2\2\u013e\u013f\7^\2\2\u013f\u0142\7/\2\2\u0140\u0142\7~\2\2\u0141\u0139"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0149\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u0148\n\13\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a(\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\u014d\7]\2\2\u014d\u0151\7\63\2\2\u014e\u014f"+
		"\7]\2\2\u014f\u0151\7\64\2\2\u0150\u014c\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"*\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\7\64\2\2\u0154,\3\2\2\2\u0155"+
		"\u0156\7*\2\2\u0156\u0157\7\65\2\2\u0157.\3\2\2\2\u0158\u0159\7*\2\2\u0159"+
		"\u015a\7\66\2\2\u015a\60\3\2\2\2\u015b\u015c\7\61\2\2\u015c\62\3\2\2\2"+
		"\u015d\u015e\7]\2\2\u015e\64\3\2\2\2\u015f\u0160\7_\2\2\u0160\66\3\2\2"+
		"\2\u0161\u0162\4\62;\2\u01628\3\2\2\2\60\2=HNV\\djrx~\u0086\u008f\u0095"+
		"\u0097\u009f\u00a5\u00ab\u00af\u00b4\u00bc\u00c2\u00c7\u00cd\u00d2\u00d6"+
		"\u00dc\u00e1\u00e6\u00eb\u00f1\u00f3\u00fc\u0102\u0107\u0109\u0112\u0123"+
		"\u012b\u0130\u0133\u013b\u0141\u0143\u0149\u0150";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}