package player;

/**
 * Represents the header of an ABC music file
 * This is immutable because each of the fields are immutable
 */
public class Header {
    public final int indexNumber;
    public final String title;
    private final String composer;
    public final String key;
    public final Fraction noteLengthPerBeat;
    public final int beatsPerMeasure;

    public Header(int indexNumber, String title, String composer, String key, Fraction noteLengthPerBeat, int beatsPerMeasure) {
        this.indexNumber = indexNumber;
        this.title = title;
        this.composer = composer;
        this.key = key;
        this.noteLengthPerBeat = noteLengthPerBeat;
        this.beatsPerMeasure = beatsPerMeasure;
    }
    
    public int getIndexNumber() {
        return indexNumber;
    }
    
    public String getComposer() {
        return composer;
    } 
    
    public String getTitle() {
        return title;
    }
    
    public String getKey() {
        return key;
    }
    
    public Fraction getNoteLengthPerBeat() {
        return noteLengthPerBeat;
    }
    
    public int getBeatsPerMeasure() {
        return beatsPerMeasure;
    }
    
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Index Number: " + this.getIndexNumber());
        output.append(" - Composer: " + this.getComposer());
        output.append(" - Title: " + this.getTitle());
        output.append(" - Key: " + this.getKey());
        output.append(" - Note Length per Beat: " + this.getNoteLengthPerBeat());
        output.append(" - Beats per Measure (meter): " + this.getBeatsPerMeasure());
        return output.toString();
    }
}
