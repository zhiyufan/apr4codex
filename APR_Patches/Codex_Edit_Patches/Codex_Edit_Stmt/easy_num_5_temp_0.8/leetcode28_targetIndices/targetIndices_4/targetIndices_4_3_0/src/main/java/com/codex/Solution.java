package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPalindrome(String s) {
        

        char[] a = s.replaceAll("[^A-Za-z0-9]", "").toCharArray();

        for (int i = 0, j = a.length - 1; i < a.length / 2 + 1; i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }
        return result;
    }

    
}