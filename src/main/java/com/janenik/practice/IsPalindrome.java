package com.janenik.practice;

/**
 * Created by jane on 7/1/19.
 */
public class IsPalindrome {

    public static void main(String[] args){
        String str = "abba";
        String str1 = "abcba";
        String str2 = "abaa";
        System.out.print(isPalindrome(str2));
    }

    public static boolean isPalindrome(String str){
        if(str.isEmpty()){
            return false;
        }

        if(str.length() < 2){
            return true;
        }

        for(int i = 0, j = str.length()-1; i < str.length()/2; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
