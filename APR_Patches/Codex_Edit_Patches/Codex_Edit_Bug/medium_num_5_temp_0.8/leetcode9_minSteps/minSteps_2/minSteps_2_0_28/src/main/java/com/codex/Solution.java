package com.codex;

import java.util.*;

public class Solution {
        public static int minSteps(String s, String t) {
        
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            if(sArray[i] - tArray[i] < 0)
                result += sArray[i] - tArray[i];
        }
        return result;
    }

    
}