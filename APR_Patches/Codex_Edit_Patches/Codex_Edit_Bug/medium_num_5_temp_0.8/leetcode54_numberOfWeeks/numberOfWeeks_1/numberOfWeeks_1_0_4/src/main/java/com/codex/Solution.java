package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length];        
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        long pqHead, prev;
        for (int i = 1; i < dp.length; i++) {
            pqHead = pq.peek() + dp.length;
            if (milestones[i] < dp[(int) pqHead % dp.length]) {
                dp[i] = dp[(int) pqHead % dp.length] + milestones[i];
            } else {
                dp[i] = milestones[i];
            }
            while (!pq.isEmpty()) {
                prev = pq.poll() + dp.length;
                if (prev == pqHead) continue;                
                if (milestones[i] + dp[(int) prev % dp.length] < dp[(int) pqHead % dp.length]) {
                    pq.add((int) prev % dp.length);
                    dp[i] = dp[(int) prev % dp.length] + milestones[i];
                    break;                    
                }                
            }
            pq.add(i);
        }
        return dp[dp.length - 1];
    }


    
    
}