package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length + 1];
        int[] nonDec = new int[security.length + 1];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonInc[i + 1] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonDec[i + 1] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time + 1] <= security[i] && security[i] <= nonDec[i + time + 1]) {
                res.add(i);
            }
        }
        return res;
    }
    
    
}