package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(1)) count++;
        }
        return count;
    }



public static void main(String args[]) {
        System.out.println("");
    }
    

    
}