package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
            }
        }
        return dp[n - 1];
    }



    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        if (n == 1) return 0;
        int[][] dp = new int[2][n];
        Arrays.fill(dp[0], Integer.MAX_VALUE);
        dp[0][0] = 0;
        for (int i = 1;i < n;i++) {
            dp[0][i] = Math.min(dp[0][i], dp[0][i - 1] + Math.abs(nums[i] - nums[i - 1]));
            if (i == 1) dp[1][i] = dp[0][i - 1] + Math.abs(nums[i] + nums[i - 1]);
            else dp[1][i] = Math.min(dp[1][i], dp[0][i - 1] + Math.abs(nums[i] + nums[i - 1]));
            dp[0][i] = Math.min(dp[0][i], dp[1][i - 1] + Math.abs(nums[i] - nums[i - 1]));
            dp[1][i] = Math.min(dp[1][i], dp[1][i - 1] + Math.abs(nums[i] + nums[i - 1]));
        }
        return dp[1][n - 1];
    }

    
    
}