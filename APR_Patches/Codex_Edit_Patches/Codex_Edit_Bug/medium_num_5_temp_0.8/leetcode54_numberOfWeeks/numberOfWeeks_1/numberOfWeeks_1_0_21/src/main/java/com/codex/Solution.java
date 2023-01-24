package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfWeeks(int[] milestones) {
        
        long[] dp = new long[milestones.length + 1];
        int pqLen;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        int pqHead, prev;
        for (int i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[i] < dp[pqHead]) {
                dp[i] = dp[pqHead] + milestones[i];
            } else {
                dp[i] = milestones[i];
            }
            pqLen = pq.size();
            for (int j = 0; j < pqLen; j++) {
                prev = pq.remove();
                if (prev == pqHead) continue;
                if (milestones[i] + dp[prev] < dp[pqHead]) {
                    pq.add(prev);
                    dp[i] = dp[prev] + milestones[i];
                    pq.add(i);
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
    }

}