package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        if (nums[0] == 0) {
            return -1;
        }

        for (int i = 2; i < n; i++){
            if (nums[i] == 0){
                return -1;
            }
            else if (nums[i] == nums[i - 1]) {
                if (i == 2) {
                    dp[i] = dp[i - 1];
                } else {
                    dp[i] = Math.min(dp[i - 2] + 1, dp[i - 1]);
                }
            }
            else if(nums[i] == nums[i - 1] + 1){
                dp[i] = dp[i - 1];
            }
            else if(nums[i] == nums[i - 2] + 1) {
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
            else{
                return -1;
            }
        }

        return dp[n - 1];
    }

    
}