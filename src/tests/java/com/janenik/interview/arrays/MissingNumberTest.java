package com.janenik.interview.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by jane on 10/16/17.
 */
public class MissingNumberTest {

    @Test
    public void testMissing(){

        int[] arr = new int[100];

        for(int i = 0; i <99; i++){
            arr[i] = i+1;
        }

        int[] arr2 = new int[50];
        for(int i = 0; i < 50; i++){
            arr2[i] = i+1;
        }

        int[] arr3 = new int[50];
        for(int i = 0; i <= 20; i++){
            arr3[i] = i+1;
        }

        for(int i = 22; i <50; i++){
            arr3[i] = i+1;
        }

        int[] arr4 = new int[] {1, 2, 4, 5, 7, 8, 10, 11, 12, 13, 14, 15, 17};
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(6);
        expected.add(9);
        expected.add(16);

        assertEquals(100, MissingNumber.misNumber(arr, 100));
        assertNotEquals(99, MissingNumber.misNumber(arr, 100));
        assertEquals(0, MissingNumber.misNumber(arr2, 50));
        assertNotEquals(3, MissingNumber.misNumber(arr2, 50));
        assertEquals(22, MissingNumber.misNumber(arr3, 50));
        assertNotEquals(3, MissingNumber.misNumber(arr3, 50));
        assertEquals(expected, MissingNumber.numbers(arr4));

        assertEquals(100, MissingNumber.missingNumber(arr));
        assertNotEquals(99, MissingNumber.missingNumber(arr));
        assertEquals(0, MissingNumber.missingNumber(arr2));
        assertNotEquals(3, MissingNumber.missingNumber(arr2));
        assertEquals(22, MissingNumber.missingNumber(arr3));
        assertNotEquals(3, MissingNumber.missingNumber(arr3));

    }
}
