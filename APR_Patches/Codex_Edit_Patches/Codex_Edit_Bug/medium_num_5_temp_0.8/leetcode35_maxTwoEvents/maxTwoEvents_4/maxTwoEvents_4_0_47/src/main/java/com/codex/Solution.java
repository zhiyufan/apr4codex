package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        dp[0] = events[0][2];
        pq.offer(events[0]);
        for (int i = 1; i < n; i++) {
            while (!pq.isEmpty() && pq.peek()[1] < events[i][0]) {
                pq.poll();
            }
            int max = pq.stream().mapToInt(e -> e[2]).sum() + events[i][2];
            dp[i] = Math.max(dp[i - 1], max);
            pq.offer(events[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}