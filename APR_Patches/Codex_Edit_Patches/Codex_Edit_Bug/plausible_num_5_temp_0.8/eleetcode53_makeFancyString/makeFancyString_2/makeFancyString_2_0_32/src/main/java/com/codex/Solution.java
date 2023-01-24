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
        sb.append(s.charAt(0));
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (i + 1 == s.length() - 1) {
                if (sb.charAt(sb.length() - 1) == s.charAt(i)) {
                    sb.append(s.charAt(i + 1));
                } else {
                    sb.append(s.charAt(i));
                    sb.append(s.charAt(i + 1));
                }
                continue;
            }
            if (s.charAt(i) != s.charAt(i-1)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    
}