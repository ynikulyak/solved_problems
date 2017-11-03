package com.janenik.interview.numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/25/17.
 */
public class PrimeNumbersTest {

    @Test
    public void testNumber(){

        assertFalse(PrimeNumbers.isPrime(0));
        assertFalse(PrimeNumbers.isPrime(-3));
        assertFalse(PrimeNumbers.isPrime(1));
        assertFalse(PrimeNumbers.isPrime(12));

        assertTrue(PrimeNumbers.isPrime(2));
        assertTrue(PrimeNumbers.isPrime(17));
        assertTrue(PrimeNumbers.isPrime(13));
    }
}
