package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

/*
https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
https://www.geeksforgeeks.org/sherlock-and-anagrams/
*/

// Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int total = 0;
        for (int i = 1; i < s.length(); i++) { //substring length
            for (int j = 0; j < (s.length() - i + 1); j++) {
                String current = s.substring(j, j + i);
                for (int k = j + 1; k < (s.length() - i + 1); k++) {
                    if (isAnagram(current, s.substring(k, k + i))) {
                        total++;
                    }
                }
            }
        }
        return total;
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (frequency[c - 'a'] == 0) {
                return false;
            }
            frequency[c - 'a']--;
        }
        return true;
    }

    
    
}