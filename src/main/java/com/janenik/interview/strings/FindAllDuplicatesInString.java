package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jane on 10/10/17.
 */
public class FindAllDuplicatesInString {

    public static Set<String> duplicates(String str){

        Preconditions.checkNotNull(str);

        if(str.isEmpty()){
            return null;
        }

        Set<String> set = new LinkedHashSet<>();
        String[] arr = str.trim().split("\\W+");

        Set<String> duplicates = new LinkedHashSet<>();

        for(String string : arr){
            if(!set.add(string)){
                duplicates.add(string);
            }
        }
        return duplicates;
    }
}
