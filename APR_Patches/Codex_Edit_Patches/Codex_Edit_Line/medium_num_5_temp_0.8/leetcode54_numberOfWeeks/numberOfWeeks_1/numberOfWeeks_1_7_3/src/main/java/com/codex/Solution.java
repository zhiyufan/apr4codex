package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            
            while(true) {
                int next = pq.poll();
                if (next == pqHead) continue;
                if (milestones[(int) i] + dp[next] < dp[pqHead]) {
                    pq.add(next);
                    dp[(int) i] = dp[next] + milestones[(int) i];
                    pq.add((int) i);
                    pqHead = next;
                } else {
                    pq.add(next);
                    break;
                }
            }
            pq.add((int) i);
        }
        return dp[dp.length - 1];
    }


    
    
}