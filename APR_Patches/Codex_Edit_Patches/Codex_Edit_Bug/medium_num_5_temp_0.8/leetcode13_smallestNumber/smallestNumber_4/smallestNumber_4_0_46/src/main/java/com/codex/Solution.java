package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
       
        int[] digits = new int[10];
        for (char c : String.valueOf(num).toCharArray()) {
            digits[c - '0']++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < digits.length; i++) {
            while (digits[i] > 0) {
                builder.append(i);
                digits[i]--;
            }
        }
        return Long.parseLong(builder.toString());
    }

    
}