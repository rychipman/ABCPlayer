package sound;

import static org.junit.Assert.*;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import org.junit.Test;

/**
 * Test that require the MIDI synthesizer.
 * @category no_didit
 */
public class SequencePlayerTest {
    
//    @Test
//    public void rowYourBoat() {
//        SequencePlayer player;
//        try {
//
//            // Create a new player, with 140 beats per minute, 12 ticks per beat
//            // and a LyricListener that prints each lyric that it sees.
//            LyricListener listener = new LyricListener() {
//                public void processLyricEvent(String text) {
//                    System.out.println(text);
//                }
//            };
//            // We choose 12 ticks per beat in order to be able to split a single beat into triplets, eighth notes, and sixteenth notes
//            player = new SequencePlayer(140, 12, listener);
//
//            player.addNote(new Pitch('C').toMidiNote(), 0, 12);
//            player.addNote(new Pitch('C').toMidiNote(), 12, 12);
//            player.addNote(new Pitch('C').toMidiNote(), 24, 9);
//            player.addNote(new Pitch('D').toMidiNote(), 33, 3);
//            player.addNote(new Pitch('E').toMidiNote(), 36, 12);
//            player.addNote(new Pitch('E').toMidiNote(), 48, 9);
//            player.addNote(new Pitch('D').toMidiNote(), 57, 3);
//            player.addNote(new Pitch('E').toMidiNote(), 60, 9);
//            player.addNote(new Pitch('F').toMidiNote(), 69, 3);
//            player.addNote(new Pitch('G').toMidiNote(), 72, 24);
//            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 4);
//            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 100, 4);
//            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 104, 4);
//            player.addNote(new Pitch('G').toMidiNote(), 108, 4);
//            player.addNote(new Pitch('G').toMidiNote(), 112, 4);
//            player.addNote(new Pitch('G').toMidiNote(), 116, 4);
//            player.addNote(new Pitch('E').toMidiNote(), 120, 4);
//            player.addNote(new Pitch('E').toMidiNote(), 124, 4);
//            player.addNote(new Pitch('E').toMidiNote(), 128, 4);
//            player.addNote(new Pitch('C').toMidiNote(), 132, 4);
//            player.addNote(new Pitch('C').toMidiNote(), 136, 4);
//            player.addNote(new Pitch('C').toMidiNote(), 140, 4);
//            player.addNote(new Pitch('G').toMidiNote(), 144, 9);
//            player.addNote(new Pitch('F').toMidiNote(), 153, 3);
//            player.addNote(new Pitch('E').toMidiNote(), 156, 9);
//            player.addNote(new Pitch('D').toMidiNote(), 165, 3);
//            player.addNote(new Pitch('C').toMidiNote(), 168, 24);
//
//            player.play();
//
//        } catch (MidiUnavailableException e) {
//            e.printStackTrace();
//        } catch (InvalidMidiDataException e) {
//            e.printStackTrace();
//        }
//    }
    
    @Test
    public void superMario() {
        SequencePlayer player;
        try {

            // Create a new player, with 200 beats per minute, 12 ticks per beat
            // and a LyricListener that prints each lyric that it sees.
            LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };
            // We choose 12 ticks per beat in order to be able to split a single beat into triplets, eighth notes, and sixteenth notes
            player = new SequencePlayer(200, 12, listener);

            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);
            // rest 6 ticks
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);
            // rest 6 ticks
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12);
            player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
            player.addNote(new Pitch('B').toMidiNote(), 48, 12);
            player.addNote(new Pitch('G').toMidiNote(), 48, 12);
            // rest 12 ticks
            player.addNote(new Pitch('G').toMidiNote(), 72, 12);
            // rest 12 ticks
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
            player.addNote(new Pitch('G').toMidiNote(), 114, 6);
            // rest 12 ticks
            player.addNote(new Pitch('E').toMidiNote(), 132, 12);
            player.addNote(new Pitch('E').toMidiNote(), 144, 6);
            player.addNote(new Pitch('A').toMidiNote(), 150, 12);
            player.addNote(new Pitch('B').toMidiNote(), 162, 12);
            player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);
            player.addNote(new Pitch('A').toMidiNote(), 180, 12);
            player.addNote(new Pitch('G').toMidiNote(), 192, 8);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);
            player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);
            player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);
            // rest 6 ticks
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);
            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);
            player.addNote(new Pitch('B').toMidiNote(), 270, 9);

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
    
//    @Test
//    public void amazingGrace() {
//        SequencePlayer player;
//        try {
//
//            // Create a new player, with 100 beats per minute, 2 ticks per beat
//            // and a LyricListener that prints each lyric that it sees.
//            LyricListener listener = new LyricListener() {
//                public void processLyricEvent(String text) {
//                    System.out.println(text);
//                }
//            };
//            // We choose 2 ticks per beat in order to be able to split a single beat into eighth notes
//            player = new SequencePlayer(100, 2, listener);
//
//            player.addNote(new Pitch('D').toMidiNote(), 0, 2);
//            player.addLyricEvent("A", 0);
//            player.addNote(new Pitch('G').toMidiNote(), 2, 4);
//            player.addLyricEvent("ma", 2);
//            player.addNote(new Pitch('B').toMidiNote(), 6, 1);
//            player.addLyricEvent("zing", 6);
//            player.addNote(new Pitch('G').toMidiNote(), 7, 1);
//            player.addNote(new Pitch('B').toMidiNote(), 8, 4);
//            player.addLyricEvent("Grace", 8);
//            player.addNote(new Pitch('A').toMidiNote(), 12, 2);
//            player.addLyricEvent("How", 12);
//            player.addNote(new Pitch('G').toMidiNote(), 14, 4);
//            player.addLyricEvent("Sweet", 14);
//            player.addNote(new Pitch('E').toMidiNote(), 18, 2);
//            player.addLyricEvent("The", 18);
//            player.addNote(new Pitch('D').toMidiNote(), 20, 4);
//            player.addLyricEvent("Sound", 20);
//            player.addNote(new Pitch('D').toMidiNote(), 24, 2);
//            player.addLyricEvent("That", 24);
//            player.addNote(new Pitch('G').toMidiNote(), 26, 4);
//            player.addLyricEvent("Saved", 26);
//            player.addNote(new Pitch('B').toMidiNote(), 30, 1);
//            player.addLyricEvent("A", 30);
//            player.addNote(new Pitch('G').toMidiNote(), 31, 1);
//            player.addNote(new Pitch('B').toMidiNote(), 32, 4);
//            player.addLyricEvent("Wretch", 32);
//            player.addNote(new Pitch('A').toMidiNote(), 36, 2);
//            player.addLyricEvent("Like", 36);
//            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 38, 8);
//            player.addLyricEvent("Me", 38);
//
//            player.play();
//
//        } catch (MidiUnavailableException e) {
//            e.printStackTrace();
//        } catch (InvalidMidiDataException e) {
//            e.printStackTrace();
//        }
//    }
    
    @Test
    public void assertTrue() {
        assertEquals(true, true);
    }
}
