package com.codex;

import java.util.*;

public class Solution {
 private static int minimumMoves(String s) {

        if (s.length() <= 2) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
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