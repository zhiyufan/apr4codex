package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
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

    public static int countVowelSubstrings(String word) {
    
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String substring = word.substring(i, j + 1);
                int vowelsCount = 0;
                for (Character c : substring.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCount++;
                    }
                }
                if (vowelsCount == vowels.size()) {
                    result++;
                }
            }
        }
        return result;
    }
    
}