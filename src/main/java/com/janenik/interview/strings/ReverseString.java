package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 9/26/17.
 */
public class ReverseString {

   /* public String reverse(String str){
        Preconditions.checkNotNull(str);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }*/

   /* public String reverseRec(String str){
        if(str.length() < 1){
            return "";
        }

        return str.charAt(str.length()-1) + reverseRec(str.substring(0, str.length()-1));
    }*/

    public static String reverseUsingStringBuilder(String str) {
        Preconditions.checkNotNull(str);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder = stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static String reverseString(String str) {
        Preconditions.checkNotNull(str);;

        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + str.charAt(i);
        }
        return string;
    }

    public static String reverseRec(String str) {

        if (str.length() < 1) {
            return str;
        }

        return str.charAt(str.length() - 1) + reverseRec(str.substring(0, str.length() - 1));
    }
}
