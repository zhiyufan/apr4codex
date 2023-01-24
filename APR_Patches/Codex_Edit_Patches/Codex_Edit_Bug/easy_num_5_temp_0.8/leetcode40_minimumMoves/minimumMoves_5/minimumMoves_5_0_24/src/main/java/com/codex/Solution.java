package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        //if string length is < 3, no moves will be made and thus return 0
        if (s.length() < 3) { 
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0; //to check for consecutive Xs
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') { //if character at index i is X, add 1 to the consecutiveX
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