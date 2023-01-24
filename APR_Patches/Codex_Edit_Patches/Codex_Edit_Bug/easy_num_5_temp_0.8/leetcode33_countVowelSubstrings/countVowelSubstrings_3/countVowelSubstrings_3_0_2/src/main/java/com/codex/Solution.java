package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (Character vowel : vowels) {
                    if (!word.substring(i, j + 1).contains(vowel.toString())) {
                        hasAllVowels = false;
                    }
                }
                if (hasAllVowels) {
                    result++;
                }
            }
        }
        return result;
    }

    public static int countVowelSubstrings(String word) {
        boolean hasA = false;
        boolean hasE = false;
        boolean hasI = false;
        boolean hasO = false;
        boolean hasU = false;
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            boolean hasA = word.substring(i, i+1).equals("a") || hasA;
            boolean hasE = word.substring(i, i+1).equals("e") || hasE;
            boolean hasI = word.substring(i, i+1).equals("i") || hasI;
            boolean hasO = word.substring(i, i+1).equals("o") || hasO;
            boolean hasU = word.substring(i, i+1).equals("u") || hasU;
            if (hasA && hasE && hasI && hasO && hasU) {
                hasA = false;
                hasE = false;
                hasI = false;
                hasO = false;
                hasU = false;
                result++;
            }
        }
        return result;
    }
    
}