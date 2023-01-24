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
        while (!pq.isEmpty() && pq.peek()[1] <= e[0]) {
            pq.poll();
        }
        dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
    }

    Arrays.parallelSort(dp, (a , b) -> a - b);
    return dp.length == 0 ? 0 : dp[dp.length - 1];
}

public static int maxTwoEvents(int[][] events) {
    int n = events.length;
        if (n < 0) return 0;
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int[] e : events) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] <= e[0]) {
                pq.poll();
            }
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        Arrays.parallelSort(dp, (a, b) -> b - a);
        return dp[0];
    }
}