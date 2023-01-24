package com.codex;

import java.util.*;

public class Solution {
    public static long count(int[] stones, int n) {
        long[] dp = new long[stones.length];
        dp[0] = stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dp[a] - dp[b]);
        pq.add(0);
        int pos, prev;
        for(int i = 1; i < stones.length; i++) {
            pos = pq.peek();
            if (stones[i] < dp[pos]) {
                dp[i] = dp[pos] + stones[i];
            } else {   
                dp[i] = stones[i];
            }
            int pqSize = pq.size();
            for(int j = 0; j < pqSize; j++) {
                prev = pq.remove();
                if (prev == pos) continue;
                if (stones[i] + dp[prev] < dp[pos]) {
                    pq.add(prev);
                    dp[(int) i] = dp[prev] + stones[(int) i];
                    break;
                }
            }
            pq.add(i);
        }
        return dp[stones.length - 1];
    }
}