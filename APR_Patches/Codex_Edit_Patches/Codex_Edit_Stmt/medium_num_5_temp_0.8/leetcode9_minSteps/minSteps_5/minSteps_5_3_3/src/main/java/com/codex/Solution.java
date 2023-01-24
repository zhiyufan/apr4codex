package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) { // hash[i] is the count of character
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    
}