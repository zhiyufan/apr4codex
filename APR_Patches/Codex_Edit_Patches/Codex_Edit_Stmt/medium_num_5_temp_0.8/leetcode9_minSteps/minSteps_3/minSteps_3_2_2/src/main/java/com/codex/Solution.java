package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        if (s.length() != t.length())
            return -1;
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(letters[i]);
        }
        return res / 2;
    }

    
}