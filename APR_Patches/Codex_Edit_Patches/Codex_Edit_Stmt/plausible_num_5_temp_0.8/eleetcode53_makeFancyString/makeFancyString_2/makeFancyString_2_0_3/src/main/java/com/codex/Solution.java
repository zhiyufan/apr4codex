package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    /**
     * @param s, a string
     * @return a string without three identical consecutive letters
     */
    public String makeFancyString(String s) {
        // Write your code here

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
                // note that we do not need to check i+2 since we have already 
                // checked i+1
                i++;
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