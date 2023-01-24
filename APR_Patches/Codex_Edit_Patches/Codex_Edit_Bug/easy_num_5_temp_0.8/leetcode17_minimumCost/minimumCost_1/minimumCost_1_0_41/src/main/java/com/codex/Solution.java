package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        if (cost.length == 2) return Math.min(cost[0], cost[1]);
        int first = cost[0];
        int second = cost[1];
        for (int i = 2; i < cost.length - 1; i++) {
            int newMin = Math.min(first, second) + cost[i];
            first = second;
            second = newMin;
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    
}