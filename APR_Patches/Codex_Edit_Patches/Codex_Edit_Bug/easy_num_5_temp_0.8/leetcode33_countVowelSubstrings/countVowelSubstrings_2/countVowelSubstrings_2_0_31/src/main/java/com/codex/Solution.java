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
//this is a program to count all the substring of a given string which has all the english vowels
//this program runs in o(n^2) time 
    public static int countVowelSubstrings(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] freq = new int[5];
        int i = 0;
        int j = 0;
        int ans = 0;
        while (j < str.length()) {
            int index = vowelIndex(str.charAt(j), vowels);
            if (index != -1) {
                freq[index]++;
                if (check(freq)) {
                    ans += (j - i + 1) * (j - i + 2) / 2;
                }
                j++;
            } else {
                while (i < j) {
                    freq[vowelIndex(str.charAt(i), vowels)]--;
                    i++;
                    if (check(freq)) {
                        ans += (j - i + 1) * (j - i + 2) / 2;
                    } else {
                        break;
                    }
                }
                j++;
                i = j;
            }
        }
        return ans;
    }

    private static int vowelIndex(char c, char[] vowels) {
        for (int i = 0; i < 5; i++) {
            if (c == vowels[i]) {
                return i;
            }
        }
        return -1;
    }

    private static boolean check(int[] freq) {
        for (int i = 0; i < 5; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }
        return true;
    }
}