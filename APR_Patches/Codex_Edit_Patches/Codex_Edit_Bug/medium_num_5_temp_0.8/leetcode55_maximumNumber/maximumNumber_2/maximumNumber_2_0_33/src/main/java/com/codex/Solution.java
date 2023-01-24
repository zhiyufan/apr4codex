package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] count = new int[10];
        for (int c : change) count[c]++;
        
        for (int i = 0; i <= 9; i++) {
            if (count[i] == 0) continue;
            change[i] = (i + change[i]) % 10;
            if (change[i] == 0) change[i] = 10;
        }
        
        StringBuilder sb = new StringBuilder(num);
        
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        
        return sb.toString();
    }

    
}