package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        int[][] dp = new int[2][grid[0].length]; // declaring dp matrix 

        dp[0][0] = 0; // filling the first element of the dp matrix
        dp[1][0] = 0; // filling the second element of the dp matrix

        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]); // filling the third element of the dp matrix
            dp[1][i] = dp[0][i - 1] + grid[1][i]; // filling the fourth element of the dp matrix
        }


        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }
}