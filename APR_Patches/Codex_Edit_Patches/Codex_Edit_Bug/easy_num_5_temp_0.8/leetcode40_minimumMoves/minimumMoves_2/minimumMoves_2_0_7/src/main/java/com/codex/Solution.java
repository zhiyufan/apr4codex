package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int counts = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                counts++;
                i += 2;
            }
        }
        return counts;
    }

    
}