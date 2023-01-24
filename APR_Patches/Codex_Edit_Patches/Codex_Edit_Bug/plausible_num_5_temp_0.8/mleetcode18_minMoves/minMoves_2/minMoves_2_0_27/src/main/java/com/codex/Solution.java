package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        int moves = 0;
        while (target > 0) {
            if (target % 2 == 0 && maxDoubles > 0) {
                moves++;
                maxDoubles--;
                target /= 2;
                moves++;
            } else {
                target--;
            }
        }
        return moves;
    }

    
}