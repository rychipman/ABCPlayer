package player;

/**
 * Specifies that a note can only take the value of A,B,C,D,E,F,G.
 */
public enum NoteEnum {
    
    /**
     * The seven letters keys, the number that they associated with is the pitch scale
     * defined in the SequencePlayer. It's not used in this program, but is useful
     * to have in case we ever decide to extend the program.
     */
    C(0), D(2), E(4), F(5), G(7), A(9), B(11);
    
    /**
     * @param pitchScale as defined in SequencePlayer
     */
    NoteEnum(int pitchScale)
    {
        this.pitchScale = pitchScale;
    }

    /**
     * The pitch scale as defined in SequencePlayer
     */
    private int pitchScale;

    /**
     * @return the pitch scale
     */
    public int getPitchScale()
    {
        return pitchScale;
    }
    
    /**
     * @return the letter of the note
     */
    @Override
    public String toString(){
        switch(this){
        case C:
            return "C";
        case D:
            return "D";
        case E:
            return "E";
        case F:
            return "F";
        case G:
            return "G";
        case A:
            return "A";
        case B:
            return "B";
        default:
            return "X";
        }
    }
}
