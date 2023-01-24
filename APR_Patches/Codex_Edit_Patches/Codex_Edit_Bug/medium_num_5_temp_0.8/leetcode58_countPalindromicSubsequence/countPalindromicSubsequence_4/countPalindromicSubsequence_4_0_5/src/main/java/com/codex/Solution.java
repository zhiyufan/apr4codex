package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= len - i; j++) {
                String str = s.substring(i, i + j);
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();

                if (str.equals(sb.toString())) {
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

    public static void main(String args[]) {
        System.out.println(countPalindromicSubsequence("abaaab"));
    }
}
}