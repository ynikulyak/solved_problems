package com.janenik.interview.sortingalgorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jane on 7/21/17.
 */
public class BubbleSortTest {

    int[] array;
    int[] expected;

    @Before
    public void setUp() {
        array = new int[]{2, 1, 0, 8, 4, 5, 3};
        expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
    }

    @Test
    public void testBubbleSort() {
        assertArrayEquals(expected, BubbleSort.sort(array));
        assertArrayEquals(new int[]{2}, BubbleSort.sort(new int[]{2}));
        assertArrayEquals(new int[]{0, 2}, BubbleSort.sort(new int[]{2, 0}));

    }
}
