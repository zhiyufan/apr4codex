package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromeSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    set.add(s.substring(i, j + 1));
                }
            }
        }
        return set.size();
    }
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    
}