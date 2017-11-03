package com.janenik.interview.strings;

import com.google.common.base.Preconditions;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jane on 10/9/17.
 */
public class RemoveCharFromStringTest {
    @Test(expected = NullPointerException.class)
    public void testNull(){
        RemoveCharFromString.removeChar(null, 'c');
    }

    @Test
    public void testRemove(){

        String expected = "bnn";

        assertEquals(expected, RemoveCharFromString.removeChar("banana", 'a'));
        assertEquals("", RemoveCharFromString.removeChar("", 'c'));
        assertEquals("", RemoveCharFromString.removeChar("aaaaa", 'a'));

        assertEquals(expected, RemoveCharFromString.removeRec("banana", 'a'));
        assertEquals("", RemoveCharFromString.removeRec("", 'c'));
        assertEquals("", RemoveCharFromString.removeRec("aaaaa", 'a'));
    }


}
