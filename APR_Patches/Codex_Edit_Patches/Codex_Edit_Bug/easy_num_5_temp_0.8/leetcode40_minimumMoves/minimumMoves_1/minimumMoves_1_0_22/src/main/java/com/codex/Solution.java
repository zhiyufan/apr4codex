package com.codex;

import java.util.*;

public class Solution {
Lagun  public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

        int count = 0;
        // Iterate over each possible starting index
        for (int i = 0; i < s.length() - 1; i++) {
            // Check if 3 in a row
            if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'X') {
                // If xxx present then increase count and iterate over
                count++;
                i += 2;
            }
        }
        return count;
    }
}