package com.codex;

import java.util.*;

public class Solution {
public static int maxTwoEvents(int[][] events) {    

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = events[i][2];

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