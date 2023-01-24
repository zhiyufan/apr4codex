package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int res = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            res += cost[i];
            if (i - 1 >= 0) {
                res += cost[i - 1];
            }
        }
        Collections.sort(list);
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            res += list.get(i);
        }
        return res;
    }

    
}