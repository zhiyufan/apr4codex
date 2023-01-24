package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
        if (target <= 0) return 0;
        if (memo.containsKey(target)) return memo.get(target);
        int minMoves = Integer.MAX_VALUE;
        if (maxDoubles != 0) {
            for (int i = 1; i <= target; i++) {
                int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
                minMoves = Math.min(minMoves, cur);
        minMoves = Math.min(minMoves, 1 + minMoves(target - 1, maxDoubles, memo));
            }
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}