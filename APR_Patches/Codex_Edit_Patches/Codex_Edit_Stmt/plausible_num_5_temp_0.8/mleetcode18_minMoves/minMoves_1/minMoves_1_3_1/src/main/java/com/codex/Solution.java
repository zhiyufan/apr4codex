package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        int moves = 0;
        
        for (int i = 0; i < maxDoubles && target % 2 == 0; i++) {
            target /= 2;
        }
        
        for (int i = 0; i < target; i++) {
            moves++; // target -= 1;
        }
        return moves;
    }

    
}