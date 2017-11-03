package com.janenik.interview.arrays;

import java.util.Arrays;

/**
 * Created by jane on 10/17/17.
 */
public class LargerstAndSmallestNumber {

    public static void smallestAndLargest(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for(int i : arr){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println("Smallest is " + min + "\nLargest is " + max);
    }

    public static void smallestAndLargestWithSort(int[] arr){
        Arrays.sort(arr);
        System.out.println("\nSmallest is " + arr[0] + "\nLargest is " + arr[arr.length-1]);
    }

    public static void main(String[] args){
        int[] arr = new int[] {3, 6, 0, 1, 7, 23, 45, 67};
        smallestAndLargest(arr);
        smallestAndLargestWithSort(arr);

    }
}
