package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        int[] cost = {1, 2, 3, 4, 5, 6};

        System.out.println("The final price is : "+minimumCost(cost));

    }

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