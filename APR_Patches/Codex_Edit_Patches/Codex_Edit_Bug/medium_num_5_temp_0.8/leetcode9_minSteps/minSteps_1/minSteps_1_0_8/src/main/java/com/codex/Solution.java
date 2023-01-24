package com.codex;

import java.util.*;

public class Solution {

Solution: 
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


-------------------------------------------------------------------------------------------------------------
}