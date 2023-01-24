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
            int cur = Math.min(1 + minMoves(target - i, maxDoubles - 1, memo), 1 + minMoves(target / 2, maxDoubles - 1, memo));
            minMoves = Math.min(minMoves, cur);
        }
        memo.put(target, minMoves);
        return minMoves;
## 可视化
可视化  

https://www.sanwebe.com/2013/03/addremove-input-fields-dynamically-with-jquery

https://www.sanwebe.com/2014/08/css-html-forms-designs

http://www.cssflow.com/snippets/slider-input

    }

    
}