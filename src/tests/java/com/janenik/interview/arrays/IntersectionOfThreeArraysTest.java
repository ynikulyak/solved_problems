package com.janenik.interview.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 10/19/17.
 */
public class IntersectionOfThreeArraysTest {

    int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] arr2 = new int[] { 9, 7, 5, 3, 1};
    int[] arr3 = new int[] {4, 5, 7, 1};
    List<Integer> expected1 = new ArrayList<>();
    Set<Integer> expected = new HashSet<>();

    @Test
    public void testIntersection(){

        expected.add(1);
        expected.add(5);
        expected.add(7);

        expected1.add(1);
        expected1.add(5);
        expected1.add(7);

        assertEquals(expected, IntersectionOfThreeArrays.intersection(arr1, arr2, arr3));
        assertEquals(expected1, IntersectionOfThreeArrays.intersection2(arr1, arr2, arr3));
    }
}
