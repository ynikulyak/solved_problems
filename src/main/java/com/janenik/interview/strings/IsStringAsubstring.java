package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.lang.ref.PhantomReference;

/**
 * Created by jane on 10/10/17.
 */
public class IsStringAsubstring {

    public static int isSubstring(String source, String target){
        Preconditions.checkNotNull(source);
        Preconditions.checkNotNull(target);

        if(source.isEmpty() || target.isEmpty() || source.length() <= target.length()){
            return -1;
        }
        int index = -1;
        int length = source.length() - target.length();
        for(int i = 0; i <= length; i++ ){
            if(source.substring(i, target.length() + i).equals(target)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int isSubstringWithIndexOf(String source, String target){
        Preconditions.checkNotNull(source);
        Preconditions.checkNotNull(target);

        if(source.isEmpty() || target.isEmpty() || source.length() <= target.length()){
            return -1;
        }

        int length = source.length() - target.length();
        int index = -1;
        int firstChar = 0;


        for(int i = 0; i <= length; i++){
            if(source.charAt(i) == target.charAt(firstChar)){
                index = i;
                for(int j = i+1; j < i + target.length()-1; j++){
                    if(source.charAt(j) != target.charAt(++firstChar)){
                        index = -1;
                        i = j;
                        break;
                    }
                }
            }

        }
        return index;
    }
}
