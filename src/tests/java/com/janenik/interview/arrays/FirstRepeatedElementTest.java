package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by jane on 10/19/17.
 */
public class FirstRepeatedElementTest {

    int[] arr = new int[] {};
    int[] arr1 = new int[] {1};

    int[] arr2 = new int[] {10, 5, 3, 3, 5, 8, 2};
    int[] arr3 = new int[] {10, 5};

    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        FirstRepeatedElement.firstRepeatedElement(arr);
    }

    @Test
    public void testException2(){
        try{
            FirstRepeatedElement.firstRepeatedElement(arr1);
            fail("Expected exception");
        }catch (IllegalArgumentException iae){}
    }

    @Test
    public void testRepeated(){

        assertEquals(5, FirstRepeatedElement.firstRepeatedElement(arr2));
        assertEquals(5, FirstRepeatedElement.findUsingHashMap(arr2));

        assertEquals(0, FirstRepeatedElement.firstRepeatedElement(arr3));
        assertEquals(0, FirstRepeatedElement.findUsingHashMap(arr3));

    }
}
