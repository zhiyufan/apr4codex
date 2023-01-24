package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26]; // Store the number of appearances
        // Initialize the number of appearances
        // Traverse s and update the number of appearances
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        // Traverse t and update the number of appearances
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        // If a character appears in t and not in s, res += 1
        // If a character appears more times in t than in s, res += (appearances in t - appearances in s)
        int res = 0;
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    
}