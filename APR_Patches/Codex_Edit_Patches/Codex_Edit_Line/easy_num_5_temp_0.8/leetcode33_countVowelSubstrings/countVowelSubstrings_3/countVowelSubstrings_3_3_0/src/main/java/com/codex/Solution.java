package com.codex;

import java.util.*;

public class Solution {
<<<<<<< HEAD
    public static int countVowelSubstrings(String word) {
        
=======
    int countVowelSubstrings(String word) {
>>>>>>> 86db9f3b3114f8d19a5c5f2ff5d5c5a8e543f9e4
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (Character vowel : vowels) {
                    if (!word.substring(i, j + 1).contains(vowel.toString())) {
                        hasAllVowels = false;
                    }
                }
                if (hasAllVowels) {
                    result++;
                }
            }
        }
        return result;
    }

    
}