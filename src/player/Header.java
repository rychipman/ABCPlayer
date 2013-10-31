package player;

/**
 * Represents the header of an ABC music file
 * 
 */
public class Header implements ISongSequencerVisitable{
    
    /**
     * The index of the song (field X in header)
     */
    private final int indexNumber;
    
    /**
     * The title of the song (field T in header)
     */
    private final String title;
    
    /**
     * The composer of the song (field C in header)
     */
    private final String composer;
    
    /**
     * The key signature of the song (field K in header)
     */
    private final KeySignature keySignature;
    
    /**
     * The meter of the song (field M in header)
     */
    private final Fraction meter;
    
    /**
     * The beats per minute of the song (field Q in header)
     */
    private final int beatsPerMinute;
    
    /**
     * The default length of a note (field L in header)
     */
    private final Fraction defaultLength;
    
    /**
     * The duration of a note which counts as one beat (field Q in header)
     */
    private Fraction tempoBeat;

    public void setTempoBeat(Fraction tempoBeat) {
        this.tempoBeat = tempoBeat;
    }

    /**
     * Initializes a new Header.
     * @param indexNumber is the index of the header
     * @param title is the title of the header
     * @param composer is the composer of the header
     * @param keySignature is the key signature of the header
     * @param meter is the meter of the header
     * @param beatsPerMinute is the beats per minute of the header
     * @param defaultLength is the default length of a note
     * @param tempoBeat is the duration of a note which is associated with one beat
     */
    public Header(int indexNumber, String title, String composer, KeySignature keySignature, Fraction noteLengthPerBeat, int beatsPerMinute, Fraction tempoBeat, Fraction defaultLength) {
        this.indexNumber = indexNumber;
        this.title = title;
        this.composer = composer;
        this.keySignature = keySignature;
        this.meter = noteLengthPerBeat;
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
     * @return The duration of a note which counts as one beat (field Q in header)
     */
    public Fraction getTempoBeat() {
        return tempoBeat;
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
        return meter;
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
     * Method that allows the Visitor to process this object
     */
    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
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
    
    /**
     * Returns a boolean representing whether the two compared Headers are equivalent.
     */
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Header))
            return false;
        Header compareHeader = (Header)other;
        if (compareHeader.indexNumber == this.indexNumber &&
                compareHeader.title.equals(this.title) &&
                compareHeader.composer.equals(this.composer) &&
                compareHeader.keySignature.equals(this.keySignature) &&
                compareHeader.beatsPerMinute == this.beatsPerMinute &&
                compareHeader.defaultLength.equals(this.defaultLength) &&
                compareHeader.tempoBeat.equals(this.tempoBeat)) {
            return true;
        } else {return false;}
    }
}
