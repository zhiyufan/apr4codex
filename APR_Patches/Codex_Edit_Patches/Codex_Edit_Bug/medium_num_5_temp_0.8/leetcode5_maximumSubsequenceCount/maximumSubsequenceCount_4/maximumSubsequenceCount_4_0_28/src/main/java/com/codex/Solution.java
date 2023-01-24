package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String pattern = scanner.next();
        System.out.println(maximumSubsequenceCount(text, pattern));
    }
}
}