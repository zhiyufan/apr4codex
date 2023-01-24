package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

    class Solution {
    public int minimumOperations(int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = Math.max(dp[i - 1], nums[i]);
            } else {
                dp[i] = dp[i - 1] ;
            }
            min = Math.min(min, nums[i] - dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

    
}