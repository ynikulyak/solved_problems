package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 10/9/17.
 */
public class RemoveCharFromString {

    public static String removeChar(String str, char character){
        Preconditions.checkNotNull(str);
        if(str.isEmpty()){
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for(int i= 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != character){
                sb = sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeRec(String str, char character){
        Preconditions.checkNotNull(str);
        int index = str.indexOf(character);
        if(index == -1){
            return str;
        }
        return removeRec(str.substring(0, index) + str.substring(index + 1), character);
    }

}
