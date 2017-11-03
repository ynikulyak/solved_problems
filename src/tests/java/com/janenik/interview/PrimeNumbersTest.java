package com.janenik.interview;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by jane on 9/23/17.
 */
public class PrimeNumbersTest {
    // 31 * 11 =  341

    int[] arr = new int[350];
    List<Integer> list = new ArrayList<>();
    PrimeNumbers num = new PrimeNumbers();

    @Before
    public void setUp() {
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(23);
        list.add(29);
        list.add(31);
        list.add(37);
        list.add(41);
        list.add(43);
        list.add(47);
    }

    @Test
    public void testPrimes(){
        assertEquals(list, num.prime(1, 50));
        /*2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,*/


    }


}
