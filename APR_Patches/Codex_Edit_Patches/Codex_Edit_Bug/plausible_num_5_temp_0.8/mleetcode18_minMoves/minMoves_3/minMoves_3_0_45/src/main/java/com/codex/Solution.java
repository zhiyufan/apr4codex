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
        for (int i = 1; i <= target; i++) {
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo) + 1);
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
    }

    //int minMoves(int target, int maxDoubles) {
//
//        Map<Integer, Integer> memo = new HashMap<>();
//        return minMoves(target, maxDoubles, memo);
//    }
//
//    private static int minMoves(int target, int maxDoubles, Map<Integer, Integer> memo) {
//        if (memo.containsKey(target)) return memo.get(target);
//        if (target == 0) return 0;
//        if (target == 1 || target == 2)  return 1;
//        if (maxDoubles == 0) {
//            int min = Integer.MAX_VALUE;
//            for (int i = 1; i < target; i++) {
//                min = Math.min(minMoves(i, maxDoubles - 1, memo) + 1, min);
//            }
//            return min;
//        }
//        int min = Integer.MAX_VALUE;
//        for (int i = 1; i < target; i++) {
//            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo) + 1);
//            min = Math.min(min, cur);
//        }
//        memo.put(target, min);
//        return min;
//    }
}