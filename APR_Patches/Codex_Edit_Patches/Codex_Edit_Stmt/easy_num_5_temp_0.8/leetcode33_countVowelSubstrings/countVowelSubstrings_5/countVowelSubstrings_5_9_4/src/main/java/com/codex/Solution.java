package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {

        // Fix 
        
        List<Character> vowels = new ArrayList<>();

        // Fix 
        
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}