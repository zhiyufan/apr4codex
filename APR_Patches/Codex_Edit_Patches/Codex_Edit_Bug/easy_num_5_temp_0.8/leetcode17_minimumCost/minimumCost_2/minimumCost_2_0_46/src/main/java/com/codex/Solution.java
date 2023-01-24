package com.codex;

import java.util.*;

public class Solution {
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
    public static void main(String[] args) {
        int[] cost = {3, 7, 2, 8, 6, 4, 5, 1};

        System.out.println("Minimum Cost: " + minimumCost(cost));
    }
}
    
}