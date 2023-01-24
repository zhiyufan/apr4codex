package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 4) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
            } else {
                consecutiveX = 0;
            }
            if (consecutiveX == 4) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    }

    
}