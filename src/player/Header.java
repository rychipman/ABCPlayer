package player;

/**
 * Represents the header of an ABC music file
 * 
 */
public class Header implements ISongSequencerVisitable{
    private final int indexNumber;
    private final String title;
    private final String composer;
    private final KeySignature keySignature;
    private final Fraction noteLengthPerBeat;
    private final int beatsPerMinute;

    /**
     * Initializes a new Header.
     * @param indexNumber is an int
     * @param title is a String
     * @param composer is a String
     * @param keySignature is a KeySignature
     * @param noteLengthPerBeat is a Fraction
     * @param beatsPerMinute is an int
     */
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

    /**
     * @return Returns the index number associated with the header.
     */
    public int getIndexNumber() {return indexNumber;}
    
    /**
     * @return Returns the composer associated with the header.
     */
    public String getComposer() {return composer;} 
    
    /**
     * @return Returns the title associated with the header.
     */
    public String getTitle() {return title;}
    
    /**
     * @return Returns the key signature associated with the header.
     */
    public KeySignature getKeySignature() {
        return keySignature;
    }
    
    /**
     * @return Returns the note length per beat associated with the header.
     */
    public Fraction getNoteLengthPerBeat() {
        return noteLengthPerBeat;
    }
    
    /**
     * @return Returns the beats per minute associated with the header.
     */
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }
    
    /**
     * Returns a string representation of the Header.
     */
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
