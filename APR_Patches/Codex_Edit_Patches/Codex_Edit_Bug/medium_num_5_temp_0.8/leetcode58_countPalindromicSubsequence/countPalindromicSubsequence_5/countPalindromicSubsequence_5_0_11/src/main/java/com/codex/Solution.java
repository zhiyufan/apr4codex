package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    continue;
                }
                if (j - i < 2 && s.charAt(i) == s.charAt(j)) {
                    res++;
                    continue;
                }
                int left = i + 1;
                int right = j - 1;
                boolean flag = true;
                while (left <= right && flag) {
                    if (s.charAt(left) == s.charAt(right)) {
                        left++;
                        right--;
                    } else {
                        flag = false;
                    }
                }
                if (left > right && flag) {
                    res++;
                    System.out.println(s.substring(i, j + 1));
                }
                /*
                if (s.charAt(i) == s.charAt(j)) {
                    res++;
                }
                */
            }
        }
        return res;
    }

    
}