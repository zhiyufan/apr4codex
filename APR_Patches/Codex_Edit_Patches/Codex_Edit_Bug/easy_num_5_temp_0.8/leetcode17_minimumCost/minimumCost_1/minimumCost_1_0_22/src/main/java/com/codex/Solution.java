package com.codex;

import java.util.*;

public class Solution {

        if (cost.length == 0) return 0;
        if (cost.length == 1) return cost[0] + paintHouses(Arrays.copyOfRange(cost, 1, cost.length));
        int[] dp = new int[cost.length]; // 0 is red, 1 is blue
        dp[0] = cost[0]; // only choice
        dp[1] = cost[1]; // house 1 can only be painted blue
        for (int i = 2; i < cost.length; i++) { // if house i is painted red, then house i - 1 can only be painted blue
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2] + cost[i - 1]); // if house i is painted blue, then house i - 1 can only be painted red
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    
}