package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
        if (target == 0) return 0;
        if (maxDoubles == 0) return target;
        if (memo.containsKey(target)) return memo.get(target);
        int minMoves = Integer.MAX_VALUE;
         if (t <= 0) return 0;
        for (int i = 1; i <= maxDoubles; i++) {
            int cur = Math.min(1 + numOps(t - i ,maxDoubles), 1 + numOps(t / 2, maxDoubles));
            minOps = Math.min(minOps, cur);
        }
        return minOps; 
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}