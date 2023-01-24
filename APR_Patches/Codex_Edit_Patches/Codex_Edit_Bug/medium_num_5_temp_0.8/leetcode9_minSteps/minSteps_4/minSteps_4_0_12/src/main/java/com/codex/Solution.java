package com.codex;

import java.util.*;

public class Solution {


class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1) return 0;
        int[][] memo = new int[grid.length][grid[0].length];
        return helper(grid, 0, 0, memo);
    }
    public int helper(int[][] grid, int i, int j, int[][] memo){
        if(i==grid.length-1 && j==grid[0].length-1) return 1;
        if(i >= grid.length || j >= grid[0].length || grid[i][j] == 1) return 0;
        if(memo[i][j] > 0) return memo[i][j];
        memo[i][j] = helper(grid, i+1, j, memo) + helper(grid, i, j+1, memo);
        return memo[i][j];
    }
}

//  
// public static int minSteps(String s, String t) {
//         int[] freq = new int[26];
//         for (char c : s.toCharArray()) {
//             freq[c - 'a']++;
//         }
//         int steps = 0;
//         for (char c : t.toCharArray()) {
//             if (freq[c - 'a'] == 0) {
//                 steps++;
//             } else {
//                 freq[c - 'a']--;
//             }
//         }
//         return steps;
//     }

// public static int minSteps(String s, String t) {
//         int resStep = 0;
//         int[] count = new int[26];
//         for (int i = 0; i < s.length(); ++i) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
//         for (int i = 0; i < 26; ++i) {
//             if (count[i] > 0) {
//                 resStep += count[i];
//             }
//         }

//         return resStep;
//     }




//  Working code for this problem.

// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int [][] dp = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
//         dp[0][0] = 1;
//         for(int i = 1; i < dp.length; i++){
//             dp[i][0] = 0;
//         }
//         for(int i = 1; i < dp[0].length; i++){
//             dp[0][i] = 0;
//         }
//         for(int i = 1; i < dp.length; i++){
//             for(int j = 1; j < dp[0].length; j++){
//                 if(obstacleGrid[i-1][j-1] == 1){
//                     dp[i][j] = 0;
//                 }else{
//                     dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                 }
//             }
//         }
//         //print
//         for(int j = 0; j < dp.length; j++){
//             System.out.print("{");
//             for(int k = 0; k < dp[0].length; k++){
//                 System.out.print(dp[j][k] + ",");
//             }
//                 System.out.print("}");
//                 System.out.println();
//         }
//         return dp[obstacleGrid.length][obstacleGrid[0].length];
//     }
//     public void print(int [][] dp){
//         for(int i = 0; i < dp.length; i++){
//             for(int j = 0; j < dp[0].length; j++){
//                 System.out.print(dp[i][j] + ",");
//             }
//             System.out.println();
//         }
//     }
// }

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] dp = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(obstacleGrid[i-1][j-1] == 1){
                    dp[i][j] = 0;
                }else if(i == 1 && j == 1){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[obstacleGrid.length][obstacleGrid[0].length];
    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else if(i == 0){
                    dp[i][j] = dp[i][j-1];
                }else if(j == 0){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return steps;
    }

    return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
}