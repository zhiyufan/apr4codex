package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {           

        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        boolean isFirst = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
                if (isFirst == false) {
                    sb.append(s.charAt(i));
                    isFirst = true;
                }                                
            }
        }

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != s.charAt(s.length() - 1)) {
            sb.append(s.charAt(s.length() - 1));
        }

        return sb.toString();
    }

    
}