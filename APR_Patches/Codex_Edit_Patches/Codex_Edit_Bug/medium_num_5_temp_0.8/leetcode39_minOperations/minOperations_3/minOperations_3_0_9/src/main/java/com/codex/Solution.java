package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        

        int N = grid.length;
        int M = grid[0].length;
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 0; i < N + 1; i++) Arrays.fill(dp[i], 100 * 100 * 100 * 100 * 100);

        dp[N - 1][M - 1] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (i != N - 1){
                    for (int k = 0; k <= grid[i][j]; k++){
                        if (k != 0){
                            if (dp[i][j] != 100 * 100 * 100 * 100 * 100){
                                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + ((grid[i][j] - k) / x));
                            }
                        }
                    }
                }
                if (j != M - 1){
                    for (int k = 0; k <= grid[i][j]; k++){
                        if (k != 0){
                            if (dp[i][j] != 100 * 100 * 100 * 100 * 100){
                                dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + ((grid[i][j] - k) / x));
                            }
                        }
                    }
                }
            }
        }
        return (dp[0][0] == 100 * 100 * 100 * 100 * 100) ? -1 : dp[0][0];
    }

    
}