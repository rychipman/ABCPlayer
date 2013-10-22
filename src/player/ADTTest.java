package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class ADTTest {

    @Test
    public void toStringTest(){
        List<Music> music = new ArrayList<Music>();
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(3,8)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(1,8)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(2,4)));
        
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 2, new Fraction(1,4)));
        
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 2, new Fraction(3,8)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(1,8)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 2, new Fraction(2,4)));
        
        
        Voice voice = new Voice("Test Voice", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        Header header = new Header(3, "Test Title", "Test Composer", new KeySignature("A"), new Fraction(1,4), 60);
        Song song = new Song(header, body);
        SongSequencerVisitor visitor = new SongSequencerVisitor();
        song.accept(visitor);
        try {
            visitor.play();
        } catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertTrue(true);
    }

}
