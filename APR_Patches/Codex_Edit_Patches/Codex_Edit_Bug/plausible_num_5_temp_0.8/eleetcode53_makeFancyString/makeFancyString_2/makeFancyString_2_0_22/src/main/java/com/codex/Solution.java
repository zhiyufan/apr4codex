package com.codex;

import java.util.*;

public class Solution {
public static String makeFancyString(String s) {
        if (s == null || s.length() == 0 || s.length() == 1 || s.length() == 2) {
            return s;
        }
        String f = s.charAt(0) + "";
        for (int i = 1; i < s.length() - 1; i++) {
            char left = s.charAt(i - 1);
            char right = s.charAt(i + 1);
            char current = s.charAt(i);
            if (current != left) {
                if (current != right){
                    f += current;
                } else {
                    f += current + "" + current;
                    i++;
                }
            }
        }
        char last = s.charAt(s.length() - 1);
        if (last != s.charAt(s.length() - 2)) {
            f += last;
        }

        if (s.length() == f.length()) {
            return s;
        } else {
            return f;
        }


    }

    
}