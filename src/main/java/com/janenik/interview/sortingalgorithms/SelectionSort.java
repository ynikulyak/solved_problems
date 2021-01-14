package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 1/16/20.
 * Selection sort starts by scanning the entire given list to find the smallest element and exchange it with
 * the first element, putting the smallest element in its final position in the sorted list. Then we scan the
 * list starting with the second element, to find the smallest among the last n-1 elements and exchange it wiht
 * the second element, putting the second smallest element in its final position.
 * Time complexity is O(n^2) on all inputs; number of swaps - thetha(n)
 */
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3, 10, 2, 11, 4, 8};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] selectionSort(int[] arr){
        if(arr == null){
            throw new NullPointerException("Your array is null");
        }

        if(arr.length < 2){
            return arr;
        }

        for(int i = 0; i< arr.length-1; i++){
            int min = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
