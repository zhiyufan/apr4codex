package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int res = 0;
        int[] sCount = new int[128];
        int[] tCount = new int[128];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 128; i++) {
            res += Math.abs(sCount[i] - tCount[i]);
        }
        return res / 2;
    }

    
}