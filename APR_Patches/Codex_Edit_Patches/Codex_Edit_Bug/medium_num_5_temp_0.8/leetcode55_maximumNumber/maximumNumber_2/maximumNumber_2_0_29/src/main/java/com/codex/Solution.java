package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change, int k) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            if (change[num.charAt(i) - '0'] == 9) {
                sb.setCharAt(i, (char)(change[num.charAt(i) - '0'] + '0'));
                k--;
            }
        }
        for (int i = 0; i < num.length() && k > 0; i++) {
            if (change[num.charAt(i) - '0'] != 9) {
                sb.setCharAt(i, (char)(change[num.charAt(i) - '0'] + '0'));
                k--;
            }
        }
        return sb.toString();
    }

    
}