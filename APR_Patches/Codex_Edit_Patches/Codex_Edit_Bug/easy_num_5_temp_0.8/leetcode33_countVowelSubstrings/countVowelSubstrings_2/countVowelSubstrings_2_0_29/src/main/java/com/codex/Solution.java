package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        if (word == null || word.length() == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                if (isVowelSubstring(word.substring(i, j))) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static boolean isVowelSubstring(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (str.charAt(i) == vowels[j]) {
                    freq[j]++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}