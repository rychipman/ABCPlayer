package player;

import java.util.ArrayList;
import java.util.List;

public class Voice implements ISongSequencerVisitable{
    
    private String voiceName;
    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    private List<Music> songComponents;
    
    public List<Music> getSongComponents() {
        List<Music> copySongComps = new ArrayList<Music>();
        for (Music m : this.songComponents)
            copySongComps.add(m);
        return copySongComps;
    }

    public void setSongComponents(List<Music> songComponents) {
        this.songComponents = songComponents;
    }

    public Voice(String voiceName, List<Music> songComponents){
        this.voiceName = voiceName;
        this.songComponents = new ArrayList<Music>();
        for (Music s : songComponents)
            this.songComponents.add(s.copy());
    }
    
    public Fraction getDuration(){throw new UnsupportedOperationException("Can't get duration");}

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);
    }
}
