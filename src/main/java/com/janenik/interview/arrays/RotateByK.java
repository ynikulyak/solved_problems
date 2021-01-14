package com.janenik.interview.arrays;

/**
 * Created by jane on 8/12/19.
 */
public class RotateByK {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int k){
        if(k < 1 || arr.length < 1 || arr.length < k){
            return;
        }

        int[] temp = new int[k];

        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        for(int i = k, j= 0; i < arr.length; i++, j++){
            arr[j] = arr[i];
        }

        for(int i = arr.length - k, j=0; i < arr.length; i++, j++){
            arr[i] = temp[j];
        }
    }
}
