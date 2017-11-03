package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

/**
 * Created by jane on 10/19/17.
 */
public class FirstNonRepeatedElementTest {

    int[] arr = new int[] {};
    int[] arr1 = new int[] {1};
    int[] arr2 = new int[] {2, 2};
    int[] arr3 = new int[] {2, 3};
    int[] arr4 = new int[] { 10, 4, 8, 7, 9, 10, 4, 9};

    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        FirstNonRepeatedElement.findWithHashMap(arr);
    }

    @Test
    public void testNonRepeatedElement(){
        assertEquals(1, FirstNonRepeatedElement.findWithHashMap(arr1));
        assertEquals(0, FirstNonRepeatedElement.findWithHashMap(arr2));
        assertEquals(2, FirstNonRepeatedElement.findWithHashMap(arr3));
        assertEquals(8, FirstNonRepeatedElement.findWithHashMap(arr4));

        assertEquals(1, FirstNonRepeatedElement.firstNonRepeatedElement(arr1));
        assertEquals(0, FirstNonRepeatedElement.firstNonRepeatedElement(arr2));
        assertEquals(2, FirstNonRepeatedElement.firstNonRepeatedElement(arr3));
        assertEquals(8, FirstNonRepeatedElement.firstNonRepeatedElement(arr4));

        assertNotEquals(2, FirstNonRepeatedElement.findWithHashMap(arr2));
        assertNotEquals(3, FirstNonRepeatedElement.findWithHashMap(arr3));
        assertNotEquals(7, FirstNonRepeatedElement.findWithHashMap(arr4));

        assertNotEquals(2, FirstNonRepeatedElement.firstNonRepeatedElement(arr2));
        assertNotEquals(3, FirstNonRepeatedElement.firstNonRepeatedElement(arr3));
        assertNotEquals(7, FirstNonRepeatedElement.firstNonRepeatedElement(arr4));


    }



}
