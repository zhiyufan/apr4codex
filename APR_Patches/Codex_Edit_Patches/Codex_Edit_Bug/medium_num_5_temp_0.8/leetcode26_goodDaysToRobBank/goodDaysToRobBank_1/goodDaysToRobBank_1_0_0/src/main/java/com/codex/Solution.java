package com.codex;

import java.util.*;

public class Solution {
    public static int findRobot(int[] security, int time) {
        
        int max = 0;
        for (int i = time; i < security.length - time; i++) {
            boolean good = true;
            for (int j = i - time; j < i; j++) {
                if (security[j] > security[j + 1]) {
                    good = false;
                    break;
                }
            }
            if (!good) continue;
            for (int j = i + 1; j < i + time + 1; j++) {
                if (security[j - 1] > security[j]) {
                    good = false;
                    break;
                }
            }
            if (good) {
                max = Math.max(max, security[i]);
            }
        }
        return goodDays;
    }

    
}