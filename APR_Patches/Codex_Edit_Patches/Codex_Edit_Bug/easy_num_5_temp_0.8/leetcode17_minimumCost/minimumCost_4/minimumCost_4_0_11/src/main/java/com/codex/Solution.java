package com.codex;

import java.util.*;

public class Solution {

public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int result = 0;
        for (int curCost : cost) {
            if (curCost < min1) {
                result += min2 != Integer.MAX_VALUE ? min2 : min1;
                min2 = min1;
                min1 = curCost;
            } else if (curCost < min2) {
                result += curCost;
                min2 = curCost;
            } else {
                result += min2;
            }
        }
        return result;
    }
}
}