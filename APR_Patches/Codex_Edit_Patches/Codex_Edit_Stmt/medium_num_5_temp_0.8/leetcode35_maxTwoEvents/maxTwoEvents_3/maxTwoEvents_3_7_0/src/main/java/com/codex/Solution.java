package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {

        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]); //
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }


// https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/discuss/510263/JavaC%2B%2BPython-Priority-Queue

// public int maxEvents(int[][] events) {
//         int res = 0, cur = 1, len = events.length, pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
//         Arrays.sort(events, (a,b) -> a[0]-b[0]);
//         for (int[] e : events) {
//             pq.offer(e);
//         }
//         while(!pq.isEmpty()) {
//             PriorityQueue<int[]> tem = new PriorityQueue<>((a,b) -> a[1]-b[1]);
//             while(!pq.isEmpty() && pq.peek()[0] <= cur) {
//                 tem.offer(pq.poll());
//             }
//             while(!tem.isEmpty()) {
//                 int[] e = tem.poll();
//                 if (e[1] >= cur) {
//                     res++;
//                     cur++;
//                     break;
//                 }
//             }
//             if (tem.isEmpty()) cur = pq.isEmpty() ? cur+1 : pq.peek()[0];
//         }
//         return res;
//     }
}