package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/6/17.
 */
public class DigitsInStringTest {

    @Test
    public void testDigits(){

        assertTrue(DigitsInString.areDigits("12345"));
        assertFalse(DigitsInString.areDigits(""));
        assertFalse(DigitsInString.areDigits("    1234"));
        assertFalse(DigitsInString.areDigits("a1234"));
        assertFalse(DigitsInString.areDigits("1234!"));
        assertFalse(DigitsInString.areDigits("1234    "));

        assertTrue(DigitsInString.areDigitsWithRegExpr("12345"));
        assertFalse(DigitsInString.areDigitsWithRegExpr(""));
        assertFalse(DigitsInString.areDigitsWithRegExpr("    1234"));
        assertFalse(DigitsInString.areDigitsWithRegExpr("a1234"));
        assertFalse(DigitsInString.areDigitsWithRegExpr("1234!"));
        assertFalse(DigitsInString.areDigitsWithRegExpr("1234    "));
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        DigitsInString.areDigits(null);
        DigitsInString.areDigitsWithRegExpr(null);
    }
}
