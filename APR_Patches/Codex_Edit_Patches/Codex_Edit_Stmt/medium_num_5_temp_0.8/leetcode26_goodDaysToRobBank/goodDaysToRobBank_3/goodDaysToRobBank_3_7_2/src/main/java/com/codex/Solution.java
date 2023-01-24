package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            nonInc[i] = min = Math.min(security[i], min);
        }
        for (int i = security.length - 1; i >= 0; i--) {
            nonDec[i] = max = Math.max(security[i], max);
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time] <= security[i] && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

    
}