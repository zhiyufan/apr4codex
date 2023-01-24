package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Map<Integer, Integer>> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Map<Integer, Integer>> memo) {
        if (target == 0) return 0;
        if (maxDoubles == 0) return target;
        if (memo.containsKey(target) && memo.get(target).containsKey(maxDoubles)) {
            return memo.get(target).get(maxDoubles);
        }
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.get(target).put(maxDoubles, minMoves);
        return minMoves;
    }

    
}