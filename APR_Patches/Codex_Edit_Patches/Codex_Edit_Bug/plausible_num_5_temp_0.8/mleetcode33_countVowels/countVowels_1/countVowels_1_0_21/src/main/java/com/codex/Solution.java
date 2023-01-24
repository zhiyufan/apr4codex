package com.codex;

import java.util.*;

public class Solution {
    public static long countVowels(String word) {
        

        long count = 0;
        int len = word.length();

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
                for (int j = i + 1; j < len; j++) {  
                    if (word.charAt(j) == c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}