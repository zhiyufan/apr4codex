package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int minIndex = -1;
        int secondMinIndex = -1;
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] < cost[minIndex] || minIndex == -1) {
                secondMinIndex = minIndex;
                minIndex = i;
            } else if (cost[i] < cost[secondMinIndex] || secondMinIndex == -1) {
                secondMinIndex = i;
            }
        }
        for (int i = 0; i < cost.length; i++) {
            if (i != minIndex) {
                res += cost[minIndex] + cost[secondMinIndex];
            } else {
                res += cost[secondMinIndex];
            }
        }
        return res;
    }
}