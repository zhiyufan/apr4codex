package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelStrings(String word) {
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (word.charAt(i) == vowels[j]) {
                    freq[j]++;
                }
            }
        }
        int[] c = {1, 1, 1, 1, 1};
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return 0;
            }
        }
        int ans = 0;
        while (true) {
            int val = 1;
            for (int i = 0; i < 5; i++) {
                val *= c[i];
            }
            if (val == 0) {
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            c[i]--;
        }
        for (int i = 4; i >= 0; i--) {
            if (c[i] == freq[i]) {
                c[i] = 0;
            } else {
                c[i] = c[i] + 1;
            }
        }
        return ans;
    }
}