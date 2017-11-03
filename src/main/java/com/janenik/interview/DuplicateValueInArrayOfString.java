package com.janenik.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 9/21/17.
 */
public class DuplicateValueInArrayOfString {

    public static List<String> duplicates(String[] arr){
        if(arr.length < 2){
            return null;
        }

        List<String> listOfDuplicates = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            String a  = arr[i].toLowerCase();
            for(int j = i +1; j < arr.length; j++){
                String b = arr[j].toLowerCase();
                if(a.equals(b)){
                    listOfDuplicates.add(a);
                }
            }
        }
        return listOfDuplicates;
    }
}
