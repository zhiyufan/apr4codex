package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {

        int N = nums.length;
        int[][] dp = new int[N][2];
        dp[0][0] = nums[0];
        dp[0][1] = Integer.MAX_VALUE;

        for (int i = 1; i < N; i++) {
            dp[i][0] = nums[i] + dp[i - 1][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + Math.abs(nums[i] - nums[i - 1]);
        }
        
        return Math.min(dp[N - 1][0], dp[N - 1][1]);
    }

    
}