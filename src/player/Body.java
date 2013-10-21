package player;

import java.util.ArrayList;
import java.util.List;

public class Body implements ISongSequencerVisitable{
    private final List<Voice> voices;
    
    public Body(List<Voice> voices){
        this.voices = new ArrayList<Voice>();
        for (Voice v : voices)
            this.voices.add(v);
    }
    
    public Body(Body body){
        this(body.getVoices());
    }
    
    public List<Voice> getVoices() {
        return voices;
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}