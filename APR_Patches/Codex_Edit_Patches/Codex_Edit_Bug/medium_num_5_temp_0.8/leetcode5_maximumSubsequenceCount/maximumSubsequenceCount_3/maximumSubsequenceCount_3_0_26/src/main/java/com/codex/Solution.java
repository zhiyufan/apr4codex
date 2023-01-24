package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String txt, String pat) {
        
        long res = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == pat.charAt(0)) {
                for (int j = i + 1; j < txt.length(); j++) {
                    if (txt.charAt(j) == pat.charAt(1)) {
                        res += 1;  
                    }
                }
            }
        }
        return res;
    }
}