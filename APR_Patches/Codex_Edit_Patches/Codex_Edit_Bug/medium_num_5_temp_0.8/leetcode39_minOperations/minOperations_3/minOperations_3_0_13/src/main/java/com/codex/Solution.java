package com.codex;

import java.util.*;

public class Solution {
 public static int minOperations(int[][] grid, int x) {
        

        int N = grid.length;
        boolean[][] visited = new boolean[N][M];
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (visited[i][j]){
                    continue;
                }
                int target = grid[i][j];
                if (grid[i][j] > target){
                    if (grid[i][j] % x == 0){
                        if (i != 0){
                            if (dp[i - 1][j] == -1) {
                                dp[i][j] = grid[i][j] / x;
                                visited[i][j] = true;
                                continue;
                            }else{
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (grid[i][j] / x));
                                visited[i][j] = true;
                            }
                        }
                        if (j != 0){
                            if (dp[i][j - 1] == -1){
                                dp[i][j] = grid[i][j] / x;
                                visited[i][j] = true;
                                continue;
                            }else{
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (grid[i][j] / x));
                                visited[i][j] = true;
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                        }
                    }
                }
                if (j != 0){
                    if (dp[i][j - 1] != -1){
                        if (grid[i][j - 1] > target){
                            if ((grid[i][j - 1] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (grid[i][j - 1] - target) / x);
                            }
                        }else if (grid[i][j - 1] < target){
                            if ((target - grid[i][j - 1]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + (target - grid[i][j - 1]) / x);
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];
    }

    
}