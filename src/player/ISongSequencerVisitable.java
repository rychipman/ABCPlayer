package player;

/**
 * The "Visitable" interface, as described in the Visitor Pattern
 */

public interface ISongSequencerVisitable {
    public void accept(ISongSequencerVisitor visitor);
}
