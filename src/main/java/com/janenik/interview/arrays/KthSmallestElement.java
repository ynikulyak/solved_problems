package com.janenik.interview.arrays;

import java.util.Arrays;

/**
 * Created by jane on 10/18/17.
 */
public class KthSmallestElement {


    //O(NlogN)
    public static int kthSmallest(int[] arr, int k){

        if(arr.length < k){
            throw new IllegalArgumentException("K is greater then array length");
        }

        Arrays.sort(arr);

        return arr[k-1];
    }

    /*
    O(nlogk) running time + O(k) memory
    public int kthLargestElement(int k, int[] nums) {
        if (nums == null || nums.length == 0 || k == 0) {
            return -1;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            heap.offer(nums[i]);
        }
        for (int j = 0; j < k - 1; j++) {
            heap.poll();
        }
        return heap.peek();
    }
     */
}
