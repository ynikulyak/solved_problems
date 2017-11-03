package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jane on 10/4/17.
 */
public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        Preconditions.checkNotNull(str1);
        Preconditions.checkNotNull(str2);

        if(str1.isEmpty() || str2.isEmpty()){
            return false;
        }

        char[] arr1 = str1.trim().toLowerCase().toCharArray();
        char[] arr2 = str2.trim().toLowerCase().toCharArray();

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            if(Character.isLetter(arr1[i])){
                list1.add(arr1[i]);
            }
        }

        for(int i = 0; i < arr2.length; i++){
            if(Character.isLetter(arr2[i])){
                list2.add(arr2[i]);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);

    }
}
