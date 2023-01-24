package com.codex;

import java.util.*;

public class Solution {
       public static String maximumNumber(String num, int[] change) {
        
        int maxDigit[] = new int[10];
        for (int i = 1; i < 10; i++) {
            if (maxDigit[change[i]] == 0) {
                maxDigit[change[i]] = i;
            } else {
                maxDigit[change[i]] = Math.max(maxDigit[change[i]], i);
            }
        }

        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0' + 1;
            if (digit > maxDigit[change[digit - 1]]) {
                sb.setCharAt(i, (char)(maxDigit[change[digit - 1]] + '0'));
            } else {
                sb.setCharAt(i, num.charAt(i));
            }
        }
        return sb.toString();
    }
}