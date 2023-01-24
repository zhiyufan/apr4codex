package com.codex;

import java.util.*;

public class Solution {
     public static int minimumMoves(String s) {
        
        int count = 0;
        int n = s.length();
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
            if (i == n - 3) {
                if (s.charAt(n - 1) == s.charAt(n - 2) && s.charAt(n - 1) == 'X') {
                    count++;
                }
            }
        }
        return count;
    }

}