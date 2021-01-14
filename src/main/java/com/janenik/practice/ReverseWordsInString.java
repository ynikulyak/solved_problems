package com.janenik.practice;

/**
 * Created by jane on 7/1/19.
 */
public class ReverseWordsInString {

    public static void main(String[] args){
        String str = " Hello, there!";
        String str1 = "Hello";
        String str2 = "a b c s l      ";
        System.out.print(reverseWords(str2));
    }

    public static String reverseWords(String str){
        if(str.isEmpty()){
            throw new IllegalArgumentException("Your string is empty.");
        }

        if(str.length() < 2){
            return str;
        }

        String[] arr = str.split("\\s");
        StringBuilder sb = new StringBuilder();

        for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            if (i == arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
