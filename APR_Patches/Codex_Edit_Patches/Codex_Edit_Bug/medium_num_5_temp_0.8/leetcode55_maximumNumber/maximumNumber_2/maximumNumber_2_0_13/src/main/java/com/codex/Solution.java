package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static String maximumNumber(String num1, int[] change) {
        
        StringBuilder sb = new StringBuilder(num1);
        for (int i = 0; i < num1.length(); i++) {
            int digit = num1.charAt(i) - '0';
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    } 
}
}