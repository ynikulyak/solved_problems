package com.janenik.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jane on 10/19/17.
 */
public class IntersectionOfThreeArrays {

    public static Set<Integer> intersection(int[] arr1, int[] arr2, int[] arr3){

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionOfThree = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(!set.add(num)){
                list.add(num);
            }
        }

        for(int num : arr3){
            if(list.contains(num)){
                intersectionOfThree.add(num);
            }
        }
        return intersectionOfThree;
    }

    public static List<Integer> intersection2(int[] arr1, int[] arr2, int[] arr3){

        List<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        while (i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                intersection.add(arr1[i]);
                i++;
                j++;
                k++;
                continue;
            }
            if(arr1[i] > arr2[j] || arr2[j] < arr3[k]){
                j++;
                continue;
            }
            else if(arr1[i] < arr2[j]){
                i++;
                continue;
            }
            else {
                k++;
                continue;
            }

        }
        return intersection;
    }
}
