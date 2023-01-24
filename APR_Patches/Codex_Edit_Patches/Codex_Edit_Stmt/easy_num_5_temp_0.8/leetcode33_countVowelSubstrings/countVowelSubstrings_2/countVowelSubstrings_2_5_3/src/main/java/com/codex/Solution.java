package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        int ans = 0;
        int[] freq = new int[5];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                for (int k = 0; k < 5; k++) {
                    if (word.charAt(j) == vowels[k]) {
                        freq[k]++;
                    }
                }
                boolean isVowelSubstring = true;
                for (int k = 0; k < 5; k++) {
                    if (freq[k] == 0) {
                        isVowelSubstring = false;
                        break;
                    }
                }
                if (isVowelSubstring) {
                    ans += j - i + 1;
                }
            }
        }
        return ans;
    }
}