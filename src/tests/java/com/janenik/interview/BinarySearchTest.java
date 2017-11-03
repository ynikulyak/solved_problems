package com.janenik.interview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 7/21/17.
 */
public class BinarySearchTest {

    int[] array;

    @Before
    public void setUp() {
        array = new int[]{0, 4, 6, 8, 10, 12, 14, 16};
    }

    @Test
    public void testBinarySearchIter() {
        assertEquals(1, BinarySearch.binarySearchIter(array, 4));
        assertEquals(7, BinarySearch.binarySearchIter(array, 16));
        assertEquals(-1, BinarySearch.binarySearchIter(array, 18));
    }

    @Test
    public void testBinarySearchRecursive() {
        assertEquals(1, BinarySearch.binarySearchRecursive(array, 4, 0, array.length - 1));
        assertEquals(7, BinarySearch.binarySearchRecursive(array, 16, 0, array.length - 1));
        assertEquals(-1, BinarySearch.binarySearchRecursive(array, 18, 0, array.length - 1));
    }
}
