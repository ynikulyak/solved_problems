package com.janenik.interview.arrays;

import java.util.*;


/**
 * Created by jane on 11/2/20.
 */
public class FindFirstKMissingNumbers {
    public static void main(String[] args) {
        List<Integer> missingNumbers = findNumbers(new int[]{3, -1, 4, 5, 5}, 3);
        System.out.println("Missing numbers: " + missingNumbers);

        missingNumbers = findNumbers(new int[]{2, 3, 4}, 3);
        System.out.println("Missing numbers: " + missingNumbers);

        missingNumbers = findNumbers(new int[]{-2, -3, 4}, 2);
        System.out.println("Missing numbers: " + missingNumbers);
    }
    public static List<Integer> findNumbers(int[] nums, int k) {
        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; ) {
            if (nums[i] == i + 1 || nums[i] - 1 >= nums.length || nums[i] <= 0) {
                i++;
            } else {
                int index = nums[i] - 1;
                int temp = nums[index];
                if(temp != nums[i]) {
                    nums[index] = nums[i];
                    nums[i] = temp;
                }else{
                    i++;
                }
            }
        }

        int count = 0;

        int i = 0;
        while (i < nums.length) {
            if (count < k && nums[i] != i + 1) {
                missingNumbers.add(i + 1);
                count++;
            }
            i++;
        }

        while (count < k) {
            missingNumbers.add(i + 1);
            count++;
            i++;
        }
        // TODO: Write your code here
        return missingNumbers;
    }
}

