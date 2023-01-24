package com.codex;

import java.util.*;

public class Solution {
 public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = dp[i - 1];
            if (nums[i] > nums[i - 1]) {
                if (i == 2) {
                    dp[i] += nums[i] - nums[i - 1];
                }
                else {
                    dp[i] = Math.min(nums[i] - nums[i - 1], nums[i] - nums[i - 2]) + dp[i - 1];
                }
            }
            else if (nums[i] < nums[i - 1]) {
                if (i == 2) {
                    dp[i] += nums[i - 1] - nums[i];
                }
                else {
                    dp[i] = Math.min(nums[i - 1] - nums[i], nums[i - 2] - nums[i]) + dp[i - 1];
                }
            }
        }
        return dp[nums.length - 1];
    }
}