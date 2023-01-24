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
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

        int n = events.length;
        int[][] ecopy = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            ecopy[i][0] = events[i][0];
            ecopy[i][1] = events[i][1];
            ecopy[i][2] = events[i][2];
        }

        ecopy[n][0] = 1000000000;
        ecopy[n][1] = 1000000001;
        ecopy[n][2] = 0;
        Arrays.sort(ecopy, Comparator.comparingInt(a -> a[1]));
        int[] dp = new int[n + 1];
        int[] cur = new int[n + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        for (int i = 0; i < n; i++) {
            int[] e = ecopy[i];
            pq.offer(e);
            cur[e[0]] = pq.stream().mapToInt(a -> a[2]).sum();
            dp[e[0]] = Math.max(cur[e[0]], dp[e[1]]);
            while (!pq.isEmpty() && pq.peek()[1] <= e[0]) {
                pq.poll();
            }
        }
        return dp[0];
    }
    
}