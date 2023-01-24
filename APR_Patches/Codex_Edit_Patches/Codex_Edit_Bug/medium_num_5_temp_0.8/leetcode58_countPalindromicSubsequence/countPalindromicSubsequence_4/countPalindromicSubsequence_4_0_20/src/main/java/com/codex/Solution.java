package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet<String>();
        int l = s.length();
        System.out.println(l);
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 2; j < l; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.substring(i, j + 1));
                    set.add(s.substring(i, j + 1));  
                }
            }
        }
        return set.size();
    }

    
}