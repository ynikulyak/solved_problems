package com.janenik.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jane on 10/18/17.
 */
public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] arr1, int[] arr2){

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();

        for(int number : arr1){
            set.add(number);
        }

        for(int number : arr2){
            if(!set.add(number)){
                list.add(number);
            }
        }
        int[] intersection = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            intersection[i] = list.get(i);
        }
        return intersection;
    }

    public static Set<Integer> intersectionAsSet(int[] arr1, int[] arr2){
        Set<Integer> set = new LinkedHashSet<>();
        for(int number : arr1){
            set.add(number);
        }
        for (int number : arr2) {
            set.remove(number);
        }
        return set;
    }
}
