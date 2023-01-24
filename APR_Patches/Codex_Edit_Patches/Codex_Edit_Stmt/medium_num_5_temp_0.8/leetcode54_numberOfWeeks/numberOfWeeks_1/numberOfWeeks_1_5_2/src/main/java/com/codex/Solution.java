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
            pqLen = pq.size();
            if (pqLen == 0) {
                dp[(int) i] = milestones[(int) i];
                pq.add((int) i);
            } else {
                pqHead = pq.peek();
                if (milestones[(int) i] < dp[pqHead]) {
                    dp[(int) i] = milestones[(int) i];
                    pq.add((int) i);
                } else {
                    pq.poll();
                    while (pq.size() > 0) {
                        pqHead = pq.peek();
                        if (milestones[(int) i] + dp[pqHead] < dp[pqHead]) {
                            dp[(int) i] = dp[pqHead] + milestones[(int) i];
                            pq.add((int) i);
                            break;
                        } else {
                            pq.poll();
                        }
                    }
                    if (pq.size() == 0) {
                        dp[(int) i] = milestones[(int) i];
                        pq.add((int) i);
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }


    
    
}