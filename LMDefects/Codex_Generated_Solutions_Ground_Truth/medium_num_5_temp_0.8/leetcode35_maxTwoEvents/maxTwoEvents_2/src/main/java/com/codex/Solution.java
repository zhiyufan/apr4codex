package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        /** You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
         * Return this maximum sum.
         * Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time t, the next event must start at or after t + 1.
         */
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    }