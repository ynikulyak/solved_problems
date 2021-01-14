package com.janenik.practice;

/**
 * Created by jane on 7/4/19.
 */
public class RotateArray {

    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 4, 5, 6};
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1};
        int[] arr3 = new int[5];

        rotate(arr);
        rotate(arr1);
        rotate(arr2);
        rotate(arr3);

        for (int i = 0; i< arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }

    public static int[] rotate(int[] arr){
        if (arr == null){
            throw new NullPointerException("Your array is null.");
        }
        if(arr.length < 2){
            return arr;
        }

        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
