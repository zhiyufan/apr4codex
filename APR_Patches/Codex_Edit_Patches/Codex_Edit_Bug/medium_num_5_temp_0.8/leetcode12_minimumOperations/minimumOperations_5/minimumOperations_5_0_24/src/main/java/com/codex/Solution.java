package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + 1;
            if(nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
        }
        return dp[n - 1];

        int n = nums.length;
        int[][] dp = new int[n][3];
        dp[0][0] = nums[0];
        for (int i = 1; i < n; i++){
            dp[i][0] = dp[i - 1][0] + nums[i];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0]) + nums[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }
        return Math.max(dp[n - 1][1], dp[n - 1][2]);
    }

    
}