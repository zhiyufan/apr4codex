package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time, int max) {
        
        List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            boolean good = true;
            for (int j = i - time; j < i; j++) {
                if (security[j] > security[j + 1] || security[j] == max) {
                    good = false;
                    break;
                }
            }
            if (!good) continue;
            for (int j = i + 1; j < i + time + 1; j++) {
                if (security[j - 1] > security[j] || security[j] == max) {
                    good = false;
                    break;
                }
            }
            if (good) goodDays.add(i);
        }
        return goodDays;
    }

    
}