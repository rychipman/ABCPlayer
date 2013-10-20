package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilitiesTest {

    @Test
    public void GCDTests() {
        // test when b > a
        assertEquals(6, Utilities.GCD(24, 42));
        // test when a > b
        assertEquals(6, Utilities.GCD(42, 24));
        // test when b is a really big number
        assertEquals(1, Utilities.GCD(24, Integer.MAX_VALUE));
        // test when either a or b is zero
        assertEquals(1, Utilities.GCD(1, 0));
        // test when both a and b are zero
        assertEquals(0, Utilities.GCD(0, 0));
    }
    
    @Test
    public void LCMTests() {
        // test when b > a
        assertEquals(168, Utilities.LCM(24, 42));
        // test when a > b
        assertEquals(168, Utilities.LCM(42, 24));
        // test when either a or b is zero
        assertEquals(0, Utilities.LCM(1, 0));
        // test when both a and b are zero
        assertEquals(0, Utilities.LCM(0, 0));
    }

}
