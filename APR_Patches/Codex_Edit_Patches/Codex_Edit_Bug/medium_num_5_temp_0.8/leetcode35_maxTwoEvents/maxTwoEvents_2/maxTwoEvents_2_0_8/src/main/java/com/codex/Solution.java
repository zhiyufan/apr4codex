package com.codex;

import java.util.*;

public class Solution {
/**
 * 活动安排，分两种情况，第一种，第i个活动不被选定时，其前一个活动有三种可能，第一个活动，
 * 第二个活动，没有任何活动，第二种，第i个活动被选定时，其前一个活动有两种可能，第i-1个活动
 * 或者没有任何活动，而且该活动的时间必须大于等于前一个活动的结束时间
 */
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            if (events[i-1][1] <= events[i][0]) {
                dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            }
            if (events[i-1][1] <= events[i][0]) {
                dp[i][2] = events[i][2] + dp[i-1][1];
            }
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    
}