package com.codex;

import java.util.*;

public class Solution {
public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] dp = new int[n];
        dp[0] = 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(nums[i] - nums[i - 1]),
                             i > 1 ? dp[i - 2] + Math.abs(nums[i] - nums[i - 2]) : Integer.MAX_VALUE);
        }
        return dp[n - 1];
    }

}