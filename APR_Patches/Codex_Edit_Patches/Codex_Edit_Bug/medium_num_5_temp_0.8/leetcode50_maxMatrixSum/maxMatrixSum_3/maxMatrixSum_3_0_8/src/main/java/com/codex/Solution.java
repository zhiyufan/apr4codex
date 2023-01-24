package com.codex;

import java.util.*;

public class Solution {

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3, 4}, {5,6,7,8}};
    System.out.println(maxMatrixSum(matrix));

    int[][] matrix2 = {{1, 2, 3}, {4,5,6}, {7,8,9}};
    System.out.println(maxMatrixSum(matrix2));
  }

    public static long maxMatrixSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }


        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i=1; i<matrix[0].length; i++) {

            dp[0][i] = dp[0][i-1] + matrix[0][i]; // base case (first row)
        }
        for (int i=1; i<matrix.length; i++) {

            dp[i][0] = dp[i-1][0] + matrix[i][0]; // base case (first col)
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                dp[i][j] = 
                  Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

}
}