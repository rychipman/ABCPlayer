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
		"\2\4\34\u014f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3\2\7\2:\n\2\f\2\16"+
		"\2=\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\7\4P\n\4\f\4\16\4S\13\4\3\4\6\4V\n\4\r\4\16\4W\3\5\3\5\3\5"+
		"\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\6\5d\n\5\r\5\16\5e\3\6\3\6\3\6\3\6\7"+
		"\6l\n\6\f\6\16\6o\13\6\3\6\6\6r\n\6\r\6\16\6s\3\6\3\6\6\6x\n\6\r\6\16"+
		"\6y\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\7\3\7\3\7\3\7"+
		"\6\7\u0089\n\7\r\7\16\7\u008a\3\7\3\7\6\7\u008f\n\7\r\7\16\7\u0090\5\7"+
		"\u0093\n\7\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\b\6\b\u009f"+
		"\n\b\r\b\16\b\u00a0\3\b\3\b\6\b\u00a5\n\b\r\b\16\b\u00a6\3\b\3\b\5\b\u00ab"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\t\6\t"+
		"\u00b9\n\t\r\t\16\t\u00ba\3\n\6\n\u00be\n\n\r\n\16\n\u00bf\3\n\3\n\6\n"+
		"\u00c4\n\n\r\n\16\n\u00c5\3\13\6\13\u00c9\n\13\r\13\16\13\u00ca\3\f\3"+
		"\f\5\f\u00cf\n\f\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\6\f\u00d7\n\f\r\f\16\f"+
		"\u00d8\3\f\3\f\6\f\u00dd\n\f\r\f\16\f\u00de\5\f\u00e1\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00ea\n\r\3\r\3\r\6\r\u00ee\n\r\r\r\16\r\u00ef\3"+
		"\r\6\r\u00f3\n\r\r\r\16\r\u00f4\5\r\u00f7\n\r\3\16\3\16\3\17\3\17\3\20"+
		"\6\20\u00fe\n\20\r\20\16\20\u00ff\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0111\n\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23\3\23\5\23\u011e\n\23"+
		"\3\23\5\23\u0121\n\23\3\24\3\24\3\24\3\24\6\24\u0127\n\24\r\24\16\24\u0128"+
		"\3\24\3\24\3\24\3\24\7\24\u012f\n\24\f\24\16\24\u0132\13\24\3\24\7\24"+
		"\u0135\n\24\f\24\16\24\u0138\13\24\3\25\3\25\3\25\3\25\5\25\u013e\n\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u014a\n\32\r\32"+
		"\16\32\u014b\3\33\3\33\2\34\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\3!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\3"+
		"\2\f\3\f\f\3\f\f\3\f\f\3\f\f\4\13\f\17\17\4CIci\4%%dd\4CIci\6,,//aa\u0080"+
		"\u0080\3\f\f\u0186\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\5@\3\2\2\2\7K\3\2\2\2\tY\3\2\2\2\13g\3\2\2\2\r{\3\2\2\2\17\u0094\3\2"+
		"\2\2\21\u00ae\3\2\2\2\23\u00bd\3\2\2\2\25\u00c8\3\2\2\2\27\u00ce\3\2\2"+
		"\2\31\u00e9\3\2\2\2\33\u00f8\3\2\2\2\35\u00fa\3\2\2\2\37\u00fd\3\2\2\2"+
		"!\u0103\3\2\2\2#\u0110\3\2\2\2%\u0112\3\2\2\2\'\u0122\3\2\2\2)\u013d\3"+
		"\2\2\2+\u013f\3\2\2\2-\u0142\3\2\2\2/\u0144\3\2\2\2\61\u0146\3\2\2\2\63"+
		"\u0149\3\2\2\2\65\u014d\3\2\2\2\67;\7\'\2\28:\n\2\2\298\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\2\2\2?\4\3\2\2\2@A\7"+
		"Z\2\2AB\7<\2\2BF\3\2\2\2CE\5\37\20\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\63\32\2J\6\3\2\2\2KL\7V\2\2LM\7<\2\2MQ"+
		"\3\2\2\2NP\5\37\20\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2"+
		"SQ\3\2\2\2TV\n\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\b\3\2\2"+
		"\2YZ\7E\2\2Z[\7<\2\2[_\3\2\2\2\\^\5\37\20\2]\\\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\n\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\n\3\2\2\2gh\7N\2\2hi\7<\2\2im\3\2\2\2jl\5\37\20\2kj\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pr\5\65\33\2q"+
		"p\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\7\61\2\2vx\5\65\33"+
		"\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\f\3\2\2\2{|\7O\2\2|}\7<\2"+
		"\2}\u0081\3\2\2\2~\u0080\5\37\20\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0092\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0093\7E\2\2\u0085\u0086\7E\2\2\u0086\u0093\7~\2\2\u0087\u0089"+
		"\5\65\33\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\61\2\2\u008d\u008f"+
		"\5\65\33\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0085"+
		"\3\2\2\2\u0092\u0088\3\2\2\2\u0093\16\3\2\2\2\u0094\u0095\7S\2\2\u0095"+
		"\u0096\7<\2\2\u0096\u009a\3\2\2\2\u0097\u0099\5\37\20\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00aa\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\65\33\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\7\61\2\2\u00a3\u00a5\5\65\33\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00ab\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\63\32\2\u00ad"+
		"\20\3\2\2\2\u00ae\u00af\7X\2\2\u00af\u00b0\7<\2\2\u00b0\u00b4\3\2\2\2"+
		"\u00b1\u00b3\5\37\20\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b9\n\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\22\3\2\2\2\u00bc\u00be\5\65\33\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7\61\2\2\u00c2\u00c4\5\65\33\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\24\3\2\2\2\u00c7\u00c9\t\6\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\26\3\2\2\2\u00cc"+
		"\u00cf\5\31\r\2\u00cd\u00cf\5!\21\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3"+
		"\2\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00e1\5-\27\2\u00d1\u00d3\5-\27\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e1\5\63"+
		"\32\2\u00d5\u00d7\5\65\33\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\61"+
		"\2\2\u00db\u00dd\5\65\33\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d0\3\2"+
		"\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\30\3\2\2\2\u00e2\u00ea\7`\2\2\u00e3\u00e4\7`\2\2\u00e4\u00ea\7`\2\2\u00e5"+
		"\u00ea\7a\2\2\u00e6\u00e7\7a\2\2\u00e7\u00ea\7a\2\2\u00e8\u00ea\7?\2\2"+
		"\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00f6\t\7\2\2\u00ec\u00ee\7)\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f7\3\2\2\2\u00f1"+
		"\u00f3\7.\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\32\3\2\2\2\u00f8\u00f9\t\b\2"+
		"\2\u00f9\34\3\2\2\2\u00fa\u00fb\7o\2\2\u00fb\36\3\2\2\2\u00fc\u00fe\7"+
		"\"\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\20\3\2\u0102 \3\2\2\2"+
		"\u0103\u0104\7|\2\2\u0104\"\3\2\2\2\u0105\u0111\7~\2\2\u0106\u0107\7~"+
		"\2\2\u0107\u0111\7~\2\2\u0108\u0109\7]\2\2\u0109\u0111\7~\2\2\u010a\u010b"+
		"\7~\2\2\u010b\u0111\7_\2\2\u010c\u010d\7<\2\2\u010d\u0111\7~\2\2\u010e"+
		"\u010f\7~\2\2\u010f\u0111\7<\2\2\u0110\u0105\3\2\2\2\u0110\u0106\3\2\2"+
		"\2\u0110\u0108\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111$\3\2\2\2\u0112\u0113\7M\2\2\u0113\u0114\7<\2\2\u0114\u0118"+
		"\3\2\2\2\u0115\u0117\5\37\20\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011d\t\t\2\2\u011c\u011e\5\33\16\2\u011d\u011c\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\5\35\17\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121&\3\2\2\2\u0122\u0123\7y\2\2\u0123\u0124"+
		"\7<\2\2\u0124\u0130\3\2\2\2\u0125\u0127\7\"\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012f\3\2"+
		"\2\2\u012a\u012f\t\n\2\2\u012b\u012c\7^\2\2\u012c\u012f\7/\2\2\u012d\u012f"+
		"\7~\2\2\u012e\u0126\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\n\13\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137(\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7]\2\2\u013a\u013e"+
		"\7\63\2\2\u013b\u013c\7]\2\2\u013c\u013e\7\64\2\2\u013d\u0139\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e*\3\2\2\2\u013f\u0140\7*\2\2\u0140\u0141\5\65"+
		"\33\2\u0141,\3\2\2\2\u0142\u0143\7\61\2\2\u0143.\3\2\2\2\u0144\u0145\7"+
		"]\2\2\u0145\60\3\2\2\2\u0146\u0147\7_\2\2\u0147\62\3\2\2\2\u0148\u014a"+
		"\5\65\33\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\64\3\2\2\2\u014d\u014e\4\62;\2\u014e\66\3\2"+
		"\2\2-\2;FQW_emsy\u0081\u008a\u0090\u0092\u009a\u00a0\u00a6\u00aa\u00b4"+
		"\u00ba\u00bf\u00c5\u00ca\u00ce\u00d2\u00d8\u00de\u00e0\u00e9\u00ef\u00f4"+
		"\u00f6\u00ff\u0110\u0118\u011d\u0120\u0128\u012e\u0130\u0136\u013d\u014b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}