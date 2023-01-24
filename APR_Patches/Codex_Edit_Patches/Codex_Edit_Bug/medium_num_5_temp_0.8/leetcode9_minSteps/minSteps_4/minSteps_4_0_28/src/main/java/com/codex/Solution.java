package com.codex;

import java.util.*;

public class Solution {
public static int minSteps(String s, String t) {
        
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for (char c : s.toCharArray()) {
            freqS[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freqT[c - 'a']++;
        }
        int steps = 0;
        for (int i = 0; i < 26; i++) {
            if (freqS[i] < freqT[i]) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

    
}