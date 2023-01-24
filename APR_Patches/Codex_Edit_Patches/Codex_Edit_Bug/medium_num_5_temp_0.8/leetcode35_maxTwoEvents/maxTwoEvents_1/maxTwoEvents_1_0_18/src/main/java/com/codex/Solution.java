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
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                dp[i][j] = dp[i][j-1];

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][i] + events[j][2]);
                }
            }
        }

        return max;
    }
}