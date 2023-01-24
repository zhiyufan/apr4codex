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
        dp[0] = events[0][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);

        for (int i = 1; i < n; i++) {
            int[] event = events[i];
            pq.offer(event);
            while (!pq.isEmpty() && pq.peek()[1] <= event[0]) {
                pq.poll();
            }
            dp[i] = Math.max(dp[i - 1], pq.stream().mapToInt(a -> a[2]).sum() + event[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}