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
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (vowels.contains(word.charAt(i)) && vowels.contains(word.charAt(j))) {
                    result++;
                }
            }
        }
        return result;
    }


    public static int countVowelSubstrings(String word) {
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                int count = 0;
                for (int x = i; x <= j; x++) {
                    if (vowels.contains(word.charAt(x))) {
                        count++;
                    }
                }
                if (count == j - i + 1) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countVowelSubstrings(String word) {
        
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for(Character vowel : word.substring(i, j + 1).toCharArray()) {
                    if (!isVowel(vowel)) {
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
    
    public static boolean isVowel(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';
    }
}