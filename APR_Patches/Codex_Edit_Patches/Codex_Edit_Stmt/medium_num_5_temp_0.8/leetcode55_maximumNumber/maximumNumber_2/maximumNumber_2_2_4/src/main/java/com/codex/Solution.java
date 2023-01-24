package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';   //num.charAt(i) - '0'取得字符串中第i个字符
            sb.setCharAt(i, (char)(change[digit] + '0'));
        }
        return sb.toString();
    }

    
}