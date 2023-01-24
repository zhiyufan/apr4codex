package com.codex;

import java.util.*;

public class Solution {

//         A = [[0, 3, 1], [1, 5, 2], [2, 5, 3], [2, 4, 5], [4, 5, 6]]

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
        // start from the end, since the points are sorted
        for (int i = n - 1; i >= 0; i--) {
            int res = dp[i][n - 1];
            for (int j = n - 1; j > i; j--) {
                dp[i][j - 1] = Math.max(dp[i][j], dp[i + 1][j]);

                if (events[i][1] + 1 <= events[j][0]) {
                    dp[i][j - 1] = Math.max(dp[i][j - 1], dp[i + 1][j - 1] + events[i][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}