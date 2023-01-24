package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        /** You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
         * Return this maximum sum.
         * Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time t, the next event must start at or after t + 1.
         */
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

    }