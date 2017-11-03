package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jane on 10/18/17.
 */
public class IntersectionOfTwoArraysTest {

    @Test
    public void testIntersection(){

        int[] arr1 = new int[] {1, 5, 9, 23, 90, 43, 8};
        int[] arr2 = new int[] {9, 0, 10, 7, 100, 1, 5};
        int[] expected = new int[] {9, 1, 5};

        assertArrayEquals(expected, IntersectionOfTwoArrays.intersection(arr1, arr2));
    }
}
