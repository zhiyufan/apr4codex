package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        long[] dp = new long[milestones.length];
        long[] sum = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        sum[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev, pqHead2;
        for (long i = 1; i < dp.length; i++) {
            pqHead2 = pq.peek();
            pqHead = pq.poll();
            if (milestones[(int) i] + sum[pqHead] < dp[pqHead2]) {
                pq.add(pqHead);
                dp[(int) i] = dp[pqHead2] + milestones[(int) i];
                sum[(int) i] = sum[pqHead2] + milestones[(int) i];
            } else {
                dp[(int) i] = sum[pqHead] + milestones[(int) i];
                sum[(int) i] = sum[pqHead] + milestones[(int) i];
            }
            pq.add((int)i);
        }
        return dp[dp.length - 1];
    }


    
    
}