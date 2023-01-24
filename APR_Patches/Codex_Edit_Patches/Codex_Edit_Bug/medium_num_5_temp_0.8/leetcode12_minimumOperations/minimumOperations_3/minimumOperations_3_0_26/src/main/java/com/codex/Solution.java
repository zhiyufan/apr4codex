package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int[][] dp = new int[len][3];
        dp[0][0] = nums[0];
        dp[0][1] = dp[0][2] = Integer.MAX_VALUE;
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]) + nums[i];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) + nums[i] * nums[i-1];
            if (i >= 2) {
                dp[i][2] = Math.min(dp[i-1][1], dp[i-1][2]) + nums[i] * nums[i-1];
            }
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

    
}