package com.codex;

import java.util.*;

public class Solution {
    public static int maxEvents(int[][] events) {
        
        if (events.length < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        int[] dp = new int[100001];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[2] < e[0]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[1]).sum() + e[1]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}