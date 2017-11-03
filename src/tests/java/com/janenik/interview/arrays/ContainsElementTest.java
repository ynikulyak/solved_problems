package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jane on 10/16/17.
 */
public class ContainsElementTest {

    @Test
    public void testContain(){

        int[] arr = new int[] {1, 5, 2, 8, 4, 9, 10, 0, 3, 23, 56};
        int[] numbers = new int[] {0, 1, 2};

        assertTrue(ContainsElement.isContain(arr, 23));
        assertFalse(ContainsElement.isContain(arr, 99));

        assertTrue(ContainsElement.isContains(arr, 8));
        assertFalse(ContainsElement.isContains(arr, 99));

        assertTrue(ContainsElement.arePresent(arr, numbers));
    }
}
