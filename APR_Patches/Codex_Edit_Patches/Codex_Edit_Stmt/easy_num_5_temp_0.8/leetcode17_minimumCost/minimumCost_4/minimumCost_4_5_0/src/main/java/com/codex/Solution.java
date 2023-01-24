package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] <= min) {
                res += min;
                secondMin = min;
                min = cost[i];
            } else if (cost[i] < secondMin) {
                res += cost[i];
                secondMin = cost[i];
            } else {
                res += secondMin;
            }
        }
        return res;
    }
}