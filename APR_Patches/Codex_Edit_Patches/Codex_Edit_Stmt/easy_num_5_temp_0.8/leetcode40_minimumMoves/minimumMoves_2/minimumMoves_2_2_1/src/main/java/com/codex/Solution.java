package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    public static int minimumMoves(String s) {
        
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {

            if (i < s.length() - 2 && s.charAt(i) == 'X' && s.charAt(i + 1) == 'X' && s.charAt(i + 2) == 'X') {
                count++;
                i += 2;
            }
        }

        return count;
    }
}