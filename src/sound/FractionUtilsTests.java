package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionUtilsTests {

    @Test
    public void GCDTests() {
        // test when b > a
        assertEquals(6, FractionUtils.GCD(24, 42));
        // test when a > b
        assertEquals(6, FractionUtils.GCD(42, 24));
        // test when b is a really big number
        assertEquals(1, FractionUtils.GCD(24, Integer.MAX_VALUE));
        // test when either a or b is zero
        assertEquals(1, FractionUtils.GCD(1, 0));
        // test when both a and b are zero
        assertEquals(0, FractionUtils.GCD(0, 0));
    }
    
    @Test
    public void LCMTests() {
        // test when b > a
        assertEquals(168, FractionUtils.LCM(24, 42));
        // test when a > b
        assertEquals(168, FractionUtils.LCM(42, 24));
        // test when either a or b is zero
        assertEquals(0, FractionUtils.LCM(1, 0));
        // test when both a and b are zero
        assertEquals(0, FractionUtils.LCM(0, 0));
    }

}