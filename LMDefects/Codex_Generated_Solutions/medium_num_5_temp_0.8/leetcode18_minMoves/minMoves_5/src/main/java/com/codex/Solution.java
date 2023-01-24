package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        /** You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
         * In one move, you can either:
         * Increment the current integer by one (i.e., x = x + 1).
         * Double the current integer (i.e., x = 2 * x).
         * You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
         * Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
         */

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
    }}