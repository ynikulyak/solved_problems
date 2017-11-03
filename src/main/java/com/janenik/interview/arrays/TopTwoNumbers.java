package com.janenik.interview.arrays;

import java.util.Arrays;

/**
 * Created by jane on 10/19/17.
 */
public class TopTwoNumbers {

    public static int[] topTwoNumbers(int[] arr){

        if(arr.length < 2){
            throw new IllegalArgumentException("Your array is too small");
        }

        int topFirst = arr[0];
        int topSecond = arr[0];

        for(int num : arr){
            if(num > topFirst){
                topSecond = topFirst;
                topFirst = num;
            }else if(num > topSecond){
                topSecond = num;
            }
        }
        int[] topTwo = new int[] {topSecond, topFirst};
        return topTwo;
    }

    public static int[] topTwoWithSorting(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Your array is too small");
        }

        Arrays.sort(arr);

        int[] topTwo = new int[] {arr[arr.length -2], arr[arr.length-1]};
        return topTwo;
    }
}
