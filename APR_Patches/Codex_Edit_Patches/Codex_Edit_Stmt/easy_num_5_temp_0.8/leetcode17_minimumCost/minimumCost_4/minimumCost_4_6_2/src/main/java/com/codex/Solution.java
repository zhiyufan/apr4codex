package com.codex;

import java.util.*;

public class Solution {
// https://www.hackerrank.com/challenges/paint-house
    public static int minimumCost(int[] cost) {
        int n = cost.length;
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int firstMin = 0, secondMin = 0;
        for (int i = 0; i < n; i++) {
            // Check the previous i - 1 houses
            int curMin = Integer.MAX_VALUE;
            for (int k = 0; k < 3; k++) {
                if (k != firstMin) {
                    curMin = Math.min(curMin, cost[i][k]);
                }
            }
        }
        return res;
    }
}