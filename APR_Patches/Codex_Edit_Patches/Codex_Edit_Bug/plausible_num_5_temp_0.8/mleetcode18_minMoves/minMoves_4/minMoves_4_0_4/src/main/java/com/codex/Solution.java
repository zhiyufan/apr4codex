package com.codex;

import java.util.*;

public class Solution {

        public static int minMoves(int target, int maxDoubles) {
        

            // Write your code here
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            int numMoves = 0;
            q.offer(1);
            while (!q.isEmpty()) {
                int qSize = q.size();
                for (int i = 0; i < qSize; i++) {
                    int cur = q.poll();
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
            }
            numMoves++;
            
        }
}