package com.janenik.interview.numbers;

/**
 * Created by jane on 10/25/17.
 *
 */
public class PrimeNumbers {

    //check if a number is prime
    public static boolean isPrime(int num){

        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
