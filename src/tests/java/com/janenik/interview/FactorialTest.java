package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 7/20/17.
 */
public class FactorialTest {

    @Test
    public void testFact() {

        assertEquals(1, Factorial.factor(0));
        assertEquals(1, Factorial.factor(1));
        assertEquals(2, Factorial.factor(2));
        assertEquals(6, Factorial.factor(3));
        assertEquals(24, Factorial.factor(4));
        assertEquals(120, Factorial.factor(5));
    }

    @Test
    public void testFacRec() {

        assertEquals(1, Factorial.facRec(0));
        assertEquals(1, Factorial.facRec(1));
        assertEquals(2, Factorial.facRec(2));
        assertEquals(6, Factorial.facRec(3));
        assertEquals(24, Factorial.facRec(4));
        assertEquals(120, Factorial.facRec(5));
    }
}
