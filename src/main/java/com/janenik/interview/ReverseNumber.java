package com.janenik.interview;

/**
 * Created by jane on 10/7/17.
 */
public class ReverseNumber {

    public static int reverse(int num){

        int reversed = 0;
        int remainder = 0;

        do{
            remainder = num % 10;
            reversed = reversed*10 + remainder;
            num = num / 10;
        }while (num > 0);
        return reversed;
    }
}
