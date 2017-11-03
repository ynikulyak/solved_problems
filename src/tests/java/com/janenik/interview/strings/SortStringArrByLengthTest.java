package com.janenik.interview.strings;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jane on 10/10/17.
 */
public class SortStringArrByLengthTest {

    @Test
    public void testSort() {

        String[] expected = {"a", "ab", "abc", "abcd", "abcde", "1234567890"};
        String[] actual = {"abcde", "a", "abc", "1234567890", "ab", "abcd"};

        assertArrayEquals(expected, SortStringArrByLength.sort(actual));
        assertArrayEquals(expected, SortStringArrByLength.sortWithLambda(actual));
        assertArrayEquals(expected, SortStringArrByLength.sortWithBubbleSort(actual));
    }
}
