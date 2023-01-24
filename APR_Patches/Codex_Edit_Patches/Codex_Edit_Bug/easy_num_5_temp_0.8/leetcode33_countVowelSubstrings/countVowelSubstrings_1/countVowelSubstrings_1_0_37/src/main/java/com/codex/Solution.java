package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                boolean check = true;
                for (int x = 0; x < sub.length(); x++) {
                    if (!isVowel(sub.charAt(x))) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}