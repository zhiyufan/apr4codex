package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int max = 0;
        int[] dp = new int[10001];
        for (int i = 0; i < milestones.length; i++) {
            if (max < milestones[i]) {
                max = milestones[i];
            }
        }
        for (int i = 0; i <= max; i++) {
            dp[i] = i;
        }
        for (int i = 0; i < milestones.length; i++) {
            
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] + 1 < dp[milestones[i]]) {
                    dp[milestones[i]] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    
}