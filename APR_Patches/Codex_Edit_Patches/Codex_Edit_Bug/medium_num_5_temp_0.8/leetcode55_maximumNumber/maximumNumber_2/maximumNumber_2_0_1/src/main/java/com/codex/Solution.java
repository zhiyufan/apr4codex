package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        int current_max = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (change[digit] > current_max) {
                sb.setCharAt(i, (char)(change[digit] + '0'));
                current_max = change[digit];
            }
            else {
                sb.setCharAt(i, (char)(current_max + '0'));
            }
        }
        return sb.toString();
    }

    
}