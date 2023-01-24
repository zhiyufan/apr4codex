package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) { // two moves max
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') { // if the three characters are the same and the first is X
                count++;
                i += 2; // move to the end of the movement
            }
        }
        return count;
    }

    
}