package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        if (nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = nums[0];
        for (int i = 1;i < n;i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int[][] dp = new int[n][n];
        for (int i = 0;i < n;i++) {
            int j = i + 1;
            while (j < n) {
                int count = dp[i][j - 1] + Math.abs(nums[j] + nums[i]);
                if (j - 2 >= 0) {
                    count = Math.min(count, dp[i][j - 2] + Math.abs(nums[j - 1]) + Math.abs(nums[i]));
                }
                dp[i][j] = count;
                j++;
            }
        }
        for (int[] row : dp) System.out.println(Arrays.toString(row));
        if (nums.length <= 2) return Math.abs(nums[nums.length - 1] - nums[0]);
        int rst = Integer.MAX_VALUE;
        for (int i = 0;i < n - 1;i++) {
            rst = Math.min(rst, nums[n - 1] - nums[i] + dp[i][n - 2]);
        }
        return dp[n - 1];
    }
}