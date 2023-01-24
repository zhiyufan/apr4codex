package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public int maxTwoEvents(int[][] events) {


        if (events == null || events.length == 0) {
            return 0;
            Arrays.sort(events[i], new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
        }

        for (int i = 0; i < n; i++) {
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        for (int i = 0; i < n-1; i++) {
            int res = dp[0][i];
            for (int j = i + 1; j < n; j++) {
                dp[i + 1][j] = Math.max(dp[i][j - 1], dp[i + 1][j - 1]);

                if (events[i][1] <= events[j][0]) {
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i + 1][j]);
            }
        }

        return dp[n-1][n-1];
    }
}
}