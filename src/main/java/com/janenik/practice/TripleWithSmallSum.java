package com.janenik.practice;

import java.util.*;

class TripletWithSmallerSum {

    public static int searchTriplets(int[] arr, int target) {
        int count = 0;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            int result = countLessThanTarget(arr, target, i+1, arr[i]);
            count += result;
        }
        // TODO: Write your code here
        return count;
    }

    private static int countLessThanTarget(int[] arr, int target, int leftIndex, int thirdElement){
        int rightIndex = arr.length-1;
        int count = 0;
        while(leftIndex < rightIndex){
            int sum = arr[leftIndex] + arr[rightIndex] + thirdElement;
            if(sum < target){
                count += rightIndex - leftIndex;
                leftIndex++;
            }else {
                rightIndex--;
            }
            }
        return count;
    }

    public static void main(String[] args){
       // System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(TripletWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}