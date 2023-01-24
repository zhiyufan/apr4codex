package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        /** 
         * Arrays.sort(cost);
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            sum += cost[i];
        }
        return sum;*/
        
        // In this block I am using a different logic

        int sum = Math.min(cost[0],cost[1]);
        int i = 2;
        while (i < cost.length) {
            sum += Math.min(cost[i],cost[i-1]);
            i += 2;
        }
        return sum;       
    }

    
}