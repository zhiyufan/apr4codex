package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int res = 0;
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(sCount[i] - tCount[i]);
        }
        return res / 2;
    }


    public static int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        int res = 0;
        for (int c : count) {
            if (c > 0) res += c;
        }
        return res;
    }

    
}