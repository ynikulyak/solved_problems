package com.janenik.interview.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by jane on 10/19/17.
 */
public class FirstRepeatedElement {

    public static int firstRepeatedElement(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Your array is too small");
        }

        int found = 0;

        for(int i = 0; i < arr.length -1; i++){
            boolean founded = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    found = arr[i];
                    founded = true;
                    break;
                }
            }
            if(founded){
                break;
            }
        }
        return found;
    }

   public static int findUsingHashMap(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>(arr.length);

        for(int num : arr){
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }

        int found = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                found = entry.getKey();
                break;
            }
        }
        return found;
   }
}
