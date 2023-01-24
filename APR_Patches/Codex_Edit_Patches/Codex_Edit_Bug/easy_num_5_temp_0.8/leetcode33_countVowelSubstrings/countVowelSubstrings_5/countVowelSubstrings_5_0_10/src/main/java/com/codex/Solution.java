package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {

        List<Character> vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('e');
        vowels.add('i');
        vowels.add('O');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i)) || vowels.contains(word.charAt(i) - 32)) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}