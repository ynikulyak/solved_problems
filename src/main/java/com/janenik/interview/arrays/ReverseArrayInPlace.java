package com.janenik.interview.arrays;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 10/2/17.
 */
public class ReverseArrayInPlace {

    public int[] reverse(int[] arr){

        Preconditions.checkNotNull(arr);
        if(arr.length < 2){
            return arr;
        }

        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }

        return arr;
    }
}
