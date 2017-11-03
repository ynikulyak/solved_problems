package com.janenik.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 12/9/16.
 */
public class Fibonacci {

    public static void main(String[] args){
        System.out.println(fib1(7));
        System.out.println(fibo(8));
        System.out.println(fibRec(0));
    }
    //with recursion
    public static long fib(long n){
        if ( n == 0)
            return 0;

        if ( n < 3)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    private static Map<Long, Long> fibIter = new HashMap<>();
    private static Map<Long, Long> fibRecursive = new HashMap<>();

    //without recursion
    public static long fibo(long n){

        if ( n == 0)
            return 0;

        if ( n < 2)
            return 1;

        int first = 0;
        int second = 1;
        int nth =1;

        for ( int k = 2; k <= n; k++){
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public static long fib1(long num){
        if(num == 0){
            return 0;
        }

        if(num == 1){
            return 1;
        }

        Long existNum = fibIter.get(num);
        if(existNum != null){
            return existNum;
        }

        long twoStepsPrev = 0;
        long prev = 1;
        long fibNum = 0;

        for (int i = 2; i <= num; i++){
            fibNum = twoStepsPrev + prev;
            twoStepsPrev = prev;
            prev = fibNum;
        }

        fibIter.put(num, fibNum);
        return fibNum;
    }

    public static long fibRec(long num){

        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }

        Long existNum = fibRecursive.get(num);
        if(existNum != null){
            return existNum;
        }

        Long result = fibRec(num-1) + fibRec(num -2);
        fibRecursive.put(num, result);

        return result;
    }
}
