package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        if (events == null || events.length == 0) {
            return 0;
        }
        Arrays.sort(events, (a, b) -> (a[1] - b[1]));
        int[][] dp = new int[events.length][events.length];
        for (int i = 0; i < events.length; i++) {
            dp[i][0] = events[i][2];
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i-1][j-1];
                if (events[i][0] >= events[i-1][1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i][2]);
                }
            }
        }
        int maxVal = dp[events.length - 1][0];
        for (int i = 1; i < events.length; i++) {
            maxVal = Math.max(maxVal, dp[events.length - 1][i]);
        }
        return maxVal;
    }

    
}