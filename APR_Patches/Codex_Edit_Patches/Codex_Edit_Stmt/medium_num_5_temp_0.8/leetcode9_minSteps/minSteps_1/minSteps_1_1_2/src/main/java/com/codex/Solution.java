package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int res = 0;
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++; //- 'a' 为了得到字母的下标
            tCount[t.charAt(i) - 'a']++; //- 'a' 为了得到字母的下标
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(sCount[i] - tCount[i]);
        }
        return res / 2;
    }

    
}