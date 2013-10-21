package player;

public enum AccidentalEnum {
    NONE, SHARP, DOUBLE_SHARP, FLAT, DOUBLE_FLAT, NATURAL;
    
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
