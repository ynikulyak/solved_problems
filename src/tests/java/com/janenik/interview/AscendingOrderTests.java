package com.janenik.interview;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by jane on 9/20/17.
 */
public class AscendingOrderTests {


        int[] arr = {9, 4, 2, 8, 10, 5, 1};
        int[] arr1 = {1, 2, 4, 5, 8, 9, 10};


    @Test
    public void testAscendingOrder(){
        assertArrayEquals(arr1, AscendingOrder.ascendingOrder(arr));
    }
}
