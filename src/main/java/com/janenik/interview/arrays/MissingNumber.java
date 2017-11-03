package com.janenik.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jane on 10/16/17.
 */
public class MissingNumber {

    //if array is unsorted, first sort then find
    public static int missingNumber(int[] arr){

        Arrays.sort(arr);

        int missing = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                missing = i+1;
            }
        }
        return missing;
    }

    //no matter if it is sorted or not
    public static int misNumber(int[] arr, int totalNumbers){

        int expectedSum = totalNumbers*(totalNumbers + 1) / 2;
        int actualSum = 0;

        for(int i : arr){
            actualSum = actualSum + i;
        }

        return expectedSum - actualSum;
    }

    //several missing numbers
    public static List<Integer> numbers(int[] arr){

        List<Integer> list = new ArrayList<>();

        for(int i = 0, j = 1; i < arr.length; i++){
            if(arr[i] != j){
                list.add(j);
                j = j+2;
            }else {
                j++;
            }
        }
        return list;
    }
}
