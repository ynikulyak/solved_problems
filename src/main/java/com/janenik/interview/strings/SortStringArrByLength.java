package com.janenik.interview.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 10/10/17.
 */
public class SortStringArrByLength {

    private static final Comparator<String> SORT_BY_LENGTH = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            // If something is null - don't swap.
            if (o1 == null || o2 == null) {
                return 0;
            }
            return Integer.compare(o1.length(), o2.length());
        }
    };

    public static String[] sort(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        return arr;
    }

    public static String[] sortWithLambda(String[] str) {
        Arrays.sort(str, (a, b) -> Integer.compare(a.length(), b.length()));
        return str;
    }

    public static String[] sortWithBubbleSort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            boolean hadSwap = false;
            for (int j = i + 1; j < strings.length; j++) {
                String si = strings[i];
                String sj = strings[j];
                // Swap if not in order.
                if (SORT_BY_LENGTH.compare(si, sj) > 0) {
                    strings[i] = sj;
                    strings[j] = si;
                    hadSwap = true;
                }
            }
            // Finish early if there were no swaps.
            if (!hadSwap) {
                break;
            }
        }
        return strings;
    }
}
