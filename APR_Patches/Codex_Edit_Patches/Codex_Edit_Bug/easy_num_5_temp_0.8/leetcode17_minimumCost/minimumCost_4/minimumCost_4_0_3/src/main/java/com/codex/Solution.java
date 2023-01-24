package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given a list of houses and their prices, find the minimum cost incurred while painting all the houses such that no two adjacent houses
     * should have the same color.
     * 1,2,3,4
     * 1,3,5
     */
     
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                res += min;
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                res += curCost;
                secondMin = curCost;
            } else {
                res += secondMin;
            }
        }
        return res;
    }
}