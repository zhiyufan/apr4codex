package com.codex;

import java.util.*;

public class Solution {
    public int shortDistance(int word1, int word2) {
        return Math.min(Math.abs(word1 - word2), 26 - Math.abs(word1 - word2));
    }

    public static int minTimeToType(String word) {
        if (word == null) return 0;
        if (word.length() <= 1) return word.length();


        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += shortDistance(pos[ch - 'a'], cur);
            cur = pos[ch - 'a'];
        }
        return res;
    }
}