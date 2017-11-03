package com.janenik.interview.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/10/17.
 */
public class MostPopularCharInStringTest {

    @Test(expected = NullPointerException.class)
    public void testNull(){
        MostPopularCharInString.popular(null);
    }

    @Test
    public void testPopularChar(){

        assertEquals(0, MostPopularCharInString.popular(""));
        assertNotEquals('a', MostPopularCharInString.popular(""));

        assertEquals('a', MostPopularCharInString.popular("aaavvd"));
        assertNotEquals('a', MostPopularCharInString.popular("aaavvvddddadd"));
    }
}
