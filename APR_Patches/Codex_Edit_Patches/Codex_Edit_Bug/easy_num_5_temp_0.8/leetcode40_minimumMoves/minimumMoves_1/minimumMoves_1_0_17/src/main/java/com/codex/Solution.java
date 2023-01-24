package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String str) {
        
        if (str.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) == 'X' && str.charAt(i - 1) == 'X' && str.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    
}