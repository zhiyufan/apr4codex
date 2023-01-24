package com.codex;

import java.util.*;

public class Solution {
     public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> result = new ArrayList<>();
        if (security == null || security.length == 0 || time <= 0) return result;

        if (time == 1) {
            for (int i = 0; i < security.length; i++) {
                int j = 0;
                for (j = 1; j < security.length; j++) {
                    if (security[i] < security[j]) break;
                }
                if (j >= security.length) result.add(i);
            }
            return result;
        }

        int end = security.length - 1 - time;
        for (int i = time; i <= end; i++) {
            int j = 0;
            for (j = 1; j <= time; j++) {
                if (!(security[i - j] > security[i - j + 1] && security[i + j] < security[i + j - 1])) break;
            }
            if (j > time) result.add(i);
        }
        return result;
    }

    
}