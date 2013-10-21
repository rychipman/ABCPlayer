package player;

public interface Voice {
    public Fraction getDuration();
    
    @Override
    public String toString();

    public Voice copyVoice();
}
