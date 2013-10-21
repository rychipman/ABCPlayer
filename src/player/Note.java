package player;

public class Note implements Music {
    
    private final NoteEnum note;
    private final AccidentalEnum accidental;
    private final int octave;
    private final Fraction duration;
    
    public Note(NoteEnum note, AccidentalEnum accidental, int octave, Fraction duration){
        this.note = note;
        this.accidental = accidental;
        this.octave = octave;
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuilder octaveBuilder = new StringBuilder();
        for(int i = 0; i < this.octave; i++)
            octaveBuilder.append("'");
        for(int i = 0; i < this.octave*-1; i++)
            octaveBuilder.append(",");
        return String.format("%s%s%s%s", this.accidental.toString(), this.note.toString(), octaveBuilder.toString(), this.duration.toString());
    }
   
    @Override
    public Fraction getDuration() {
        return this.duration;
    }
    
    public NoteEnum getNote() {
        return note;
    }

    public AccidentalEnum getAccidental() {
        return accidental;
    }

    public int getOctave() {
        return octave;
    }
    
    @Override
    public Music copy() {
        return new Note(this.note, this.accidental, this.octave, this.duration);
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}
