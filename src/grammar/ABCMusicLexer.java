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
		LINEFEED=1, DIGITS=2, DIGIT=3, BASENOTE=4, KEYACCIDENTAL=5, MODEMINOR=6, 
		SPACE=7, REST=8, OCTAVE=9, ACCIDENTAL=10, BARLINE=11, FRACTION=12, COMMENT=13, 
		FN_START=14, FTI_START=15, FC_START=16, FD_START=17, FM_START=18, FTE_START=19, 
		FV_START=20, FK_START=21, LYRIC=22, LYRICAL_ELEMENT=23, NTH_REPEAT=24, 
		L_PAREN=25, SLASH=26, L_BRACKET=27, R_BRACKET=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINEFEED", "DIGITS", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", "SPACE", 
		"'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "COMMENT", "FN_START", 
		"FTI_START", "FC_START", "FD_START", "FM_START", "FTE_START", "FV_START", 
		"FK_START", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "'('", "'/'", "'['", 
		"']'"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "DIGITS", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "MODEMINOR", 
		"SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "COMMENT", 
		"FN_START", "FTI_START", "FC_START", "FD_START", "FM_START", "FTE_START", 
		"FV_START", "FK_START", "LYRIC", "LYRICAL_ELEMENT", "NTH_REPEAT", "L_PAREN", 
		"SLASH", "L_BRACKET", "R_BRACKET"
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
		"\2\4\36\u0117\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2"+
		"\6\2=\n\2\r\2\16\2>\3\3\6\3B\n\3\r\3\16\3C\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\6\nS\n\n\r\n\16\nT\3\n\6\nX\n\n\r\n\16\nY\5\n"+
		"\\\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13e\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fr\n\f\3\r\6\ru\n\r\r\r\16\rv\3\r\3\r\6\r"+
		"{\n\r\r\r\16\r|\3\16\3\16\6\16\u0081\n\16\r\16\16\16\u0082\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17\u008b\n\17\f\17\16\17\u008e\13\17\3\20\3\20\3"+
		"\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20\3\20\6\20\u009a\n\20\r"+
		"\20\16\20\u009b\3\21\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13"+
		"\21\3\21\6\21\u00a8\n\21\r\21\16\21\u00a9\3\22\3\22\3\22\3\22\7\22\u00b0"+
		"\n\22\f\22\16\22\u00b3\13\22\3\23\3\23\3\23\3\23\7\23\u00b9\n\23\f\23"+
		"\16\23\u00bc\13\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00c8\n\24\f\24\16\24\u00cb\13\24\3\24\3\24\3\24\5\24\u00d0"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u00d6\n\25\f\25\16\25\u00d9\13\25\3\25"+
		"\6\25\u00dc\n\25\r\25\16\25\u00dd\3\26\3\26\3\26\3\26\7\26\u00e4\n\26"+
		"\f\26\16\26\u00e7\13\26\3\26\3\26\5\26\u00eb\n\26\3\26\5\26\u00ee\n\26"+
		"\3\27\3\27\3\27\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27\3\27\7\27"+
		"\u00fa\n\27\f\27\16\27\u00fd\13\27\3\30\6\30\u0100\n\30\r\30\16\30\u0101"+
		"\3\30\3\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\5\31\u010e\n"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\2\36\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1\3\2\f\4\13\f\17\17\4CIci\4%%dd\3\"\"\3"+
		"\f\f\3\f\f\3\f\f\3\f\f\3\f\f\6,,//aa\u0080\u0080\u013e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3<\3\2\2\2\5A\3\2\2\2"+
		"\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2"+
		"\23[\3\2\2\2\25d\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33~\3\2\2\2\35\u0086"+
		"\3\2\2\2\37\u008f\3\2\2\2!\u009d\3\2\2\2#\u00ab\3\2\2\2%\u00b4\3\2\2\2"+
		"\'\u00c3\3\2\2\2)\u00d1\3\2\2\2+\u00df\3\2\2\2-\u00ef\3\2\2\2/\u0107\3"+
		"\2\2\2\61\u010d\3\2\2\2\63\u010f\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2"+
		"\2\29\u0115\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\4\3\2\2\2@B\5\7\4\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\6\3\2\2"+
		"\2EF\4\62;\2F\b\3\2\2\2GH\t\3\2\2H\n\3\2\2\2IJ\t\4\2\2J\f\3\2\2\2KL\7"+
		"o\2\2L\16\3\2\2\2MN\t\5\2\2N\20\3\2\2\2OP\7|\2\2P\22\3\2\2\2QS\7)\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\\\3\2\2\2VX\7.\2\2WV\3\2\2\2"+
		"XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[R\3\2\2\2[W\3\2\2\2\\\24\3\2"+
		"\2\2]e\7`\2\2^_\7`\2\2_e\7`\2\2`e\7a\2\2ab\7a\2\2be\7a\2\2ce\7?\2\2d]"+
		"\3\2\2\2d^\3\2\2\2d`\3\2\2\2da\3\2\2\2dc\3\2\2\2e\26\3\2\2\2fr\7~\2\2"+
		"gh\7~\2\2hr\7~\2\2ij\7]\2\2jr\7~\2\2kl\7~\2\2lr\7_\2\2mn\7<\2\2nr\7~\2"+
		"\2op\7~\2\2pr\7<\2\2qf\3\2\2\2qg\3\2\2\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2"+
		"qo\3\2\2\2r\30\3\2\2\2su\5\7\4\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wx\3\2\2\2xz\7\61\2\2y{\5\7\4\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\32\3\2\2\2~\u0080\7\'\2\2\177\u0081\n\6\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\5\3\2\2\u0085\34\3\2\2\2\u0086\u0087\7Z\2\2\u0087\u0088"+
		"\7<\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\17\b\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\36\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008f\u0090\7V\2\2\u0090\u0091\7<\2\2\u0091\u0095"+
		"\3\2\2\2\u0092\u0094\5\17\b\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\n\7\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2\u009d\u009e\7E\2\2\u009e"+
		"\u009f\7<\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\5\17\b\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\n\b\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\"\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7<\2\2\u00ad\u00b1\3\2\2\2\u00ae"+
		"\u00b0\5\17\b\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2$\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\7O\2\2\u00b5\u00b6\7<\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\5\17\b\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\7E\2\2\u00be"+
		"\u00bf\7E\2\2\u00bf\u00c2\7~\2\2\u00c0\u00c2\5\31\r\2\u00c1\u00bd\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2&\3\2\2\2\u00c3\u00c4"+
		"\7S\2\2\u00c4\u00c5\7<\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\5\17\b\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cf\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\31\r\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7X\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d7"+
		"\3\2\2\2\u00d4\u00d6\5\17\b\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dc\n\t\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de*\3\2\2\2\u00df\u00e0\7M\2\2\u00e0"+
		"\u00e1\7<\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\5\17\b\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\5\t\5\2\u00e9\u00eb\5\13"+
		"\6\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00ee\5\r\7\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee,\3\2\2\2"+
		"\u00ef\u00f0\7y\2\2\u00f0\u00f1\7<\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4"+
		"\5/\30\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\n\n"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc.\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7\"\2\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0108\3\2\2\2\u0103\u0108\t\13\2\2\u0104\u0105\7^\2\2\u0105"+
		"\u0108\7/\2\2\u0106\u0108\7~\2\2\u0107\u00ff\3\2\2\2\u0107\u0103\3\2\2"+
		"\2\u0107\u0104\3\2\2\2\u0107\u0106\3\2\2\2\u0108\60\3\2\2\2\u0109\u010a"+
		"\7]\2\2\u010a\u010e\7\63\2\2\u010b\u010c\7]\2\2\u010c\u010e\7\64\2\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e\62\3\2\2\2\u010f\u0110\7*\2\2"+
		"\u0110\64\3\2\2\2\u0111\u0112\7\61\2\2\u0112\66\3\2\2\2\u0113\u0114\7"+
		"]\2\2\u01148\3\2\2\2\u0115\u0116\7_\2\2\u0116:\3\2\2\2!\2>CTY[dqv|\u0082"+
		"\u008c\u0095\u009b\u00a3\u00a9\u00b1\u00ba\u00c1\u00c9\u00cf\u00d7\u00dd"+
		"\u00e5\u00ea\u00ed\u00f5\u00fb\u0101\u0107\u010d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}