package com.codex;

import java.util.*;

public class Solution {
public int minMoves(int target, int maxDoubles) {
        if (target == 0) return 0; 
        if (maxDoubles == 0) return target;
        int minMoves = Integer.MAX_VALUE; 
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(minMoves(target - i, maxDoubles), 1 + minMoves(target / 2, maxDoubles - 1));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}