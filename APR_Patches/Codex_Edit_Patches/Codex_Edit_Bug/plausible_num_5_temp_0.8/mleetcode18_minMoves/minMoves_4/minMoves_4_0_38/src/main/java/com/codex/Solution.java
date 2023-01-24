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
                for (long next : new long[] { cur * 2, cur + 1 }) {
                    if (next == target) {
                        return numMoves + 1;
                    }
                    if (next <= target && next <= (1L << maxDoubles) && !visited.contains(next)) {
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }
            numMoves++;
        }
        return -1;
    }
}