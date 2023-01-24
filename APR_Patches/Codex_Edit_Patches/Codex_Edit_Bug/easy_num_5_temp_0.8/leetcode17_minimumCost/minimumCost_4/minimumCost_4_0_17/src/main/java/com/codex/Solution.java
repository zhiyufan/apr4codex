package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int res = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                if (min != Integer.MAX_VALUE) {
                    res += min;
                }
                secondMin = min;
                min = curCost;
            } else if (curCost < secondMin) {
                if (secondMin != Integer.MAX_VALUE) {
                    res += curCost;
                }
                secondMin = curCost;
            } else {
                if (secondMin != Integer.MAX_VALUE) {
                    res += secondMin;
                }
            }
        }
        return res;
    }
}