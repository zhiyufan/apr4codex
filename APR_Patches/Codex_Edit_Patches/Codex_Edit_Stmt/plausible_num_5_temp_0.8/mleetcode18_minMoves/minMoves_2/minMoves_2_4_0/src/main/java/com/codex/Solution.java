package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPowerOf2(int val) {
        return Integer.bitCount(val) == 1;
    }

    public static int minMoves(int target, int maxDoubles) {

        int moves = 0;
        while (!isPowerOf2(target)) {
            moves++;
            if (isPowerOf2(target) && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }
}