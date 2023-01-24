package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        /** You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
         * In one move, you can either:
         * Increment the current integer by one (i.e., x = x + 1).
         * Double the current integer (i.e., x = 2 * x).
         * You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
         * Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
         */
        Map<Integer, Integer> memo = new HashMap<>();
        return minMoves(target, maxDoubles, memo);
    }

    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
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