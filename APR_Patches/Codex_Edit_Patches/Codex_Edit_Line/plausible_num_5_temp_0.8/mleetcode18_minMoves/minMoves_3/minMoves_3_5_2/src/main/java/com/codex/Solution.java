package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
        if (target == 0) return 0; // base case
        if (maxDoubles == 0) return target; // base case
        if (memo.containsKey(target)) return memo.get(target); // memoization, hashmap saves time
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}