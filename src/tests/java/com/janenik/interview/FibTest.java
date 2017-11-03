package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 7/20/17.
 */
public class FibTest {

    @Test
    public void testFib(){

        assertEquals(0L, Fibonacci.fib1(0));
        assertEquals(1, Fibonacci.fib1(1));
        assertEquals(1, Fibonacci.fib1(2));
        assertEquals(2, Fibonacci.fib1(3));
        assertEquals(13, Fibonacci.fib1(7));
    }

    @Test
    public void testFibRec(){

        assertEquals(0, Fibonacci.fibRec(0));
        assertEquals(1, Fibonacci.fibRec(1));
        assertEquals(1, Fibonacci.fibRec(2));
        assertEquals(2, Fibonacci.fibRec(3));
        assertEquals(13, Fibonacci.fibRec(7));
    }
}
