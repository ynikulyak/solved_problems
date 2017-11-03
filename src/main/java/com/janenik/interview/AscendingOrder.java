package com.janenik.interview;

/**
 * Created by jane on 9/20/17.
 */
public class AscendingOrder {

    public static int[] ascendingOrder(int[] arr){
        if(arr.length < 2){
            return arr;
        }

        for(int i = arr.length; --i>=0;){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
