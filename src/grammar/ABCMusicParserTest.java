package grammar;

//TODO: Write better parser tests

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import player.AccidentalEnum;
import player.Body;
import player.Chord;
import player.Fraction;
import player.Header;
import player.KeySignature;
import player.Music;
import player.Note;
import player.NoteEnum;
import player.Rest;
import player.Song;
import player.SongSequencerVisitor;
import player.Tuplet;
import player.TupletEnum;
import player.Voice;
public class ABCMusicParserTest {
    /*
     * Partitioning the input space:
     * - Parse note
     * - Parse accidentals
     * - Parse octave
     * - Parse lowercase and uppercase notes
     * - Parse note with 
     * - Fail to parse note with invalid order
     */
    public final static String[] songFileNames = new String[]{"sample_abc/piece1.abc"};
    
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
    
    @Test
    public void testSong(){
        
        List<Music> music = new ArrayList<Music>();
        List<Note> chordHolder = new ArrayList<Note>();
        List<Music> tupletHolder = new ArrayList<Music>();
        chordHolder.add(new Note(NoteEnum.F, AccidentalEnum.SHARP, 0, new Fraction(1,2)));
        chordHolder.add(new Note(NoteEnum.E, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Chord(chordHolder));
        List<Note> chordHolder2 = new ArrayList<Note>();
        chordHolder2.add(new Note(NoteEnum.F, AccidentalEnum.NONE, 0, new Fraction(1,2)));
        chordHolder2.add(new Note(NoteEnum.E, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Chord(chordHolder2));
        music.add(new Rest(new Fraction(1,2)));
        music.add(new Chord(chordHolder2));
        music.add(new Rest(new Fraction(1,2)));
        chordHolder.set(0, (new Note(NoteEnum.F, AccidentalEnum.NONE,0, new Fraction(1,2))));
        chordHolder.set(1, (new Note(NoteEnum.C, AccidentalEnum.NONE,1, new Fraction(1,2))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.F, AccidentalEnum.NONE,0, new Fraction(1,1))));
        chordHolder.set(1, (new Note(NoteEnum.E, AccidentalEnum.NONE,1, new Fraction(1,1))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.G, AccidentalEnum.NONE,0, new Fraction(1,1))));
        chordHolder.set(1, (new Note(NoteEnum.B, AccidentalEnum.NONE,0, new Fraction(1,1))));
        chordHolder.add(new Note(NoteEnum.G, AccidentalEnum.NONE,1, new Fraction(1,1)));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,1)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NONE,0, new Fraction(1,1)));
        music.add(new Rest(new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NONE,1, new Fraction(3,2)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NONE,0, new Fraction(1,2)));
        music.add(new Rest(new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NONE,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NONE,0, new Fraction(1,2)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NONE,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NONE,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.FLAT,0, new Fraction(1,2)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NONE,0, new Fraction(1,1)));
        tupletHolder.add(0, new Note(NoteEnum.G, AccidentalEnum.NONE,0, new Fraction(1,1)));
        tupletHolder.add(1, new Note(NoteEnum.E, AccidentalEnum.NONE,1, new Fraction(1,1)));
        tupletHolder.add(2, new Note(NoteEnum.G, AccidentalEnum.NONE,1, new Fraction(1,1)));
        music.add(new Tuplet(TupletEnum.TRIPLET, tupletHolder));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NONE,1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Rest(new Fraction(1,2)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NONE,1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NONE,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NONE,0, new Fraction(3,4)));
        music.add(new Rest(new Fraction(3,4)));
        
        Voice voice = new Voice("THE_DEFAULT_VOICE", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        Header header = new Header(1, "Piece No.1", "DEFAULT", new KeySignature("C"), new Fraction(4,4), 200,  new Fraction(1,4),new Fraction(1,4));
        Song manualSong = new Song(header, body);
        
        try {
            Song parsedSong = parseFile("sample_abc/piece2.abc");
            assertTrue(parsedSong.equals(manualSong));
        } catch (IOException e) {
            assertTrue(false);
        };
        
    }
    
    public static Song parseFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
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
        return ((SongListener)listener).getSong();
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
