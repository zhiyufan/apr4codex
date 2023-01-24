package com.codex;

import java.util.*;

public class Solution {
   public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev, pqSize;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.poll();
            if (milestones[(int) i] < dp[pqHead] - milestones[pqHead]) {
                dp[(int) i] = dp[pqHead] - milestones[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pqSize = pq.size();
            for (long j = 0; j < pqSize; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead] - milestones[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
                pq.add(prev);
            }
        }
        return dp[dp.length - 1];
    }


    
    
}