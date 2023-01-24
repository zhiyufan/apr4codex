package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[][] dp = new int[n][3];
        dp[0][1] = 1;
        dp[0][2] = 1;
        for (int i = 0;i < n;i++) {
            dp[i][0] = dp[i - 1][0] + Math.abs(nums[i] - nums[i - 1]);
            dp[i][1] = Math.min(dp[i - 1][1], dp[i][0]) + 1;
            dp[i][2] = Math.min(dp[i - 1][2], dp[i][1]) + (nums[i] == nums[i - 1] ? 0 : 1);
        }
        return dp[n - 1][2];
    } 

    
}