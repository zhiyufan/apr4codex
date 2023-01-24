package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        int countX = 0;
        for (int i = 0; i < s.length(); i++) {
            countX = 0;
            if (s.charAt(i) == 'X') {
                countX++;
                while (countX % 3 != 0 && i < s.length()) {
                    i++;
                    if (s.charAt(i) == 'X') {
                        countX++;
                    } else {
                        countX = 0;
                        break;
                    }
                }
                moves++;
            }
        }
        return moves;
    }

    
}