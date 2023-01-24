package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < sb.length(); i++) {
            int digit = sb.charAt(i) - '0';
            char newDigit = (char)('0' + change[digit]);
            sb.setCharAt(i, newDigit);
        }
        return sb.toString();
    }

    
}