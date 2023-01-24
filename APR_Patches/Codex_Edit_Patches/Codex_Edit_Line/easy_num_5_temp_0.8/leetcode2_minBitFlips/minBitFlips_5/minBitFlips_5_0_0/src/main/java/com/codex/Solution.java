package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }

    public static String minInteger(String num, int k) {
        int len = num.length();
        int[] digits = new int[10];
        boolean[] used = new boolean[len];
        
        StringBuilder sb = new StringBuilder(num);
        
        for (int i = 0; i < k; i++) {
            
            // Find the smallest digit in num[i], num[i+1], ... num[len-1]
            Arrays.fill(digits, -1);
            for (int j = 0; j + i < len; j++) {
                if (!used[j]) {
                    digits[num.charAt(j + i) - '0'] = j;
                }
            }
            
            for (int j = 0; j < 10; j++) {
                if (digits[j] == -1) {
                    continue;
                }
                
                // Swap between num[i] and num[digits[j]]
                char c = num.charAt(i);
                char d = (char)('0' + j);
                
                used[digits[j]] = true;
                
                if (c > d) {
                    sb.setCharAt(i, d);
                    sb.setCharAt(digits[j] + i, c);
                    break;
                }
            }
        }
        
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                sb.append(num.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
}