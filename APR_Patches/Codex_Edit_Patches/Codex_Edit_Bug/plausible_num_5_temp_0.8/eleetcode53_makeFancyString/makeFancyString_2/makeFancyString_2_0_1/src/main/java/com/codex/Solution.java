package com.codex;

import java.util.*;

public class Solution {
    import java.util.*;

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     *
     *
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public class DoubleChar {

        public String doubleChar(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }

    }
    
  
    
    
    
    
    
    
    public static String makeFancyString(String s) {
        

        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() == 1 || s.length() == 2) {
            return s;
        }

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