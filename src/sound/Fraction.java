package sound;

public class Fraction {
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
    
}
