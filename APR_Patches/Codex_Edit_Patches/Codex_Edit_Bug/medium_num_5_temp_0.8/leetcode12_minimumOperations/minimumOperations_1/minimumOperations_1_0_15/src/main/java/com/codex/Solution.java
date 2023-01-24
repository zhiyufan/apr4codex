package com.codex;

import java.util.*;

public class Solution {
public int minOperations(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][2];
        for(int i = 0; i < n; i++){
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][1] = Integer.MAX_VALUE;
        }
        
        dp[0][0] = 0;
        dp[1][0] = Math.abs(nums[1] - nums[0]);
        
        for(int i = 1; i < n; i++){
            dp[i][0] = Math.abs(nums[i] - nums[i - 1]) + dp[i - 1][1];
            for(int j = i - 1; j >= 0; j--){
                int x = nums[i];
                int y = nums[j];
                if(x == y){
                    dp[i][1] = Math.min(dp[i][1], dp[j - 1][0]);
                } else {
                    dp[i][1] = Math.min(dp[i][1], dp[j][0] + x);
                }
            }
        }
        return dp[n - 1][1];
    }
}