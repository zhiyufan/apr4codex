package com.codex;

import java.util.*;

public class Solution {

// 2147483647
// 2147483647


    public static String minimumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (change[digit] != digit) {
                sb.setCharAt(i, (char)(change[digit] + '0'));
                break;
            }
        }
        return sb.toString();
    }

    public static String maximumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    
}