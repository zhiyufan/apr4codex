package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        String result = "";
        for (int i = 0; i < s.length(); i++) {
          
                if (i == 0) {
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