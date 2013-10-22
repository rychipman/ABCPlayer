package player;

/**
 * This is an abstract class that represents the non-lyric parts of the song (notes, chords, rests, tuplets)
 */
public interface Music{
    public Music copy();
    public Fraction getDuration();
}
