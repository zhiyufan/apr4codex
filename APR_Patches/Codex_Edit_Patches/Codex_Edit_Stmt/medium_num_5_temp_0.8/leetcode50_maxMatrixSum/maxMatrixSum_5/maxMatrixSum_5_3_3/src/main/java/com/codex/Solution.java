package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
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

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }
    
    
    
    
    
    public int getNumberOfArrayElements(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] sumMatrix = new int[rows+1][cols+1];
        
        for(int i=0;i<=rows;i++) {
            sumMatrix[i][0] = 0;
        }
        
        for(int j=0;j<=cols;j++) {
            sumMatrix[0][j] = 0;
        }
        
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=cols;j++) {
                sumMatrix[i][j] = sumMatrix[i-1][j] + sumMatrix[i][j-1] + matrix[i-1][j-1] - sumMatrix[i-1][j-1];
            }
        }
        
        for(int i=0;i<=rows;i++) {
            for(int j=0;j<=cols;j++) {
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println();
        }
                
        return 0;
    }
    
    
    public static void main(String a[]) {
        int[][] matrix = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        PrintMaxMatrix printMaxMatrix = new PrintMaxMatrix();
        System.out.println(printMaxMatrix.getNumberOfArrayElements(matrix));
    }
        }

        return maxSum;
    }
}