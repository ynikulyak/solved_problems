package com.janenik.interview.numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/25/17.
 */
public class PowerOfTwoTest {

    @Test
    public void testPowerOfTwo(){

        assertFalse(PowerOfTwo.isPowerOfTwo(0));
        assertFalse(PowerOfTwo.isPowerOfTwo(-4));
        assertFalse(PowerOfTwo.isPowerOfTwo(7));

        assertTrue(PowerOfTwo.isPowerOfTwo(1));
        assertTrue(PowerOfTwo.isPowerOfTwo(2));
        assertTrue(PowerOfTwo.isPowerOfTwo(128));
    }

    @Test
    public void testPowerOfTwoWithBit(){

        assertTrue(PowerOfTwo.isPowerOfTwoUsingBit(1));
        assertTrue(PowerOfTwo.isPowerOfTwoUsingBit(2));
        assertTrue(PowerOfTwo.isPowerOfTwoUsingBit(128));

        assertFalse(PowerOfTwo.isPowerOfTwoUsingBit(0));
        assertFalse(PowerOfTwo.isPowerOfTwoUsingBit(-4));
        assertFalse(PowerOfTwo.isPowerOfTwoUsingBit(7));
    }
}
