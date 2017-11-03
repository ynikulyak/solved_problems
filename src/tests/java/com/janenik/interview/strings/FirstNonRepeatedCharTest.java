package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.fail;

/**
 * Created by jane on 10/5/17.
 */
public class FirstNonRepeatedCharTest {

    @Test
    public void testString() {
        assertEquals('c', FirstNonRepeatedChar.firstNonRepeated("abcdabd"));
        assertNotSame('c', FirstNonRepeatedChar.firstNonRepeated("abdccba"));
        assertNotSame('c', FirstNonRepeatedChar.firstWithHash("abdccba"));
        assertEquals('c', FirstNonRepeatedChar.firstWithHash("abcdabd"));
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        FirstNonRepeatedChar.firstNonRepeated(null);
    }

    @Test
    public void testEmpty() {
        try {
            FirstNonRepeatedChar.firstNonRepeated("");
            fail("Your string is empty: Expected IllegalArgumentException");
        } catch (IllegalArgumentException iae) {

        }
    }

}
