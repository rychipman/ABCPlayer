package player;

public interface ISongSequencerVisitor {
    public void visit(Song song);
    public void visit(Header header);
    public void visit(Body body);
    public void visit(Music music);
    public void visit(Note note);
    public void visit(Rest rest);
    public void visit(Voice voice);
}
