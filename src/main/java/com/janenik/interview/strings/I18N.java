package com.janenik.interview.strings;

/**
 * Created by jane on 7/19/18.
 */
public class I18N {

    public static int count(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
        }
        return count;
    }

    public static String wordWithNumber(String str){
        if(str == null){
            throw new NullPointerException("Your string is null");
        }
        if(count(str) < 2 ){
            throw new IllegalArgumentException("Your string too short");
        }

        StringBuilder sb = new StringBuilder();
        sb = sb.append(str.charAt(0));
        sb = sb.append(count(str));
        sb = sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}
