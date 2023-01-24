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
        return Math.abs(num1 - num2);
    }

    
    
    
    //fix line 17
    

    
}