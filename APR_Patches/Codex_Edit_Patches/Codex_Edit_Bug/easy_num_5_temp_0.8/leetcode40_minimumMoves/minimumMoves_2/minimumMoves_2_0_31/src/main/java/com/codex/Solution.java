package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        
        int count = 0;
        int i = 0;
        while(i < s.length()) {
            Character c = s.charAt(i);
            if (c == 'X') {
                int j = i;
                while (j < (s.length() - 2) && s.charAt(j) == s.charAt(j + 1) && s.charAt(j + 1) == s.charAt(j + 2) && s.charAt(j) == 'X') {
                    count++;
                    j += 2;
                }
            }
            i++;
        }
        return count;
    }

    
}