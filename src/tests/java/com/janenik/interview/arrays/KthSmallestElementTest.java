package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

/**
 * Created by jane on 10/18/17.
 */
public class KthSmallestElementTest {

    int[] arr = new int[] {1, 8, 4, -2, 9, 0, 23, 87};
    @Test
    public void testKthSmallestElement(){

        assertEquals(-2, KthSmallestElement.kthSmallest(arr, 1));
        assertEquals(4, KthSmallestElement.kthSmallest(arr, 4));
        assertNotEquals(0, KthSmallestElement.kthSmallest(arr, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        KthSmallestElement.kthSmallest(arr, 100);
    }

    @Test
    public void testException2(){
        try{
            KthSmallestElement.kthSmallest(arr, 100);
            fail("Expected exception");
        }catch (IllegalArgumentException iae){}
    }
}
