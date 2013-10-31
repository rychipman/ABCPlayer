package player;

/**
 * The "Visitor" interface, as described in the Visitor Pattern
 *
 */
public interface ISongSequencerVisitor {
    public void visit(Song song);
    public void visit(Header header);
    public void visit(Body body);
    public void visit(Voice voice);
}
