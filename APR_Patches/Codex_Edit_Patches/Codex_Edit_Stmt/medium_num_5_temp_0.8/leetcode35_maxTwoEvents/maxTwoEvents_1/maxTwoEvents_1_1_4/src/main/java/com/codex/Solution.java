package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0) {
        int max = Integer.MIN_VALUE;
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];

            int res = dp[i][i];
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j - 1]);

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i][j] = Math.max(dp[i][j], res + events[j][2]);
                }
                res = Math.max(res, dp[i][j]);
            }
            max = Math.max(max, res);
        }

        }
        return max<0?0:max;
    }

    
}