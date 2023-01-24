package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {        
        int n = nums.length;        
        int[][] dp = new int[n][2];
        int p = nums[0];        
        for (int i = 1;i < n;i++) {
            dp[i][0] = dp[i - 1][0] + Math.abs(nums[i] - p);
            dp[i][1] = Math.min(dp[i - 1][1], dp[i - 1][0]) + Math.abs(nums[i] - 1);
            p = nums[i];
        }
        return dp[n - 1][0];
    }
    
}