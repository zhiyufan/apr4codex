package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i % 3 == 2 && i != cost.length - 1) {
                continue;
            }
            sum += cost[i];
        }
        return sum;
    }
}