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
        pq.offer(e);
        while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
            pq.poll();
        }
        dp[i] = Math.max(i > 0 ? dp[i - 1] : 0, pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
}
    }

    
}