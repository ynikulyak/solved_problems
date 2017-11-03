package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jane on 9/26/17.
 */
public class ReverseStringTest {
    @Test()
    public void testReverse(){
        assertEquals("abc", ReverseString.reverseUsingStringBuilder("cba"));
        assertEquals("a", ReverseString.reverseUsingStringBuilder("a"));
        assertEquals("ab", ReverseString.reverseUsingStringBuilder("ba"));
        assertEquals("mama", ReverseString.reverseUsingStringBuilder("amam"));

        assertEquals("abc", ReverseString.reverseRec("cba"));
        assertEquals("a", ReverseString.reverseRec("a"));
        assertEquals("ab", ReverseString.reverseRec("ba"));
        assertEquals("mama", ReverseString.reverseRec("amam"));

        assertEquals("abc", ReverseString.reverseString("cba"));
        assertEquals("", ReverseString.reverseString(""));
    }


}
