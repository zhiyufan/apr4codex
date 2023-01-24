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
               
            }
            numMoves++;
        }
        return -1;
    }
}