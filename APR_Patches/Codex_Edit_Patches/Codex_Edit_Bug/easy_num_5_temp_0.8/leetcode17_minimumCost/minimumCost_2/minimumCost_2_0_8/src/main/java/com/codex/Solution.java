package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int sum = 0, count = 0;
        for (int i = 0; i < cost.length; i++) {
            if (count == cost.length / 3) {
                continue;
            }
            count++;
            sum += cost[i];
        }
        return sum;
    }
}