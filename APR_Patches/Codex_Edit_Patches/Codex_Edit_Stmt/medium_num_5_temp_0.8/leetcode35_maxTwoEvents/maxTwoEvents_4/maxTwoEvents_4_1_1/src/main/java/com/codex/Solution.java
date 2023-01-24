package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            int[] e = events[i];
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + e[2]);
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }

    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            int[] e = events[i];
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + e[2]);
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        return Math.max(dp[n - 1][0], dp[n - 1][1]);

    }
    
}