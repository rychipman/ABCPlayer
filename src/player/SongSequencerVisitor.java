package player;

import java.util.List;

public class SongSequencerVisitor implements ISongSequencerVisitor{
    private KeySignature keySignature;
    private Fraction noteLengthPerBeat;
    private int beatsPerMeasure;
    private List<Music> music;
    
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
    public void visit(Music music) {}

    @Override
    public void visit(Note note) {
    }

    @Override
    public void visit(Rest song) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Voice voice) {
        // TODO Auto-generated method stub
        
    }

}
