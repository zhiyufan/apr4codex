package com.codex;

import java.util.*;

public class Solution {
//General Case

    public static int minimumMoves(String s) {
        
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

    
    //Specific Case
    
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        int i = 2;
        while(i < s.length()) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
            i++;
        }
        return count;
    }
    
}