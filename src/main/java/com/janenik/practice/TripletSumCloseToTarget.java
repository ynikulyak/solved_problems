package com.janenik.practice;

import java.util.*;

class TripletSumCloseToTarget {

    public static int searchTriplet(int[] arr, int targetSum) {

        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            int result = searchPair(arr, targetSum, i+1, arr[i]);
            if(Math.abs(targetSum - result) < Math.abs(targetSum - min)){
                min = result;
            }
        }
        // TODO: Write your code here
        return min;
    }

    private static int searchPair(int[] arr, int targetSum, int leftIndex, int thirdElement){
        int rightIndex = arr.length-1;
        int min = Integer.MAX_VALUE;
        int dif = Integer.MAX_VALUE;
        while(leftIndex < rightIndex){
            int sum = arr[leftIndex] + arr[rightIndex];
            int triple = sum + thirdElement;
            if(triple == targetSum){
                min = targetSum;
                break;
            }else if(triple > targetSum){
                if(dif > triple-targetSum){
                    dif = triple-targetSum;
                    min = triple;
                }
                rightIndex--;
            }else{
                if(dif > targetSum - triple){
                    dif = targetSum - triple;
                    min = triple;
                }
                leftIndex++;
            }
        }
        return min;
    }

    public static void main(String[] args){
        System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(TripletSumCloseToTarget.searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }
}