package com.janenik.practice;

import java.util.ArrayList;

/**
 * Created by jane on 1/17/20.
 */
public class CommonElements {
    public static void main(String[] args){

        int[] a = {20, 30, 50, 70, 90, 100};
        int[] b = {10, 20, 30, 50, 80};
        ArrayList<Integer> list =  common(a, b);
        for(Integer x : list){
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> common(int[] a, int[] b){
        if(a.length < 1 || b.length < 1){
            throw new IllegalArgumentException("No elements in array");
        }

        if(a == null || b == null){
            throw new NullPointerException("Array is null");
        }

        ArrayList<Integer> commonElement = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                commonElement.add(a[i]);
                i++;
                j++;
            }
        }
        return  commonElement;
    }
}
