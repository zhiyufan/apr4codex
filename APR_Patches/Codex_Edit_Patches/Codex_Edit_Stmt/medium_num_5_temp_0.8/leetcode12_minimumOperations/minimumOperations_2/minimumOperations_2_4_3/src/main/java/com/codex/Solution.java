package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int a = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
            int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1];
    }

    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cur = i;
            int cost = 0;
            while (manager[cur] != -1) {
                cost += informTime[manager[cur]];
                cur = manager[cur];
            }
            res = Math.max(res, cost);
        }
        return res;
    }
    
}