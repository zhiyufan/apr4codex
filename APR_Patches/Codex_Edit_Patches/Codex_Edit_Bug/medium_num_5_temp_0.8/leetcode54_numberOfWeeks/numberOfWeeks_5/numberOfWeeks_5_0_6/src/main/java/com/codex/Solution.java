package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
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
            result = Math.max(result, dp[milestones[i]]);
        }
        return result;
    }

    public static int distance(int[] a) {
        int index = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int k = index; k < i; k++) {
                if (a[i] <= a[k]) {
                    index = k;
                    break;
                }
            }
            result = Math.max(result, i - index);
        }
        return result;
    }

    
    
}