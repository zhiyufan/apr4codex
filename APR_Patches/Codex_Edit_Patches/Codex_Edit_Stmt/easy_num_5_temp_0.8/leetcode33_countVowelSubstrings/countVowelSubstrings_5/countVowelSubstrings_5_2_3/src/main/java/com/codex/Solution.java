package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
        int wordLen = word.length();
            if (vowels.contains(word.charAt(i))) {
                count += wordLen - i;
            }
        }

        return count;
    }

    
}