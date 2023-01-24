package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
    long[] dp = new long[milestones.length];
    int pqHead;
    int pqLen;
    dp[0] = milestones[0];
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(0);
    for (int i = 1; i < dp.length; i++) {
        pqHead = pq.peek();
        if (milestones[i] < dp[pqHead]) {
            dp[i] = dp[pqHead] + milestones[i];
        } else {
            dp[i] = milestones[i];
        }
        pqLen = pq.size();
        for (int j = 0; j < pqLen; j++) {
            pqHead = pq.remove();
            if (dp[pqHead] + milestones[i] < dp[i]) {
                dp[i] = dp[pqHead] + milestones[i];
                pq.add(pqHead);
                break;
            }
        }
    }
    return dp[dp.length - 1];
}

}