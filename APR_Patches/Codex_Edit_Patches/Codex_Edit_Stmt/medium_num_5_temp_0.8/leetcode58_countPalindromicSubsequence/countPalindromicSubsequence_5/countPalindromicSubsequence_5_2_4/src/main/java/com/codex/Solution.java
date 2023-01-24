package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) { // 找到回文字符串，结果值加1
                    res++;
                }
            }
        }
        return res;
    }

    
}