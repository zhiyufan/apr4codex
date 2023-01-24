package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String ss) {
        

        String result = "";
        for (int i = 0; i < ss.length(); i++) {
            if (i <= 1) {
                if (i == 1 && ss.charAt(0) == ss.charAt(1)) {
                    result += ss.charAt(0);
                    i++;
                } else {
                    result += ss.charAt(i);
                }
            } else {
                if (ss.charAt(i) != ss.charAt(i - 1) && ss.charAt(i) != ss.charAt(i - 2)) {
                    result += ss.charAt(i);
                }
            }
        }
        return result;
    }

    
}