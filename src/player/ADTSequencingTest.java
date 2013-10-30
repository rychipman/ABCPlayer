package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

/**
 * Test the ADT and ensure that we can use it to play songs
 */

public class ADTSequencingTest {

    @Test
    public void odeToJoy() {
        List<Music> music = new ArrayList<Music>();
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(3,4)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,2)));
        
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,1)));
        
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(3,4)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,2)));
        
        Voice voice = new Voice("Test Voice", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        Header header = new Header(3, "Test Title", "Test Composer", new KeySignature("A"), new Fraction(1,1), 180, new Fraction(1,4), new Fraction(1,4));
        Song song = new Song(header, body);
        SongSequencerVisitor visitor = new SongSequencerVisitor();
        song.accept(visitor);
        try {
            visitor.play();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }
    
    @Test
    public void testSuperMario() {
        List<Music> music = new ArrayList<Music>();
        List<Note> chordHolder = new ArrayList<Note>();
        List<Music> tupletHolder = new ArrayList<Music>();
        chordHolder.add(new Note(NoteEnum.F, AccidentalEnum.SHARP, 0, new Fraction(1,2)));
        chordHolder.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,2)));
        music.add(new Chord(chordHolder));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,2)));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,2)));
        chordHolder.set(1, (new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(1,2))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.F, AccidentalEnum.SHARP,0, new Fraction(1,1))));
        chordHolder.set(1, (new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1))));
        chordHolder.set(1, (new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(1,1))));
        chordHolder.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,1)));
        
        Note test = new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1));
        test.setSyllable("Super Mario!");
        music.add(test);
        
        music.add(new Rest(new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(3,4)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,2)));
        music.add(new Rest(new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,0, new Fraction(1,2)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.FLAT,0, new Fraction(1,2)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        tupletHolder.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        tupletHolder.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        tupletHolder.add(2, new Chord(chordHolder));
        music.add(new Tuplet(TupleEnum.TRIPLET, tupletHolder));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,2)));
        music.add(new Rest(new Fraction(1,2)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL,1, new Fraction(1,2)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(3,4)));
        music.add(new Rest(new Fraction(3,4)));
        
        Voice voice = new Voice("Test Voice", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        Header header = new Header(3, "Test Title", "Test Composer", new KeySignature("C"), new Fraction(1,4), 200,  new Fraction(1,4),new Fraction(1,4));
        Song song = new Song(header, body);
        System.out.println(song);
        SongSequencerVisitor visitor = new SongSequencerVisitor();
        song.accept(visitor);
        try {
            visitor.play();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        assertTrue(true);
    }

}
