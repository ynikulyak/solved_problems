package com.janenik.interview;

import java.util.ArrayList;

/**
 * Created by jane on 9/20/17.
 */
public class ArmstrongNumber {

    public static boolean armstrongNumber(int num){

        int result = 0;
        int number = num;
        int digit;

        ArrayList<Integer> arr = new ArrayList<>();

        while(num > 0){
            digit = num % 10;
            arr.add(digit);
            num = (int) num/10;
        }

        int power = arr.size();
        int numbserInPower = 1;

        for(int i = 0; i < arr.size(); i++){
            int numFromArr = arr.get(i);

            for(int j = 1; j <= power; j++){
                numbserInPower = numbserInPower * numFromArr;
            }

            result = result + numbserInPower;
            numbserInPower = 1;
        }
        return result == number;
    }
}
