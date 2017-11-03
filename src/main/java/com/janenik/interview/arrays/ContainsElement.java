package com.janenik.interview.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/**
 * Created by jane on 10/16/17.
 */
public class ContainsElement {

    public static boolean isContain(int[] arr, int number) {

        Arrays.sort(arr);

        int first = 0;
        int last = arr.length - 1;


        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == number) {
                return true;
            }
            if (arr[mid] > number) {
                last = arr[mid - 1];
            }
            if (arr[mid] < number) {
                first = arr[mid + 1];
            }
        }
        return false;
    }

    public static boolean isContains(int[] arr, int number) {

        for (int i : arr) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * TODO: convert both arguments to Set<Integer> and check with {@link Set#containsAll(Collection)} ())
     **/

    public static boolean arePresent(int[] arr, int[] numbsers) {

        boolean[] present = new boolean[numbsers.length];

        for (int num : numbsers) {
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    present[i] = true;
                }
            }
        }

        for (int i = 0; i < present.length; i++) {
            if (present[i] == false) {
                return false;
            }
        }
        return true;
    }
}
