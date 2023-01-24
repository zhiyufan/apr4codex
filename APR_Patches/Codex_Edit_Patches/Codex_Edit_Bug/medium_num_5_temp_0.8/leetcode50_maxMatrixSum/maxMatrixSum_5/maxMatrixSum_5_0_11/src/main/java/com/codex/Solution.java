package com.codex;

import java.util.*;

public class Solution {
    import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.regex.*;

    public class Solution {

        // Complete the maxMatrixSum function below.

        private static int maxSum(int[][] matrixSum,int rows,int cols) {

            int maxSum = Long.MIN_VALUE;
            for(int i=0;i<rows;i++) {
                for(int j=0;j<cols;j++) {
                    if(maxSum<matrixSum[i][j]) {
                        maxSum = matrixSum[i][j];
                    }
                }
            }

            return maxSum;
        }

        private static int[][] findMatrixSum(int[][] matrix) {
            
            // rows and columns declaration

        int rows = matrix.length;

        // Find the sum matrix
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        return matrixSum;
        }

    private static int maxMatrixSum(int[][] matrix) {
        
        // rows and columns declaration
        int rows = matrix.length;
        int cols = matrix[0].length;

        // finding the sum matrix
        int[][] matrixSum = findMatrixSum(matrix);

        // finding max value of sum matrix
        return maxSum(matrixSum,rows,cols);
    }
}