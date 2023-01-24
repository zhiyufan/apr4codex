package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxMoves) {
        

        int moves = 0;
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxMoves > 0) {
                maxMoves--;
                target /= 2;
            } else {
                target--;
            }
        }
        return moves;
    }

    
}