package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        int res = 0;

        Arrays.sort(cost);
        for (int i = 0; i < cost.length - 1; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += cost[i];
        }
        res += cost[cost.length - 1];
        return res;
    }

    
}