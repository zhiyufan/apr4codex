package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfWeeks(int[] milestones) {
        
        int result = 0;
        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < milestones.length; i++) {
            for (int j = 0; j < milestones[i]; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[milestones[i]] = Math.min(dp[j] + 1, dp[milestones[i]]);
                }
            }
        }
		result = dp[9999];
        return result;
    }

    
}