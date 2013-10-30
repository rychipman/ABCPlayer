package player;


/**
 * Note is an immutable class that inherits from Music and implements Voice.
 * This is the basis for the music in the song.
 */
public class Note implements Singable {
    
    private final NoteEnum note;
    private final AccidentalEnum accidental;
    private final int octave;
    private final Fraction duration;
    private String syllable;
    
    public Note(NoteEnum note, AccidentalEnum accidental, int octave, Fraction duration){
        this.note = note;
        this.accidental = accidental;
        this.octave = octave;
        this.duration = duration;
    }
    
    public void setSyllable(String syllable) {
    	this.syllable = syllable;
    }
    
    public String getSyllable() {
        return syllable;
    }

    @Override
    public String toString() {
        StringBuilder octaveBuilder = new StringBuilder();
        for(int i = 0; i < this.octave; i++)
            octaveBuilder.append("'");
        for(int i = 0; i < this.octave*-1; i++)
            octaveBuilder.append(",");
        return String.format("%s%s%s%s with %s", (this.accidental == null) ? "" : this.accidental.toString(), (this.note == null) ? "" : this.note.toString(), (octaveBuilder == null) ? "" : octaveBuilder.toString(), (this.duration == null) ? "" : this.duration.toString(), this.getSyllable());
    }
   
    /**
     * @return Returns the set duration of the note.
     */
    @Override
    public Fraction getDuration() {return this.duration;}
    
    /**
     * @return Returns the pure note, without accidentals (A,B,C,D,E,F,G)
     */
    public NoteEnum getNote() {
        return note;
    }

    /**
     * @return Returns the accidental associated with the note (-1, 0, 1)
     */
    public AccidentalEnum getAccidental() {
        return accidental;
    }

    /**
     * @return Returns the octave associated with the note. 
     * Any note beyond the octave containing middle C will need to be specified.
     */
    public int getOctave() {
        return octave;
    }
    
    /**
     * @return Gives an new Note with the same specifications as the current note.
     */
    @Override
    public Music copy() {
        Note copiedNote = new Note(this.note, this.accidental, this.octave, this.duration);
        copiedNote.setSyllable(this.getSyllable());
        return copiedNote;
    }
}
