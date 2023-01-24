package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String str) {
        if (str == null || str.length() < 3) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            for (int j = i + 2; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    res++;
                }
            }
        }
        return res * 2 + str.length();
    }

    
}