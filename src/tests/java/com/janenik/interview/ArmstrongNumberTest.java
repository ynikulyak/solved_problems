package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 9/20/17.
 */
public class ArmstrongNumberTest {

    @Test
    public void testArmstrong(){
        assertTrue(ArmstrongNumber.armstrongNumber(407));
        assertFalse(ArmstrongNumber.armstrongNumber(26));
        assertTrue(ArmstrongNumber.armstrongNumber(6));
        assertTrue(ArmstrongNumber.armstrongNumber(1634));
    }
}
