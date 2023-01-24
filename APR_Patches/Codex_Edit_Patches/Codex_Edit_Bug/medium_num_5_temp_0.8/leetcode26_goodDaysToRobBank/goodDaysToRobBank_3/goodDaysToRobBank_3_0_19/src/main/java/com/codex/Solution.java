package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] nonIncMax = new int[security.length];
        int[] nonDecMin = new int[security.length];
        int min = security[security.length - 1];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonDecMin[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonIncMax[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonDecMin[i - time] <= security[i] && security[i] <= nonIncMax[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

    
}