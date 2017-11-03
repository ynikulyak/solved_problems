package com.janenik.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by jane on 10/17/17.
 */
public class EqualSumPairs {

    //do not lose any pair but O(n^2)
    public static void pairs2(int[] arr, int sum) {

        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            for (int j = i; j < arr.length; j++) {
                int second = arr[j];
                if (first + second == sum) {
                    System.out.println("{" + first + ", " + second + "}");
                }
            }
        }
    }

    //here we lose some duplicate pairs and reverse pairs
    public static void pairs(int[] arr, int number) {
        if (arr.length < 2) {
            return;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == number) {
                System.out.println("{" + arr[left] + ", " + arr[right] + "}");
                System.out.println("{" + arr[right] + ", " + arr[left] + "}");
                left = left + 1;
                right = right - 1;
                continue;
            }
            if (sum > number) {
                right = right - 1;
            }
            if (sum < number) {
                left = left + 1;
            }
        }
    }

    //same pairs are not allowed
    public static void pairsWithoutDuplicates(int[] arr, int sum) {

        if (arr.length < 2) {
            return;
        }

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int first = arr[left];
            int last = arr[right];
            int result = arr[left] + arr[right];

            if (result == sum) {
                if (!map.containsKey(first)) {
                    map.put(first, last);
                    System.out.println("{" + first + ", " + last + "}");
                    left = left + 1;
                    right = right - 1;
                    continue;
                } else {
                    left = left + 1;
                    right = right - 1;
                    continue;
                }
            }
            if (result > sum) {
                right = right - 1;
            }
            if (result < sum) {
                left = left + 1;
            }
        }
    }

    //if the same numbers are not allowed
    public static void pairsWithoutEqualNumbers(int[] arr, int number) {

        if (arr.length < 2) {
            return;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int first = arr[left];
            int last = arr[right];
            int sum = first + last;

            if (first == last) {
                left = left + 1;
                right = right - 1;
                continue;
            }
            if (sum == number) {
                System.out.println("{" + first + ", " + last + "}");
                left = left + 1;
                right = right - 1;
                continue;
            }
            if (sum < number) {
                left = left + 1;
            }
            if (sum > number) {
                right = right - 1;
            }
        }
    }

    public static void pairsWithoutDuplicatesAndEqualNumbers(int[] arr, int sum) {
        if (arr.length < 2) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex < rightIndex) {

            int first = arr[leftIndex];
            int last = arr[rightIndex];
            int result = first + last;

            if (first == last) {
                leftIndex++;
                rightIndex--;
                continue;
            }

            if (sum == result) {
                if (!map.containsKey(first)) {
                    map.put(first, last);
                    System.out.println("{" + first + ", " + last + "}");
                    leftIndex++;
                    rightIndex--;
                    continue;
                } else {
                    leftIndex++;
                    rightIndex--;
                    continue;
                }
            }
            if (sum > result) {
                leftIndex++;
            }
            if (sum < result) {
                rightIndex--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 2, 8, 4, 9, 0, 5, 2, 8, 12};
        int[] arr1 = new int[]{1, 5, 2, 8, 4, 9, 0, 5, 2, 8, 12, 13};
        int[] arr2 = new int[]{1, 5, 2, 8, 4, 9, 0, 5, 2, 8, 12, 13, 3};
        int[] arr3 = new int[]{1, 5, 2, 8, 4, 9, 0, 5, 2, 8};
        int[] arr4 = new int[]{1, 5, 2, 8, 4, 9, 0, 5, 2, 8, 12, 20, 21, 22};

        System.out.println("Here we don't lose any pair but we have O(n^2)");
        pairs2(arr, 10);

        System.out.println("\n Here we lose some duplicate pairs and reverse pairs");
        pairs(arr1, 10);

        System.out.println("Pairs without equal numbers:");
        pairsWithoutEqualNumbers(arr2, 10);

        System.out.println("\n Pairs without duplicates");
        pairsWithoutDuplicates(arr3, 10);

        System.out.println("\nNo duplicates pairs and eqaul numbers");
        pairsWithoutDuplicatesAndEqualNumbers(arr4, 10);
    }
}
