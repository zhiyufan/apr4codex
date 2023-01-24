package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String input = "abdbca";
        System.out.println(countPalindromicSubsequence(input));
    }

    public static int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<>();
        char[] letters = s.toCharArray();
        int len = letters.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (letters[i] == letters[j]) {
                    set.add(s.substring(i, j + 1)); // s.substring(i, j + 1) will exclude letter at position j
                }
            }
        }
        return set.size();
    }
}
}