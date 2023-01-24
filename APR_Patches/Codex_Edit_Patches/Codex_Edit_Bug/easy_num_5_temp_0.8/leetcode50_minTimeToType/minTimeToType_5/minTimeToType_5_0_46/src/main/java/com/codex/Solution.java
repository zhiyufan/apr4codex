package com.codex;

import java.util.*;

public class Solution {

    public static int minTimeToType(String[] word, int shift_a, int shift_b) {

        int res = 0;
        for (int i = 1; i < word.length; i++) {
            int move = Math.abs(word[i-1] - word[i]);
            res += Math.min(move, 26 - move);
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}