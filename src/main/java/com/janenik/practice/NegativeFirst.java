package com.janenik.practice;

/**
 * Created by jane on 1/28/20.
 */
public class NegativeFirst {
    public static void main(String[] args) {
        int[] arr = {1, 4, -5, 2, -8, -9, 0, 4, -1};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {

        int positive = 0;
        int negative = 0;
        boolean changedI = false;
        boolean changedJ = false;
        for (int i = 0, j = arr.length - 1; i < j; ) {
            if (arr[i] >= 0) {
                positive = i;
                changedI = true;
            }

            if (arr[j] < 0) {
                negative = j;
                changedJ = true;
            }

            if (changedI && changedJ) {

                int temp = arr[positive];
                arr[positive] = arr[negative];
                arr[negative] = temp;
                i++;
                j--;
                changedI = false;
                changedJ = false;
            } else if (changedI) {
                j--;
            } else {
                i++;
            }

        }
    }
}
