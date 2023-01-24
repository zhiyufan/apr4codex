package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    res++;
                }
            }
        }
        return res;
    }
    private boolean isPalindrome(String s) {
      int start = 0;
      int end = s.length() - 1;
      while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
          return false;
        }
        start++;
        end--;
      }
      return true;
    }

    
}