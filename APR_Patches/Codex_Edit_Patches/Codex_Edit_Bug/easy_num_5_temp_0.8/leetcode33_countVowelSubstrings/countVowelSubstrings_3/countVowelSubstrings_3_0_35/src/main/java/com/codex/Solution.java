package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        // Write your code here
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        int result = 0;
        for (int start = 0; start < word.length(); start++) {
            for (int end = start; end < word.length(); end++) {
                boolean hasAllVowels = true;
                for (Character vowel : vowels) { //hashset is used to check the vowel
                    if (!word.substring(start, end + 1).contains(vowel.toString())) {
                        hasAllVowels = false;
                        break;
                    }
                }
                if (hasAllVowels) result++;
            }
        }
        return result;
    }

    
}