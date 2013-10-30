package player;

/**
 *  This is the immutable, top-level class that represents each ABC song. 
 *  This is the output of the Parser, and the input to the Visitor. 
 *  The Datatype definition is:
 *      Song = Body + Header
 *  The rep invariant is that the object is immutable
 *      The fields of the class are set by the constructor, 
 *      and they are recursively immutable
 */
public class Song implements ISongSequencerVisitable{
    private final Header header;
    private final Body body;
    
    /**
     * Construct a new Song comprised of a header and a body.
     * @param header refers to the Header datatype that specifies title, composer, etc.
     * @param body refers to the Body datatype that specifies notes, chords, etc.
     */
    public Song(Header header, Body body){
        this.header = new Header(header);
        this.body = new Body(body);
    }    
    
    /**
     * @return Returns the header associated with the song.
     */
    public Header getHeader() {
        return header;
    }

    /**
     * @return Returns the body of music associated with the song.
     */
    public Body getBody() {
        return body;
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
    
    /**
     * @return string representation of this Song
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("Header: ");
        builder.append(header.toString());
        builder.append("\n");
        builder.append("Body:");
        builder.append(body.toString());
        return builder.toString();
    }
    
}
