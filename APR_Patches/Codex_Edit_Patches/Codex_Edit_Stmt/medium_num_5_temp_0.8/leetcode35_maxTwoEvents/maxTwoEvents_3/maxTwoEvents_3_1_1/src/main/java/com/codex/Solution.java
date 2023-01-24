package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        dp[0] = events[0][2]; // 只能参加第一个活动时，最大收益是第一个活动的收益
        dp2[0] = 0; // 只能参加第一个活动时，最大收益如果不参加活动，则收益为0
        dp[1] = events[1][2]; // 只能参加前两个活动中的其中一个时，最大收益是第二个活动的收益
        dp2[1] = events[0][2]; // 只能参加前两个活动中的其中一个时，最大收益如果不参加第二个活动，则收益为第一个活动的收益
        for (int i = 2; i < n; i++) {
            if (events[i][0] >= events[i-1][1]) { // 可以参加第i个活动
                dp[i] = Math.max(dp[i-1], events[i][2] + dp2[i - 1]);
                dp2[i] = dp2[i - 1];
            } else { // 不能参加第i个活动
                dp[i] = dp[i-1];
                dp2[i] = dp[i-1];
            }
        }
        return dp[n-1];
    }

    
}