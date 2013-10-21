package player;

import java.util.ArrayList;
import java.util.List;

/**
 * A type representing the body of an abc music document.
 * The body is made up of one or more Voices.
 * @author rchipman
 */
public class Body implements ISongSequencerVisitable{
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
     * @param visitor
     */
    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}
