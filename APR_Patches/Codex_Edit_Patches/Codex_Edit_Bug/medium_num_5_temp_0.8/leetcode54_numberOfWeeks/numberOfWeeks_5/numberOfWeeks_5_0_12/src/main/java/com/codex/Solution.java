package com.codex;

import java.util.*;

public class Solution {
    
    public static long numberOfWeeks(int[] milestones) {
        long[] dp = new long[100001];
        for (int i = 0; i < 100001; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
        }
        dp[0] = 0;
        for (int i = 1; i <= 100000; i++) {
            for (int j = 0; j < milestones.length; j++) {
                if (milestones[j] <= i) {
                    if (milestones[j] == i) {
                        dp[i] = Math.min(dp[i], dp[milestones[j] - 1] + 1);
                    } else {
                        dp[i] = Math.min(dp[i], dp[milestones[j] - 1] + 1);
                    }
                }
            }
        }
        return dp[100000];
    }
}