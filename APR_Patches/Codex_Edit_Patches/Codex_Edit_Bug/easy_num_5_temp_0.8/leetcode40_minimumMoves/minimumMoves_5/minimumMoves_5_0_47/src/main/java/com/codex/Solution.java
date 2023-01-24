package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < slength(); i++) {
            if (s.charAt(i) == 'x') {
                consecutiveX++;
                consecutiveY = 0;
            } else {
                consecutiveX = 0;
                consecutiveY++;
            }
            if (consecutiveX == 3) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    }

    
}