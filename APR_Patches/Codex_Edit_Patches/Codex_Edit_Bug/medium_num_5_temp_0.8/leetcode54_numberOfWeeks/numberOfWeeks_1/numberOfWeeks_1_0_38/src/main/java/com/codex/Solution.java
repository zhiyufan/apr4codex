package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        dp[0] = 0;
        pq.add(0);
        int pqHead;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[pq.peek()] + milestones[i - 1];
            pqHead = pq.remove();
            if (pqHead == 0) {
                pq.add(i);
                continue;
            }
            if (dp[i] < dp[pqHead]) {
                pq.add(pqHead);
                pq.add(i);
            } else {
                pq.add(pqHead);
                dp[i] = dp[pqHead] + milestones[i - 1];
                for (int prev : pq) {
                    if (prev != pqHead && dp[i] + dp[prev] < dp[pqHead] + dp[i - 1]) {
                        dp[i] = dp[prev] + dp[i] - dp[pqHead];
                        break;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }


    
    
}