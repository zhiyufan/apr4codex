package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                int vowels = 0;
                if (sub.contains("a")) {
                    vowels++;
                }
                if (sub.contains("e")) {
                    vowels++;
                }
                if (sub.contains("i")) {
                    vowels++;
                }
                if (sub.contains("o")) {
                    vowels++;
                }
                if (sub.contains("u")) {
                    vowels++;
                }
                if (vowels == 5) {
                    count++;
                }
            }
        }
        return count;
    }

    
}