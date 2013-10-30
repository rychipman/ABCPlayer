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
    private final Fraction defaultLength;
    private Fraction tempoBeat;

    public Fraction getTempoBeat() {
        return tempoBeat;
    }

    public void setTempoBeat(Fraction tempoBeat) {
        this.tempoBeat = tempoBeat;
    }

    /**
     * Initializes a new Header.
     * @param indexNumber is an int
     * @param title is a String
     * @param composer is a String
     * @param keySignature is a KeySignature
     * @param noteLengthPerBeat is a Fraction
     * @param beatsPerMinute is an int
     * @param defaultLength is a Fraction
     * @param tempoBeat is a Fraction
     */
    public Header(int indexNumber, String title, String composer, KeySignature keySignature, Fraction noteLengthPerBeat, int beatsPerMinute, Fraction tempoBeat, Fraction defaultLength) {
        this.indexNumber = indexNumber;
        this.title = title;
        this.composer = composer;
        this.keySignature = keySignature;
        this.noteLengthPerBeat = noteLengthPerBeat;
        this.beatsPerMinute = beatsPerMinute;
        this.defaultLength = defaultLength;
        this.tempoBeat = tempoBeat;
    }
    
    /**
     * Constructor which creates a new Header from an existing header, copying the fields over
     * @param header the header to copy
     */
    public Header(Header header) {
        this(header.getIndexNumber(), header.getTitle(), header.getComposer(), header.getKeySignature(), header.getNoteLengthPerBeat(), header.getBeatsPerMinute(), header.getTempoBeat(), header.getDefaultLength());
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
     * @return Returns the default length of the note
     */
    public Fraction getDefaultLength(){
        return defaultLength;
    }
    
    /**
     * Returns a string representation of the Header.
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("\n - Index Number: " + this.getIndexNumber());
        output.append("\n - Composer: " + this.getComposer());
        output.append("\n - Title: " + this.getTitle());
        output.append("\n - Key: " + this.getKeySignature().toString());
        output.append("\n - Note Length per Beat: " + this.getNoteLengthPerBeat());
        output.append("\n - Beats per Measure (meter): " + this.getBeatsPerMinute());
        output.append("\n - Default note length: " + this.getDefaultLength());
        output.append("\n - Tempo beat: " + this.getTempoBeat());
        return output.toString();
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}
