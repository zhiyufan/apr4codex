package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> goodDays = new ArrayList<>();
        for (int i = time; i < security.length - time; i++) {
            boolean good = true;
            for (int j = i - time; j < i; j++) {
                if (security[j] > security[j + 1]) {
                    good = false;
                    break;
                }
            }
            if(security[i] > security[i-1]) good = false;
            if (!good) continue;
            for (int j = i + 1; j < i + time + 1; j++) {
                if (security[j - 1] > security[j]) {
                    good = false;
                    break;
                }
                if(security[i] > security[i+1]) good = false;
            }
            if (good) goodDays.add(i);
        }
        return goodDays;
    }

    
}