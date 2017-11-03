package com.janenik.interview.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jane on 10/19/17.
 */
public class FirstNonRepeatedElement {

    public static int firstNonRepeatedElement(int[] arr){
        if(arr.length < 1){
            throw new IllegalArgumentException("Your array is empty");
        }

        if(arr.length == 1){
            return arr[0];
        }

        int foundNumber = 0;

        for(int i = 0; i < arr.length -1; i++){
            boolean founded = true;

            int num = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(num == arr[j]){
                    founded = false;
                    break;
                }

            }
            if(founded){
                foundNumber = num;
                break;
            }
        }
        return foundNumber;
    }

    public static int findWithHashMap(int[] arr){
        if(arr.length < 1){
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int num : arr){
            map.put(num, map.containsKey(num) ? map.get(num) +1 : 1);
        }

        int found = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                found = entry.getKey();
                break;
            }
        }
        return found;
    }
}
