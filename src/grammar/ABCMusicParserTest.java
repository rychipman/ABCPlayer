package grammar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
public class ABCMusicParserTest {

    public final static String[] songFileNames = new String[]{"sample_abc/sampleFile.abc"};
    @Test
    public void parseTest(){
        try {
            System.out.println(ABCMusicParserTest
                    .parseFile(ABCMusicParserTest.songFileNames[0]));
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }
    
    public static String parseFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String fileAsString = Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();
    	System.out.println(unEscapeString(fileAsString));
    	CharStream fileAsStream = new ANTLRInputStream(fileAsString);
    	ABCMusicLexer lexer = new ABCMusicLexer(fileAsStream);
        lexer.reportErrorsAsExceptions();
        
        TokenStream tokens = new CommonTokenStream(lexer);
        
        // Feed the tokens into the parser
        ABCMusicParser parser = new ABCMusicParser(tokens);
        parser.reportErrorsAsExceptions();
        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abc_tune(); // "abc_music" is the starter rule.
        
        ((RuleContext)tree).inspect(parser);
        
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ABCMusicBaseListener();
        walker.walk(listener, tree);
        return ((ABCMusicBaseListener)listener).toString();
    }
    
    public static String unEscapeString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++)
            switch (s.charAt(i)){
                case '\n': sb.append("\\n\n"); break;
                case '\t': sb.append("\\t\t"); break;
                // ... rest of escape characters
                default: sb.append(s.charAt(i));
            }
        return sb.toString();
    }
}
