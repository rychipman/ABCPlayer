package player;

/**
 * This is an immutable class that inherits from Music and implements Voice.
 * It is a type representing a Rest, which is a pause in the music being 
 * played for a specified duration of time.
 * @author daniman
 */
public class Rest implements Music {

    private final Fraction duration;
    
    /**
     * Construct a new Rest from the duration that is specified.
     * @param duration specifies how long you want to hold the rest for.
     */
    public Rest(Fraction duration){
        this.duration = duration;
    }
    
    /**
     * Returns the set duration of the Rest.
     */
    @Override
    public Fraction getDuration() {
        return this.duration;
    }
    
    /**
     * Returns a string representation of the Rest.
     */
    @Override
    public String toString(){
        return String.format("z%s",this.duration.toString());
    }
    
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Rest))
            return false;
        Rest compareRest = (Rest)other;
        if (compareRest.duration == this.duration) {
            return true;
        } else {return false;}
    }

    /**
     * Returns a copy of the current Rest.
     */
    @Override
    public Music copy() {
        return new Rest(this.duration);
    }
}