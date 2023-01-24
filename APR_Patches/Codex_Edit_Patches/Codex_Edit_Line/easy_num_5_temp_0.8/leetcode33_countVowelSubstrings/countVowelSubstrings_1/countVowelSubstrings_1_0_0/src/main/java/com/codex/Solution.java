package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") && sub.contains("u")) {
                    count++;
                }
            }
        }

        return count;
    }

    public static String convertCharToBinary(char ch) {
        StringBuilder binary = new StringBuilder();
        int val = ch;
        for (int i = 0; i < 8; i++) {
            binary.append((val & 128) == 0 ? 0 : 1);
            val <<= 1;
        }
        return binary.toString();
    }

    public static int countSubstringsWithEqualBinaryOnesCount(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (countBinaryOnes(sub) % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int countBinaryOnes(String word) {
        int count = 0;
        char[] chs = word.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            String binary = convertCharToBinary(chs[i]);
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countSubstringsWithEqualNumberOfZeroesAndOnes(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (countZeroes(sub) == countOnes(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countZeroes(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }

    public static int countOnes(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}