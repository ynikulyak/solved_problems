package com.janenik.interview.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/10/17.
 */
public class IsStringAsubstringTest {

    @Test(expected = NullPointerException.class)
    public void testNull(){
        IsStringAsubstring.isSubstring(null, null);
        IsStringAsubstring.isSubstring(null, "of");
        IsStringAsubstring.isSubstring("pot", null);
    }

    @Test
    public void testSubstring(){

        assertEquals(-1, IsStringAsubstring.isSubstring("", "of"));
        assertEquals(-1, IsStringAsubstring.isSubstring("pot", "potty"));
        assertEquals(-1, IsStringAsubstring.isSubstring("pot", ""));

        assertEquals(2, IsStringAsubstring.isSubstring("Dasha", "sha"));
        assertEquals(0, IsStringAsubstring.isSubstring("Dasha", "Da"));

        assertNotEquals(2, IsStringAsubstring.isSubstring("Dasha", "shaa"));

        assertEquals(-1, IsStringAsubstring.isSubstringWithIndexOf("", "of"));
        assertEquals(-1, IsStringAsubstring.isSubstringWithIndexOf("pot", "potty"));
        assertEquals(-1, IsStringAsubstring.isSubstringWithIndexOf("pot", ""));

        assertEquals(2, IsStringAsubstring.isSubstringWithIndexOf("Dasha", "sha"));
        assertEquals(0, IsStringAsubstring.isSubstringWithIndexOf("Dasha", "Da"));

        assertNotEquals(2, IsStringAsubstring.isSubstringWithIndexOf("Dasha", "shaa"));
    }
}