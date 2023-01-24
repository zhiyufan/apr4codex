package com.codex;

import java.util.*;

public class Solution {
public static int minimumOperations(int[] nums) {
    int[][] dp = new int[nums.length][3];
    dp[0][0] = nums[0]; //red
    dp[0][1] = Integer.MAX_VALUE; //green
    dp[0][2] = Integer.MAX_VALUE; //blue

    int n = nums.length;
    for(int i = 1; i < n; i++) {
        dp[i][0] = nums[i] + Math.min(dp[i - 1][1], dp[i - 1][2]);
        dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + 1;
        dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + 1;
    }

    return Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
}
}