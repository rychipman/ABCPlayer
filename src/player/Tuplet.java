package player;

import java.util.ArrayList;
import java.util.List;

public class Tuplet implements Music {

	private final TupleEnum type;
	private List<Music> notes;
	
	public List<Music> getNotes() {
        return notes;
    }
	
	public TupleEnum getType() {
		return type;
	}

    public void setNotes(List<Music> notes) {
        this.notes = notes;
    }

    public Tuplet(TupleEnum type, List<Music> notes) {
		this.type = type;
		this.notes = new ArrayList<Music>(notes);
	}
	
	@Override
	public String toString() {
	    String startString = (type == TupleEnum.DUPLET) ? "Duplet(" : ((type == TupleEnum.TRIPLET) ? "Triplet(" : "Quadruplet(");
		StringBuilder tupletBuilder = new StringBuilder(startString);
		for(Music n : notes) {
			tupletBuilder.append(n.toString() + ",");
		}
		tupletBuilder.append(")");
		return tupletBuilder.toString();
	}
	
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Tuplet))
            return false;
        Tuplet compareTuplet = (Tuplet)other;
        if (compareTuplet.notes.equals(this.notes)) {
            return true;
        } else {return false;}
    }
	
	@Override
	public Music copy() {
		return new Tuplet(this.type, new ArrayList<Music>(this.notes));
	}

	@Override
	public Fraction getDuration() {
		int durationNum = 0;
		int durationDen = 1;
		for(Music n : notes) {
			int noteNum = n.getDuration().getNumerator();
			int noteDen = n.getDuration().getDenominator();
			durationNum = noteNum*durationDen + durationNum*noteDen;
			durationDen = noteDen * durationDen;
		}
		int gcd = Fraction.GCD(durationNum, durationDen);
		durationNum /= gcd;
		durationDen /= gcd;
		switch(type) {
		case DUPLET:
			durationNum *= 3;
			durationDen *= 2;
			break;
		case TRIPLET:
			durationNum *= 2;
			durationDen *= 3;
			break;
		case QUADRUPLET:
			durationNum *= 3;
			durationDen *= 4;
			break;
		}
		return new Fraction(durationNum, durationDen);
	}

}
