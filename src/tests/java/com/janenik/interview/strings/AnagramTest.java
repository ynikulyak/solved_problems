package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by jane on 10/4/17.
 */
public class AnagramTest {

    @Test
    public void testAnagram() {
        assertFalse(Anagram.isAnagram("aaam", "mama1"));
        assertTrue(Anagram.isAnagram("world", "dorwl"));
        assertTrue(Anagram.isAnagram("       123abs", "sab"));
        assertFalse(Anagram.isAnagram("asdv", "aadv"));
        assertFalse(Anagram.isAnagram("mama", "mamaa"));
        assertFalse(Anagram.isAnagram("", "asd"));
    }

    @Test(expected = NullPointerException.class)
    public void testNull1() {
        Anagram.isAnagram(null, "abs");
    }

    @Test
    public void testNull2() {
        try {
            Anagram.isAnagram(null, "abs");
            fail("This should not happend");
        } catch (NullPointerException npe) {
            // Expected.
        }
    }
}
