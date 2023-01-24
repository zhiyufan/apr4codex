package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeek(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        long max = -1;
        for (int i = 0; i < milestones.length; i++) {
            for(int j = i + 1; j < milestones.length; j++) {
                if(milestones[j] % milestones[i] == 0) {
                    dp[j] = Math.max(dp[j], dp[i] + milestones[j]);
                    max = Math.max(max, dp[j]);
                }
            }
        }
        for(int i = 0; i < milestones.length; i++) {
            dp[i] = Math.max(dp[i], milestones[i]);
            max = Math.max(max, dp[i]);
            if(max == milestones[i]) {
                max = dp[i];
            }
        }
        
        return (max - 1) / 7 + 1;
    }
}