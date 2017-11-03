package com.janenik.interview.numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/25/17.
 */
public class EvenOrOddTest {

    @Test
    public void testNumber(){

        assertTrue(EvenOrOdd.isEven(0));
        assertTrue(EvenOrOdd.isEven(-2));
        assertFalse(EvenOrOdd.isEven(1));
        assertFalse(EvenOrOdd.isEven(3));
        assertFalse(EvenOrOdd.isEven(-5));
    }
}
