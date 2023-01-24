package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones , int finalMiles) {
        
        int result = 0;
        int[] dp = new int[finalMiles+1];
        for (int i = 0; i < finalMiles+1; i++) {
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
         result = dp[finalMiles];
        return result;
    }

    
}