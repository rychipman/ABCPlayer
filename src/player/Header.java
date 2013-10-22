package player;

/**
 * Represents the header of an ABC music file
 * This is immutable because each of the fields are immutable
 */
public class Header implements ISongSequencerVisitable{
    private final int indexNumber;
    private final String title;
    private final String composer;
    private final KeySignature keySignature;
    private final Fraction noteLengthPerBeat;
    private final int beatsPerMinute;

    public Header(int indexNumber, String title, String composer, KeySignature keySignature, Fraction noteLengthPerBeat, int beatsPerMinute) {
        this.indexNumber = indexNumber;
        this.title = title;
        this.composer = composer;
        this.keySignature = keySignature;
        this.noteLengthPerBeat = noteLengthPerBeat;
        this.beatsPerMinute = beatsPerMinute;
    }
    
    /**
     * Constructor which creates a new Header from an existing header, copying the fields over
     * @param header the header to copy
     */
    public Header(Header header) {
        this(header.getIndexNumber(), header.getTitle(), header.getComposer(), header.getKeySignature(), header.getNoteLengthPerBeat(), header.getBeatsPerMinute());
    }

    public int getIndexNumber() {return indexNumber;}
    
    public String getComposer() {return composer;} 
    
    public String getTitle() {return title;}
    
    public KeySignature getKeySignature() {
        return keySignature;
    }
    
    public Fraction getNoteLengthPerBeat() {
        return noteLengthPerBeat;
    }
    
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }
    
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Index Number: " + this.getIndexNumber());
        output.append(" - Composer: " + this.getComposer());
        output.append(" - Title: " + this.getTitle());
        output.append(" - Key: " + this.getKeySignature().toString());
        output.append(" - Note Length per Beat: " + this.getNoteLengthPerBeat());
        output.append(" - Beats per Measure (meter): " + this.getBeatsPerMinute());
        return output.toString();
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}
