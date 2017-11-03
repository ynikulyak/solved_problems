package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 7/25/17.
 */
public class FirstLetterInStringTest {

    @Test
    public void testString(){

        assertEquals("There are no letters in a given string.", FirstLetterInString.printFirstLetters(""));
        assertEquals("a", FirstLetterInString.printFirstLetters("a"));
        assertEquals("m p b ", FirstLetterInString.printFirstLetters("mama papa brother"));
        assertEquals("m p b ", FirstLetterInString.printFirstLetters("        ma     pa     br       "));
        assertEquals("m p b ", FirstLetterInString.printFirstLetters("        ma, pa br"));
        assertNotEquals("m p b ", FirstLetterInString.printFirstLetters("    ma ,     pa br b"));
    }
}
