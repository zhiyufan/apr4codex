package com.codex;

import java.util.*;

public class Solution {

    public static long numberOfWeeks(int[] milestones) {

        long[] dp = new long[milestones.length];

        dp[0] = milestones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(0);

        for (long i = 1; i < dp.length; i++) {

            //System.out.println(Arrays.toString(dp));
            //System.out.println(pq);
            pq.removeIf(prev -> dp[(int) i] - milestones[prev] >= dp[prev]);
            pq.add((int) i);
            dp[(int) i] = dp[pq.peek()] + milestones[(int) i];

        }
        return dp[dp.length - 1];
    }
}


    
    
}