package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {        
        int dp[][] = new int[nums.length][2];
        dp[0][1] = nums[0];      
        for(int i = 1; i < nums.length; i++){
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + nums[i];
        }
        return Math.min(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    
}