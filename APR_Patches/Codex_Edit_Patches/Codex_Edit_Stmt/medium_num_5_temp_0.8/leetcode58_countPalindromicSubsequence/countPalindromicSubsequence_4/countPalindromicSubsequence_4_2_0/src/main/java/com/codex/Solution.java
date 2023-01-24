package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class file {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countPalindromicSubsequence(s));
    }

    public static int countPalindromicSubsequence(String s) {
        Set<String> set = new HashSet();
        int n = s.length();
        for (int i = 0; i < n - 2; ++i) {
            for (int j = i + 2; j < n; ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    set.add(s.substring(i, j + 1));   // 因为j要加1，所以最后一个小括号里没有+1
                }   
            }   
        }
        return set.size();
    }

    
}