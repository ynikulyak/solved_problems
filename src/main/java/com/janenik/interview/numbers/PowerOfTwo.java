package com.janenik.interview.numbers;

/**
 * Created by jane on 10/25/17.
 */
public class PowerOfTwo {

    //time complexity O(logN)
    public static boolean isPowerOfTwo(int num){

        if(num < 1){
            return false;
        }
        while(num > 1){
            if(num % 2 != 0){
                return false;
            }
            num = num / 2;
        }
        return true;
    }

    //time complexity O(1) using bit
    public static boolean isPowerOfTwoUsingBit(int num){
        return ((num > 0) && ((num & (num -1)) == 0));
    }
}
