package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        String result = "";
        for (int i = 1; i < s.length(); i++) {
            if (i <= 1) {
                if (i == 1 && s.charAt(0) == s.charAt(1)) {
                    result += s.charAt(0);
                 
                } else {
                    result += s.charAt(i);
                }
            } else {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2)) {
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }

    
}