package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int[] dp = new int[s.length()];
        char[] sChar = s.toCharArray();
        if (sChar[0] == sChar[1] && sChar[1] == sChar[2]) {
            dp[0] = sChar[0] == 'X'? 0 : 1;
        }
        else if (sChar[0] == sChar[1] && sChar[1] != sChar[2]) {
            dp[0] = sChar[0] == 'X'? 1 : 0;
        } else {
            dp[0] = 0;
        }
        dp[1] = dp[0];
        for (int i = 2; i < sChar.length; i++) {
            if (sChar[i] == sChar[i-1] && sChar[i-1] == sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 0 : 1;
            } else if (sChar[i] == sChar[i-1] && sChar[i-1] != sChar[i-2]) {
                dp[i] = sChar[i] == 'X'? 1 : 0;
            } else {
                dp[i] = 0;
            }
            dp[i] += dp[i-1];
        }
        return dp[dp.length-1];
    }   
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
    

    
}