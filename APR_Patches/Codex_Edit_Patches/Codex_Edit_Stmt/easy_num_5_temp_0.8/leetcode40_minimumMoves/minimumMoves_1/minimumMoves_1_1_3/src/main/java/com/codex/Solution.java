package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        if (s.length() < 3) return 0;
        if (s.length() == 3) return s.charAt(0) == 'X' && s.charAt(1) == 'X' && s.charAt(2) == 'X' ? 1 : 0;
        
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
}