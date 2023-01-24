package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
    long[] dp = new long[milestones.length];
    dp[0] = milestones[0];
    if (milestones.length == 1) return milestones[0];
    int pqLen, pqHead, prev;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> milestones[b] - milestones[a]);
    pq.add(0);

    for (int i = 1; i < dp.length; i++) {
        pqHead = pq.peek();
        long tmp = milestones[i];
        while (!pq.isEmpty() && milestones[pqHead] >= dp[i - 1]) {
            tmp += milestones[pq.remove()];
        }
        dp[i] = tmp;
        pq.add(i);
    }
    return dp[dp.length - 1];
}


    
    
}