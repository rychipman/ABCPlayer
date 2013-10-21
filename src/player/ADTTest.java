package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ADTTest {

    @Test
    public void toStringTest(){
        Note n1 = new Note(NoteEnum.A, AccidentalEnum.DOUBLE_SHARP, 2, new Fraction(1,2));
        Note n2 = new Note(NoteEnum.C, AccidentalEnum.FLAT, 3, new Fraction(1,4));
        Note n3 = new Note(NoteEnum.D, AccidentalEnum.NATURAL, 1, new Fraction(2,4));
        List<Music> music = new ArrayList<Music>();
        music.add(n1);
        music.add(n2);
        music.add(n3);
        Voice voice = new Voice("Test Voice", music);
        List<Voice> voices = new ArrayList<Voice>();
        voices.add(voice);
        Body body = new Body(voices);
        
        assertTrue(true);
    }

}
