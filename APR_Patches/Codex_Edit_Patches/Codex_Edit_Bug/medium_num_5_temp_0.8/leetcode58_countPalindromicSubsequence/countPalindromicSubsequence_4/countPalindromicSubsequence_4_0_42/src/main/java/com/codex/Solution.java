package com.codex;

import java.util.*;

public class Solution {
    
    /*
      Finding the number of distinct palindromic subsequences in a String
      Complexity : O(n^2 * n!)
    */

    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                int k = 0;
                while (k < (j - i) / 2) {
                    if (s.charAt(i + k) == s.charAt(j - k)) {
                        k++;
                    } else {
                        break;
                    }
                }
            }
        }
        return set.size();
    }

    
}