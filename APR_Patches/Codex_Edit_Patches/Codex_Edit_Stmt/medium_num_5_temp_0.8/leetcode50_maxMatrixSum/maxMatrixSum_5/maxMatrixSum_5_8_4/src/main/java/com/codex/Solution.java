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
    
//     public int minCostPath(int[][] arr, int x, int y) {
//         int m = x;
//         int n = y;
//         int[][] mc = new int[m+1][n+1];
        
//         mc[0][0] = arr[0][0];
        
//         for(int i=1;i<=m;i++) {
//             mc[i][0] = mc[i-1][0] + arr[i][0];
//         }
        
//         for(int i=1;i<=n;i++) {
//             mc[0][i] = mc[0][i-1] + arr[0][i];
//         }
        
//         for(int i=1;i<=m;i++) {
//             for(int j=1;j<=n;j++) {
//                 mc[i][j] = arr[i][j] + Math.min(mc[i-1][j],Math.min(mc[i][j-1],mc[i-1][j-1]));
//             }
//         }
        
//         return mc[m][n];
        
//     }
// }
        }

        return maxSum;
    }
}