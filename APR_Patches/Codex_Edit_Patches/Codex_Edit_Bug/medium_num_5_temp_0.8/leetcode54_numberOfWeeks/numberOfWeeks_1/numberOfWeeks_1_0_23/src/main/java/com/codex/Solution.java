package com.codex;

import java.util.*;

public class Solution {
       public static long numberOfWeeks(int[] milestones) {
        long[] dp = new long[milestones.length];
        dp[0] = milestones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingLong(x->dp[x]));
        pq.add((int) 0);
        int pqHead;
        for (long i = 1; i < dp.length; i++) {
            pqHead = pq.peek();
            if (milestones[(int) i] < dp[pqHead]) {
                dp[(int) i] = dp[pqHead] + milestones[(int) i];
            } else {
                dp[(int) i] = milestones[(int) i];
                priorityQueue = new PriorityQueue<>();
                priorityQueue.add((int) i);
            }
            else {
                pq.add((int) i);
            }
        }
        return dp[dp.length - 1];
    }


    
    
}