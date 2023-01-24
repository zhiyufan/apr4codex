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
        int last_end_time = Integer.MIN_VALUE;
        for (int[] e : events) {
            if (e[0] != last_end_time) {
                dp[e[0]] = dp[last_end_time];
            }
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            dp[e[1]] = Math.max(dp[e[1]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
            last_end_time = e[1];
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}