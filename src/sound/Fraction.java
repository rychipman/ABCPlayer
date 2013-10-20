package sound;

public class Fraction{
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Cannot have a denominator of 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
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
    
}