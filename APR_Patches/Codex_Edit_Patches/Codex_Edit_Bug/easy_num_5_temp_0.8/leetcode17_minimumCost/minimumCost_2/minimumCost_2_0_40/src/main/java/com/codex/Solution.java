package com.codex;

import java.util.*;

public class Solution {
     public static int minimumCost(int[] cost) {
        // Write your code here
        Arrays.sort(cost);
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i > 2 && (i + 1) % 3 == 0) {
                sum += cost[i];
            }
            sum += cost[i];
        }
        return sum;
    }

    
}