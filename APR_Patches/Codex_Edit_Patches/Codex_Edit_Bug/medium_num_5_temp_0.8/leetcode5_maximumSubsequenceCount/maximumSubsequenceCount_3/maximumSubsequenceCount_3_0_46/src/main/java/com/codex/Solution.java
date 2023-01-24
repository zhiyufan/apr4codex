package com.codex;

import java.util.*;

public class Solution {
    public static long subsequenceCount(String text, String pattern) {
        
        int res = 0;
        int j = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if(j == pattern.length()) {
                res++;
                j = 0;
            }
            
        }
        return res;
    }
}