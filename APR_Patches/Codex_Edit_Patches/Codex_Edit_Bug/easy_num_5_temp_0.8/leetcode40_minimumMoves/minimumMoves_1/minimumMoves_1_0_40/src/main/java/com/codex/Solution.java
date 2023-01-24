package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 2;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minimumMoves(""));
        System.out.println(minimumMoves("XX"));
        System.out.println(minimumMoves("XX_"));
        System.out.println(minimumMoves("XXXXXXX"));
        System.out.println(minimumMoves("XXX_XXX"));
    }
}


    
}