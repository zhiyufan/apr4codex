package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[][] costs) {
        
        if (costs.length == 0) return 0;
        for (int i = 1; i < costs.length; i++) {
            costs[i][0] += Math.min(costs[i - 1][1], costs[i - 1][2]);
            costs[i][1] += Math.min(costs[i - 1][0], costs[i - 1][2]);
            costs[i][2] += Math.min(costs[i - 1][0], costs[i - 1][1]);
        }
        return Math.min(Math.min(costs[costs.length - 1][1], costs[costs.length - 1][2]), costs[costs.length - 1][0]);
    }

    
}