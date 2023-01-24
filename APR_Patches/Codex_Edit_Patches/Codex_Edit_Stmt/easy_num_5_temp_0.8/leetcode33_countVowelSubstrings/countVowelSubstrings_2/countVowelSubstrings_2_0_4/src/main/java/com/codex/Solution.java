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

    public static boolean checkIfPangram(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (map.containsKey(sentence.charAt(i))) {
                map.put(sentence.charAt(i), map.get(sentence.charAt(i)) + 1);
            } else {
                map.put(sentence.charAt(i), 1);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (!map.containsKey((char) i)) {
                return false;
            }
        }
        return true;
    }
}