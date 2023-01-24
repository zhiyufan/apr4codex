package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        // Fill the two arrays with 0
        for (int i = 0; i < 26; i++) {
            sArray[i] = 0;
            tArray[i] = 0;
        }
        
        // Count the number of each character in both string
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }

    
}