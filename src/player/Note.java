package player;


/**
 * Note is an immutable class that inherits from Music and implements Voice.
 * This is the basis for the music in the song.
 */
public class Note implements Singable {
    
    /**
     * The letter of this note (i.e. A, B, C, D, E, F, or G)
     */
    private final NoteEnum note;
    
    /**
     * The accidental applied to this note (sharp, flat, natural, double flat, double sharp)
     */
    private final AccidentalEnum accidental;
    
    /**
     * The octave of this note above (or below, if the value is negative) middle C
     */
    private final int octave;
    
    /**
     * The duration of the note
     */
    private final Fraction duration;
    
    /**
     * The syllable of the lyrics associated with this note
     */
    private String syllable;
    
    /**
     * @param note The letter of this note (i.e. A, B, C, D, E, F, or G)
     * @param accidental The accidental applied to this note (sharp, flat, natural, double flat, double sharp)
     * @param octave The octave of this note above (or below, if the value is negative) middle C
     * @param duration The duration of the note
     */
    public Note(NoteEnum note, AccidentalEnum accidental, int octave, Fraction duration){
        this.note = note;
        this.accidental = accidental;
        this.octave = octave;
        this.duration = duration;
        this.syllable = ""; // begin with an empty syllable
    }
    
    /**
     * @param the syllable associated with this note
     */
    public void setSyllable(String syllable) {
    	this.syllable = syllable;
    }
    
    /**
     * @return the syllable associated with this note 
     */
    public String getSyllable() {
        return syllable;
    }

    /**
     * @return the string representation of this Note
     */
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
    
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Note))
            return false;
        Note compareNote = (Note)other;
        if (compareNote.note.equals(this.note) &&
                compareNote.accidental.equals(this.accidental) &&
                compareNote.octave == this.octave &&
                compareNote.duration.equals(this.duration) &&
                compareNote.syllable.equals(this.syllable)) {
            return true;
        } else {return false;}
    }
}
