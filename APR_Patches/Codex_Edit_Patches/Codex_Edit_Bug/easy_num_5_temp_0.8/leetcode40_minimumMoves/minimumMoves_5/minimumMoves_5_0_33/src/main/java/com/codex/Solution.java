package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                if (i == s.length() - 1 || s.charAt(i+1) == 'X') {
                    consecutiveX++;
                }
            } else {
                consecutiveX = 0;
            }
            if (consecutiveX == 3) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    }

    
}