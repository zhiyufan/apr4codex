package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        Map<Integer, Integer> memo = new HashMap<>();
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i <= target; i++) {
            int cur = minMoves(target - i, maxDoubles - 1, memo);
            if (maxDoubles > 0) cur = Math.min(cur, minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;

    }

    
}