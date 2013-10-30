package player;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;
import grammar.ABCMusicParserTest;
import grammar.SongListener;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        try {
            byte[] encoded;
            encoded = Files.readAllBytes(Paths.get(file));
            String fileAsString = Charset.defaultCharset().decode(ByteBuffer.wrap(encoded)).toString();
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
            ParseTreeWalker walker = new ParseTreeWalker();
            ParseTreeListener listener = new SongListener();
            walker.walk(listener, tree);
            
            SongSequencerVisitor visitor = new SongSequencerVisitor();
            ((SongListener)listener).getSong().accept(visitor);
            try {
                visitor.play();
            } catch (MidiUnavailableException e) {
                e.printStackTrace();
            } catch (InvalidMidiDataException e) {
                e.printStackTrace();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        // CALL play() HERE
        try {
            System.out.println(ABCMusicParserTest.parseFile(ABCMusicParserTest.songFileNames[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
