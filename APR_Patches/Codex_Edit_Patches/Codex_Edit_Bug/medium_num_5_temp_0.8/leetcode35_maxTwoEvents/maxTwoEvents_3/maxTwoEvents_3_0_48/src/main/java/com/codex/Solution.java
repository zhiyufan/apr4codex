package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        for (int i = 1; i < n; i++) {
            int max = events[i][2];
            for (int j = 0; j < i; j++) {
                if (canAttend(events, j, i)) {
                    max = Math.max(max, dp[j] + events[i][2]);
                }
            }
            dp[i] = max;
        }
        return dp[n-1];
    }

    private boolean canAttend(int[][] events, int i, int j) {
        return events[i][1] <= events[j][0];
    }
}