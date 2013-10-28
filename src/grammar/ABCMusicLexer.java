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
		LINEFEED=1, TEXT=2, DIGIT=3, BASENOTE=4, KEYACCIDENTAL=5, MODEMINOR=6, 
		SPACE=7, REST=8, OCTAVE=9, ACCIDENTAL=10, BARLINE=11, FRACTION=12, DIGITS=13, 
		KEY=14, METER=15, COMMENT=16, FN_START=17, FTI_START=18, FC_START=19, 
		FD_START=20, FM_START=21, FTE_START=22, FV_START=23, FK_START=24, LYRIC=25, 
		LYRICAL_ELEMENT=26, NTH_REPEAT=27, TUPLET_SPEC=28, SLASH=29, L_BRACKET=30, 
		R_BRACKET=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"LINEFEED", "'Piece No.1'", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "'m'", 
		"SPACE", "'z'", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "DIGITS", 
		"KEY", "METER", "COMMENT", "FN_START", "FTI_START", "FC_START", "FD_START", 
		"FM_START", "FTE_START", "FV_START", "FK_START", "LYRIC", "LYRICAL_ELEMENT", 
		"NTH_REPEAT", "TUPLET_SPEC", "'/'", "'['", "']'"
	};
	public static final String[] ruleNames = {
		"LINEFEED", "TEXT", "DIGIT", "BASENOTE", "KEYACCIDENTAL", "MODEMINOR", 
		"SPACE", "REST", "OCTAVE", "ACCIDENTAL", "BARLINE", "FRACTION", "DIGITS", 
		"KEY", "METER", "COMMENT", "FN_START", "FTI_START", "FC_START", "FD_START", 
		"FM_START", "FTE_START", "FV_START", "FK_START", "LYRIC", "LYRICAL_ELEMENT", 
		"NTH_REPEAT", "TUPLET_SPEC", "SLASH", "L_BRACKET", "R_BRACKET"
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
		"\2\4!\u0111\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \3\2\6\2C\n\2\r\2\16\2D\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\6\n_\n\n\r\n\16\n`\3\n\6\nd\n\n\r\n\16\ne\5\nh\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f~\n\f\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3\r\6\r\u0087\n\r\r\r\16"+
		"\r\u0088\3\16\6\16\u008c\n\16\r\16\16\16\u008d\3\17\3\17\5\17\u0092\n"+
		"\17\3\17\5\17\u0095\n\17\3\20\3\20\3\20\3\20\5\20\u009b\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00a5\n\22\f\22\16\22\u00a8\13\22"+
		"\3\23\3\23\3\23\3\23\7\23\u00ae\n\23\f\23\16\23\u00b1\13\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00b7\n\24\f\24\16\24\u00ba\13\24\3\25\3\25\3\25\3\25"+
		"\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25\3\26\3\26\3\26\3\26\7\26\u00c9"+
		"\n\26\f\26\16\26\u00cc\13\26\3\27\3\27\3\27\3\27\7\27\u00d2\n\27\f\27"+
		"\16\27\u00d5\13\27\3\27\3\27\3\27\5\27\u00da\n\27\3\30\3\30\3\30\3\30"+
		"\7\30\u00e0\n\30\f\30\16\30\u00e3\13\30\3\31\3\31\3\31\3\31\7\31\u00e9"+
		"\n\31\f\31\16\31\u00ec\13\31\3\32\3\32\3\32\3\32\7\32\u00f2\n\32\f\32"+
		"\16\32\u00f5\13\32\3\33\6\33\u00f8\n\33\r\33\16\33\u00f9\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3\34\3\34\5\34\u0107\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \2!\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1\3\2\7\4\13\f\17\17\4CIci\4%%dd\3\"\""+
		"\6,,//aa\u0080\u0080\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3B\3\2\2\2\5F\3\2"+
		"\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2"+
		"\2\2\23g\3\2\2\2\25p\3\2\2\2\27}\3\2\2\2\31\u0080\3\2\2\2\33\u008b\3\2"+
		"\2\2\35\u008f\3\2\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u00a0\3\2\2\2%"+
		"\u00a9\3\2\2\2\'\u00b2\3\2\2\2)\u00bb\3\2\2\2+\u00c4\3\2\2\2-\u00cd\3"+
		"\2\2\2/\u00db\3\2\2\2\61\u00e4\3\2\2\2\63\u00ed\3\2\2\2\65\u0100\3\2\2"+
		"\2\67\u0106\3\2\2\29\u0108\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u010f"+
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
		"\3\2\2\2\u0089\32\3\2\2\2\u008a\u008c\5\7\4\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\34\3\2\2"+
		"\2\u008f\u0091\5\t\5\2\u0090\u0092\5\13\6\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\r\7\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\36\3\2\2\2\u0096\u009b\7E\2\2\u0097\u0098"+
		"\7E\2\2\u0098\u009b\7~\2\2\u0099\u009b\5\31\r\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b \3\2\2\2\u009c\u009d\7\'\2\2"+
		"\u009d\u009e\5\5\3\2\u009e\u009f\5\3\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7"+
		"Z\2\2\u00a1\u00a2\7<\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\5\17\b\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7$\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab"+
		"\7<\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\5\17\b\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0&\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b3\7E\2\2\u00b3\u00b4\7<\2\2\u00b4\u00b8"+
		"\3\2\2\2\u00b5\u00b7\5\17\b\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9(\3\2\2\2\u00ba\u00b8\3"+
		"\2\2\2\u00bb\u00bc\7N\2\2\u00bc\u00bd\7<\2\2\u00bd\u00c1\3\2\2\2\u00be"+
		"\u00c0\5\17\b\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2*\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\7O\2\2\u00c5\u00c6\7<\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\5\17\b\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb,\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7S\2\2\u00ce\u00cf"+
		"\7<\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d2\5\17\b\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d9\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\5\31\r\2\u00d7\u00d8\7?\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da.\3\2\2\2"+
		"\u00db\u00dc\7X\2\2\u00dc\u00dd\7<\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0"+
		"\5\17\b\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\60\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\7M\2\2\u00e5\u00e6\7<\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\5\17\b\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\62\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef"+
		"\7<\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\5\65\33\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\64"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\"\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0101\3\2"+
		"\2\2\u00fb\u0101\t\6\2\2\u00fc\u00fd\7^\2\2\u00fd\u0101\7/\2\2\u00fe\u0101"+
		"\7~\2\2\u00ff\u0101\5\5\3\2\u0100\u00f7\3\2\2\2\u0100\u00fb\3\2\2\2\u0100"+
		"\u00fc\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\66\3\2\2"+
		"\2\u0102\u0103\7]\2\2\u0103\u0107\7\63\2\2\u0104\u0105\7]\2\2\u0105\u0107"+
		"\7\64\2\2\u0106\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u01078\3\2\2\2\u0108"+
		"\u0109\7*\2\2\u0109\u010a\5\7\4\2\u010a:\3\2\2\2\u010b\u010c\7\61\2\2"+
		"\u010c<\3\2\2\2\u010d\u010e\7]\2\2\u010e>\3\2\2\2\u010f\u0110\7_\2\2\u0110"+
		"@\3\2\2\2\34\2D`egp}\u0082\u0088\u008d\u0091\u0094\u009a\u00a6\u00af\u00b8"+
		"\u00c1\u00ca\u00d3\u00d9\u00e1\u00ea\u00f3\u00f9\u0100\u0106";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}