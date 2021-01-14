package com.janenik.practice;

/**
 * Created by jane on 6/30/19.
 */
public class Move_NonZeroNumbers {

    public static void main(String[] args){
        int[] arr = new int[] {0, 1, 2, 3, 0, 4, 0, 0, 5};
        int[] arr1 = new int[] {0, 0, 0, 0, 0, 1};
        int[] arr2 = new int[] {1, 2, 3, 0, 0, 0, 4, 5};
        int[] arr3 = new int[] {0, 1, 2, 0, 3, 0, 0, 4, 0, 5, 0, 0, 0, 0, 0, 0};
        int[] arr4 = new int[] {0, 1};

        moveNumbers(arr3);

        for(int i : arr3){
            System.out.print(i);
        }
    }

    public static void moveNumbers(int[] arr){
        if (arr.length < 2){
            return;
        }

        boolean isZeroFound = false;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 && !isZeroFound){
                index = i;
                isZeroFound = true;
                continue;
            }

            if(isZeroFound && arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                i = index;
                index = -1;
                isZeroFound = false;
            }
        }
    }
}
