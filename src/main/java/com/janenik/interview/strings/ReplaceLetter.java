package com.janenik.interview.strings;

/**
 * Created by jane on 8/13/19.
 */
public class ReplaceLetter {

    public static void main(String[] args){
        System.out.println(replaceLetter("mama", 'm', 'p'));
    }

    public static String replaceLetter(String str, char replaceLetter, char replaceWith){
        if(str == null || str.length() < 0){
            throw new IllegalArgumentException("Check you String argument");
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == replaceLetter){
                sb.append(replaceWith);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
