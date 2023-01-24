package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (isVowelSubstring(word.substring(i, j + 1))) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static boolean isVowelSubstring(String str) {


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    freq[0]++;
                    break;
                case 'e':
                    freq[1]++;
                    break;
                case 'i':
                    freq[2]++;
                    break;
                case 'o':
                    freq[3]++;
                    break;
                case 'u':
                    freq[4]++;
            }
        }

        return freq[0] != 0 && freq[1] != 0 && freq[2] != 0 && freq[3] != 0 && freq[4] != 0;
    }
}