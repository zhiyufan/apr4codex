package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                freq[c - 'a']--;
            }
        }
        int res = 0;
        for (int i : freq) {
            res += i;
        }
        return res;
    }

    
}