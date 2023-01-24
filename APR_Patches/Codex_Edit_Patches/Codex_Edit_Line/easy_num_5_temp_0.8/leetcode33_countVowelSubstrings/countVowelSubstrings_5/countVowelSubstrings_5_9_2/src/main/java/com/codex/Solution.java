package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        String vowels = "aeiou";

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}