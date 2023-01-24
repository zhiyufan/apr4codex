package com.codex;

import java.util.*;

public class Solution {
    // You are given an N by M grid of numbers and an integer K. You can change 
    // the number in the grid at any position to any number, but you can only 
    // change K numbers.
    // Each number in the grid has a positive and a negative integer, and it costs 
    // exactly one step to change one positive or negative integer to the opposite one.
    // Return the minimum number of steps to change all the numbers in the grid to 
    // the same number. If it's impossible, return -1.
    // https://leetcode.com/contest/weekly-contest-209/problems/minimum-number-of-steps-to-make-two-strings-anagram/

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
                if (dp[i][j] == -1){
                    continue;
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