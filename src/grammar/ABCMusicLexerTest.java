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
		String[] expected = {"0123456789"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testBaseNotes() {
		String input = "C D E F G A B c d e f g a b";
		String[] expected = {"C", " ", "D", " ", "E", " ", "F", " ", "G", " ", "A", " ", "B", " ", "c", " ", "d", " ", "e", " ", "f", " ", "g", " ", "a", " ", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testAccidentals() {
		String input = "C#Bbab";
		String[] expected = {"C#", "Bb", "ab"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testMode() {
		String input = "Gm b";
		String[] expected = {"Gm", " ", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testSpace() {
		String input = "A  C   bb";
		String[] expected = {"A", " ", " ", "C", " ", " ", " ", "bb"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testRests() {
		String input = "ab z z C";
		String[] expected = {"ab", " ", "z", " ", "z", " ", "C"};
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
	
	@Test
	public void testFractions() {
	    String input = "3/4 1/2 2C";
	    String[] expected = {"3/4", " ", "1/2", " ", "2", "C"};
	    verifyLexer(input, expected);
	}
	
	@Test
    public void testKey() {
        String input = "Gbm";
        String[] expected = {"Gbm"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testTempo() {
        String input = "42 1/4=234C";
        String[] expected = {"42", " ", "1/4=234", "C"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testMeter() {
        String input = "CC| 4/4";
        String[] expected = {"C", "C|", " ", "4/4"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testBrackets() {
        String input = "[B1/2 G]";
        String[] expected = {"[", "B", "1/2", " ", "G", "]"};
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
