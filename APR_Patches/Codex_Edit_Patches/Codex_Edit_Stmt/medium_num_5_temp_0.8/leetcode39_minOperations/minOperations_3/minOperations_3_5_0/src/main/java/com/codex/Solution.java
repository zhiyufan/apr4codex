package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                int target = grid[i][j];
                if (i > 0 && dp[i - 1][j] == -1){
                    continue;
                }
                if (i > 0 && dp[i - 1][j] != -1 && grid[i - 1][j] > target){
                    if ((grid[i - 1][j] - target) % x == 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (grid[i - 1][j] - target) / x);
                    }
                }else if (i > 0 && dp[i - 1][j] != -1 && grid[i - 1][j] < target){
                    if ((target - grid[i - 1][j]) % x == 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (target - grid[i - 1][j]) / x);
                    }
                }else if (i > 0 && dp[i - 1][j] != -1 && grid[i - 1][j] == target){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                }
                
                if (j > 0 && dp[i][j - 1] == -1){
                    continue;
                }
                if (j > 0 && dp[i][j - 1] != -1 && grid[i][j - 1] > target){
                    if ((grid[i][j - 1] - target) % x == 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (grid[i][j - 1] - target) / x);
                    }
                }else if (j > 0 && dp[i][j - 1] != -1 && grid[i][j - 1] < target){
                    if ((target - grid[i][j - 1]) % x == 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                    }
                }else if (j > 0 && dp[i][j - 1] != -1 && grid[i][j - 1] == target){
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                }
                if (i > 0 && dp[i - 1][j] != -1){
                    if (target > grid[i - 1][j]){
                        if ((target - grid[i - 1][j]) % x == 0){
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (target - grid[i - 1][j]) / x);
                        }
                    }
                }
                if (j > 0 && dp[i][j - 1] != -1){
                    if (target > grid[i][j - 1]){
                        if ((target - grid[i][j - 1]) % x == 0){
                            dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                        }
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];
    }

    
}