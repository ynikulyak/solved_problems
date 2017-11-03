package com.janenik.interview;

/**
 * Created by jane on 7/25/17.
 */
public class FirstLetterInString {

    public static String printFirstLetters(String str){

        if(str.length() == 0){
            return "There are no letters in a given string.";
        }

        if(str.length() == 1){
            return str;
        }

        str = str.trim();
        String result = str.charAt(0) + " ";

        for(int i = 1; i < str.length(); i++){
            if(Character.isWhitespace(str.charAt(i-1)) && Character.isLetter(str.charAt(i))){
                result = result + str.charAt(i) + " ";
            }
        }
        return result;
    }
}
