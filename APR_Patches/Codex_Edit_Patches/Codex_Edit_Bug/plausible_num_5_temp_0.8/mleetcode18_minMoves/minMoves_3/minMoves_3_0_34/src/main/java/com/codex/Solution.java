package com.codex;

import java.util.*;

public class Solution {
public static int minMoves(int target, int maxDoubles) {
        
        if (target == 0) return 0;
        if (maxDoubles == 0) return target;
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i <= maxDoubles; i++) {
            int cur = Math.min(i + minMoves(target - i, maxDoubles - i), 1 + minMoves(target / 2, maxDoubles - i));
            minMoves = Math.min(minMoves, cur);
        }
        return minMoves;
}

    
}