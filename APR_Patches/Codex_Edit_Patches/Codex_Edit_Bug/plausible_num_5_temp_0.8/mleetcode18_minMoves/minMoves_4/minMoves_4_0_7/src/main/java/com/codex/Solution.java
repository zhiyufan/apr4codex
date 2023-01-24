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




    public static List<String> subSets(String set) {
        List<String> res = new ArrayList<>();
        if (set == null) {
            return res;
        }
        if (set.length() == 0) {
            res.add("");
            return res;
        }
        char c = set.charAt(0);
        List<String> subSets = subSets(set.substring(1));
        for (String str : subSets) {
            res.add(str);
            res.add(c + str);
        }
        return res;
    }
}