package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.regex.Pattern;

/**
 * Created by jane on 10/6/17.
 */
public class DigitsInString {

    public static boolean areDigits(String str){
        Preconditions.checkNotNull(str);

        if(str == ""){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean areDigitsWithRegExpr(String str){

        Preconditions.checkNotNull(str);

        if(str == ""){
            return false;
        }

        //or we can write
        //Pattern pattern = Pattern.cpmpile(".*[^0-9].*");
        Pattern pattern = Pattern.compile(".*\\D.*");
        return pattern.matcher(str).matches();
    }
}
