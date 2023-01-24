package com.codex;

import java.util.*;

public class Solution {
import java.io.*;

    public static int minimumMoves(String s) {

        int moves = 0;

        if (s.length() < 3) {
            return 0;
        }
        int consecutiveX = 0;
        for (int i = 0; i < s.length(); i++) {
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