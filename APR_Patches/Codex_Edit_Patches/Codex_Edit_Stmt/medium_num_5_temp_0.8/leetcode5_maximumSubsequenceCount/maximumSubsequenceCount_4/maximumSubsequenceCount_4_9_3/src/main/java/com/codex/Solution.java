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


        for (int i = 0; i < 26; i++) {
            int aa = input.charAt(i) - 'a';
            if (aa >= 0 && aa < 26) {
                array[aa]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            int bb = pattern.charAt(i) - 'a';
            if (bb >= 0 && bb < 26) {
                array[bb]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0) {
                return 0;
            }
        }
        return 1;
    }















    
}