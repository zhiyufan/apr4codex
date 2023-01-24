package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int vowels = 0;

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowels++;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}