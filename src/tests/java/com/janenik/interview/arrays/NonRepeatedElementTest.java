package com.janenik.interview.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jane on 10/18/17.
 */
public class NonRepeatedElementTest {

    @Test
    public void testElement() {

        int[] arr0 = new int[]{1, 1, 2, 2, 3, 3, 5, 6, 5};
        int[] arr = new int[]{2, 5, 9, 4, 0, 9, 3, 0, 2, 5, 4};
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{};

        assertEquals(3, NonRepeatedElement.nonRepeated(arr));
        assertEquals(1, NonRepeatedElement.nonRepeated(arr1));
        assertEquals(0, NonRepeatedElement.nonRepeated(arr2));

        assertEquals(3, NonRepeatedElement.nonRepeatedWithHashMap(arr));
        assertEquals(1, NonRepeatedElement.nonRepeatedWithHashMap(arr1));
        assertEquals(0, NonRepeatedElement.nonRepeatedWithHashMap(arr2));

        assertEquals(3, NonRepeatedElement.nonRepeatedWithXor(arr));
        assertEquals(1, NonRepeatedElement.nonRepeatedWithXor(arr1));
        assertEquals(6, NonRepeatedElement.nonRepeatedWithXor(arr0));
    }
}
