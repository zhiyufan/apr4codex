package com.codex;

import java.util.*;

public class Solution {

    public static int minimumCost(int[] cost) {
        
        Arrays.sort(cost);
        int res = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            res += cost[i];
            res += cost[i - 1];
        }
        return res;
    }

/*
Input
[39, 36, 22, 19, 38, 37, 18, 20, 21, 42, 42, 23, 47, 37, 41, 48, 40, 40, 6, 26, 14, 44, 25, 16, 39, 42, 42, 41, 38, 23, 22, 38, 40, 48, 40, 36, 41, 19, 34, 30, 32, 27, 44, 13, 13, 10, 30, 21, 20, 33, 39, 2, 32, 41, 15, 2, 38, 33, 42, 16, 36, 34, 1, 44, 7, 15, 41, 47, 7, 39, 19, 43, 7, 1, 38, 34, 7, 6, 38, 41, 15, 38, 27, 45, 39, 45]

Your Output (stdout)
1449

Expected Output
1449
*/    
}