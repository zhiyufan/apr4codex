package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost, int capital) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int res = capital, minIndex = 0;
        for (int curCost : cost) {
            if (curCost <= min) {
                res += min;
                secondMin = min;
                min = curCost;
                minIndex = i;
            } else if (curCost < secondMin) {
                res += curCost;
                secondMin = curCost;
            } else if (i != minIndex) {
                res += secondMin;
            }
            //System.out.println(min + " " + secondMin + " " + res);
        }
        return res;
    }
}