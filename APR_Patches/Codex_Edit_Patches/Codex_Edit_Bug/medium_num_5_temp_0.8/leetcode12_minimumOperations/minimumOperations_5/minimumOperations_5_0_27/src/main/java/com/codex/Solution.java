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

//this solution is O(N^2)
public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];//dp(i) stores the minimum operations to convert nums[0] ~ nums[i] to all 1
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = nums[0];
        for(int i = 1; i < n; i++){
            dp[i] = dp[i - 1] + 1 - nums[i - 1] + nums[i];
            for(int j = 1; j <= i; j++){
                if(nums[i] == nums[i - j]){
                    dp[i] = Math.min(dp[i], dp[i - j - 1] + 1 - nums[i - j] + nums[i]);
                }else{
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
            }
        }
        return dp[n - 1];
    }
}