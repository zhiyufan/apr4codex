package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int sum = 0;
        for (int i = 0; i < cost.length; i += 3) {
            int j = i + 2;
            while (j < cost.length && cost[i] >= cost[j]) {
                sum += cost[j];
                j += 3;
            }
            if (j == cost.length) {
                sum += cost[i];
            }
        }
        return sum;
    }

    
}