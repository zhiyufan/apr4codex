package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
    
//     public static int getMoneyAmount(int n) {
        
//         int[][] dp = new int[n + 1][n + 1];
        
//         return helper(1, n, dp);
//     }
    
//     private static int helper(int i, int j, int[][] dp) {
//         if (i >= j) {
//             return 0;
//         }
//         if (dp[i][j] != 0) {
//             return dp[i][j];
//         }
//         int min = Integer.MAX_VALUE;
//         for (int k = i; k < j; k++) {
//             int tmp = k + Math.max(helper(i, k - 1, dp), helper(k + 1, j, dp));
//             min = Math.min(min, tmp);
//         }
//         dp[i][j] = min;
//         return min;
//     }
}