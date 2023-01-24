package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        
        for (int i = 0; i < security.length; i++) {
            nonInc[i] = i == 0 ? security[i] : Math.min(security[i], nonInc[i - 1]);
        }
        for (int i = security.length - 2; i >= 0; i--) {
            nonDec[i] = Math.max(security[i], nonDec[i + 1]);
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time] <= security[i] 
                && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }
}