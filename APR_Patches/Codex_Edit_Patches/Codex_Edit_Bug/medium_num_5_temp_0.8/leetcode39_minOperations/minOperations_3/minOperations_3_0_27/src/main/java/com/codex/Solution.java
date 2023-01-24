package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        

        int[] dr = {-1, 0};
        int[] dc = {0, -1};
        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (dp[i][j] == -1){
                    continue;
                }
                int target = grid[i][j];
                for (int k = 0; k < 2; k++){
                    int r = i + dr[k];
                    int c = j + dc[k];
                    if (r < 0 && c < 0){
                        continue;
                    }
                    if (r < 0 || c < 0){
                        r = Math.max(0, r);
                        c = Math.max(0, c);
                    }
                    if (dp[r][c] == -1){
                        continue;
                    }
                    if (grid[r][c] > target){
                        if ((grid[r][c] - target) % x == 0)
                            dp[i][j] = Math.max(dp[i][j], dp[r][c] + (grid[r][c] - target) / x);
                    }else if (grid[r][c] < target){
                        if ((target - grid[r][c]) % x == 0)
                            dp[i][j] = Math.max(dp[i][j], dp[r][c] + (target - grid[r][c]) / x);
                    }else{
                        dp[i][j] = Math.max(dp[i][j], dp[r][c]);
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];
    }

    
}