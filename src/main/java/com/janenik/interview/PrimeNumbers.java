package com.janenik.interview;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 9/21/17.
 */
public class PrimeNumbers {
    public List<Integer> prime(int start, int end){

        List<Integer> list = new ArrayList<>();

        for(int i = start; i <=end; i++){
            boolean isPrime = true;

            if(i == 0 || i == 1){
                continue;
            }
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
        return list;
    }




}
