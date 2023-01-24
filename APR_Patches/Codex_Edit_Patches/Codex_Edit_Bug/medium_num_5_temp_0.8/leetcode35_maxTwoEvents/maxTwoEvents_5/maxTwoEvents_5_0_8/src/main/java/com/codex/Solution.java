package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= events.length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]);
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    public static int maxTwoEvents(int[][] events) {
        
        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int[] dp = new int[events.length];
        for (int i = 0; i < events.length; i++) {
            dp[i] = events[i][2];
            for (int j = 0; j < i; j++) {
                if (events[i][0] >= events[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + events[i][2]);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
    
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);

        int[] dp = new int[events.length];
        for (int i = 0; i < events.length; i++) {
            // dp[i] does not include event i
            dp[i] = maxEvents(events, i, i-1);
            // dp[i] includes event i
            dp[i] = Math.max(dp[i], maxEvents(events, i, i-2) + events[i][2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    private static int maxEvents(int[][] events, int index, int prev) {
        if (prev == -1) {
            return 0;
        }
        int[] dp = new int[index + 1];
        for (int i = 1; i <= index; i++) {
            dp[i] = dp[i-1];
            int prevEndTime = (i == 1) ? -1: events[i-2][1];
            if (events[i-1][0] >= prevEndTime + 1) {
                dp[i] = Math.max(dp[i], dp[i-1] + events[i-1][2]);
            }
        }
        return dp[index];
    }
    
}