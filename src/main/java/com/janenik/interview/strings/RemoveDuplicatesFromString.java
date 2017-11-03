package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jane on 10/9/17.
 */
public class RemoveDuplicatesFromString {

    public static String removeDuplicates(String str){
        Preconditions.checkNotNull(str);

        if(str.isEmpty()){
            return str;
        }

        Set<Character> characterSet = new LinkedHashSet<>();

        for(int i = 0; i < str.length(); i++){
            characterSet.add(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for(Character c : characterSet){
            sb = sb.append(c);
        }
        return sb.toString();
    }
}
