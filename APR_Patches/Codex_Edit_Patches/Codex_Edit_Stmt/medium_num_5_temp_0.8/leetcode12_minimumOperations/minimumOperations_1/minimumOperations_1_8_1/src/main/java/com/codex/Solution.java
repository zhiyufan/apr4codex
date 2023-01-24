package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            // 如果相邻两个都相等，则直接替换就可以了
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            // 如果相邻两个不相等,则dp[][2]和dp[][1]一样,计算dp[][1]
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
}