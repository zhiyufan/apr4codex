package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

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
                secondMin = curCost; // fix line 16 here
            } else {
                res += secondMin;
            }
        }
        return res;
    }
}