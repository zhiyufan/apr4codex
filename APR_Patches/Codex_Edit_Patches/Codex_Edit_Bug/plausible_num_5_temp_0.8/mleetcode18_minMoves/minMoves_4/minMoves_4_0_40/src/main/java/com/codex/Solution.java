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

        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(new int[]{1, 0});
        int minMoves = 0;
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                int[] cur = q.poll();
                if (cur[0] == target) {
                    return cur[1];
                }
                if (!visited.contains(cur[0] + 1) && (cur[0] + 1) <= target) {
                    visited.add(cur[0] + 1);
                    q.offer(new int[]{cur[0] + 1, cur[1] + 1});
                }
                if (cur[1] < maxDoubles && !visited.contains(cur[0] * 2) && (cur[0] * 2) <= target) {
                    visited.add(cur[0] * 2);
                    q.offer(new int[]{cur[0] * 2, cur[1] + 1});
                }
            }
        }
        return -1;
    }
}