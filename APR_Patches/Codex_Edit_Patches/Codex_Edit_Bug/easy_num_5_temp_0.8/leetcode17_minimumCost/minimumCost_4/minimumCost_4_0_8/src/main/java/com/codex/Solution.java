package com.codex;

import java.util.*;

public class Solution {
    // Better solution
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int minimumCost(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int c1 = cost[0];
        int c2 = cost[0];
        int res = c1;
        for (int i = 1; i < cost.length; i++) {
            int cur = cost[i];
            int min = Math.min(c1, c2);
            int tmp = cur + Math.min(c1, c2);
            res += tmp;
            c1 = tmp;
            c2 = min;
        }
        return res;
    }

    // Time complexity: O(n)
    // Space Complexity: O(1)
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                res += min;
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                res += curCost;
                secondMin = curCost;
            } else {
                res += secondMin;
            }
        }
        return res;
    }
}