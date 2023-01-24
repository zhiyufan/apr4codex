package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (i +1 < s.length() && s.charAt(0) == s.charAt(1)) {
                    result += s.charAt(0);
                    i++;
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