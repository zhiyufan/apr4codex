package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
            }
        }
        return dp[n - 1];
    }



    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            for (int j = 1;j <= nums[i];j++) {
                if (i + j >= n) break;
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[n - 1];
    }

    
}