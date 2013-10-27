package player;

/**
 * Specifies that a Tuple can only come as a Duplet, Triplet, or Quadruplet.
 */
public enum TupleEnum {
    DUPLET, TRIPLET, QUADRUPLET;
    
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
