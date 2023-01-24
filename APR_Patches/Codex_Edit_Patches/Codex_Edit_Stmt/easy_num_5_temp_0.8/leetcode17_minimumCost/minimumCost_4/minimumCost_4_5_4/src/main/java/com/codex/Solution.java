package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost == null || cost.length == 0) {
            return 0;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int res = 0;
        for (int num : cost) {
            if (num <= min1) {
                res += min1;
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                res += num;
                min2 = num;
            } else {
                res += min2;
            }
        }
        return res;
    }
}