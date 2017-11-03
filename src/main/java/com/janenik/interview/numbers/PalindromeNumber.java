package com.janenik.interview.numbers;

/**
 * Created by jane on 10/25/17.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int num){

        if(num < 10){
            return false;
        }

        int result = 0;
        int number = num;

        while(num > 0){

            result = result*10 + num % 10;
            num = num /10;
        }

        return result == number;
    }
}
