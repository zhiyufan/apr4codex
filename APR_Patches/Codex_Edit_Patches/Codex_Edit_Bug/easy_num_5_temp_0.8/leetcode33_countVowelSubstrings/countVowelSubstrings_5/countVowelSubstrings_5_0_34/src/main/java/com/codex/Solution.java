package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        if (word == null || word.equals("")) {
            return 0;
        }

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
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