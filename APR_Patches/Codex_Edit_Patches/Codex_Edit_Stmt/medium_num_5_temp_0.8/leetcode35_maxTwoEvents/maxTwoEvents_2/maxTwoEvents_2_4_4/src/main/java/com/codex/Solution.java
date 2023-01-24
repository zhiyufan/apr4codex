package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            //either you skip the current event or extend the previous event interval
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    public static int maxTwoEvents(int[][] events) {
        //maximum of two events such that no events overlap
        //sort the events by end time
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));
        int n = events.length;
        int[] dp = new int[n];
        dp[0] = events[0][2];
        int max = dp[0];
        for (int i = 1; i < n; i++)
            for (int prev = i - 1; prev >= 0; prev--) {
                if (events[prev][1] <= events[i][0]) {
                    dp[i] = Math.max(dp[i], events[i][2] + dp[prev]);
                    break;
                }
            }
        for (int i = 0; i < n; i++)
            max = Math.max(max, dp[i]);
        return max;
    }
}