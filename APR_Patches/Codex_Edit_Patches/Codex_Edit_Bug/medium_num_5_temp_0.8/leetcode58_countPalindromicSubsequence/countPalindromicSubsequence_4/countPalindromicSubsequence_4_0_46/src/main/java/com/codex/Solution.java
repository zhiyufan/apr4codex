package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence1(String s) {
        
        Set<String> set = new HashSet<>();
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
    public static int countPalindromicSubsequence2(String s) {

        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int l = i, r = i;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                set.add(s.substring(l, r+1));
                l--;
                r++;
            }
            l = i;
            r = i+1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                set.add(s.substring(l, r+1));
                l--;
                r++;
            } 
        }
        return set.size();
    }

    
}