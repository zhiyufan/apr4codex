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

    public boolean isBoomerang(int[][] points) {
        int x  = (points[1][0] - points[0][0]);
        int y  = (points[1][1] - points[0][1]);
        int x1 = (points[2][0] - points[0][0]);
        int y1 = (points[2][1] - points[0][1]);
        return ((x*y1 - y*x1) != 0);
    }

    

    
    
}