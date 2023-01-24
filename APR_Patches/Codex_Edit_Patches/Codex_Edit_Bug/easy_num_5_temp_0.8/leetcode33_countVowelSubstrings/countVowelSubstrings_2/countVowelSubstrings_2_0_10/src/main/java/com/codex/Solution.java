package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    int[] freq = new int[5];
    Arrays.fill(freq, 0);
    int ans = 0;
    for (int i = 0; i < word.length(); i++) {
        for (int j = 0; j < 5; j++) {
            if (word.charAt(i) == vowels[j]) {
                freq[j]++;
            }
        }
        // do the count here
        int tmp = 0;
        for (int j = 0; j < 5; j++) {
            if (freq[j] > 0) {
                tmp++;
            } else {
                break;
            }
        }
        if (tmp == 5) {
            ans += 5;
        } else {
            ans += tmp;
        }
    }
    return ans;
}










    // public static int countVowelSubstrings(String word) {
        
    //     int ans = 0;
    //     for (int i = 0; i < word.length(); i++) {
    //         for (int j = i; j < word.length(); j++) {
    //             if (isVowelSubstring(word.substring(i, j + 1))) {
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    // private static boolean isVowelSubstring(String str) {
    //     char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    //     int[] freq = new int[5];
    //     for (int i = 0; i < str.length(); i++) {
    //         for (int j = 0; j < 5; j++) {
    //             if (str.charAt(i) == vowels[j]) {
    //                 freq[j]++;
    //             }
    //         }
    //     }
    //     for (int i = 0; i < 5; i++) {
    //         if (freq[i] == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}