package player;

import java.util.ArrayList;
import java.util.List;

public class Tuplet implements Music {

	private final TupleEnum type;
	private List<Note> notes;
	
	public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Tuplet(TupleEnum type, List<Note> notes) {
		this.type = type;
		this.notes = new ArrayList<Note>(notes);
	}
	
	@Override
	public String toString() {
		StringBuilder tupletBuilder = new StringBuilder();
		tupletBuilder.append(type.toString());
		type.toString();
		for(Note n : notes) {
			tupletBuilder.append(n.toString());
		}
		return tupletBuilder.toString();
	}
	@Override
	public Music copy() {
		return new Tuplet(this.type, new ArrayList<Note>(this.notes));
	}

	@Override
	public Fraction getDuration() {
		int durationNum = 0;
		int durationDen = 1;
		for(Note n : notes) {
			int noteNum = n.getDuration().getNumerator();
			int noteDen = n.getDuration().getDenominator();
			durationNum = noteNum*durationDen + durationNum*noteDen;
			durationDen = noteDen * durationDen;
		}
		switch(type) {
		case DUPLET:
			durationNum *= 3;
			durationDen *= 2;
		case TRIPLET:
			durationNum *= 2;
			durationDen *= 3;
		case QUADRUPLET:
			durationNum *= 3;
			durationDen *= 4;
		}
		return new Fraction(durationNum, durationDen);
	}

}
