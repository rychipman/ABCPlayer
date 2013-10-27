package player;

/**
 * Class for representing a rational number of the form numerator/denominator
 * 
 * This class is immutable
 *      The fields are both ints, which are immutable
 *      We do not modify the fields in methods other than the constructor
 *      Both fields are declared final
 * 
 * Abstraction Function: The Fraction with numerator=n, denominator=d maps to the fraction n/d
 * 
 * Datatype definition
 * Fraction = {int: numerator, int: denominator} denominator != 0
 *
 */
public class Fraction implements Comparable<Object>{
   /**
    * The numerator of the fraction
    */
    private final int numerator;
    
    /**
     * The denominator of the fraction - cannot be 0
     */
    private final int denominator;

    /**
     * Constructs the fraction numerator/denominator
     * @param numerator - the numerator of the fraction
     * @param denominator the denominator of the fraction - must be nonzero
     */
    public Fraction(int numerator, int denominator) {
        
        /*
         * Although we require a nonzero denominator in our precondition, we will double check
         * that it is indeed nonzero
         */
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot have a denominator of 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    /**
     * @return the numerator of the fraction
     */
    public int getNumerator() {
        return numerator;
    }
    
    /**
     * @return the denominator of the fraction
     */
    public int getDenominator() {
        return denominator;
    }
    
    /**
     * Returns a double representing the fraction
     */
    public double getFraction() {
        return ( (double) numerator) / ( (double) denominator);
    }
    
    /**
     * Using Euclid's algorithm, this calculates the greatest common denominator of two integers.
     * @param a  Must be a positive integer.
     * @param b Must be a positive integer.
     * @return Returns the greatest common denominator.
     */
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (b > a) {
            int placeHolder = b;
            b = a;
            a = placeHolder;
        }
        return GCD(b, a % b);
    }
    
    /**
     * This calculates the least common multiple of two integers.
     * Note: this method does not handle large numbers so inputs must be within a reasonable range.
     * @param a Must be a positive integer.
     * @param b Must be a positive integer.
     * @return Returns the least common multiple.
     */
    public static int LCM(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        int lcm =  (a / GCD(a, b)) * b;
        return lcm;
     }

    /**
     * Determines whether two Fractions
     * @param other the other fraction to be compared to - must be of type Fraction and must not be null
     * @return 0 if the fractions are equal, positive if other is smaller, negative if other is larger
     */
    @Override
    public int compareTo(Object other) {
        /*
         * Although we specify that other must be a non-null Fraction, we double check
         */
        if(!(other instanceof Fraction))
            throw new IllegalArgumentException("Can only compare this to a Fraction object");
        
        /*
         * If we are comparing fractions a/b and c/d, we consider the quantity:
         * ad - bc
         * which is:
         * 0 if a/b = c/d
         * >0 if a/b > c/d
         * <0 if a/b < c/d
         * 
         *  We apply this rule to the case where
         *  a/b is this
         *  c/d is other
         */
        
        Fraction otherFrac = (Fraction)other;
        return (this.getNumerator()*otherFrac.getDenominator() - otherFrac.getNumerator()*this.getDenominator());
    } 
    
    /**
     * @return a string representation of the fraction (of the form numerator/denominator)
     */
    @Override
    public String toString(){
        return String.format("%d/%d", this.getNumerator(), this.getDenominator());
    }
}