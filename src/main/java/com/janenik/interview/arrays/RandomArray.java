package com.janenik.interview.arrays;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] aar3 = new int[]{21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        //create new array for 3 numbers
        int[] arr4 = new int[3];
        arr4[0] = randomIntFromArray(arr1);
        arr4[1] = randomIntFromArray(arr2);
        arr4[2] = randomIntFromArray(aar3);

        for(int i = 0; i< arr4.length; i++){
            System.out.print(arr4[i] + " ");
        }
    }

    public static int randomIntFromArray(int[] arr){
        //check array is not null
        if(arr == null){
            throw new NullPointerException("Your array is empty");
        }

        //check array has elements => array length > 0
        if(arr.length == 0){
            throw new IllegalArgumentException("Array length is 0; no elements");
        }
        int indexInArray = new Random().nextInt(arr.length);
        //class Random in Java that randomly access element
        //method in class Random - nextInt() return random integer
        //arr.length is an upper bound where to find this random element
         return arr[indexInArray];
    }
}
