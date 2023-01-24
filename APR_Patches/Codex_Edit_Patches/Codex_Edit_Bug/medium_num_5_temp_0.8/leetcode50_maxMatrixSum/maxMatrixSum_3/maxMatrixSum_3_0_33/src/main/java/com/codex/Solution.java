package com.codex;

import java.util.*;

public class Solution {
    public static int maxMatrixSum(int[][] matrix) {
        

        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i=1; i<dp.length; i++) {
            for (int j=1; j<dp[0].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i-1][j-1];
                //System.out.println("dp[" + i + "][" + j + "] = " + dp[i][j]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 10, 6}, {1, 9, 5}, {4, 8, 7} };
        System.out.println(maxMatrixSum(matrix));
    }
}