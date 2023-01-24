package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (is_vowel(word.charAt(i))) {
                count += word.length() - i;
            }
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") &&
                        sub.contains("u")) {
                    if (i == 0 && !is_vowel(word.charAt(j))) {
                        count++;
                    } else if (i != 0 && j < word.length() && !is_vowel(word.charAt(i - 1)) && !is_vowel(word.charAt(j))) {
                        count++;
                    } else if (i != 0 && j == word.length() && !is_vowel(word.charAt(i - 1))) {
                        count++;
                    } else if (i == 0 && j == word.length()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    

    
}