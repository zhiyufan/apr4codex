package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        if (security == null || security.length == 0) {
            return res;
        }
        if (time <= 0) {
            for (int i = 0; i < security.length; i++) {
                res.add(i);
            }
            return res;
        }
        time = time - 1;

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min); //suppose here is min = Integer.MAX_VALUE
            nonInc[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) { //here is mistake: should be i = security.length - 1, because we want to start to compare with the end of array
            max = Math.max(security[i], max);
            nonDec[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - 1 - time  && nonInc[i - time] <= security[i] && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

    
}