package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {
        
    long res = 0;
    int size = pattern.length();
    for (int i = 0; i + size < text.length(); i++) {
        if (text.substring(i, i + size).equals(pattern)) {
            res++;
        }
    }
    return res;
}













    // for (int i = 0; i < text.length(); i++) {
    //     if (text.charAt(i) == pattern.charAt(0)) {
    //         for (int j = i + 1; j < text.length(); j++) {
    //             if (text.charAt(j) == pattern.charAt(1)) {
    //                 res += 1;
    //             }
    //         }
    //     }
    // }


















    // public static long maximumSubsequenceCount(String text, String pattern) {
        
    //     long res = 0;
    //     for (int i = 0; i < text.length(); i++) {
    //         if (text.charAt(i) == pattern.charAt(0)) {
    //             for (int j = i + 1; j < text.length(); j++) {
    //                 if (text.charAt(j) == pattern.charAt(1)) {
    //                     res += 1;
    //                 }
    //             }
    //         }
    //     }
    //     return res;
    // }

























    public static long maximumSubsequenceCount(String text, String pattern) {
        long res = 0;
        int size = pattern.length();
        int textSize = text.length();
        int end = textSize - size + 1;
        for (int i = 0; i < end; i++) {
            if (text.substring(i, i + size).equals(pattern)) {
                res ++;
            }
        }
        return res;
    }


















    public static long maximumSubsequenceCount(String text, String pattern) {
        long res = 0;
        int size = pattern.length();
        int textSize = text.length();
        for (int i = 0; i < textSize; i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                for (int j = i + 1 ; j < textSize; j++) {
                    if (j + size <= textSize && text.substring(i, j + size).equals(pattern)) {
                        res++;
                    }
                }
            }
        }
        return res + 1;
    }


















    public static long maximumSubsequenceCount(String text, String pattern) {
        long res = 0;
        int size = pattern.length();
        int textSize = text.length();
        for (int i = 0; i < textSize; i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                int j = 1;
                while (i + j < textSize && j < size && text.charAt(i + j) == pattern.charAt(j)) {
                    j++;
                }
                if (j == size) {
                    res++;
                }
            }
        }
        return res;
    }
}