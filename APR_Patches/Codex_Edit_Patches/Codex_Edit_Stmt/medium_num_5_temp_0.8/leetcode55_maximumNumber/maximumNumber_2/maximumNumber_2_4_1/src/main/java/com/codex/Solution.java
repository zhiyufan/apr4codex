package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);//StringBuilder不是String的子类型
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    
}