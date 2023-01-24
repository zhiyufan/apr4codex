package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a = true;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }




    private static int countRecur(String word, int i, int j, boolean [] vowels) {
        if (i > j) {
            return 0;
        }
        int count = 0;
        if (containsVowels(word.substring(i, j + 1), vowels)) {
            count++;
        }
        count += countRecur(word, i + 1, j + 1, vowels);
        return count;
    }

    private static boolean containsVowels(String word, boolean [] vowels) {
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                vowels[0] = true;
            }
            if (c == 'e') {
                vowels[1] = true;
            }
            if (c == 'i') {
                vowels[2] = true;
            }
            if (c == 'o') {
                vowels[3] = true;
            }
            if (c == 'u') {
                vowels[4] = true;
            }
        }
        return vowels[0] && vowels[1] && vowels[2] && vowels[3] && vowels[4];
    }
    
}