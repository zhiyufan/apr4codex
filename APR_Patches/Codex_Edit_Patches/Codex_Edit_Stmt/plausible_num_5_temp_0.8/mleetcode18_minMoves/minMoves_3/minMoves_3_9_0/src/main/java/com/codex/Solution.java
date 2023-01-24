package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        int minMoves = Integer.MAX_VALUE;
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo, minMoves);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo, int minMoves) {
        if (target == 0) return 0;
        if (maxDoubles == 0) return target;
        if (memo.containsKey(target)) return memo.get(target);
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo, minMoves), 1 + minMoves(target / 2, maxDoubles - 1, memo, minMoves));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}