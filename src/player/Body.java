package player;

import java.util.ArrayList;
import java.util.List;

/**
 * A type representing the body of an abc music document.
 * The body is made up of one or more Voices.
 * 
 * Rep Invariant: This class is immutable
 *      We are assured that a Voice is immutable, and we ensure that our list of voices is immutable
 *      We copy the voices that are passed to the constructor, to ensure that the client cannot modify the voices
 *      We can safely return the voices list as is because it is immutable
 *      Since the class is immutable, we can safely pass it to the visitor
 *      There is no rep exposure
 *      
 *  Datatype Definition:
 *  Body = List<Voices>
 */
public class Body implements ISongSequencerVisitable{
    
    /**
     * This is the list of voices composing the song
     * Each voice will correspond to an instrument or the lyrics
     */
    private final List<Voice> voices;
    
    /**
     * Create a new body object from a list of voices
     * @param voices the voices in the body
     */
    public Body(List<Voice> voices) {
        this.voices = new ArrayList<Voice>();
        for (Voice v : voices)
            this.voices.add(v);
    }
    
    /**
     * Create a new body as a copy of an existing Body object
     * @param body the body to be copied
     */
    public Body(Body body){
        this(body.getVoices());
    }
    
    /**
     * Get all the voices that make up this Body
     * @return a List of the voices in the body
     */
    public List<Voice> getVoices() {
        return voices;
    }

    /**
     * Accept a visitor so that we can parse our input using the Visitor method 
     * @param visitor the visitor to accept
     */
    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
    
    /**
     * @return the string representation of this object
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (Voice v : this.voices){
            builder.append("Voice: ");
            builder.append(v.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
