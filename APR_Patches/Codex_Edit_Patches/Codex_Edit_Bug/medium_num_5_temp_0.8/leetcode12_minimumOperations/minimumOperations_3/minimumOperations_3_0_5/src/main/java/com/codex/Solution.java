package com.codex;

import java.util.*;

public class Solution {
    public int minimumOperations(String leaves) {
        char[] nums = leaves.toCharArray();
        int len = nums.length;
        int[][] dp = new int[len][3];
        dp[0][0] = 0;
        dp[0][1] = dp[0][2] = nums[0] == 'y' ? 1 : 0;
        dp[1][0] = dp[1][1] = dp[1][2] = nums[1] == 'y' ? 1 : 0;
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][0];
            if (nums[i] == 'y') {
                dp[i][0] += 1;
            }
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]) + (nums[i] == 'y' ? 1 : 0);
            dp[i][2] = Math.min(dp[i-1][1], dp[i-1][2]);
            if (nums[i] == 'r') {
                dp[i][1] += 1;
            }
            // System.out.println(i + " " + Arrays.toString(dp[i]));
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

    
}