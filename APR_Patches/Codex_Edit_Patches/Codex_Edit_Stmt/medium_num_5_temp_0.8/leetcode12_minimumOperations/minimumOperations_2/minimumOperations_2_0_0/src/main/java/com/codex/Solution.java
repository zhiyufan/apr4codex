package com.codex;

import java.util.*;

public class Solution {
    /**
     * 请你给数组 nums 中的每个元素一次加一或减一 ，你可以至多操作 k 次，
     * find the minimum of the absolute differences of the sums of even and odd numbered elements. 
     */

    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int a = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
            int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1] - nums[nums.length - 1];
    }

    
}