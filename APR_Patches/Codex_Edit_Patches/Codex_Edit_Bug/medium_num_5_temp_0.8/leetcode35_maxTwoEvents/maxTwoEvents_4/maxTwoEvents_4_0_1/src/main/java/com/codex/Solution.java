package com.codex;

import java.util.*;

public class Solution {
public static int maxTwoEvents(int[][] events) {
    Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
    int[] dp = new int[events.length + 1];
    for (int i = 1; i <= events.length; i++) {
        int[] e = events[i - 1];
        dp[i] = Math.max(dp[i], dp[i - 1]);
        if (i == 1 || e[0] >= events[i - 2][1]) {
            dp[i] = Math.max(dp[i], dp[i - 1] + e[2]);
        }
        if (i >= 2) {
            dp[i] = Math.max(dp[i], dp[i - 2] + e[2]);
        }
    }
    return dp[events.length];
}

    
}