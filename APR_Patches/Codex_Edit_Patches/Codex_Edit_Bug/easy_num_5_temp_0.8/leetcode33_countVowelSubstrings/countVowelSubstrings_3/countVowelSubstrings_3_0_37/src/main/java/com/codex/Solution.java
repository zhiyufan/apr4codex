package com.codex;

import java.util.*;

public class Solution {
import java.util.*;


    public static int countVowelSubstrings(String word) {
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        System.out.println(vowels);
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (Character vowel : vowels) {
                    System.out.println(word.substring(i, j + 1));
                    if (word.substring(i, j + 1).indexOf(vowel) == -1) {
                        hasAllVowels = false;
                    }
                }
                if (hasAllVowels) {
                    System.out.println(word.substring(i, j + 1));
                    result++;
                }
            }
        }
        return result;
    }

    
}