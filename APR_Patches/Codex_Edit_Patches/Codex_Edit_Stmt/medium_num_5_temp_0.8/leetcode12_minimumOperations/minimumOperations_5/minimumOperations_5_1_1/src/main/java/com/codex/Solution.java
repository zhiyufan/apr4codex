package com.codex;

import java.util.*;

public class Solution {
public static int minimumOperations(int[] nums) {

    int n = nums.length;
    int[] dp = new int[n];
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2; i < n; i++) {
        dp[i] = dp[i - 1] + 1;
        if (nums[i] == nums[i - 2]) {
            // dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            dp[i] = Math.min(dp[i], dp[i - 2] + 1);
        }
    }

    return dp[n - 1];
}
}