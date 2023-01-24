package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    /**
    * Given two strings s and t, write a function to determine if t is an anagram of s.
    * For example,
    * s = "anagram", t = "nagaram", return true.
    * s = "rat", t = "car", return false.
    * @param s
    * @param t
    * @return boolean
    */
    
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
    * Given a string s, find the longest palindromic substring in s.
    * You may assume that the maximum length of s is 1000.
    * @param s
    * @return 
    */
    
    public static String longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    

    
}