package player;

public class Note implements Music{
    
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
        return "X";
    }

    @Override
    public Voice copyVoice() {
        return new Note(this.note, this.accidental, this.octave, new Fraction(this.duration));
    }

    @Override
    public Fraction getDuration() {
        return this.duration;
    }

}
