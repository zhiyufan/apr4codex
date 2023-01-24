package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int scoreA = 0;
        int scoreB = 0;

        for (char c : colors.toCharArray()) {
            if (c == 'A') {
                scoreA++;
            } else {
                scoreB++;
            }
        }
        if(A>B) {
            return true;
        }
        return false;
    }
    
}