package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {


        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = time - 1; i < security.length - time; i++) {
            min = Math.min(security[i], min);
            nonInc[i - time + 1] = min;
        }
        for (int i = security.length - time; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonDec[i] = max; 
        }
        for (int i = time - 1; i < security.length - time; i++) {
            if (nonInc[i - time + 1] <= security[i] && security[i] <= nonDec[i]) {
                res.add(i + 1);
            }
        }
        return res;
    }
}