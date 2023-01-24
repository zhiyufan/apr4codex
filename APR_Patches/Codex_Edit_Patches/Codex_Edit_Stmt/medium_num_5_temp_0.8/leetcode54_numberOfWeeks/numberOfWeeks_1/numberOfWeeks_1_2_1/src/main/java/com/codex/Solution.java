package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();//pq.Head
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            for (int j = 0; j < pq.size(); j++) {
                prev = pq.remove();// pq.Head
                if (prev == pqHead) continue;
                if (milestones[(int) i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + milestones[(int) i];
                    pq.add((int) i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }


    
    
}