package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {

                boolean flag = true;
                for (int j = 1; j < pattern.length(); j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        flag = false;
                        break;
                    }  
                }

                if (flag) {
                    res += 1;
                }
            }
        }
        return res;
    }
}