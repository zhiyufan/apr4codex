package com.codex;

import java.util.*;

public class Solution {
    public static int maxMatrixSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length]; //O(m*n) space
        for (int i=0; i<matrix[0].length; i++) { //O(n) time
            dp[0][i] = matrix[0][i];
    }

        for (int i=1; i<matrix.length; i++) { //O(m) time
            dp[i][0] = matrix[i][0];
        }
        for (int i=1; i<matrix.length; i++) { //O(m*n) time
            for (int j=1; j<matrix[0].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
            }
        }
        return dp[matrix.length-1][matrix[0].length-1]; //O(1)
    }
}
}