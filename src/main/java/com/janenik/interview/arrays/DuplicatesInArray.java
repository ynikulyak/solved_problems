package com.janenik.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by jane on 10/16/17.
 */
public class DuplicatesInArray {

    public static int findDuplicate(int[] arr) {
        int duplicate = 0;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                duplicate = arr[i];
                break;
            }
        }
        return duplicate;
    }

    public static List<Integer> duplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;

        Arrays.sort(arr);

        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1] && !list.contains(i)) {
                list.add(arr[i]);
            }
            i++;
        }
        return list;
    }

    public static List<Integer> duplicatesWithSet(int[] arr) {

        List<Integer> listOfDuplicates = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) {
            if (!set.add(i) && !listOfDuplicates.contains(i)) {
                listOfDuplicates.add(i);
            }
        }
        return listOfDuplicates;
    }

    public static List<Integer> duplicatesWithHashMap(int[] arr){
        if(arr.length < 2){
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> listOfDuplicates = new ArrayList<>();

        for(int number : arr){
            map.put(number, map.containsKey(number) ? map.get(number) + 1 : 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                listOfDuplicates.add(entry.getKey());
            }
        }
        return listOfDuplicates;
    }

    public static Integer[] removeDuplicates1(Integer[] arr) {

        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> listWithoutDuplicates = new ArrayList<>(set);
        Integer[] result = new Integer[listWithoutDuplicates.size()];

        return listWithoutDuplicates.toArray(result);
    }

    public static int[] removeDuplicates(int[] arr) {
        if(arr.length < 2){
            return null;
        }

        Set<Integer> set = new LinkedHashSet<>();

        for(int number : arr){
            set.add(number);
        }

        int[] result = new int[set.size()];

        int i = 0;
        for(Integer num : set){
            result[i++] = num;
        }

        return result;
    }

    public static int[] removeDuplicates2(int[] arr) {
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        int prev = arr[0];
        list.add(prev);

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            if (prev != number && !list.contains(number)) {
                list.add(number);
            }
            prev = number;
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[] replace(int[] arr) {

        Arrays.sort(arr);
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];

            if (prev == number) {
                arr[i] = 0;
            }
            prev = number;
        }
        return arr;
    }
}
