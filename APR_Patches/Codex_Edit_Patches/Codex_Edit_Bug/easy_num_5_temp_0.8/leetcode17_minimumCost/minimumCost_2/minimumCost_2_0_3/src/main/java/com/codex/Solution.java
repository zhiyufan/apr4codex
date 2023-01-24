package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int num1 = 0;
        int i = 0;
        int min = Math.min(Math.min(cost[0], cost[1]), cost[2]);
        while (i < cost.length) {
            num1 += min;
            i += 3;
        }
        return sum;
    }

    
}