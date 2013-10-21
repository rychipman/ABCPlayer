package player;

/**
 * Enum representing the different kinds of accidentals used in abc notation
 * @author rchipman
 */
public enum AccidentalEnum {
    NONE, SHARP, DOUBLE_SHARP, FLAT, DOUBLE_FLAT, NATURAL;
    
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
