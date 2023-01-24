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





// 第二种做法 ,  
// 这种做法不好的地方是，如果有重复的，会被排除掉
public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        Arrays.sort(cost);
        int res = 0;
        int index = 0;
        while (index + 1 < cost.length) {
            index += 1;
            if (cost[index] == cost[index - 1]) {
                res += cost[index];
                cost[index] = -1;
            } else {
                res += cost[index - 1];
            }
        }
        
        res += cost[cost.length - 1];
        return res;
    }
}