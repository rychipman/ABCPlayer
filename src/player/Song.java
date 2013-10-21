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
public class Song {
    private final Header header;
    private final Body body;
    
    public Song(Header header, Body body){
        this.header = new Header(header);
        this.body = new Body(body);
    }    
    
    public Header getHeader() {
        return header;
    }

    public Body getBody() {
        return body;
    }
}
