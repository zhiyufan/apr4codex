package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        for (int j = 0; j < s.length() - 2; j++) {
            if (s.charAt(j) == s.charAt(j + 1) && s.charAt(j + 1) == s.charAt(j + 2) && s.charAt(j) == 'X') {
                count++;
                j += 2;
            }
        }
        return count;
    }

    
}