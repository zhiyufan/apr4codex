package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (isPalindrom(s.substring(i, j + 1))) {
                        set.add(s.substring(i, j + 1));
                    }
                }
            }
        }
        return set.size();
    }

    public static boolean isPalindrom(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("aaaabaa"));
        System.out.println(isPalindrom("aaxa"));
        System.out.println(countPalindromicSubsequence("aaaabaa"));
        System.out.println(countPalindromicSubsequence("aaxa"));
    }

    
}