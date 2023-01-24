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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || i == s.length() - 1) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i)); 
            }
        }

        return sb.toString();
    }

    
}