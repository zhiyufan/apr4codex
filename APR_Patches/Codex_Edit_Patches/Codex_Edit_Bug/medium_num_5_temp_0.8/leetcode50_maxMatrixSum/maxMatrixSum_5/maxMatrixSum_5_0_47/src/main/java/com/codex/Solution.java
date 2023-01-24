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
Max sum path in a matrix

Given a matrix of integers A of size N x M. 

Find and return the path with maximum sum amongst all paths from top-left cell (0,0) to bottom-right cell (N-1, M-1). 

Path definition: A path should start from any cell of the first row, and end on any cell of the last row of the matrix A travel only right or downward. 

Note: Rows are numbered from top to bottom and columns are numbered from left to right. It is guaranteed that the path exists.


Input Format

The first and the only argument of input contains a 2-d integer matrix A, of size N x M.

Output Format

Return a single integer denoting the maximum sum path in the matrix A.

Constraints



1 <= N, M <= 100
-1000 <= A[i][j] <= 1000


For Example

Input 1:
    A = [   [1, 2, 3]
            [4, 5, 6]
            [7, 8, 9]   ]
Output 1:
    25
Explanation 1:
    Maximum sum path will be 7 -> 8 -> 9.

        }

        return maxSum;
    }
}