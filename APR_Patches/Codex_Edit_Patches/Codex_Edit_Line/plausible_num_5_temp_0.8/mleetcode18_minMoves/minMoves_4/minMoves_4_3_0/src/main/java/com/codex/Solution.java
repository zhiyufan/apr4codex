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
        // Write your code here
        int[] dp = new int[target + 1];
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            int x = (int)(Math.log(i) / Math.log(2));
            int small = Integer.MAX_VALUE;
            if (i - (1 << x) >= 0) {
                small = dp[i - (1 << x)];
            }
            int y = (int)(Math.log(i) / Math.log(3));
            if (i - (1 << y) >= 0) {
                small = Math.min(small, dp[i - (1 << y)]);
            }
            dp[i] = 1 + small;
        }
        return dp[target];
    }
}
}