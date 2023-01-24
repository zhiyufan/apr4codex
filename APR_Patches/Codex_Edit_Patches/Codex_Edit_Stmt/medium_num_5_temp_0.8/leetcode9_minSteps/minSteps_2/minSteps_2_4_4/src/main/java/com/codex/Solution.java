package com.codex;

import java.util.*;

public class Solution {
public static int minSteps(String s, String t) {
        
        if (s == null || t == null) return -1;
        if (s.length() != t.length()) return -1;
        
        int[] sArray = new int[256];
        int[] tArray = new int[256];
        for (char c : s.toCharArray()) {
            sArray[c]++;
        }
        for (char c : t.toCharArray()) {
            tArray[c]++;
        }
        int result = 0;
        for (int i = 0; i < 256; i++) {
            result += Math.abs(sArray[i] - tArray[i]);
        }
        return result / 2;
    }


    
}