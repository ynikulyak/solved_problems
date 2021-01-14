package com.janenik.interview;

/**
 * Created by jane on 8/6/19.
 */
public class RatMaze {

    public static void main(String[] args){

    }

    private int[][] path;
    private char[][] letterPath;
    private int N;

    RatMaze(int[][] arr){
        N = 5;
        path = new int[N][N];
        for (int i = 0; i < path.length; i++){
            for (int j = 0; j < path[0].length; j++){
                path[i][j] = 0;
            }
        }

        letterPath = new char[N][N];
    }

    private boolean isLegalStep(int x, int y, int[][] matrix){
        return (x>=0 && y>=0 && x < N && y < N && matrix[x][y] == 1);
    }

    public boolean isGoalReached(int x, int y, int[][] matrix){
        if(x == N-1 && y == N-1){
            path[x][y] = 1;
            return true;
        }

        if(isLegalStep(x, y, matrix)){
            path[x][y] = 1;

            if(isGoalReached(x+1, y, matrix)){

            }
        }
        return false;
    }

}
// Java implementation of the approach

// This code is contributed by anuj_67..
