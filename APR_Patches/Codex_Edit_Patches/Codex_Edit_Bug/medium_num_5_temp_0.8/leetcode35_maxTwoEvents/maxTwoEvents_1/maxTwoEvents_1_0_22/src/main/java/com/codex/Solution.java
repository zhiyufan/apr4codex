package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }
            if (i > 0) {
                dp[i][i] = Math.max(dp[i][i], dp[i-1][i-1]);
            }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = dp[0][n-1];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}