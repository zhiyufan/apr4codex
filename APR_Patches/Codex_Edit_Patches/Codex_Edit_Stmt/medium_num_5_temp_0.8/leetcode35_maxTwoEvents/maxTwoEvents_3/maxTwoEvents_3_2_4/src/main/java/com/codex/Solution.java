package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
            if (events[i][0] > events[i - 1][1]) dp[i] = Math.max(dp[i - 1], events[i][2] + dp[i - 2]);
            else dp[i] = Math.max(dp[i - 1], events[i][2] + dp[i - 1]);
        }
        return dp[n-1];
    }

    // another
    public static int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = events[i][2];
            for (int j = 0; j < i; j++) {
                if (events[i][0] >= events[j][1]) {
                    dp[i] = Math.max(dp[i], events[i][2] + dp[j]);
                }
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }
}