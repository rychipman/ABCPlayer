package player;

import java.util.ArrayList;
import java.util.List;

public class Chord implements Music{

    private final List<Note> notes;
    
    public Chord(List<Note> notes){
        assert notes.size() > 1;
        this.notes = new ArrayList<Note>();
        for (Note n : notes)
            this.notes.add(n);
    }

    @Override
    public Music copy() {
        return new Chord(this.notes);
    }

    @Override
    public Fraction getDuration() {
        Fraction maxDuration = new Fraction(0,1);
        for (Note n : this.notes)
            if (n.getDuration().compareTo(maxDuration) > 0)
                maxDuration = n.getDuration();
        return maxDuration;
    }

}
