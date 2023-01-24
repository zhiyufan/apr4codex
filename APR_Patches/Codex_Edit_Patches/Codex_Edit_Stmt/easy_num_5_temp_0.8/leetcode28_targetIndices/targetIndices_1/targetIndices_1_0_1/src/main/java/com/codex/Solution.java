package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;


        public List<Integer> findAnagrams(String s, String p) {
        
        int[] target = new int[26];
        List<Integer> res = new ArrayList<>();
        int begin = 0, end = 0, counter = p.length();
        for (char c : p.toCharArray()) {
            target[c-'a']++;
        }
        
        while (end < s.length()) {
            if (target[s.charAt(end++) - 'a']-- > 0) counter--;
            if (counter == 0) res.add(begin);
            if (end - begin == p.length() && target[s.charAt(begin++) - 'a']++ >= 0) counter ++;
        }
        return res;
    }

    //O(n)
    public boolean canPermutePalindrome(String s) {
        
        if (s.length() == 0 || s.length() == 1) return true;
        
        int[] hash = new int[128];
        
        for (char c : s.toCharArray()) {
            hash[c]++;
        }
        
        int count = 0;
        
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] % 2 == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }



//O(n)
    public boolean canPermutePalindrome(String s) {
        
        if (s.length() == 0 || s.length() == 1) return true;
        
        int[] hash = new int[128];
        int count = 0;
        for (char c : s.toCharArray()) {
            if (hash[c] % 2 == 0) {
                count++;
            }
            else {
                count--;
            }
            hash[c]++;
        }
        return count <= 1;
    }


    }
}