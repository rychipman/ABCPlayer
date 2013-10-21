package player;

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
