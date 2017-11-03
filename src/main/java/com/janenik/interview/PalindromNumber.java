package com.janenik.interview;

/**
 * Created by jane on 10/7/17.
 */
public class PalindromNumber {

    public static boolean isPalindrom(int num){

        int reversed = 0;
        int remainder = 0;
        int number = num;

        do{
            remainder = num % 10;
            reversed = reversed*10 + remainder;
            num = num/10;
        }while (num > 0);

        return number == reversed;
    }
}
