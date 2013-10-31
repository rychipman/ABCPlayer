package player;

/**
 * Enum representing the different kinds of accidentals used in abc notation
 * 
 * Rep Invariant: This class is immutable because enums and ints are immutable
 */
public enum AccidentalEnum {
    /**
     * Accidentals are constructed with a number that indicates the number of semitones they
     * displace a note. For example, a DOUBLE_SHARP increases a note by two semitones, so 
     * it is constructed with a value of 2.
     */
    NONE(0), SHARP(1), DOUBLE_SHARP(2), FLAT(-1), DOUBLE_FLAT(-2), NATURAL(0);
    
    /**
     * Number of semitones to the accidental will offset a note by
     * a negative value means the semitones are decreased
     * a positive value means the semitones are increased
     */
    private int semitoneOffset;
    
    /**
     * Construct with a semitone offset
     * @param semitoneOffset the number of semitones that this accidental will offset a note by
     */
    private AccidentalEnum(int semitoneOffset){
        this.semitoneOffset = semitoneOffset;
    }

    /**
     * @return the number of semitones that this accidental will offset a note by
     */
    public int getSemitoneOffset(){
        return this.semitoneOffset;
    }
    
    /**
     * Get the ABC String for this kind of accidental
     * @return the string representation of this accidental, in abc syntax
     */
    @Override
    public String toString(){
        switch(this){
        case NONE:
            return "";
        case SHARP:
            return "^";
        case DOUBLE_SHARP:
            return "^^";
        case FLAT:
            return "_";
        case DOUBLE_FLAT:
            return "__";
        case NATURAL:
            return "=";
        default:
            return "X";
        }
    }
}
