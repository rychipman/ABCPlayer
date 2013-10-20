package grammar;

import static org.junit.Assert.*;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class ABCMusicLexerTest {
	
	/** Testing Strategy for Lexer:
	 * Make sure that the lexer properly tokenizes each character/combinaiton ofcharacters it
	 * ought to, and make sure it throws an exception if it gets illegal characters.
	 */
	
	@Test
	public void testDigits() {
		String input = "0123456789";
		String[] expected = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testNotes() {
		String input = "C D E F G A B c d e f g a b";
		String[] expected = {"C", " ", "D", " ", "E", " ", "F", " ", "G", " ", "A", " ", "B", " ", "c", " ", "d", " ", "e", " ", "f", " ", "g", " ", "a", " ", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testKeyAccidentals() {
		String input = "C#Bbab";
		String[] expected = {"C", "#", "B", "b", "a", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testMode() {
		String input = "Gbm";
		String[] expected = {"G", "b", "m"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testSpace() {
		String input = "A  C   bb";
		String[] expected = {"A", " ", " ", "C", " ", " ", " ", "b", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testRests() {
		String input = "ab z z C";
		String[] expected = {"a", "b", " ", "z", " ", "z", " ", "C"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testOctaves() {
		String input = "' ''' , ,,,";
		String[] expected = {"'", " ", "'''", " ", ",", " ", ",,,"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testAccidental() {
		String input = "^ ^^ _ __ =";
		String[] expected = {"^", " ", "^^", " ", "_", " ", "__", " ", "="};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testBarline() {
		String input = "| || [| |] |: :||";
		String[] expected = {"|", " ", "||", " ", "[|", " ", "|]", " ", "|:", " ", ":|", "|"};
		verifyLexer(input, expected);
	}
	
//	@Test(expected=RuntimeException.class)
//	public void testExceptions() {
//		verifyLexer("z?()()qx", new String[8]);
//	}
	
	public void verifyLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicLexer lexer = new ABCMusicLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());
        
        for(int i = 0; i < actualTokens.size(); i++) {
             String actualToken = actualTokens.get(i).getText();
             String expectedToken = expectedTokens[i];
             assertEquals(actualToken, expectedToken);
        }
    }
}
