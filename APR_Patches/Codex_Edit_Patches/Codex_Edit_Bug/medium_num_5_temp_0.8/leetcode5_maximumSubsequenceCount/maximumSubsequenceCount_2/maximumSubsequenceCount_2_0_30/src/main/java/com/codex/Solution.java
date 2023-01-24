package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        if (pattern.length()==1){
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == pattern.charAt(0)) count++;
            }
        }
        else{
            for (int i = 0; i < text.length()-1; i++) {
                if (text.substring(i,i+2).equals(pattern)) count++;
            }
        }
        return count;
    }

    
}