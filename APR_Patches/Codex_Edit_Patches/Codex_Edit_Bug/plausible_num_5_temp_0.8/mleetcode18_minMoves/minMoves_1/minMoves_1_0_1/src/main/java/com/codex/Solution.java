package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {        
        int moves = 0, currMoves;
        while (target > 2) {
            if (maxDoubles-1 > 0) {
                currMoves = minMoves(target/2, maxDoubles-1)+1;
            } else {
                target -= 1;
            }
            moves++;
        }
        return moves;
    }

    
}