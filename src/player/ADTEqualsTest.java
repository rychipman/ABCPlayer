package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ADTEqualsTest {
    
    /**
     * Testing Strategy:
     * We want to make sure that the .equals() methods works properly for each element of our ADT.
     * 
     * Partitioning the input space:
     * 
     * - Note
     * - Tuple
     * - Chord
     * - Rest
     * - Voice
     * - Header
     * - Body
     * - Song
     * - Fraction
     * - KeySignature
     * 
     */
    
    @Test
    public void noteEquals() {
        Note note1 = new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,2));
        Note note2 = new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,2));
        assertTrue(note1.equals(note2));
    }
    
    @Test
    public void tupleEquals() {
        List<Music> tupletHolder1 = new ArrayList<Music>();
        List<Music> tupletHolder2 = new ArrayList<Music>();
        tupletHolder1.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        tupletHolder1.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        tupletHolder1.add(2, new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        Tuplet tuple1 = new Tuplet(TupletEnum.TRIPLET, tupletHolder1);
        tupletHolder2.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        tupletHolder2.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        tupletHolder2.add(2, new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        Tuplet tuple2 = new Tuplet(TupletEnum.TRIPLET, tupletHolder2);
        assertTrue(tuple1.equals(tuple2));
    }
    
    @Test
    public void chordEquals() {
        List<Note> chordHolder1 = new ArrayList<Note>();
        List<Note> chordHolder2 = new ArrayList<Note>();
        chordHolder1.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        chordHolder1.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        chordHolder1.add(2, new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        Chord chord1 = new Chord(chordHolder1);
        chordHolder2.add(0, new Note(NoteEnum.G, AccidentalEnum.NATURAL,0, new Fraction(1,1)));
        chordHolder2.add(1, new Note(NoteEnum.E, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        chordHolder2.add(2, new Note(NoteEnum.G, AccidentalEnum.NATURAL,1, new Fraction(1,1)));
        Chord chord2 = new Chord(chordHolder2);
        assertTrue(chord1.equals(chord2));
    }
    
    @Test
    public void restEquals() {
        Rest rest1 = new Rest(new Fraction(1,2));
        Rest rest2 = new Rest(new Fraction(1,2));
        assertTrue(rest1.equals(rest2));
    }
   
    @Test
    public void voiceEquals() {
        List<Music> array1 = new ArrayList<Music>();
        List<Music> array2 = new ArrayList<Music>();
        array1.add(new Rest(new Fraction(1,1)));
        array2.add(new Rest(new Fraction(1,1)));
        Voice voice1 = new Voice("test", array1);
        Voice voice2 = new Voice("test", array2);
        assertTrue(voice1.equals(voice2));
    }
    
    // This tests for header, body, and song equality. 
    // It is all in one test so as to simply the code and not have large repeated portions of code.
    @Test
    public void songEquals() {
        Header header1 = new Header(1, "Piece No.1", "DEFAULT", new KeySignature("C"), new Fraction(4,4), 200,  new Fraction(1,4),new Fraction(1,4));
        Header header2 = new Header(1, "Piece No.1", "DEFAULT", new KeySignature("C"), new Fraction(4,4), 200,  new Fraction(1,4),new Fraction(1,4));
        assertTrue(header1.equals(header2));
        
        List<Music> music1 = new ArrayList<Music>();
        List<Music> music2 = new ArrayList<Music>();
        music1.add(new Rest(new Fraction(1,1)));
        music2.add(new Rest(new Fraction(1,1)));
        List<Voice> voice1 = new ArrayList<Voice>();
        List<Voice> voice2 = new ArrayList<Voice>();
        voice1.add(new Voice("test", music1));
        voice2.add(new Voice("test", music2));
        Body body1 = new Body(voice1);
        Body body2 = new Body(voice1);
        assertTrue(body1.equals(body2));
        
        Song song1 = new Song(header1, body1);
        Song song2 = new Song(header2, body2);
        assertTrue(song1.equals(song2));
    }
    
    @Test
    public void fractionEquals() {
        Fraction fraction1 = new Fraction(2,4);
        Fraction fraction2 = new Fraction(2,4);
        assertTrue(fraction1.equals(fraction2));
    }
    
    @Test
    public void keySignatureEquals() {
        KeySignature ks1 = new KeySignature("C");
        KeySignature ks2 = new KeySignature("C");
        assertTrue(ks1.equals(ks2));
    }

}
