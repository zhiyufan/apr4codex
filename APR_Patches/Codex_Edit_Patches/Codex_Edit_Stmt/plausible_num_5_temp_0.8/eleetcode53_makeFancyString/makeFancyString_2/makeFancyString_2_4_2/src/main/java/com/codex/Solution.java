package com.codex;

import java.util.*;

public class Solution {


    public static String makeFancyString(String s) {
        

        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() == 1 || s.length() == 2) {
            return s;
        }

                continue;
            }
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
            } 
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != s.charAt(s.length() - 1)) {
            sb.append(s.charAt(s.length() - 1));
        }

        return sb.toString();
    }

    
}