package com.janenik.practice;

/**
 * Created by jane on 6/30/19.
 */
public class Array_Practice {

    public static void main(String[] args){

        int[] arr = new int[] {1, 2};
        int[] arr1 = new int[] {3, 4};
        double result = findMedianSortedArrays(arr, arr1);
        System.out.println(result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }else if(nums1[i] > nums2[j]){
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }

        double medianEven = (arr[arr.length/2 -1] + arr[arr.length/2])/2.0;
        double medianOdd = arr[arr.length/2];

        if(arr.length % 2 == 0){
            return medianEven;
        }else{
            return medianOdd;
        }
    }
}
