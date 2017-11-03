package com.janenik.interview.numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/26/17.
 */
public class ArmstrongNumbersTest {

    @Test
    public void testArmstrongNumber(){

        assertFalse(ArmstrongNumber.isArmstrong(-5));
        assertFalse(ArmstrongNumber.isArmstrong(0));
        assertFalse(ArmstrongNumber.isArmstrong(23));
        assertFalse(ArmstrongNumber.isArmstrong(344));

        assertTrue(ArmstrongNumber.isArmstrong(1));
        assertTrue(ArmstrongNumber.isArmstrong(3));
        assertTrue(ArmstrongNumber.isArmstrong(407));
        assertTrue(ArmstrongNumber.isArmstrong(1634));
    }
}
