package com.janenik.interview.strings;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by jane on 10/2/17.
 */
public class DuplicatesInString {

    public static List<Character> duplicates(String str){
        Preconditions.checkNotNull(str);

        List<Character> list = new ArrayList<>();
        if(str.length() < 2){
            return list;
        }

        for(int i = 0; i < str.length()-1; i++){
            for(int j = i +1; j < str.length(); j++){
                if(list.contains(str.charAt(i))){
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)){
                    list.add(str.charAt(i));
                }
            }
        }
        return list;
    }

    public static Map<Character, Integer> duplicatesWithCount(String str){

        Preconditions.checkNotNull(str);
        Map<Character, Integer> map = new HashMap<>();

        if(str.length() < 2){
            return map;
        }



        for(int i = 0; i < str.length(); i++){
            Character character = str.charAt(i);
            if(map.containsKey(character)){
                map.put(character, map.get(character) + 1);
            }else {
                map.put(character, 1);
            }
        }

        Map<Character, Integer> mapOfDuplicates = new HashMap<>();

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                mapOfDuplicates.put(entry.getKey(), entry.getValue());
            }
        }

        return mapOfDuplicates;
    }

    public static void duplicatesChar(String str){
        Preconditions.checkNotNull(str);

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            map.put(character, map.containsKey(character) ? map.get(character) + 1 : 1);
        }

    }

    public static void consume(Map<Character, Integer> map, BiConsumer<Character, Integer> consumer) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            consumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public static void print(Map<Character, Integer> map){

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args){
        Map<Character, Integer> map = duplicatesWithCount("privet, papa");
        print(map);

        System.out.println("This is a print using consumer");
        consume(map,(key, value) -> System.out.println("" + key +": " + value) );

           // consume(map, (key, value) -> System.out.println("  " + key + ": " + value));
        }
    }


