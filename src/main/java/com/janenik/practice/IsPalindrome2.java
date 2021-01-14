package com.janenik.practice;

/**
 * Created by jane on 7/4/19.
 */
public class IsPalindrome2 {

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        String str1 = "race a car";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str){
        if (str == null){
            throw new NullPointerException("Your string is null.");
        }

        if (str.length() < 2){
            return true;
        }

        str = str.toLowerCase();

        for(int i = 0, j = str.length()-1; i < j; ){
            while(!Character.isAlphabetic(str.charAt(i))){
                i++;
            }
            while(!Character.isAlphabetic(str.charAt(j))){
                j--;
            }

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
