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

        for (int i = 0; i < word.length() - 1; i++) {
            if (vowels.contains(word.charAt(i)) || vowels.contains(word.charAt(i + 1))) {
                count += word.length() - i - 1;
            }
        }

        return count;
    }

    
    public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (vowels.contains(word.charAt(i)) || vowels.contains(word.charAt(i + 1))) {
                count += word.length() - i - 1;
            }
        }

        return count;
    }
}