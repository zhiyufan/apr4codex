package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = dp[i-1][j];

                if (j - 1 >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j-1]);
                }

                if (events[i][0] >= events[j][1] + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[j][j] + events[i][2]);
                }

                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }

    
}