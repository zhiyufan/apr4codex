package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        if (milestones == null || milestones.length == 0) return 0;
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0] == 0 ? 0 : milestones[0] - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i] - 1;
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i] - 1;
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }


    
    
}