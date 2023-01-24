package com.codex;

import java.util.*;

public class Solution {
public static long numberOfWeeks(int[] milestones) {

    long[] dp = new long[milestones.length];
    int pqLen;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int pqHead, prev;
    for (int i = 0; i < dp.length; i++) {
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
    }


    
    
}