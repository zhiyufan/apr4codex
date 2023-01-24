package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        for (int[] cur : events) {
            pq.offer(cur);
            while (!pq.isEmpty() && pq.peek()[1] < cur[0]) {
                pq.poll();
            }
            dp[cur[0]] = Math.max(dp[cur[0]], pq.stream().mapToInt(a -> a[2]).sum() + cur[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}