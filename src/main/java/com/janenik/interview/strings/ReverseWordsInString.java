package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

/**
 * Created by jane on 10/9/17.
 */
public class ReverseWordsInString {

    public static String reverse(String str){

        Preconditions.checkNotNull(str);
        if(str.isEmpty()){
            return str;
        }
        String[] arr = str.split("\\s");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length /2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length - 1 - i] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            if(i == arr.length -1){
                sb = sb.append(arr[i]);
            }else {
                sb = sb.append(arr[i]);
                sb = sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String reverse2(String str){
        Preconditions.checkNotNull(str);

        if(str.isEmpty()){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        String[] arr = str.trim().split("\\s");

        for(int i = arr.length-1; i>= 0; i--){
            if(i == 0){
                sb = sb.append(arr[i]);
            }else {
                sb = sb.append(arr[i]);
                sb = sb.append(" ");
            }
        }
        return sb.toString();
    }
}
