package com.codex;

import java.util.*;

public class Solution {
    public static int calculate(int[][] grid, int[][] dp, int x, int i, int j, int target){
        if (dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = -2;
        int res = -2;
        if (i != 0){
            if (dp[i - 1][j] != -1){
                if (grid[i - 1][j] > target){
                    if ((grid[i - 1][j] - target) % x == 0){
                        res = Math.max(res, dp[i - 1][j] + (grid[i - 1][j] - target) / x);
                    }
                }else if (grid[i - 1][j] < target){
                    if ((target - grid[i - 1][j]) % x == 0){
                        res = Math.max(res, dp[i - 1][j] + (target - grid[i - 1][j]) / x);
                    }
                }else{
                    res = Math.max(res, dp[i - 1][j]);
                }
            }
        }
        if (j != 0){
            if (dp[i][j - 1] != -1){
                if (grid[i][j - 1] > target){
                    if ((grid[i][j - 1] - target) % x == 0){
                        res = Math.max(res, dp[i][j - 1] + (grid[i][j - 1] - target) / x);
                    }
                }else if (grid[i][j - 1] < target){
                    if ((target - grid[i][j - 1]) % x == 0){
                        res = Math.max(res, dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                    }
                }else{
                    res = Math.max(res, dp[i][j - 1]);
                }
            }
        }
        return dp[i][j] = res;
    }

    public static int minOperations(int[][] grid, int x) {    

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){ Arrays.fill(arr, -1); }
        dp[0][0] = 3;
                int target = grid[i][j];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (dp[i][j] == -1){
                    continue;
                }
                calculate(grid, dp, x, i, j, target);
            }
        }
        return dp[N - 1][M - 1] == -1 ? -1 : dp[N - 1][M - 1];
    }

    
}