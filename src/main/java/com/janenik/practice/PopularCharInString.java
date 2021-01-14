package com.janenik.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jane on 7/1/19.
 */
public class PopularCharInString {
    public static void main(String[] args){

        String str = "aaabaaannnnnnn";
        String str1 = "q";
        char c = mostPopularChar(str1);
        System.out.print(c);
    }

    public static char mostPopularChar(String str){
        if(str.isEmpty()){
            throw new NullPointerException("Your string is empty");
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            Integer existing = map.get(str.charAt(i));
            if(existing == null){
                map.put(str.charAt(i), 1);
            }else {
                map.put(str.charAt(i), existing + 1);
            }
        }

        int max = 0;
        char popular = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                popular = entry.getKey();
            }
        }
        return popular;
    }
}
