package com.codex;

import java.util.*;

public class Solution {
 public static int countVowelSubstrings(String word) {
        
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            int[] freq = new int[5];
            for (int j = i; j < word.length(); j++) {
                for (int k = 0; k < 5; k++) {
                    if (word.charAt(j) == vowels[k]) {
                        freq[k]++;
                    }
                }
                if (isVowelSubstring(freq)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static boolean isVowelSubstring(int[] freq) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}