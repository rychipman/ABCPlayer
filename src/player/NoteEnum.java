package player;

public enum NoteEnum {
    C, D, E, F, G, A, B;
    
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
