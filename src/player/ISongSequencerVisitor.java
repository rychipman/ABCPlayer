package player;

public interface ISongSequencerVisitor {
    public void visit(Song song);
    public void visit(Header song);
    public void visit(Body song);
    public void visit(Music song);
    public void visit(Note song);
    public void visit(Rest song);
    public void visit(Voice voice);
}
