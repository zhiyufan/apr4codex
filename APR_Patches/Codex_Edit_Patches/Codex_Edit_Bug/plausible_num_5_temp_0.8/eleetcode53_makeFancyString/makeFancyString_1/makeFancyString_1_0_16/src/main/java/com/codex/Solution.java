package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s.toLowerCase());
		int length = sb.length();

        for (int i = 2; i < length; i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                length--;
                i-=2;
            }
        }

        return sb.toString();
    }

    
}