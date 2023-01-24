package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char left = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char right = s.charAt(j);
                if (left == right) {
                    res++; // s[i..j] is a palindrome
                    int leftCount = 0;
                    int rightCount = 0;
                    for (int k = i; k < j; k++, leftCount++) {
                        if (s.charAt(k) == left) {
                            break;
                        }
                    }
                    for (int k = j; k > i; k--, rightCount++) {
                        if (s.charAt(k) == right) {
                            break;
                        }
                    }
                    if (rightCount == leftCount) {
                        res++; // add s[i+1..j-1]
                    }
                }
            }
        }
        return res;
    }

    
}