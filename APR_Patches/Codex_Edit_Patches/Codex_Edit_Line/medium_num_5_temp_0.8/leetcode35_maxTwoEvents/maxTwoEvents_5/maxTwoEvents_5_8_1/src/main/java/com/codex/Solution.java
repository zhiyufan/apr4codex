package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        int res = 0;
        int prevEnd = -1;
        boolean[] used = new boolean[events.length];
        for (int i = 0; i < events.length; i++) {
            if (events[i][0] < prevEnd) {
                continue;
            }
            used[i] = true;
            res += events[i][2];
            prevEnd = events[i][1];
        }
        int prevEnd2 = -1;
        for (int i = events.length - 1; i >= 0; i--) {
            if (used[i]) {
                continue;
            }
            int res2 = 0;
            if (events[i][0] >= prevEnd2) {
                res2 = events[i][2];
            }
            if (events[i][1] < prevEnd) {
                res2 += res - prevEnd + events[i][1];
            }
            res = Math.max(res, res2);
            prevEnd2 = events[i][1];
        }
        return res;
    }
    
      public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        int res = 0;
        int prevEnd = -1;
        boolean[] used = new boolean[events.length];
        for (int i = 0; i < events.length; i++) {
            if (events[i][0] < prevEnd) {
                continue;
            }
            used[i] = true;
            res += events[i][2];
            prevEnd = events[i][1];
        }
        int r = 0;
        int prevEnd2 = -1;
        for (int i = events.length - 1; i >= 0; i--) {
            if (used[i]) {
                continue;
            }
            if (events[i][0] >= prevEnd2) {
                r = events[i][2];
            }
            if (events[i][1] < prevEnd) {
                r += res - prevEnd + events[i][1];
            }
            res = Math.max(res, r);
            prevEnd2 = events[i][1];
        }
        return res;
    }
    
    
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            for (int j = 1; j <= events.length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]);
                int prevEndTime = (j == 1) ? -1: events[j-2][1];
                if (events[i-1][0] >= prevEndTime + 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

}
}