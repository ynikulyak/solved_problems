package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/7/17.
 */
public class PalindromNumberTest {

    @Test
    public void testPalindrom(){

        assertTrue(PalindromNumber.isPalindrom(12321));
        assertFalse(PalindromNumber.isPalindrom(123123));
    }
}
