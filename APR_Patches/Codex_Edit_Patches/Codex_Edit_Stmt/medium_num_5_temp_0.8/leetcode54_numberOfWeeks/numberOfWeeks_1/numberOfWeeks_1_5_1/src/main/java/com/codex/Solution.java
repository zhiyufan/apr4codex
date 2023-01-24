package com.codex;

import java.util.*;

public class Solution {
    public static long numberOfWeeks(int[] milestones) {

        int[] dp = new int[milestones.length];
        int pqLen, pqHead, prev;
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        for (int i = 1; i < dp.length; i++) {
            while (true) {
                pqHead = pq.peek();
                if (milestones[i] < dp[pqHead]) {
                    dp[i] = dp[pqHead] + milestones[i];
                } else {
                    dp[i] = milestones[i];
                }
                pqCount = pq.size();
                for (int j = 1; j < pqCount; j++) {
                    prev = pq.remove();
                    if (prev == pqHead) continue;
                    if (milestones[i] + dp[prev] < dp[pqHead]) {
                        pq.add(prev);
                        dp[i] = dp[prev] + milestones[i];
                        pq.add((int) i);
                        break;
                    }
                }
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