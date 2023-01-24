package com.codex;

import java.util.*;

public class Solution {
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
    //Geeks for Geeks soln
    public static int minMovesX(String str) {
        int c = 0;
        for(int i = 2;i < str.length();i++) {
            if(str.charAt(i) == 'x' && str.charAt(i-1) == 'x') {
                if(i+1 < str.length() && str.charAt(i+1) == 'x') {
                    c++;
                    i = i+2;
                }
                else if(i+2 < str.length() && str.charAt(i+2) == 'x') {
                    c++;
                    i = i+3;
                }
            }
        }
        return c;
    }

    
}