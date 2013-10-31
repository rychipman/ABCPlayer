package player;

/**
 * This is an abstract class that represents the non-lyric parts of the song (notes, chords, rests, tuplets)
 */
public interface Music{
    
    /**
     * @return a copy of this Music object
     */
    public Music copy();
    
    /**
     * @return the duration of this Music
     */
    public Fraction getDuration();
}
