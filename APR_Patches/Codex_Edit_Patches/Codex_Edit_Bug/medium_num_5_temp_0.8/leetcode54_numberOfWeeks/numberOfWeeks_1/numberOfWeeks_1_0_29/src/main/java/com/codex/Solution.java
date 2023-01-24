package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {        
        long[] dp = new long[milestones.length];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev, prev_prev, counter = 0;
        for (int i = 1; i < dp.length; i++) {
            pqHead = pq.peek();           
            dp[i] = dp[pqHead] + milestones[i];
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (dp[prev] + milestones[i] < dp[pqHead]) {
                    pq.add(prev);
                    dp[i] = dp[prev] + milestones[i];
                    pqHead = prev;
                }
            }
            pqLen = pq.size();
            if (counter == 0) {
                pq.add(i);
                counter += 1;
            } else {
                dp[(int) i] = milestones[(int) i];
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
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