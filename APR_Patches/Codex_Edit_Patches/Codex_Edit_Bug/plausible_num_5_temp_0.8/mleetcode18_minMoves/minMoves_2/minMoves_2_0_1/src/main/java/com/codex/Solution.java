package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        if(target == 0 && maxDoubles == 0) return 0;
        if(target == 0 && maxDoubles > 0) return 1;
        if(target > 0 && maxDoubles == 0) return target;
        if(target > 0 && maxDoubles > 0) return Math.min(1 + minMoves(target - 1, maxDoubles), 1 + minMoves(target / 2, maxDoubles - 1));
        return -1;
    }

    public static int minMoves(int target, int maxDoubles) {

        int moves = 0;
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }

    
}