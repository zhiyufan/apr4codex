package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
         int sum = 0;
         Arrays.sort(cost);
         for (int i = cost.length - 1; i >= 0; i--) {
             if (i % 3 == 2) {
                 continue;
             }
             sum += cost[i];
         }
         return sum;
    }

    
}