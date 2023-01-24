package com.codex;

import java.util.*;

public class Solution {
import java.util.*;


    public static int countPalindromicSubsequence(String s) {
        
        Set<String> set = new HashSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len + 1; j++) {
                // System.out.println("i = " + i + " and j = " + j);
                // System.out.println("s.substring(" + i + ", " + j + ") = " + s.substring(i, j));
                if (isPalindrome(s.substring(i, j))) {
                    set.add(s.substring(i, j));
                }
            }
        }
        return set.size();
    }


    public static boolean isPalindrome(String s) {
        int len = s.length();
        // System.out.println("len = " + len);
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("aabaa"));
    }
}
}