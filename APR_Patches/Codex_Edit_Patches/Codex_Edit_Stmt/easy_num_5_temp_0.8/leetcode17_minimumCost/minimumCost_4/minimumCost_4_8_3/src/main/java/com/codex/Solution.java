package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int totalCost = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                totalCost += min;
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                totalCost += curCost;
                secondMin = curCost;
            } else {
                totalCost += secondMin;
            }
        }
        return totalCost;
    }
}