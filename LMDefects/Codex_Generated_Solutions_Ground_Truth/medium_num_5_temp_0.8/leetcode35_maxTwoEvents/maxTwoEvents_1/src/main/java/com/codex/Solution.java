package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        /** You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
         * Return this maximum sum.
         * Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time t, the next event must start at or after t + 1.
         */

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

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