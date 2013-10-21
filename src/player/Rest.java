package player;

public class Rest implements Music {

    private final Fraction duration;
    
    public Rest(Fraction duration){
        this.duration = duration;
    }
    
    @Override
    public Fraction getDuration() {
        return this.duration;
    }
    
    @Override
    public String toString(){
        return String.format("z%s",this.duration.toString());
    }

    @Override
    public Music copy() {
        return new Rest(this.duration);
    }

    @Override
    public void accept(ISongSequencerVisitor visitor) {
        visitor.visit(this);   
    }
}
