package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class ADTTest {

//    @Test
//    public void odeToJoy() {
//        List<Music> music = new ArrayList<Music>();
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(3,8)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,8)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(2,4)));
//        
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL, 1, new Fraction(1,4)));
//        
//        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(3,8)));
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(1,8)));
//        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL, 1, new Fraction(2,4)));
//        
//        Voice voice = new Voice("Test Voice", music);
//        List<Voice> voices = new ArrayList<Voice>();
//        voices.add(voice);
//        Body body = new Body(voices);
//        Header header = new Header(3, "Test Title", "Test Composer", new KeySignature("A"), new Fraction(1,4), 180);
//        Song song = new Song(header, body);
//        SongSequencerVisitor visitor = new SongSequencerVisitor();
//        song.accept(visitor);
//        try {
//            visitor.play();
//        } catch (MidiUnavailableException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InvalidMidiDataException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        assertTrue(true);
//    }
    
    @Test
    public void superMario() {
        List<Music> music = new ArrayList<Music>();
        List<Note> chordHolder = new ArrayList<Note>();
        List<Music> tupletHolder = new ArrayList<Music>();
        chordHolder.add(new Note(NoteEnum.F, AccidentalEnum.SHARP, 0, new Fraction(1,8)));
        chordHolder.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,8)));
        music.add(new Chord(chordHolder));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,8)));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,8)));
        chordHolder.set(1, (new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(1,8))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.F, AccidentalEnum.SHARP,0, new Fraction(1,4))));
        chordHolder.set(1, (new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,4))));
        music.add(new Chord(chordHolder));
        chordHolder.set(0, (new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,4))));
        chordHolder.set(1, (new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(1,4))));
        chordHolder.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,4)));
        music.add(new Chord(chordHolder));
        music.add(new Rest(new Fraction(1,4)));
        
        Note test = new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,4));
        test.setSyllable("Super Mario!");
        music.add(test);
        
        music.add(new Rest(new Fraction(1,4)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(3,8)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,8)));
        music.add(new Rest(new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,0, new Fraction(1,4)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,0, new Fraction(1,8)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,0, new Fraction(1,4)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(1,4)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.FLAT,0, new Fraction(1,8)));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,0, new Fraction(1,4)));
        tupletHolder.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,4)));
        tupletHolder.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,4)));
        tupletHolder.add(2, new Chord(chordHolder));
        music.add(new Tuplet(TupleEnum.TRIPLET, tupletHolder));
        music.add(new Note(NoteEnum.A, AccidentalEnum.NATURAL,1, new Fraction(1,4)));
        music.add(new Note(NoteEnum.F, AccidentalEnum.NATURAL,1, new Fraction(1,8)));
        music.add(new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,8)));
        music.add(new Rest(new Fraction(1,8)));
        music.add(new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,4)));
        music.add(new Note(NoteEnum.C, AccidentalEnum.NATURAL,1, new Fraction(1,8)));
        music.add(new Note(NoteEnum.D, AccidentalEnum.NATURAL,1, new Fraction(1,8)));
        music.add(new Note(NoteEnum.B, AccidentalEnum.NATURAL,0, new Fraction(3,16)));
        
        Voice voice = new Voice("Test Voice", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        Header header = new Header(3, "Test Title", "Test Composer", new KeySignature("C"), new Fraction(1,4), 200);
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
