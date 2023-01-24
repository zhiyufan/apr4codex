package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        if (num == null || num.length() == 0) return "";

        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int change_digit = change[digit];
            if (change_digit < digit) {
                sb.setCharAt(i, (char) (change_digit + '0'));
                break;
            }
        }
        return sb.toString();
    }

    
}