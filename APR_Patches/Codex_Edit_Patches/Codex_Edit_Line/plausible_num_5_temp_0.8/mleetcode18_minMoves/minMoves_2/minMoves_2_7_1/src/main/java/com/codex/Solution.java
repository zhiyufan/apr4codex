package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        int moves = 0;
                moves++;
        while (target > 0) {
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                moves++;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }

    
}