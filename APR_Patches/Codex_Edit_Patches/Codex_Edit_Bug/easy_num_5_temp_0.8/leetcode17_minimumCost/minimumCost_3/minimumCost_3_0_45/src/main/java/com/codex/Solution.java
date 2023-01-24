package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int[] dp = new int[cost.length + 1];
        dp[1] = cost[0];
        dp[2] = cost[1];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 1] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
    public static int minimumCost(int[] cost) {

        int fi = cost[0];
        int sec = cost[1];
        int third = cost[2];
        
        for (int i = 3; i < cost.length; i++) {
            int curr = cost[i] + Math.min(fi, sec);
            fi = sec;
            sec = third;
            third = curr;
        }
        return Math.min(sec, third);
    }

    
    
}