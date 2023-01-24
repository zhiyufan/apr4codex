package com.codex;

import java.util.*;

public class Solution {
   public static int minimumMoves(String s) {
        
        if (s.length() < 3) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 1;
        int first = 0;
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
            } else {
                consecutiveX = 0;
            }
            if (consecutiveX == 3 && first == 0) {
                first = 1;
                moves++;
                consecutiveX = 0;
            } else if (consecutiveX == 3 && first == 1) {
                last = 1;
                consecutiveX = 0;
            }
        }
        return moves;
    }

    
}