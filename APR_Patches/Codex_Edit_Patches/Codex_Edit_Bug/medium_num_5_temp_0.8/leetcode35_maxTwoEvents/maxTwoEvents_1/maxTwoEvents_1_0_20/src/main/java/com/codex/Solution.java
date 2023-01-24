package com.codex;

import java.util.*;

public class Solution {
        public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> (a[1] - b[1]));
        int[] dp = new int[events.length];
        for (int i = 0; i < events.length; i++) {
            dp[i] = events[i][2];
            for (int j = 0; j < i; j++) {
                if (events[j][1] <= events[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + events[i][2]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }    
        return res;
    }
}