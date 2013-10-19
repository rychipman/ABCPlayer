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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, EOL=14, LINEFEED=15, TEXT=16, DIGIT=17, 
		BASENOTE=18, KEYACCIDENTAL=19, MODEMINOR=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'%'", "'C'", "'L:'", "'C:'", "'K:'", "'X:'", "'/'", "'='", "'V:'", "'T:'", 
		"'M:'", "'C|'", "'Q:'", "EOL", "LINEFEED", "TEXT", "DIGIT", "BASENOTE", 
		"KEYACCIDENTAL", "'m'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "EOL", "LINEFEED", "TEXT", "DIGIT", "BASENOTE", 
		"KEYACCIDENTAL", "MODEMINOR"
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
		"\2\4\26q\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\7\17P\n"+
		"\17\f\17\16\17S\13\17\3\17\6\17V\n\17\r\17\16\17W\3\17\7\17[\n\17\f\17"+
		"\16\17^\13\17\3\20\6\20a\n\20\r\20\16\20b\3\21\6\21f\n\21\r\21\16\21g"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3g\26\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1\3\2\b\4\13\13\"\"\3\f\f\3\17"+
		"\17\4\13\f\17\17\4CIci\4%%ddu\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3"+
		"+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2\r8\3\2\2\2"+
		"\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25B\3\2\2\2\27E\3\2\2\2\31H\3\2\2"+
		"\2\33K\3\2\2\2\35Q\3\2\2\2\37`\3\2\2\2!e\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'"+
		"m\3\2\2\2)o\3\2\2\2+,\7\'\2\2,\4\3\2\2\2-.\7E\2\2.\6\3\2\2\2/\60\7N\2"+
		"\2\60\61\7<\2\2\61\b\3\2\2\2\62\63\7E\2\2\63\64\7<\2\2\64\n\3\2\2\2\65"+
		"\66\7M\2\2\66\67\7<\2\2\67\f\3\2\2\289\7Z\2\29:\7<\2\2:\16\3\2\2\2;<\7"+
		"\61\2\2<\20\3\2\2\2=>\7?\2\2>\22\3\2\2\2?@\7X\2\2@A\7<\2\2A\24\3\2\2\2"+
		"BC\7V\2\2CD\7<\2\2D\26\3\2\2\2EF\7O\2\2FG\7<\2\2G\30\3\2\2\2HI\7E\2\2"+
		"IJ\7~\2\2J\32\3\2\2\2KL\7S\2\2LM\7<\2\2M\34\3\2\2\2NP\t\2\2\2ON\3\2\2"+
		"\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\t\3\2\2UT\3\2\2"+
		"\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]\36\3\2\2\2^\\\3\2\2\2_a\t\5\2\2`_\3\2\2\2"+
		"ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c \3\2\2\2df\13\2\2\2ed\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2ge\3\2\2\2h\"\3\2\2\2ij\4\62;\2j$\3\2\2\2kl\t\6\2\2l&\3\2"+
		"\2\2mn\t\7\2\2n(\3\2\2\2op\7o\2\2p*\3\2\2\2\b\2QW\\bg";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}