package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                int len = s.length();
                for (int i = 0; i < len - 2; i++) {
                    for (int j = i + 2; j < len; j++) {
                        if (c == s.charAt(j)) {
                            count++;
                        }
                    }
                }
            }
        }
        return set.size();
    }

    
}