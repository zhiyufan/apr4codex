package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (i < 2) {
                if (i == 1 && s.charAt(0) == s.charAt(1)) {
                    result += s.charAt(0);
                    i++;
                }
                if (i == s.length() - 2 && s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                    result += s.charAt(i);
                }
                if (i == s.length() - 1 && s.charAt(i) != s.charAt(i - 1)) {
                    result += s.charAt(i);
                }
            }
            if (i > 1) {
                if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i - 2)) {
                    result += s.charAt(i);
                }
            }
        }
        return result;
    }
}