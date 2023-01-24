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
        for (int i = 0; i < n; ++i) {
            int[] e = events[i];
            int t = e[1];
            while (!pq.isEmpty() && pq.peek()[1] <= t) {
                pq.poll();
            }
            int curMax = pq.stream().mapToInt(a -> a[2]).sum() + e[2];
            System.out.println(events[i][0] + " " + curMax);
            dp[i] = Math.max(dp[i - 1], curMax);
            pq.offer(e);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}