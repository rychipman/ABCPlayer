package player;

public interface Music extends ISongSequencerVisitable{
    public Music copy();
    public Fraction getDuration();
}
