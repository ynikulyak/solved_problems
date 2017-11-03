package com.janenik.interview.numbers;

/**
 * Created by jane on 10/26/17.
 */
public class ArmstrongNumber {

    public static boolean isArmstrong(int num){

        if(num < 1){
            return false;
        }

        if(num < 10){
            return true;
        }

        int power = 0;
        int number = num;
        int result = num;

        //find number of digits to definy power
        while(num > 0){
            num = num / 10;
            power++;
        }


        int sum = 0;
        while(number > 0){
            int remainder = number % 10;
            sum = sum + (int)Math.pow(remainder, power);
            number = number / 10;
        }
        return sum == result;
    }
}
