package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 7/21/17.
 */
public class BubbleSort {

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    public static int[] sort1(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return arr;
        }

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for(int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }


        }
        return arr;
    }


}
