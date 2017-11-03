package com.janenik.interview;

/**
 * Created by jane on 9/26/17.
 */
public class SumOfNNumbers {

    //sum from 1 to nth number
    public int sum(int n){
        int result = 0;

        for(int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }
}
