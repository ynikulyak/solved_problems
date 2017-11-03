package com.janenik.interview;

/**
 * Created by jane on 9/22/17.
 */
public class Triangles {

    public static void main(String[] args){
        System.out.println("This is a Floyd's triangle\n");
        printFloydsTriangle(6);
        System.out.println("\nThis is reverse right triangle\n");
        printReverseRightTriangle(6);
        System.out.println("\nThis is a reverse Floyd's triangle\n");
        printReverseFloydTriangle(9);

    }

    public static void printFloydsTriangle(int rows){

        if(rows < 1){
            return;
        }

        for(int i = 0; i < rows; i++ ){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseRightTriangle(int rows){
        if(rows < 1){
            return;
        }

        for(int i = 0; i < rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseFloydTriangle(int rows){
        if(rows < 1){
            return;
        }

        for(int i = 0; i <= (int) rows/2; i++){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i <= (int)rows/2; i++){
            for(int j = (int) rows/2 ; j > i; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
