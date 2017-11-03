package com.janenik.interview.strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/9/17.
 */
public class ReverseWordsInStringTest {

    @Test(expected = NullPointerException.class)
    public void testNull(){
        ReverseWordsInString.reverse(null);
    }

    @Test
    public void testReverse(){

        String expected = "language programming best is Java";

        assertEquals(expected, ReverseWordsInString.reverse("Java is best programming language"));
        assertNotEquals(expected, ReverseWordsInString.reverse("Java is best programming language ever"));

        assertEquals(expected, ReverseWordsInString.reverse2("Java is best programming language"));
        assertNotEquals(expected, ReverseWordsInString.reverse2("Java is best programming language ever"));

    }
}
