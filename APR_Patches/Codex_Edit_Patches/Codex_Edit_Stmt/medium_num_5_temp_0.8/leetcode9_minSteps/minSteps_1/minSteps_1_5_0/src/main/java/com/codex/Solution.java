package com.codex;

import java.util.*;

public class Solution {
       public static int minSteps(String s, String t) {
        
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        int res = 0;
        for (int i = 0; i < sCount.length; i++) {
            if (sCount[i] > tCount[i])
                res += sCount[i] - tCount[i];
        }
        return res / 2;
    }

    
}