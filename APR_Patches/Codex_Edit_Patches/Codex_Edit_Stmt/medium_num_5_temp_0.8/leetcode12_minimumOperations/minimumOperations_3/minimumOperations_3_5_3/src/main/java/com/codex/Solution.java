package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        dp[1][0] = dp[1][1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i][0] = dp[i - 1][1];
            if (nums[i] != nums[i-1]) {
                dp[i][0] += 1;
            }
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            if (nums[i] != nums[i-1]) {
                dp[i][1] += 1;
            }
        }
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }

    
}