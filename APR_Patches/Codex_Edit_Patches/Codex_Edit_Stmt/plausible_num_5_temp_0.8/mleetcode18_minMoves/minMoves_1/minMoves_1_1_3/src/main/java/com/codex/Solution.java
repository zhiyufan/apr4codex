package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        
        int moves = 0;
        while (target > 0) {
            if (target % 2 == 0 && maxDoubles > 0) {
                moves++;
                target /= 2; maxDoubles--;
            } else {
                moves++; target -= 1;
            }
            //moves++;
        }
        return moves;
    }

    
}