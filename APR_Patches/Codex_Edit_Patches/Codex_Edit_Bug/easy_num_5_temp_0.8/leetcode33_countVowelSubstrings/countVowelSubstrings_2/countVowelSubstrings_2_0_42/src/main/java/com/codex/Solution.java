package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings3(String word) {
        int ans = 0, n = word.length();
        int[] freq = new int[5];
        int[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < vowels.length; i++) {
            set.add((char) vowels[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                freq[word.charAt(j) - 'a']++;
                if (freq[4] > 0 && freq[3] > 0 && freq[2] > 0 && freq[1] > 0 && freq[0] > 0) {
                    ans += 1;
                }
            }
        }
        return ans;
    }
}