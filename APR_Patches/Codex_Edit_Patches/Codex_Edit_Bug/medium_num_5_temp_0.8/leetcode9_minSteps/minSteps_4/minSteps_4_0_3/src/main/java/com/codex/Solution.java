package com.codex;

import java.util.*;

public class Solution {
    public static boolean isSame(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                return false;
            } else {
                freq[c - 'a']--;
            }
        }
        return true;
    }

    
}