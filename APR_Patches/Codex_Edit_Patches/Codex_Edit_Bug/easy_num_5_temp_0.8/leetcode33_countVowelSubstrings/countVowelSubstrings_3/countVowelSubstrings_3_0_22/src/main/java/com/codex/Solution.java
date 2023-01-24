package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
        
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean hasAllVowels = true;
                for (int k = i; k < j; k++) {
                    if (word.charAt(k) != vowels[k]) {
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

    
}