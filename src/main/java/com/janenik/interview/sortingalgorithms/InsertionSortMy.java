package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 2/4/20.
 */
public class InsertionSortMy {
    public static void main(String[] arg){
        int[] arr = {9, -2, 0, 3, 8, -1, 67, -5, 7, 1};

        insertion(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int num = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > num){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = num;
        }
    }
}
