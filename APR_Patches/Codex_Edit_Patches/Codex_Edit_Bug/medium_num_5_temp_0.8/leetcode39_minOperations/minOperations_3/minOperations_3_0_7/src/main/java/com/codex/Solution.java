package com.codex;

import java.util.*;

public class Solution {

int[][] dp = new int[N][M];
        for (int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                dp[i][j] = Math.max(grid[i][j], 0);
            }
        }
        dp[0][0] = grid[0][0];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){                
                if (grid[i][j] == 0){
                    continue;
                }                    
                if (i != 0){
                    if (dp[i - 1][j] != -1){
                        if (grid[i - 1][j] > dp[i][j]){
                            if ((grid[i - 1][j] - dp[i][j]) % x == 0){
                                dp[i][j] = grid[i - 1][j];
                            }
                        }else if (grid[i - 1][j] < dp[i][j]){
                            if ((dp[i][j] - grid[i - 1][j]) % x == 0){
                                dp[i][j] = grid[i - 1][j];
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
                        }
                    }
                }
                if (j != 0){
                    if (dp[i][j - 1] != -1){
                        if (grid[i][j - 1] > dp[i][j]){
                            if ((grid[i][j - 1] - dp[i][j]) % x == 0){
                                dp[i][j] = grid[i][j - 1];
                            }
                        }else if (grid[i][j - 1] < dp[i][j]){
                            if ((dp[i][j] - grid[i][j - 1]) % x == 0){
                                dp[i][j] = grid[i][j - 1];
                            }
                        }else{
                            dp[i][j] = Math.max(dp[i][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
        return (dp[N - 1][M - 1] == -1) ? -1 : dp[N - 1][M - 1];




        // public static int minOperations(int[][] grid, int x) {
        

        //     int N = grid.length;
        //     int M = grid[0].length;
        //     int[][] dp = new int[N][M];
       

    
}