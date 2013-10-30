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
	 * 
	 * Partitioning the input space:
	 * 
	 * We must be able to lex:
	 * - Field number
	 * - Field title
	 * - Field composer
	 * - Field default length
	 * - Field meter
	 * - Field tempo
	 * - Field voice
	 * - Fraction
	 * - Linefeed
	 * - Note
	 * - Pitch
	 * - Key Accidental
	 * - Mode Minor
	 * - Rest
	 * - Barline
	 * - Field Key
	 * - Lyric
	 * - Nth Repeat
	 * - Duplet
	 * - Triplet
	 * - Quadruplet
	 * - Slash
	 * - L_Bracket
	 * - R_Bracket
	 * - Digit
	 */
	
    @Test
    public void testFieldNumber(){
        String input = "X: 2";
        String[] expected = {"X: 2"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testFieldTitle(){
        String input = "T: Some Title that I came up with just now";
        String[] expected = {"T: Some Title that I came up with just now"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testFieldComposer(){
        String input = "C: Some Composer that I came up with just now";
        String[] expected = {"C: Some Composer that I came up with just now"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testFieldDefaultLength(){
        String input = "L: 1/4";
        String[] expected = {"L: 1/4"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testMeter() {
        String input = "M: C|";
        String[] expected = {"M: C|"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testTempo() {
        String input = "Q:1/4=234";
        String[] expected = {"Q:1/4=234"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testVoice() {
        String input = "w: Amazing Grace";
        String[] expected = {"w: Amazing Grace"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testFraction() {
        String input = "3/4 1/2 2C";
        String[] expected = {"3/4", "1/2", "2", "C"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testLinefeed() {
        String input = "\t\r\n";
        String[] expected = {"\t\r\n"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testNote() {
        String input = "^C ^^D _E __F =G A B c d e f g a b";
        String[] expected = {"^C",  "^^D", "_E", "__F", "=G", "A", "B", "c", "d", "e", "f", "g", "a", "b"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testPitch() {
        String input = "z ^c c3/4";
        String[] expected = {"z", "^c", "c3/4"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testKeyAccidental() {
        String input = "# C b";
        String[] expected = {"#", "C", "b"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testModeMinor() {
        String input = "m";
        String[] expected = {"m"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testRest() {
        String input = "z C z";
        String[] expected = {"z", "C", "z"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testBarline() {
        String input = "| || [| |] |: :||";
        String[] expected = {"|", "||", "[|", "|]", "|:", ":|", "|"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testFieldKey() {
        String input = "K: C#m";
        String[] expected = {"K: C#m"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testLyric() {
        String input = "w: Amazing Grace";
        String[] expected = {"w: Amazing Grace"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testNthRepeat() {
        String input = "[1 [2";
        String[] expected = {"[1", "[2"};
        verifyLexer(input, expected);
    }
        
    @Test
    public void testDuplet() {
        String input = "(2";
        String[] expected = {"(2"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testTriplet() {
        String input = "(3";
        String[] expected = {"(3"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testQuadruplet() {
        String input = "(4";
        String[] expected = {"(4"};
        verifyLexer(input, expected);
    }
        
    @Test
    public void testSlash() {
        String input = "/";
        String[] expected = {"/"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testLBracket() {
        String input = "[";
        String[] expected = {"["};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testRBracket() {
        String input = "]";
        String[] expected = {"]"};
        verifyLexer(input, expected);
    }
    
    @Test
    public void testDigit() {
        String input = "0123456789";
        String[] expected = {"0","1","2","3","4","5","6","7","8","9"};
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
            String[] tokTypes = lexer.getTokenNames();
            for(int i = 0; i < actualTokens.size(); i++) {
                 String actualToken = actualTokens.get(i).getText();
                 System.out.println(tokTypes[actualTokens.get(i).getType()]);
                 System.out.println(actualToken);
                 System.out.println();
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
