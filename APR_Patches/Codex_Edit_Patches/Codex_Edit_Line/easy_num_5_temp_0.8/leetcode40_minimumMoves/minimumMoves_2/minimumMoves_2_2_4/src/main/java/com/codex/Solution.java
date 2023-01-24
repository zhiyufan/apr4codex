package com.codex;

import java.util.*;

public class Solution {
    public static int minimumMoves(String s) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < in.nextInt() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    
}