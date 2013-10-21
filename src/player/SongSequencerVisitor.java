package player;

import java.util.HashMap;
import java.util.List;

public class SongSequencerVisitor implements ISongSequencerVisitor{
    private KeySignature keySignature;
    private Fraction noteLengthPerBeat;
    private int beatsPerMeasure;
    private HashMap<String, List<Music>> musicForVoiceName;
    
    public SongSequencerVisitor(){
        this.musicForVoiceName = new HashMap<String, List<Music>>();
    }
    
    @Override
    public void visit(Song song) {
        song.getHeader().accept(this);
        song.getBody().accept(this);
    }

    @Override
    public void visit(Header header) {
        this.keySignature = header.getKeySignature();
        this.noteLengthPerBeat = header.getNoteLengthPerBeat();
        this.beatsPerMeasure = header.getBeatsPerMeasure();
    }

    @Override
    public void visit(Body body) {
        for(Voice v : body.getVoices())
            v.accept(this);
    }

    @Override
    public void visit(Voice voice) {
        this.musicForVoiceName.put(voice.getVoiceName(), voice.getSongComponents());
    }

}
