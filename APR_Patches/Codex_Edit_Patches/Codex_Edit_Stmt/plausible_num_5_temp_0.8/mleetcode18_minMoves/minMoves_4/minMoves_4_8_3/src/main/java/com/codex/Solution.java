package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int numMoves = 0;
        q.offer(1);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                int cur = q.poll();
                if (visited.contains(cur)) {
                    continue;
                }
                visited.add(cur);
                if (cur == target) {
                    return numMoves;
                }
                if (cur + 1 <= target) {
                    q.offer(cur + 1);
                }
                if (numMoves < maxDoubles && cur * 2 <= target) {
                    q.offer(cur * 2);
                }
            }
            numMoves++;
        }
        return -1;
    }


        
}