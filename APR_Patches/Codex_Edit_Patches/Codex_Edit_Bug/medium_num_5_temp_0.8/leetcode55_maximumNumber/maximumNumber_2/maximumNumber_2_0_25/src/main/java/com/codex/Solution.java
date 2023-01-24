package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        StringBuilder sb = new StringBuilder(num);
        int max = 0;
        for (int i = 0; i < change.length; i++) {
            if (change[i] > max) {
                max = change[i];
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char)(max + '0'));
        }

        return sb.toString();
    }

    public static String maximumNumber(String num, int[] change) {
        int min = 10;
        for (int i = 0; i < change.length; i++) {
            if (change[i] < min) {
                min = change[i];
            }
        }

        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    
}