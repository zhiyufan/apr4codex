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

    public static int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int uglyNumber = 0;
        int m2, m3, m5;
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = i2;; j++) {
                temp = uglyNumbers[j] * 2;
                if (temp > uglyNumbers[i - 1]) {
                    m2 = temp;
                    i2 = j;
                    break;
                }
            }
            for (int j = i3;; j++) {
                temp = uglyNumbers[j] * 3;
                if (temp > uglyNumbers[i - 1]) {
                    m3 = temp;
                    i3 = j;
                    break;
                }
            }
            for (int j = i5;; j++) {
                temp = uglyNumbers[j] * 5;
                if (temp > uglyNumbers[i - 1]) {
                    m5 = temp;
                    i5 = j;
                    break;
                }
            }
            uglyNumber = Math.min(m2, Math.min(m3, m5));
            uglyNumbers[i] = uglyNumber;
        }
        return uglyNumber;
    }

    public static int nthUglyNumber2(int n) {
        if (n == 1) {
            return 1;
        }
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        while (n > 1) {
            n--;
            if (i2 >= n - 1) {
                return uglyNumbers[n];
            }
            for (int j = i2;; j++) {
                if (uglyNumbers[j] * 2 > uglyNumbers[n]) {
                    i2 = j;
                    break;
                }
            }
            for (int j = i3;; j++) {
                if (uglyNumbers[j] * 3 > uglyNumbers[n]) {
                    i3 = j;
                    break;
                }
            }
            for (int j = i5;; j++) {
                if (uglyNumbers[j] * 5 > uglyNumbers[n]) {
                    i5 = j;
                    break;
                }
            }
            uglyNumbers[n] = Math.min(uglyNumbers[i2] * 2, Math.min(uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));
        }
        return uglyNumbers[n];
    }

    public static int nthUglyNumber3(int n) {
        if (n == 1) {
            return 1;
        }
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        while (n > 1) {
            n--;
            uglyNumbers[n] = Math.min(uglyNumbers[i2] * 2, Math.min(uglyNumbers[i3] * 3, uglyNumbers[i5] * 5));
            if (uglyNumbers[n] == uglyNumbers[i2] * 2) {
                i2++;
            }
            if (uglyNumbers[n] == uglyNumbers[i3] * 3) {
                i3++;
            }
            if (uglyNumbers[n] == uglyNumbers[i5] * 5) {
                i5++;
            }
        }
        return uglyNumbers[n];
    }
}