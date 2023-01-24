package com.codex;

import java.util.*;

public class Solution {
    private class Interval {

        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public Interval[] merge(Interval[] intervals) {

        if (intervals == null || intervals.length == 0) {
            return intervals;
        }

        List<Interval> res = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a.start - b.start));

        for (Interval i : intervals) {
            if (res.isEmpty() || res.get(res.size()-1).end < i.start) {
                res.add(i);
            } else {
                res.get(res.size()-1).end = Math.max(res.get(res.size()-1).end, i.end);
            }
        }

        return res.toArray(new Interval[res.size()]);
    }
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
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1] + 1) {
                    //dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}