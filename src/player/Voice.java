package player;

import java.util.ArrayList;
import java.util.List;

public class Voice {
    
    private final String voiceName;
    private final List<Music> songComponents;
    
    public Voice(String voiceName, List<Music> songComponents){
        this.voiceName = voiceName;
        this.songComponents = new ArrayList<Music>();
        for (Music s : songComponents)
            this.songComponents.add(s.copy());
    }
    
    public Fraction getDuration(){throw new UnsupportedOperationException("Can't get duration");}
}
