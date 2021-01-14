package com.janenik.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 7/15/19.
 */
public class DuplicatesWithinKdistance {

    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 4};
        System.out.println(containsDuplicates(arr, 3));

    }

    public static boolean containsDuplicates(int[] arr, int k){
        if(k < 1 || arr.length < 2 || arr.length < k || arr == null){
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                Integer index = map.get(arr[i]);
                if(i-index <= k){
                    return true;
                }else {
                    map.put(arr[i], i);
                }
            }else {
                map.put(arr[i], i);
            }
        }

        return false;
    }
}
