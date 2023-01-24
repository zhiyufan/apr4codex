package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        long[] dp = new long[milestones.length];
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, curr;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            for (curr = pq.remove(); !pq.isEmpty(); curr = pq.remove()) {
                if (curr != pqHead)
                    pq.add(curr);
                else
                    continue;

                if (milestones[(int) i] + dp[curr] < dp[pqHead]) {
                    dp[(int) i] = dp[curr] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }


    
    
}