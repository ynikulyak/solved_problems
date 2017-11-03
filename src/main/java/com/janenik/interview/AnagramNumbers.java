package com.janenik.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jane on 10/5/17.
 */
public class AnagramNumbers {

    public static boolean isAnagram(int number1, int number2){

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while(number1 > 0){
            list1.add(number1 %10);
            number1 = number1 / 10;
        }

        while(number2 > 0){
            list2.add(number2 % 10);
            number2 = number2 / 10;
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }

   /* public static boolean isAnagram2(int num1, int num2){

        int length1 = (int)Math.log10(num1);
        int length2 = (int) Math.log10(num2);


    }*/
}
