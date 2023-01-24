package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (Character vowel : word.substring(i, j + 1).toCharArray() {
                    if (!vowels.contains(vowel)) {
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