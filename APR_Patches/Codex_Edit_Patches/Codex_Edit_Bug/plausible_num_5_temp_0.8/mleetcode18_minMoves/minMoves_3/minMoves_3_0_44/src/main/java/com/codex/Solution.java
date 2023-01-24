package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
        if (target == 0) return 0;
        if(maxDoubles == 0) return target;
        if(memo.containsKey(target)) return memo.get(target);
        int minMoves = Integer.MAX_VALUE, cur;
        for(int i = 1; i <= target; i++) {
            if(maxDoubles > 0) {
                cur = 1 + Math.min(minMoves(target - i, maxDoubles - 1, memo), minMoves(target / 2, maxDoubles - 1, memo));
            } else {
                cur = 1 + minMoves(target - i, maxDoubles - 1, memo);
            }
            minMoves = Math.min(minMoves, cur); 
        }
        memo.put(target, minMoves); // To store the computed values already
        return minMoves;
    }

    
}