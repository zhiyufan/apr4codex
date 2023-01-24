package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
        List<String> list = new ArrayList<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.substring(i, j + 1));
                }
            }
        }
        return set.size();
    }

    
}