package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[26];
        long[] b = new long[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
            b[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            b[pattern.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.min(a[i], b[i]);
        }
        return res;
    }

     public static String replace(String input, String pattern, String replace) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < input.length() - pattern.length()) {
            boolean matching = true;
            for (int i = 0; i < pattern.length(); i++) {
                if (pattern.charAt(i) != input.charAt(index + i) ) {
                    matching = false;
                    break;
                }
            }
            if (matching) {
                sb.append(replace);
                index += pattern.length();
            } else {
                sb.append(input.charAt(index));
                index++;
            }
        }
        while (index < input.length()) {
            sb.append(input.charAt(index));
            index++;
        }
        return sb.toString();
    }
}