package com.janenik.interview;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/5/17.
 */
public class AnagramNumbersTest {

    @Test
    public void testAnagram(){

        assertTrue(AnagramNumbers.isAnagram(1234, 4312));
        assertFalse(AnagramNumbers.isAnagram(0, 23));
        assertFalse(AnagramNumbers.isAnagram(1234, 4423));
    }
}
