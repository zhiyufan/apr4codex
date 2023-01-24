package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + 1;
            if(nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i - 2] + 1, dp[i]);
            }
        }
        return dp[n - 1];
    }

    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[1] = nums[0];
        int res = Integer.MAX_VALUE;
        for(int i = 2; i <= n; i++){
            int count = 0;
            for(int j = i - 1; j >= 1; j--){
                if(nums[i-1] == nums[j-1]){
                    count = dp[j-1] + 1;
                    break;
                }else{
                    count = dp[j];
                }
            }
            dp[i] = count;
            res = Math.min(res, count);
        }
        return res;
    }

    
    
}