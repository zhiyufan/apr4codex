package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int c = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
           c = cost[i] + Math.min(c1, c2);
            c2 = c1;
            c1 = c;
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    
}