package grammar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
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
		String[] expected = {"C",  "D", "E", "F", "G", "A", "B", "c", "d", "e", "f", "g", "a", "b"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testAccidentals() {
		String input = "C' B,";
		String[] expected = {"C", "'",  "B", ","};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testMode() {
		String input = "K: Gm";
		String[] expected = {"K: Gm"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testRests() {
		String input = "z z C";
		String[] expected = {"z", "z", "C"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testOctaves() {
		String input = "' ''' , ,,,";
		String[] expected = {"'", "'''", ",", ",,,"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testAccidental() {
		String input = "^ ^^ _ __ =";
		String[] expected = {"^", "^^",  "_", "__",  "="};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testBarline() {
		String input = "| || [| |] |: :||";
		String[] expected = {"|", "||", "[|", "|]", "|:", ":|", "|"};
		verifyLexer(input, expected);
	}
	
	@Test
	public void testFractions() {
	    String input = "3/4 1/2 2C";
	    String[] expected = {"3/4", "1/2", "2", "C"};
	    verifyLexer(input, expected);
	}
	
	@Test
    public void testKey() {
        String input = "K: Gm";
        String[] expected = {"K: Gm"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testTempo() {
        String input = "1/4=234";
        String[] expected = {"1/4", "=", "234"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testMeter() {
        String input = "M: C|";
        String[] expected = {"M: C|"};
        verifyLexer(input, expected);
    }
	
	@Test
    public void testBrackets() {
        String input = "[B1/2 G]";
        String[] expected = {"[", "B", "1/2", "G", "]"};
        verifyLexer(input, expected);
    }
	
	@Test
	public void testLinefeed() {
	    String input = "\t\r\n";
	    String[] expected = {};
	    verifyLexer(input, expected);
	}
	
	@Test
	public void testFullPiece(){
	    byte[] encoded;
        try {
            encoded = Files.readAllBytes(Paths.get(ABCMusicParserTest.songFileNames[0]));
            String input = Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();
            CharStream stream = new ANTLRInputStream(input);
            ABCMusicLexer lexer = new ABCMusicLexer(stream);
            lexer.reportErrorsAsExceptions();
            List<? extends Token> actualTokens = lexer.getAllTokens();            
            for(int i = 0; i < actualTokens.size(); i++) {
                 String actualToken = actualTokens.get(i).getText();
                 System.out.println(actualToken);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
	}
	
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
