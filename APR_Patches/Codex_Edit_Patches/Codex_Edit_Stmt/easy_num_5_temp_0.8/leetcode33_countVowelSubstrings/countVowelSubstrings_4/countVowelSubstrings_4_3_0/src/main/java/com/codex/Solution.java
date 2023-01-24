package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String sub = word.substring(i, j + 1);
                if (containsVowels(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean containsVowels(String word) {
        boolean a = false, e = false, i = false, o = false, u = false;
        for (char c : word.toCharArray()) {
            if (c == 'a') {
                a = true;
            }
            if (c == 'e') {
                e = true;
            }
            if (c == 'i') {
                i = true;
            }
            if (c == 'o') {
                o = true;
            }
            if (c == 'u') {
                u = true;
            }
        }
        return a && e && i && o && u;
    }


    private static long calc(long[] a, long k) {
        Arrays.sort(a);
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] += k) >= a[a.length - 1]) {
                count++;
            }
        }
        return count;
    }

    private static long calc2(long[] a, long k) {
        Arrays.sort(a);
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] += k) >= a[a.length - 1]) {
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        if (k < n) {
            System.out.println(calc(a, k));
        } else {
            System.out.println(calc2(a, k));
        }

    }
    
}