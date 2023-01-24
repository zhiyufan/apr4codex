package com.codex;

import java.util.*;

public class Solution {
import java.util.HashMap;
import java.util.Map;

public class Test {


    public static int minMoves2(int target, int maxDoubles) {
        return minMoves2(target, maxDoubles, new HashMap<>());
    }

    private static int minMoves2(int target, int maxDoubles, Map<Integer, Integer> memo) {
        if (target == 0) return 0;
        if (maxDoubles == 0) return target;
        if (memo.containsKey(target)) return memo.get(target);
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    
}