package com.codex;

import java.util.*;

public class Solution {
public static String longestPalindrome(String str) {
        if (str == null) return null;
        if (str.length() == 1) return str;
        int[] max = new int[2];
        for (int i = 0; i < str.length(); i++) {
            checkPalindrome(str, i, i, max);
            checkPalindrome(str, i, i+1, max);
        }
        return str.substring(max[0], max[1]);
    }


    private static void checkPalindrome(String str, int start, int end, int[] max) {
        int n = str.length();
        while (start >= 0 && end < n && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        if (max[1] - max[0] < end - start + 1) {
            max[0] = start + 1;
            max[1] = end;
        }
    }
}