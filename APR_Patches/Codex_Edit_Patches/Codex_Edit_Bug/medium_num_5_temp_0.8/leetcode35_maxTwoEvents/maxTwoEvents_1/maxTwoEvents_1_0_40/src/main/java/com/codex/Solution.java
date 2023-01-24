package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(Event[] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i].profit;
        }

        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            int res = dp[i][n-1];
            for (int j = i+1; j < n; j++) {   
                if (events[j].start >= events[i].end) {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i][i] + events[j].profit);
                } else {
                    dp[i][j] = dp[i][j-1];
                }

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][i] + events[j].profit);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}