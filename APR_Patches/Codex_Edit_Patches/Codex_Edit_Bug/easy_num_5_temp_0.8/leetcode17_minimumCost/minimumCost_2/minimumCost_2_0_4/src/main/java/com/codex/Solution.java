package com.codex;

import java.util.*;

public class Solution {


import java.util.Arrays;

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

    // main function
    public static void main(String []args){
        int[] cost = {20,19,10,18,18,17,20};
        minimumCost(cost);
    }
}
}