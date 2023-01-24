package com.codex;

import java.util.*;

public class Solution {
//Problem : Climb Stairs

//Option 1:
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

//Solution 2:
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length+1];
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.min(dp[i-2]+cost[i-2], dp[i-1]+cost[i-1]);
        }
        return dp[dp.length-1];
    }
}