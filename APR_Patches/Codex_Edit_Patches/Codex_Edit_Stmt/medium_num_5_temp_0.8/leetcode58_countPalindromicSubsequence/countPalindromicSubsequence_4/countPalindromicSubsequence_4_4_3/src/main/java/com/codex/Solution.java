package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String input) {
        
        Set<String> set = new HashSet<>();
        char[] arr = input.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String subStr = String.valueOf(arr, i, j - i + 1);
                System.out.println(subStr);
                if (isPalindromic(arr, i, j)) {
                    set.add(subStr);
                }
            }
        }
        return set.size();
    }

    public static boolean isPalindromic(char[] arr, int start, int end) {

        if (start > end) return false;

        while (start < end) {
            if (arr[start] != arr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}