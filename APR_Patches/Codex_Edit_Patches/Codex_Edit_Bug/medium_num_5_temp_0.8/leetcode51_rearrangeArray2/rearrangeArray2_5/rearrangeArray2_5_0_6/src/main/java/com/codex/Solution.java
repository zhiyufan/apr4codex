package com.codex;

import java.util.*;

public class Solution {
    public static int countSubstrings(String s) {        
        int res = 0;
        for (int i = 0; i <= 2 * s.length() - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                res++;
            }
        }
        return res;
    }    
}