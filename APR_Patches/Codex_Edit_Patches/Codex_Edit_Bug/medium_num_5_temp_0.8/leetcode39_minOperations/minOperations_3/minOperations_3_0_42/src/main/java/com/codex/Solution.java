package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {

        int N = grid.length;
        int M = grid[0].length;
        int[][][] dp = new int[N][M][x + 1];
        for (int[] arr : dp){
            for (int[] arr2 : arr){
                Arrays.fill(arr2, -1);
            }
        }
        dp[0][0][0] = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                for (int k = 0; k < x; k++){
                    if (dp[i][j][k] == -1){
                        continue;
                    }
                    int target = grid[i][j];
                    if (i != 0){
                        if (dp[i - 1][j][0] != -1){
                            if (grid[i - 1][j] > target){
                                if ((grid[i - 1][j] - target) % x == 0){
                                    dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][0] + (grid[i - 1][j] - target) / x);
                                }
                            }else if (grid[i - 1][j] < target){
                                if ((target - grid[i - 1][j]) % x == 0){
                                    dp[i][j][target - grid[i - 1][j]] = Math.max(dp[i][j][target - grid[i - 1][j]], dp[i - 1][j][0] + (target - grid[i - 1][j]) / x);
                                }
                            }else{
                                dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][0]);
                            }
                        }
                    }
                    if (j != 0){
                        if (dp[i][j - 1][0] != -1){
                            if (grid[i][j - 1] > target){
                                if ((grid[i][j - 1] - target) % x == 0){
                                    dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j - 1][0] + (grid[i][j - 1] - target) / x);
                                }
                            }else if (grid[i][j - 1] < target){
                                if ((target - grid[i][j - 1]) % x == 0){
                                    dp[i][j][target - grid[i][j - 1]] = Math.max(dp[i][j][target - grid[i][j - 1]], dp[i][j - 1][0] + (target - grid[i][j - 1]) / x);
                                }
                            }else{
                                dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j - 1][0]);
                            }
                        }
                    }
                }
                int target = grid[i][j];
                if (i != 0){
                    if (dp[i - 1][j] != -1){
                        if (grid[i - 1][j] > target){
                            if ((grid[i - 1][j] - target) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (grid[i - 1][j] - target) / x);
                            }
                        }else if (grid[i - 1][j] < target){
                            if ((target - grid[i - 1][j]) % x == 0){
                                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + (target - grid[i - 1][j]) / x);
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