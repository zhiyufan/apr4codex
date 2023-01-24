package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;

        int pat1 = 0;
        int pat2 = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'A') {
                pat1 = i;
            }

            if (pattern.charAt(i) == 'C') {
                pat2 = i;
            }
        }

        char[] temp = new char[pattern.length()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = '$';
        }

        int patLength = pattern.length();

        for (int i = 0; i < text.length() - patLength + 1; i++) {
            for (int j = i; j < i + patLength; j++) {
                temp[j - i] = text.charAt(j);
            }

            if (temp[pat1] == pattern.charAt(pat1)) {
                if (temp[pat2] == pattern.charAt(pat2)) {
                    res += 1;
                    temp[pat1] = '$';
                    temp[pat2] = '$';
                    boolean cond = true;
                    for (int j = 0; j < temp.length; j++) {
                        if (temp[j] != pattern.charAt(j)) {
                            cond = false;
                            break;
                        }
                    }

                    if (cond) {
                        i += temp.length - 1;
                    }
                }
            }
        }
        return res;
    }
}