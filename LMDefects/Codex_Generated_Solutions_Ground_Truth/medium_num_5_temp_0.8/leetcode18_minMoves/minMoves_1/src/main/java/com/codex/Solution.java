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
        int moves = 0;
        while (target > 0 && maxDoubles > 0) {
            if (target % 2 == 0 && maxDoubles > 0) {
                target /= 2;
                maxDoubles--;
            } else {
                target -= 1;
            }
            moves++;
        }
        if (target !=1) moves += target-1;
        return moves;
    }

    }