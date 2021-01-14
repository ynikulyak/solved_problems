package com.janenik.practice;

/**
 * Created by jane on 7/1/19.
 */
public class ReplaceLetter {

    public static void main(String[] args){
        String str = "abba";
        String str1 = "popa";
        replace('o', 'a', str1);
    }

    public static void replace(char one, char two, String str){
        if(str == null){
            throw new NullPointerException("Your string is null");
        }

        if(!Character.isLetter(one) || !Character.isLetter(two)){
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            char found = str.charAt(i);
            if(found == one){
                sb.append(two);
            }else {
                sb.append(found);
            }
        }

        System.out.println(sb.toString());

    }
}
