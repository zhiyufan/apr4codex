package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
        
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    res++;
                }
            }
        }
        res += s.length();
        return res;
   }

    
}