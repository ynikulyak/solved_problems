package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/9/17.
 */
public class RemoveDuplicatesFromStringTest {

    @Test(expected = NullPointerException.class)
    public void testNull(){
        RemoveDuplicatesFromString.removeDuplicates(null);
    }

    @Test
    public void testRemove(){

        String expected = "bans";
        assertEquals(expected, RemoveDuplicatesFromString.removeDuplicates("bananas"));
        assertEquals("", RemoveDuplicatesFromString.removeDuplicates(""));
        assertNotEquals(expected, RemoveDuplicatesFromString.removeDuplicates("bananase"));
    }
}
