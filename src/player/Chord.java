package player;

import java.util.ArrayList;
import java.util.List;

/**
 * A type representing a chord, which is simply a group of 
 * notes played simultaneously within the same voice.
 * 
 * Rep Invariant: This class is immutable
 *      We copy the notes in the constructor to ensure that the client cannot modify them
 *      The list of notes is final
 *      We do not modify the fields in other methods
 *      There is no rep exposure
 *      
 * Datatype definition:
 * Chord = List<Note>
 */
public class Chord implements Singable {

    /**
     * The list of notes to be played simultaneously
     */
    private final List<Note> notes;
    private String syllable;
    
    /**
     * @return
     */
    public List<Note> getNotes() {
        return notes;
    }
    
    public void setSyllable(String syllable) {
    	this.syllable = syllable;
    }
    
    public String getSyllable() {
        return syllable;
    }

    /**
     * Construct a new Chord from the notes that compose it
     * @param notes the notes that are to be in the Chord
     */
    public Chord(List<Note> notes){
        assert notes.size() > 1;
        this.notes = new ArrayList<Note>();
        this.syllable = "";
        for (Note n : notes)
            this.notes.add(n);
    }

    /**
     * Create a new chord with the same notes
     */
    @Override
    public Music copy() {
        Chord copiedChord = new Chord(this.notes);
        copiedChord.setSyllable(this.getSyllable());
        return copiedChord;
        
    }

    /**
     * The duration of the chord is the duration of the longest note
     * This method returns the duration of the longest note
     */
    @Override
    public Fraction getDuration() {
        Fraction maxDuration = new Fraction(0,1);
        for (Note n : this.notes)
            if (n.getDuration().compareTo(maxDuration) > 0)
                maxDuration = n.getDuration();
        return maxDuration;
    }
    
    /**
     * @return the string representation of the Chord
     */
    @Override
    public String toString(){
        StringBuilder chord = new StringBuilder("Chord(");
        for (Note m : this.notes)
            chord.append(m.toString() + ", ");
        chord.append(")");
        return chord.toString();
    }

}
