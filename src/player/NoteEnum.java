package player;

public enum NoteEnum {
    C(0), D(2), E(4), F(5), G(7), A(9), B(11);
    NoteEnum(int i)
    {
        this.pitchScale = i;
    }

    private int pitchScale;

    public int getPitchScale()
    {
        return pitchScale;
    }
    
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
