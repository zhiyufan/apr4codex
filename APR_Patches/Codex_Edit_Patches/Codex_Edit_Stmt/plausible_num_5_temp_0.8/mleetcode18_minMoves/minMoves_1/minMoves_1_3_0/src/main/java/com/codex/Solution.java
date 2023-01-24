package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int a, int b) {
        
        int moves = 0;
        while (a > 0) {
            if (a % 2 == 0 && b > 0) {
                a /= 2;
                b--;
            } else {
                target -= 1;
            }
            moves++;
        }
        return moves;
    }

    
}