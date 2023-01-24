package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return res;
        
        int[] hash = new int[256];
        
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        
        int left = 0, right = 0, count = p.length();
        
        while (right < s.length()) {
            if (hash[s.charAt(right)] >= 1) {
                count--;
            }
            hash[s.charAt(right)]--;
            right++;
            
            if (count == 0) {
                res.add(left);
            }
            if (right - left == p.length()) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return result;
    }
}
}