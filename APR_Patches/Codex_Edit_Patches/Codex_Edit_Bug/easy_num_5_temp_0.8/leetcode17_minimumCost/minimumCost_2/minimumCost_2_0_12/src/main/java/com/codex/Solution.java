package com.codex;

import java.util.*;

public class Solution {
#Code must be written in the same file
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2) {
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }

    
}