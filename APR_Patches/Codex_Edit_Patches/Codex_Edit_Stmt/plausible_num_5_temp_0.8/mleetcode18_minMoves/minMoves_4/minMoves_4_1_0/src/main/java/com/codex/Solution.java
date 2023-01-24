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


    static int minMove = Integer.MAX_VALUE;
    static Set<Long> visited = new HashSet<>();
    static long target;
    static int maxDouble;
    static int numMoves = 0;
    public static int minMoves(int target, int maxDoubles) {
        visited.add(1L);
        if (target == 1) {
            return 0;
        }
        MinMoves.target = target;
        MinMoves.maxDouble = maxDoubles;
        dfs(1);
        return minMove == Integer.MAX_VALUE ? -1 : minMove;
    }

    static void dfs(long cur) {
        // base case
        if (cur == target) {
            minMove = numMoves;
            return;
        }
        // pruning
        if (numMoves >= minMove) {
            return;
        }
        if (cur > target) {
            return;
        }
        // recursion
        visited.add(cur + 1);
        numMoves++;
        dfs(cur + 1);
        numMoves--;
        if (maxDouble > 0 && !visited.contains(cur * 2)) {
            visited.add(cur * 2);
            maxDouble--;
            numMoves++;
            dfs(cur * 2);
            numMoves--;
            maxDouble++;
        }
    }
}