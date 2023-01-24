package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        Set<Long> visited = new HashSet<>();
        Queue<Long> q = new LinkedList<>();
        int numMoves = 0;
        q.offer(1L);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                long cur = q.poll();
                if (cur == target) {
                    return numMoves;
                }
                if (!visited.contains(cur + 1) && (cur + 1) <= target) {
                    visited.add(cur + 1);
                    q.offer(cur + 1);
                }
                if (numMoves < maxDoubles && !visited.contains(cur * 2) && (cur * 2) <= target) {
                    visited.add(cur * 2);
                    q.offer(cur * 2);
                }
            }
            numMoves++;
        }
        return -1;
    }

    public static int minMoves(int target, int maxDoubles) {
        
        // sanity check
        if (target == 0) {
            return 0;
        }

        // dp[i] = the min moves to reach target i
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        return minMoves(target, maxDoubles, dp);
    }

    private static int minMoves(int target, int maxDoubles, int[] dp) {

        if (dp[target] != -1) {
            return dp[target];
        }

        dp[target] = -1;
        for (int i = 1; i <= maxDoubles && (target - i) >= 0; i++) {
            int moves = minMoves(target - i, maxDoubles, dp);
            if (moves != -1) {
                dp[target] = Math.min(dp[target], 1 + moves);
            }
        }

        if (target % 2 == 0) {
            int moves = minMoves(target / 2, maxDoubles, dp);
            if (moves != -1) {
                dp[target] = Math.min(dp[target], 1 + moves);
            }
        }
        return dp[target];
    }
}