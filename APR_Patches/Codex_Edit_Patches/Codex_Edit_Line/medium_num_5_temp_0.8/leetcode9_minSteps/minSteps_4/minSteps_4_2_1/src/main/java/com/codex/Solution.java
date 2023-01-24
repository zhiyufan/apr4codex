package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

----------------------

    public static boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        int sInd = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sInd)) {
                sInd++;
                if (sInd == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
    
}