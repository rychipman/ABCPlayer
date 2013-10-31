package player;

import java.util.ArrayList;
import java.util.List;

/**
 * A type representing a tuplet, which is simply a group of 
 * notes played successively, with spacing dependent on the type of tuplet
 * 
 * Rep Invariant: This class is immutable
 *      We copy the notes in the constructor to ensure that the client cannot modify them
 *      The list of notes is final
 *      We do not modify the fields in other methods
 *      There is no rep exposure
 *      
 * Datatype definition:
 * Tuplet = List<Note> + tuplet type
 */

public class Tuplet implements Music {

    /**
     * The type of the tuplet - either a duplet, triplet, or quadruplet 
     */
	private final TupletEnum type;
	
	/**
	 * The notes that constitute this tuplet
	 */
	private final List<Music> notes;
	
	/**
	 * @return the notes that constitute this tuplet (IMPORTANT: the "notes" can include Chords)
	 */
	public List<Music> getNotes() {
        return notes;
    }
	
	/**
	 * @return the type of this tuplet
	 */
	public TupletEnum getType() {
		return type;
	}

	/**
	 * @param type the type of this tuplet (duplet, triplet, quadruplet)
	 * @param notes the notes that constitute this tuplet
	 */
    public Tuplet(TupletEnum type, List<Music> notes) {
		this.type = type;
		this.notes = new ArrayList<Music>(notes);
	}
	
    /**
     * @return a string representation of this tuplet
     */
	@Override
	public String toString() {
	    String startString = (type == TupletEnum.DUPLET) ? "Duplet(" : ((type == TupletEnum.TRIPLET) ? "Triplet(" : "Quadruplet(");
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
        Tuplet Tuplet = (Tuplet)other;
        for (int i = 0; i < Tuplet.notes.size(); i ++) {
           if (!(Tuplet.notes.get(i).equals(this.notes.get(i))))
               return false;
        }
        return true;
    }

	
	/**
	 * @return returns a copy of this tuplet
	 */
	@Override
	public Music copy() {
		return new Tuplet(this.type, new ArrayList<Music>(this.notes));
	}

	/**
	 * @return Computes the duration of the tuplet based on its type and its constituents
	 */
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
