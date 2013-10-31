package player;

/**
 * An interface for associating lyrics with a Music object
 */
public interface Singable extends Music {
	public void setSyllable(String syllable);
	public String getSyllable();
}
