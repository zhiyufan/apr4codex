package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, pqPrev;
        for (long i = 1; i < dp.length; i++) {
            pqLen = pq.size();
            pqHead = pq.peek();
            Long minDist = Long.MAX_VALUE;
            for (int j = 0; j < pqLen; j++) {
                pqPrev = pq.remove();
                if (milestones[(int) i] + dp[pqPrev] < minDist) {
                    minDist = dp[pqPrev] + milestones[(int) i];
                    dp[(int) i] = minDist;
                }
                if (pqPrev == pqHead) continue;
                pq.add(pqPrev);
            }
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pq.add((int) i);
        }
        return dp[dp.length - 1];
    }
}