package player;

/**
 * Specifies that a Tuplet can only come as a Duplet, Triplet, or Quadruplet.
 */
public enum TupletEnum {
    
    /**
     * The three tuplet types
     */
    DUPLET, TRIPLET, QUADRUPLET;
    
    /**
     * @return a string representation of the tuplet
     */
    @Override
    public String toString(){
        switch(this){
        case DUPLET:
            return "(2";
        case TRIPLET:
            return "(3";
        case QUADRUPLET:
            return "(4";
        default:
            return "X";
        }
    }
}
