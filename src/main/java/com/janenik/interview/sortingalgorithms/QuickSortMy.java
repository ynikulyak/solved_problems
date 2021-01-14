package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 2/4/20.
 */

/*
Idea of QuickSort: choose any element (from the beginning, end, middle, random) and sort all elements
in array compare with this pivot. All elements that are less (order is no matter) are in the left of the pivot,
all elements that are greater then pivot are on the right of the pivot. Use divide-n-conquer method to get
the result. Each time each part(left and right) are divided into two subproblems recursively and sorted.
 */
public class QuickSortMy {

    public static void main(String[] args){
        int[] arr = {1, 0, -8, 5, -3, 7, 2, 89, 4};

        quickSort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int[] arr, int start, int end){
        //choose the first element as a pivot
        int pivot = arr[start];
        int length = arr.length-1;

        //two indexes: i runs from the beginning and stops if element is greater then pivot
        //j runs from the end and stops if element is less then pivot
        int i = start+1;
        int j = length;
        //run till j becomes less than i
        while( i<=j) {
            //run i till find element greater then pivot
            if (arr[i] <= pivot) {
                i++;
                continue;
            }
            //run j till find element less then pivot
            if (arr[j] >= pivot) {
                j--;
                continue;
            }
            //swap elements in array
            if (arr[i] >= pivot && arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //swap pivot and j
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;

        //return index j where now pivot
        return j;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int partitionIndex = partition(arr, start, end);

            quickSort(arr, start, partitionIndex-1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }
}
