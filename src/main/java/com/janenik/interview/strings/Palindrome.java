package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 7/24/17.
 */
public class Palindrome {

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }

        for(int i = 0, j = str.length()-1; i < str.length()/2; i++, j--){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom2(String str){
        Preconditions.checkNotNull(str);
        if(str.length() < 1){
            return false;
        }

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
