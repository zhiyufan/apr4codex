package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        int moves = 0;
        while (target > 0) {            
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
            moves++;
                target--;
            }
        }
        return moves;
    }

    
}