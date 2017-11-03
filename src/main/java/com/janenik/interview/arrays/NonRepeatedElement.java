package com.janenik.interview.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 10/18/17.
 */
public class NonRepeatedElement {

    public static int nonRepeated(int[] arr) {

        if (arr.length == 1) {
            return arr[0];
        }

        Arrays.sort(arr);

        int found = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            if (arr[i] != arr[i - 1]) {
                found = arr[i - 1];
                break;
            }
        }
        return found;
    }

    public static int nonRepeatedWithXor(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Non-empty array expected");
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i]; // uses property of XOR:  a XOR a = 0
        }
        return x;
    }

    public static int nonRepeatedWithHashMap(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }

        int found = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                found = entry.getKey();
            }
        }
        return found;
    }
}
