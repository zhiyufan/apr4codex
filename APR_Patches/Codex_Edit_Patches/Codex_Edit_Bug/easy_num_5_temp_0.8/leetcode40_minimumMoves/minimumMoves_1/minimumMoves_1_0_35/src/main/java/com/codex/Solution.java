package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                
                i++;
                if (i == s.length()) return count;
                if (s.charAt(i) == 'X') {
                    i++;
                    if (i == s.length()) return count;
                        if (s.charAt(i) == 'X') 
                count++;
                i += 2;
            }
        }
        return count;
    }

    
}