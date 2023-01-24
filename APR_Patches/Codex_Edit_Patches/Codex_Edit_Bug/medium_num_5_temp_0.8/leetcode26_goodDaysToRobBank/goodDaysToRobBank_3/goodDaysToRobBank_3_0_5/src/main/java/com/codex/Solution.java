package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {       
        List<Integer> res = new ArrayList<>();
        int[] nonDec2 = new int[security.length];
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[0];
        int max2 = security[security.length - 1];
        
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonInc[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
        
        for (int i = security.length - 1; i >= 0; i--) {
        	max2 = Math.max(security[i], max2);
            nonDec2[i] = max2;
        }
        
            nonDec[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time] <= security[i] && security[i] <= nonDec2[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

    
}