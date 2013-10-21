package player;

import java.util.ArrayList;
import java.util.List;

/**
 * A type representing a chord, which is simply a group of 
 * notes played simultaneously within the same voice.
 * @author rchipman
 */
public class Chord implements Music{

    private final List<Note> notes;
    
    /**
     * Construct a new Chord from the notes that compose it
     * @param notes the notes that are to be in the Chord
     */
    public Chord(List<Note> notes){
        assert notes.size() > 1;
        this.notes = new ArrayList<Note>();
        for (Note n : notes)
            this.notes.add(n);
    }

    @Override
    public Music copy() {
        return new Chord(this.notes);
    }

    @Override
    public Fraction getDuration() {
        Fraction maxDuration = new Fraction(0,1);
        for (Note n : this.notes)
            if (n.getDuration().compareTo(maxDuration) > 0)
                maxDuration = n.getDuration();
        return maxDuration;
    }

}
