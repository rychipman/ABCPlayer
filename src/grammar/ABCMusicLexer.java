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
		COMMENT=1, FN_START=2, FTI_START=3, FC_START=4, FD_START=5, FM_START=6, 
		FTE_START=7, FV_START=8, FRACTION=9, LINEFEED=10, BASENOTE=11, KEYACCIDENTAL=12, 
		MODEMINOR=13, SPACE=14, REST=15, OCTAVE=16, ACCIDENTAL=17, BARLINE=18, 
		FK_START=19, LYRIC=20, LYRICAL_ELEMENT=21, NTH_REPEAT=22, TUPLET_START=23, 
		SLASH=24, L_BRACKET=25, R_BRACKET=26, DIGITS=27, DIGIT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "FN_START", "FTI_START", "FC_START", "FD_START", "FM_START", 
		"FTE_START", "FV_START", "FRACTION", "LINEFEED", "BASENOTE", "KEYACCIDENTAL", 
		"'m'", "SPACE", "'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", "FK_START", 
		"LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_START", "'/'", "'['", 
		"']'", "DIGITS", "DIGIT"
	};
	public static final String[] ruleNames = {
		"COMMENT", "FN_START", "FTI_START", "FC_START", "FD_START", "FM_START", 
		"FTE_START", "FV_START", "FRACTION", "LINEFEED", "BASENOTE", "KEYACCIDENTAL", 
		"MODEMINOR", "SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "FK_START", 
		"LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "TUPLET_START", "SLASH", "L_BRACKET", 
		"R_BRACKET", "DIGITS", "DIGIT"
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
		case 9: LINEFEED_action((RuleContext)_localctx, actionIndex); break;

		case 13: SPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINEFEED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\36\u013f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\3\2\6\2>\n\2\r\2\16\2?\3\2\3\2\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\6\4Y\n\4\r\4\16"+
		"\4Z\3\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\6\5g\n\5\r\5\16\5h\3\6"+
		"\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\6\6u\n\6\r\6\16\6v\3\6\3\6\6"+
		"\6{\n\6\r\6\16\6|\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3"+
		"\7\3\7\3\7\3\7\6\7\u008c\n\7\r\7\16\7\u008d\3\7\3\7\6\7\u0092\n\7\r\7"+
		"\16\7\u0093\5\7\u0096\n\7\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f"+
		"\13\b\3\b\6\b\u00a2\n\b\r\b\16\b\u00a3\3\b\3\b\6\b\u00a8\n\b\r\b\16\b"+
		"\u00a9\3\b\3\b\5\b\u00ae\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b6\n\t\f\t"+
		"\16\t\u00b9\13\t\3\t\6\t\u00bc\n\t\r\t\16\t\u00bd\3\n\6\n\u00c1\n\n\r"+
		"\n\16\n\u00c2\3\n\3\n\6\n\u00c7\n\n\r\n\16\n\u00c8\3\13\6\13\u00cc\n\13"+
		"\r\13\16\13\u00cd\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\6\21\u00df\n\21\r\21\16\21\u00e0\3\21\6\21\u00e4\n"+
		"\21\r\21\16\21\u00e5\5\21\u00e8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00f1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00fe\n\23\3\24\3\24\3\24\3\24\7\24\u0104\n\24\f\24\16\24\u0107"+
		"\13\24\3\24\3\24\5\24\u010b\n\24\3\24\5\24\u010e\n\24\3\25\3\25\3\25\3"+
		"\25\7\25\u0114\n\25\f\25\16\25\u0117\13\25\3\25\7\25\u011a\n\25\f\25\16"+
		"\25\u011d\13\25\3\26\6\26\u0120\n\26\r\26\16\26\u0121\3\26\3\26\3\26\3"+
		"\26\5\26\u0128\n\26\3\27\3\27\3\27\3\27\5\27\u012e\n\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u013a\n\34\r\34\16\34\u013b\3"+
		"\35\3\35\2\36\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\2\27\r\1\31\16\1\33\17\1\35\20\3\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1\3\2\f"+
		"\3\f\f\3\f\f\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\3\"\"\3\f\f\6,,//aa"+
		"\u0080\u0080\u016c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5C\3\2\2\2\7N\3\2\2\2\t\\\3\2\2\2\13j\3\2\2\2\r"+
		"~\3\2\2\2\17\u0097\3\2\2\2\21\u00b1\3\2\2\2\23\u00c0\3\2\2\2\25\u00cb"+
		"\3\2\2\2\27\u00d1\3\2\2\2\31\u00d3\3\2\2\2\33\u00d5\3\2\2\2\35\u00d7\3"+
		"\2\2\2\37\u00db\3\2\2\2!\u00e7\3\2\2\2#\u00f0\3\2\2\2%\u00fd\3\2\2\2\'"+
		"\u00ff\3\2\2\2)\u010f\3\2\2\2+\u0127\3\2\2\2-\u012d\3\2\2\2/\u012f\3\2"+
		"\2\2\61\u0132\3\2\2\2\63\u0134\3\2\2\2\65\u0136\3\2\2\2\67\u0139\3\2\2"+
		"\29\u013d\3\2\2\2;=\7\'\2\2<>\n\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@"+
		"\3\2\2\2@A\3\2\2\2AB\5\25\13\2B\4\3\2\2\2CD\7Z\2\2DE\7<\2\2EI\3\2\2\2"+
		"FH\5\35\17\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2"+
		"\2LM\5\67\34\2M\6\3\2\2\2NO\7V\2\2OP\7<\2\2PT\3\2\2\2QS\5\35\17\2RQ\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WY\n\3\2\2XW\3"+
		"\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\b\3\2\2\2\\]\7E\2\2]^\7<\2\2^b\3"+
		"\2\2\2_a\5\35\17\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2d"+
		"b\3\2\2\2eg\n\4\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\n\3\2\2\2"+
		"jk\7N\2\2kl\7<\2\2lp\3\2\2\2mo\5\35\17\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\59\35\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wx\3\2\2\2xz\7\61\2\2y{\59\35\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\f\3\2\2\2~\177\7O\2\2\177\u0080\7<\2\2\u0080\u0084\3\2\2"+
		"\2\u0081\u0083\5\35\17\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0095\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0096\7E\2\2\u0088\u0089\7E\2\2\u0089\u0096\7~\2\2\u008a\u008c"+
		"\59\35\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\61\2\2\u0090\u0092\5"+
		"9\35\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0087\3\2\2\2\u0095\u0088\3\2"+
		"\2\2\u0095\u008b\3\2\2\2\u0096\16\3\2\2\2\u0097\u0098\7S\2\2\u0098\u0099"+
		"\7<\2\2\u0099\u009d\3\2\2\2\u009a\u009c\5\35\17\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00ad"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\59\35\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\7\61\2\2\u00a6\u00a8\59\35\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\67\34\2\u00b0\20\3\2"+
		"\2\2\u00b1\u00b2\7X\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b6"+
		"\5\35\17\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc"+
		"\n\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\22\3\2\2\2\u00bf\u00c1\59\35\2\u00c0\u00bf\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c6\7\61\2\2\u00c5\u00c7\59\35\2\u00c6\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\24"+
		"\3\2\2\2\u00ca\u00cc\t\6\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\13"+
		"\2\2\u00d0\26\3\2\2\2\u00d1\u00d2\t\7\2\2\u00d2\30\3\2\2\2\u00d3\u00d4"+
		"\t\b\2\2\u00d4\32\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6\34\3\2\2\2\u00d7\u00d8"+
		"\t\t\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\17\3\2\u00da\36\3\2\2\2\u00db"+
		"\u00dc\7|\2\2\u00dc \3\2\2\2\u00dd\u00df\7)\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e8\3\2"+
		"\2\2\u00e2\u00e4\7.\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3\2"+
		"\2\2\u00e7\u00e3\3\2\2\2\u00e8\"\3\2\2\2\u00e9\u00f1\7`\2\2\u00ea\u00eb"+
		"\7`\2\2\u00eb\u00f1\7`\2\2\u00ec\u00f1\7a\2\2\u00ed\u00ee\7a\2\2\u00ee"+
		"\u00f1\7a\2\2\u00ef\u00f1\7?\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ea\3\2\2"+
		"\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1$"+
		"\3\2\2\2\u00f2\u00fe\7~\2\2\u00f3\u00f4\7~\2\2\u00f4\u00fe\7~\2\2\u00f5"+
		"\u00f6\7]\2\2\u00f6\u00fe\7~\2\2\u00f7\u00f8\7~\2\2\u00f8\u00fe\7_\2\2"+
		"\u00f9\u00fa\7<\2\2\u00fa\u00fe\7~\2\2\u00fb\u00fc\7~\2\2\u00fc\u00fe"+
		"\7<\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd"+
		"\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe&\3\2\2\2"+
		"\u00ff\u0100\7M\2\2\u0100\u0101\7<\2\2\u0101\u0105\3\2\2\2\u0102\u0104"+
		"\5\35\17\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a"+
		"\5\27\f\2\u0109\u010b\5\31\r\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u010d\3\2\2\2\u010c\u010e\5\33\16\2\u010d\u010c\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e(\3\2\2\2\u010f\u0110\7y\2\2\u0110\u0111\7<\2\2\u0111\u0115"+
		"\3\2\2\2\u0112\u0114\5+\26\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011a\n\n\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c*\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u0120\7\"\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0128\3\2\2\2\u0123\u0128\t\13\2\2"+
		"\u0124\u0125\7^\2\2\u0125\u0128\7/\2\2\u0126\u0128\7~\2\2\u0127\u011f"+
		"\3\2\2\2\u0127\u0123\3\2\2\2\u0127\u0124\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		",\3\2\2\2\u0129\u012a\7]\2\2\u012a\u012e\7\63\2\2\u012b\u012c\7]\2\2\u012c"+
		"\u012e\7\64\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e.\3\2\2\2"+
		"\u012f\u0130\7*\2\2\u0130\u0131\59\35\2\u0131\60\3\2\2\2\u0132\u0133\7"+
		"\61\2\2\u0133\62\3\2\2\2\u0134\u0135\7]\2\2\u0135\64\3\2\2\2\u0136\u0137"+
		"\7_\2\2\u0137\66\3\2\2\2\u0138\u013a\59\35\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c8\3\2\2\2"+
		"\u013d\u013e\4\62;\2\u013e:\3\2\2\2\'\2?ITZbhpv|\u0084\u008d\u0093\u0095"+
		"\u009d\u00a3\u00a9\u00ad\u00b7\u00bd\u00c2\u00c8\u00cd\u00e0\u00e5\u00e7"+
		"\u00f0\u00fd\u0105\u010a\u010d\u0115\u011b\u0121\u0127\u012d\u013b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}