package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jane on 10/19/17.
 */
public class TopTwoNumbersTest {

    int[] arr = new int[] {3, 98, 12, 0, 344, 9, 900, 2, 123, 345};

    int[] expected = new int[] {345, 900};
    int[] unexpected = new int[] {3, 9};

    int[] arr2 = new int[]{};
    int[] arr3 = new int[]{1};
    int[] arr1 = new int[] {23, 45};
    int[] expected1 = new int[] {23, 45};

    @Test
    public void testException1(){
        try{
            TopTwoNumbers.topTwoNumbers(arr2);
            TopTwoNumbers.topTwoNumbers(arr3);

            fail("Expected Illigal argument exception");
        }catch (IllegalArgumentException iae){
            System.out.println("Expected exception");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException2(){
        TopTwoNumbers.topTwoWithSorting(arr3);
        TopTwoNumbers.topTwoWithSorting(arr2);
    }

    @Test
    public void testTopTwoNumbers(){

        assertArrayEquals(expected, TopTwoNumbers.topTwoNumbers(arr));
        assertArrayEquals(expected, TopTwoNumbers.topTwoWithSorting(arr));
        assertArrayEquals(expected1, TopTwoNumbers.topTwoNumbers(arr1));
        assertArrayEquals(expected1, TopTwoNumbers.topTwoWithSorting(arr1));

        assertNotSame(unexpected, TopTwoNumbers.topTwoNumbers(arr));
        assertNotSame(unexpected, TopTwoNumbers.topTwoWithSorting(arr));
    }
}
