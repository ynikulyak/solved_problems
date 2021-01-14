package com.janenik.interview.sortingalgorithms;

/**
 * Created by jane on 1/29/20.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 23, -1, 4, 9, 2, 8, 4, 3};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        if (arr.length < 1 || arr == null || left < 0 || mid < 0 || right < 0) {
            throw new IllegalArgumentException("Your arguments are illegal");
        }

        //determine the length of two subarrays to be merged
        int leftLength = mid - left + 1;
        int rightLength = right - mid;

        //create two helper arrays
        int[] leftSubArray = new int[leftLength];
        int[] rightSubArray = new int[rightLength];

        //initialize helper arrays
        for (int i = 0; i < leftLength; i++) {
            leftSubArray[i] = arr[left + i];
        }

        for (int i = 0; i < rightLength; i++) {
            rightSubArray[i] = arr[mid + 1 + i];
        }

        //indexes for helper arrays and original array
        int i = 0;
        int j = 0;
        //initial index of merged subarray starts with left
        int k = left;

        while (i < leftLength && j < rightLength) {
            if (leftSubArray[i] > rightSubArray[j]) {
                arr[k] = rightSubArray[j];
                k++;
                j++;
            } else if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k] = leftSubArray[i];
                k++;
                i++;
            }
        }

        //copy all remaining elements from leftSubArray
        while (i < leftLength) {
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }

        //copy all remaining elements from rightSubArray
        while (j < rightLength) {
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            //sort left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            //merge both halves
            merge(arr, left, mid, right);
        }
    }
}
