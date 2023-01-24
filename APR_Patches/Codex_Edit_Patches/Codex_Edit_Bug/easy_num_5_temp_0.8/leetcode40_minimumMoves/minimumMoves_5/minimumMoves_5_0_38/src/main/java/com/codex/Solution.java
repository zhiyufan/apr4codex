package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {

        int moves = 0;
        int consecutiveX = 1;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                consecutiveX += 1;
                if (consecutiveX == 3) {
                    moves++;
                    consecutiveX -= 2;
                    i++;
                }
            } else {
                consecutiveX = 0;
            }
        }

        return moves;
    }
}