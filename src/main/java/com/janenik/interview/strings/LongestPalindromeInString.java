package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 10/11/17.
 */
public class LongestPalindromeInString {

    public static String longestPalindrome(String string){
        Preconditions.checkNotNull(string);

        if(string.length() < 2){
            return string;
        }

        for(int i = 0; i < string.length(); i++){

        }
        return null;
    }
}
