package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';

// public int minTimeToTypeword(String word) {
    //     int res = 0;
    //     int from = 0;
    //     int to = 0;
    //     for(int i = 1; i < word.length(); i++) {
    //         from = word.charAt(i - 1) - 'a';
    //         to = word.charAt(i) - 'a';
    //         res += Math.min(Math.abs(from - to), 26 - Math.abs(from - to));
    //     }
    //     return res;
    // }
        return Math.abs(num1 - num2);
    }

    

    
}