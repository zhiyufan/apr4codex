package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][2];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++) {
            dp[i][0] = Math.min(dp[i - 1][0] + nums[i - 1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i - 2][0] + nums[i], dp[i - 2][1] + nums[i]);
        }
        return Math.min(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    
}