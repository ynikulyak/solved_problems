package com.janenik.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Counts factorials.
 */
public class Factorial {

    static Map<Long, Long> facRecursive = new HashMap<>();
    static ConcurrentMap<Long, Long> facIter = new ConcurrentHashMap<>();//THread-safe

    public static long factor(long num) { // 10:
        if (num < 0) {
            throw new IllegalArgumentException("Number must be greater then 0");
        }

        long result = 1;

        if (num == 0) {
            return result;
        }

        Long existingNum;
        for (long i = num; i >= 1; i--) {
            existingNum = facIter.get(i); // i!
            if (existingNum != null) {
                result = result * existingNum;
                break;
            } else {
                result = result * i;
            }
        }
        facIter.putIfAbsent(num, result);//thread-safe
        return result;
    }

    public static long facRec(long num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be greater then 0");
        }
        if (num == 0) {
            return 1;
        }

        Long existNum = facRecursive.get(num);
        if (existNum != null) {
            return existNum;
        }

        Long result = num * facRec(num - 1);
        facRecursive.put(num, result);

        return result;
    }
}
