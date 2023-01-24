package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[2][n];

        for (int i = 0; i < n; i++) {
            dp[0][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[1][i];
            for (int j = i+1; j < n; j++) {
                dp[1][j] = Math.max(dp[0][j-1], dp[1][j-1]);

                if (events[j][0] >= events[i][1]) {
                    dp[1][j] = Math.max(dp[1][j], dp[0][i] + events[j][2]);
                }
                res = Math.max(res, dp[1][j]);
            }
            max = Math.max(max, res);
        }
            for (int k = 0; k <= i; k++) {
                dp[0][k] = dp[1][k];
            }
        }
        return max;
    }

    
}