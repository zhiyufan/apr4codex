package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        
        if (events.length < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        int[][] dp = new int[events.length][2];
        for (int[] e : events) {
            dp[e[0]][0] = Math.max(dp[e[0]][0], exc(dp, e) + e[2]);
            dp[e[0]][1] = Math.max(dp[e[0]][1], inc(dp, e) + e[2]);
        }
        return Arrays.stream(dp).mapToInt(a -> Math.max(a[0], a[1])).max().orElse(0);
    }
    
    private static int exc(int[][] dp, int[] e) {
        int res = 0;
        for (int i = 0; i < e[0]; i++) {
            if (e[1] >= i) {
                continue;
            }
            res = Math.max(dp[i][0], res);
        }
        return res;
    }

    private static int inc(int[][] dp, int[] e) {
        int res = 0;
        for (int i = 0; i < e[0]; i++) {
            if (e[1] < i) {
                continue;
            }
            res = Math.max(dp[i][1], res);
        }
        return res;
    }
}