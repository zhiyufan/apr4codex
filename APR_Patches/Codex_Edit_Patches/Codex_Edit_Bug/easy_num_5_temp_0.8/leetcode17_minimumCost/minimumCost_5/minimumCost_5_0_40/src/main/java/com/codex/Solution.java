package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int n = cost.length;
        int ans = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (res == 0 || res == 1) {
                res += cost[n - 1 - i];
            } else if (res == 2) {
                res += cost[0];
            }
            res += list.get(i);
        }
        return res;
    }

    
}