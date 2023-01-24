package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                HashSet<Character> subVowels = new HashSet<>();
                for (int k = i; k < j; k++) {
                    if (vowels.contains(word.charAt(k))) {
                        subVowels.add(word.charAt(k));
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