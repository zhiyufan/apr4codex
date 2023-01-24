package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        List<Integer> days = new ArrayList<>();
        if (security.length == 0) {
            return days;
        }

        for (int i = time; i < security.length; i++) {
            int j = 1;
            boolean goodDay = false;
            while (j <= time && (i - j) > 0 && (i + j) < security.length) {
                if (security[i - j] < security[i - j + 1] && security[i + j] > security[i + j - 1]) {
                    goodDay = true;
                } else {
                    goodDay = false;
                    break;
                }
                j++;
            }
            if (goodDay) {
                days.add(i);
            }
        }

        return days;
    }

    
}