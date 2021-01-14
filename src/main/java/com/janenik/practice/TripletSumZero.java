package com.janenik.practice;

import java.util.Arrays;

/**
 * Created by jane on 6/30/19.
 */
public class TripletSumZero {

    public static void main(String[] args){
        int[] arr = new int[] {4, -5, 3, -3, 2, -2, -1};
        threeOfZero(arr);
    }

    public static void threeOfZero(int[] arr){
        if(arr.length < 3){
            return;
        }

        boolean isZero = false;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                isZero = true;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++){
          for(int j = i + 1, k = arr.length -1; j < k;){

              if(arr[i] + arr[k] == 0 && isZero){
                  System.out.println(0 + " " + arr[i] + " " + arr[k]);
                  k--;
              }
              else if (arr[i] + arr[j] + arr[k] == 0){
                  System.out.println(arr[j] + " " + arr[i] + " " + arr[k]);
                  j++;
                  k--;
              }
              else if (arr[i] + arr[j] + arr[k] < 0){
                  j++;
              }
              else if (arr[i] + arr[j] + arr[k] > 0){
                  k--;
              }
          }
        }
    }
}
