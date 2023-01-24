package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        HashSet<String> subStr = new HashSet<>();
        for (int i = 0; i < word.length(); i++)
            for (int j = i; j < word.length(); j++)
                subStr.add(word.substring(i, j + 1));

        int result = subStr.size();

        for (String s : subStr) {
            boolean hasAllVowels = true;
            for (Character vowel : vowels) {
                if (!s.contains(vowel.toString()))
                    hasAllVowels = false;
            }
        }
        return result;
    }

    
}