package com.janenik.interview.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by jane on 10/16/17.
 */
public class DuplicatesInArrayTest {

    @Test
    public void testDuplicates(){

        int[] arr = new int[] {1, 1, 2, 3, 6, 2, 8, 9, 11, 5, 1, 8};

        List<Integer> expected  = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(8);

        assertEquals(1, DuplicatesInArray.findDuplicate(arr));
        assertNotEquals(0, DuplicatesInArray.findDuplicate(arr));

        assertEquals(expected, DuplicatesInArray.duplicates(arr));
        assertNotEquals(null, DuplicatesInArray.duplicates(arr));

        assertEquals(expected, DuplicatesInArray.duplicatesWithSet(arr));
        assertNotEquals(null, DuplicatesInArray.duplicatesWithSet(arr));

        assertEquals(expected, DuplicatesInArray.duplicatesWithHashMap(arr));
        assertNotEquals(null, DuplicatesInArray.duplicatesWithHashMap(arr));
    }

    @Test
    public void testRemove(){
        int[] arr = new int[] {1, 1, 2, 3, 6, 2, 8, 9, 11, 5, 1, 8};
        Integer[] array = new Integer[] {1, 1, 2, 3, 6, 2, 8, 9, 11, 5, 1, 8};

        int[] expected = new int[] {1, 2, 3, 6, 8, 9, 11, 5};
        Integer[] expected2 = new Integer[] {1, 2, 3, 6, 8, 9, 11, 5};
        int[] expected3 = new int[] {1,2, 3, 5, 6, 8, 9, 11};

        int[] arr1 = new int[]{1};
        assertArrayEquals(expected, DuplicatesInArray.removeDuplicates(arr));
        assertArrayEquals(expected2, DuplicatesInArray.removeDuplicates1(array));
        assertArrayEquals(expected3, DuplicatesInArray.removeDuplicates2(arr));

        assertEquals(null, DuplicatesInArray.removeDuplicates(arr1));
    }

    @Test
    public void testReplace(){

        int[] arr = new int[] {1, 1, 2, 3, 6, 2, 8, 9, 11, 5, 1, 8};

        int[] expected = new int[] {1, 0, 0, 2, 0, 3, 5, 6, 8, 0, 9, 11};

        assertArrayEquals(expected, DuplicatesInArray.replace(arr));
    }
}
