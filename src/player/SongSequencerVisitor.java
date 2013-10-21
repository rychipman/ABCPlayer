package player;

public class SongSequencerVisitor implements ISongSequencerVisitor{
    @Override
    public void visit(Song song) {
        Header header = song.getHeader();
        Body body = song.getBody();
    }

    @Override
    public void visit(Header song) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Body song) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Music song) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void visit(Note song) {
        // TODO Auto-generated method stub
        
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
